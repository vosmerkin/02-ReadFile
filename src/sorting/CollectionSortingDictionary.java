package sorting;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

public class CollectionSortingDictionary implements Sort {

    @Override
    public List<String> sort(List<String> list) throws FileNotFoundException {
        Collections.sort(list);
        return list;
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) {
        return null;
    }
}
