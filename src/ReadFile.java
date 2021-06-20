import sorting.*;

import java.io.*;
import java.util.*;

//switch
//default sorter
//intersect отдельно
//
//map - сортировка и пересечение

public class ReadFile {

    private static final IOfunctions IO = new IOfunctions();

    public static void main(String[] args) throws IOException {
        String projectPath = "./";
        List<String> list = IO.readFromFile(projectPath + "single.txt");
        System.out.println("Original list");
        IO.display(list, 10);


        sortByMethod(list, "Shuffle sorting", projectPath + "single_shuffle.txt");
        sortByMethod(list, "My way sorting (by length)", projectPath + "single_myway.txt");
        sortByMethod(list, "Dictionary sorting", projectPath + "single_dict.txt");


        Long time0 = System.currentTimeMillis();
        CollectionSortingIntersect sortIntersect = new CollectionSortingIntersect();
        List<String> list1 = IO.readFromFile(projectPath + "single1.txt");
        list = sortIntersect.intersect(list, list1);
        IO.writeToFile(projectPath + "single_intersect.txt", list);
        System.out.println("Intersection");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        IO.display(list, 10);


        time0 = System.currentTimeMillis();
        Map<Integer, String> mp;
        mp = IO.readMapFromFile(projectPath + "single.txt");
        CollectionSortingMapByValue sortMap = new CollectionSortingMapByValue();
        mp = sortMap.mapSort(mp);
        System.out.println("Map dictionary sorting");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        IO.display(mp, 10);
    }

    private static void sortByMethod(List<String> list, String sortMethod, String filePath) throws FileNotFoundException {
        long time0 = System.currentTimeMillis();
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

}
