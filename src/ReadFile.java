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

        var one = "xxx";
        String two = new String ("xxx");
        System.out.println("compare ="+(one == two));

//        Long time0 = System.currentTimeMillis();
//        IOfunctions io = new IOfunctions();
//        Sort sorter= null;
//
//        if (sortMethod == "Shuffle sorting") {
//            sorter = new CollectionSortingShuffle();
//        }
//        if (sortMethod == "My way sorting (by length)") {
//             sort = new CollectionSortingMyWay();
//        }
//        if (sortMethod == "Dictionary sorting") {
//            CollectionSortingDictionary sort = new CollectionSortingDictionary();
//            list = sortDictionary.sort(list);
//        }
//
//        list = sorter.sort(list);
//
//        if (sortMethod == "Intersection") {
//            CollectionSortingIntersect sortIntersect = new CollectionSortingIntersect();
//            ArrayList<String> list1 = io.readFromFile(System.getProperty("user.dir") + "/" + "single1.txt");
//            list = sortIntersect.intersect(list, list1);
//        }
//
//
//        io.writeToFile(filePath, list);
//        System.out.println(sortMethod);
//        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
//        io.display(list, 10);
    }

    public static void main(String[] args) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();
//        CollectionSorting sort = new CollectionSorting();
//        CollectionSortingShuffle sort1 = new CollectionSortingShuffle();

        List<String> list = new ArrayList<String>();
//        ArrayList<String> list1 = new ArrayList<String>(); //to check intersection
//        ArrayList<String> intersection = new ArrayList<String>();
//

        String projectPath = System.getProperty("user.dir") + "/";
        list = io.readFromFile(projectPath + "single.txt");
        System.out.println("Original list");
        io.display(list, 10);


        sortByMethod(list, "Shuffle sorting", System.getProperty("user.dir") + "/" + "single_shuffle.txt");
        sortByMethod(list, "My way sorting (by length)", System.getProperty("user.dir") + "/" + "single_myway.txt");
        sortByMethod(list, "Dictionary sorting", System.getProperty("user.dir") + "/" + "single_dict.txt");
        sortByMethod(list, "Intersection", System.getProperty("user.dir") + "/" + "single_intersect.txt");
//        list1 = io.readFromFile(projectPath + "single1.txt");


//        CollectionSortingShuffle sortShuffle = new CollectionSortingShuffle();
//        sortShuffle.sort(list);
//        Long time0 = System.currentTimeMillis();
//        sort.collectionShuffle(list);
//        io.writeToFile(projectPath + "single_shuffle.txt", list);
//        System.out.println("Shuffle sorting");
//        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
//        io.display(list,10);


//        CollectionSortingMyWay sortMyWay = new CollectionSortingMyWay();
//        sortMyWay.sort(list);
//        time0 = System.currentTimeMillis();
//        sort.sortMyWay1(list);
//        io.writeToFile(projectPath + "single_myway.txt", list);
//        System.out.println("My way sorting (by length)");
//        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
//        io.display(list,10);


//        CollectionSortingDictionary sortDictionary = new CollectionSortingDictionary();
//        sortDictionary.sort(list);
//        time0 = System.currentTimeMillis();
//        sort.sortDictionary(list);
//        io.writeToFile(projectPath + "single_dict.txt", list);
//        System.out.println("Dictionary sorting");
//        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
//        io.display(list,10);


//        CollectionSortingIntersect sortIntersect = new CollectionSortingIntersect();
//        intersection = (ArrayList<String>) sortIntersect.intersect(list, list1);
//        time0 = System.currentTimeMillis();
//        intersection = (ArrayList<String>) sort.intersection(list, list1);
//        io.writeToFile(projectPath + "single_intersect.txt", intersection);
//        System.out.println("Intersection");
//        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
//        io.display(intersection,10);


    }

}
