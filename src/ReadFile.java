import java.io.*;
import java.util.*;

public class ReadFile {


    public static void main(String[] args) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();
        CollectionSorting sort = new CollectionSorting();

        List<String> list = new ArrayList<String>();
        ArrayList<String> list1 = new ArrayList<String>(); //to check intersection
        ArrayList<String> intersection = new ArrayList<String>();


        String projectPath = System.getProperty("user.dir") + "/";
        System.out.println(System.getProperty("user.dir"));
        list = io.readFromFile(projectPath + "single.txt");
        System.out.println("Original list");
        io.display10(list);
        list1 = io.readFromFile(projectPath + "single1.txt");


        Long time0 = System.currentTimeMillis();


        sort.collectionShuffle(list);
        io.writeToFile(projectPath + "single_shuffle.txt", list);
        System.out.println("Shuffle sorting");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display10(list);

        time0 = System.currentTimeMillis();
        sort.sortMyWay1(list);
        io.writeToFile(projectPath + "single_myway.txt", list);
        System.out.println("Sorting by length");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display10(list);

        time0 = System.currentTimeMillis();
        sort.sortDictionary(list);
        io.writeToFile(projectPath + "single_dict.txt", list);
        System.out.println("Dictionary sorting");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display10(list);
        //ffd


        time0 = System.currentTimeMillis();
        intersection = (ArrayList<String>) sort.intersection(list, list1);
        io.writeToFile(projectPath + "single_intersect.txt", intersection);
        System.out.println("Intersection");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display10(intersection);

    }

}
