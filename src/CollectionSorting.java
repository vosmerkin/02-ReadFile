
//make interface (sort,intersect


import java.io.FileNotFoundException;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

public class CollectionSorting {

    public void collectionShuffle(List<String> list) {
        Collections.shuffle(list);
    }

    public void sortMyWay(List<String> list) {
        Comparator<String> c = new Comparator<>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        list.sort(c);
    }

    public void sortMyWay1(List<String> list) {
        String temp;
        System.out.println(list.size());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }
    }

    public void sortDictionary(List<String> list) {
        Collections.sort(list);
    }

    public <T> List<T> intersection1(List<T> list1, List<T> list2) {
        return list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());
    }

    public List<String> intersection(List<String> list1, List<String> list2) {
        ArrayList<String> list3 = new ArrayList<String>();
        for (String lst : list1) {
            if (list2.contains(lst)) list3.add(lst);
        }
        return list3;
    }


}

class CollectionSortingShuffle implements Sort {

    @Override
    public void sort(List<String> list) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();
        String projectPath = System.getProperty("user.dir") + "/";
        Long time0 = System.currentTimeMillis();
        Collections.shuffle(list);
        io.writeToFile(projectPath + "single_shuffle.txt", list);
        System.out.println("Shuffle sorting");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display(list, 10);
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) {
        return null;
    }


}

class CollectionSortingMyWay implements Sort {

    @Override
    public void sort(List<String> list) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();
        String projectPath = System.getProperty("user.dir") + "/";
        Long time0 = System.currentTimeMillis();

        String temp;
        System.out.println(list.size());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }

        io.writeToFile(projectPath + "single_myway.txt", list);
        System.out.println("Sorting by length (my way)");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display(list, 10);
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) {
        return null;
    }
}

class CollectionSortingDictionary implements Sort {

    @Override
    public void sort(List<String> list) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();
        String projectPath = System.getProperty("user.dir") + "/";
        Long time0 = System.currentTimeMillis();
        Collections.sort(list);
        io.writeToFile(projectPath + "single_dict.txt", list);
        System.out.println("Dictionary sorting");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display(list, 10);
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) {
        return null;
    }
}

class CollectionSortingIntersect implements Sort {

    @Override
    public void sort(List<String> list) {

    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) throws FileNotFoundException {
        IOfunctions io = new IOfunctions();
        String projectPath = System.getProperty("user.dir") + "/";
        Long time0 = System.currentTimeMillis();
        ArrayList<String> list3 = new ArrayList<String>();
        for (String lst : list1) {
            if (list2.contains(lst)) list3.add(lst);
        }
        io.writeToFile(projectPath + "single_intersect.txt", list3);
        System.out.println("Intersection");
        System.out.println(((System.currentTimeMillis() - time0)) + " milliseconds");
        io.display(list3, 10);
        return list3;
    }
}