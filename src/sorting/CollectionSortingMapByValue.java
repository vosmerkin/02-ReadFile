package sorting;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionSortingMapByValue {
    public Map<Integer, String> mapSort(Map<Integer, String> map) throws FileNotFoundException {
        Map<Integer, String> sortedMap = null;
        CollectionSortingDictionary sorter = new CollectionSortingDictionary();
        List<String> valueList = new ArrayList<>(sorter.sort((List<String>) map.values()));
//        valueList = sorter.sort(map.values());


        return sortedMap;
    }
}
