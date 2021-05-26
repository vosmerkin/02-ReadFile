package sorting;

import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.List;

public class CollectionSortingShuffle implements Sort {

    @Override
    public List<String> sort(List<String> list) throws FileNotFoundException {
        Collections.shuffle(list);
        return list;
    }

    @Override
    public List<String> intersect(List<String> list1, List<String> list2) {
        return null;
    }


}
