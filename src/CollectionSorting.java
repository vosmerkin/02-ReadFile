
//make interface (sort,intersect
//        Intersect переделать ручкаами
//        уменьшить колво элементов




import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

public class CollectionSorting {

    public void collectionShuffle(ArrayList<String> list) {
        Collections.shuffle(list);
    }

    public ArrayList<String> sortMyWay(ArrayList<String> list) {
        Comparator<String> c = new Comparator<>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        list.sort(c);

        return list;
    }

    public ArrayList<String> sortMyWay1(List<String> list) {
        String temp;
        System.out.println(list.size());
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.println(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).length() > list.get(j).length()) {
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }

        return list;
    }

    public ArrayList<String> sortDictionary(ArrayList<String> list) {
        Collections.sort(list);
        Integer.
        return list;
    }

    public <T> List<T> intersection(List<T> list1, List<T> list2) {
        return list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());

    }


}
