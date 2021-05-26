package sorting;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class CollectionSortingIntersect implements Sort {

    @Override
    public List<String> sort(List<String> list) {

        return list;
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) throws FileNotFoundException {
        ArrayList<String> list3 = new ArrayList<String>();
        for (String lst : list1) {
            if (list2.contains(lst)) list3.add(lst);
        }
        return list3;
    }
}
