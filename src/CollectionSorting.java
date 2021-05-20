
//make interface (sort,intersect
//        Intersect переделать ручкаами
//        уменьшить колво элементов




import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.*;

public class CollectionSorting {

    public void collectionShuffle(List<String> list) {
        Collections.shuffle(list);
    }

    public void  sortMyWay(List<String> list) {
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
            System.out.println(i);
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
    
    public List<String> intersection (List<String> list1, List<String> list2) {
        for (:
             ) {
            
        }
    }
        
    
    


}
