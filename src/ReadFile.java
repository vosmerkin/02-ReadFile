import sorting.*;

import java.io.*;
import java.util.*;

//switch
//default sorter
//intersect отдельно
//
//map - сортировка и пересечение

public class ReadFile {

    private static void sortByMethod(List<String> list, String sortMethod, String filePath) throws FileNotFoundException {


        Long time0 = System.currentTimeMillis();
        IOfunctions io = new IOfunctions();
        Sort sorter = null;

        switch (sortMethod) {
            case "Shuffle sorting":
                sorter = new CollectionSortingShuffle();
                break;
            case "My way sorting (by length)":
                sorter = new CollectionSortingMyWay();
                break;
            case "Dictionary sorting":
                sorter = new CollectionSortingDictionary();
                break;
        }


        list = sorter.sort(list);




        io.writeToFile(filePath, list);
        System.out.println(sortMethod);
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display(list, 10);
    }

    public static void main(String[] args) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();


        List<String> list = new ArrayList<String>();


        String projectPath = System.getProperty("user.dir") + "/";
        list = io.readFromFile(projectPath + "single.txt");
        System.out.println("Original list");
        io.display(list, 10);


        sortByMethod(list, "Shuffle sorting", System.getProperty("user.dir") + "/" + "single_shuffle.txt");
        sortByMethod(list, "My way sorting (by length)", System.getProperty("user.dir") + "/" + "single_myway.txt");
        sortByMethod(list, "Dictionary sorting", System.getProperty("user.dir") + "/" + "single_dict.txt");


        Long time0 = System.currentTimeMillis();
        CollectionSortingIntersect sortIntersect = new CollectionSortingIntersect();
        ArrayList<String> list1 = io.readFromFile(System.getProperty("user.dir") + "/" + "single1.txt");
        list = sortIntersect.intersect(list, list1);
        io.writeToFile(projectPath + "single_intersect.txt", list);
        System.out.println("Intersection");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display(list, 10);


    }

}
