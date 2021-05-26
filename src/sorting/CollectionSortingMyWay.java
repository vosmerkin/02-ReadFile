package sorting;

import java.io.FileNotFoundException;
import java.util.List;

public class CollectionSortingMyWay implements Sort {

    @Override
    public List<String> sort(List<String> list) throws FileNotFoundException {
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
        return list;
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) {
        return null;
    }
}
