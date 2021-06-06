package sorting;

import java.io.FileNotFoundException;
import java.util.*;

public class CollectionSortingMapByValue {
    public <Integer, String extends Comparable<? super String>> Map<Integer, String> mapSort(Map<Integer, String> map) throws FileNotFoundException {
        Map<Integer, String> sortedMap = new HashMap<>();
        List<Map.Entry<Integer, String>> values = new ArrayList<>(map.entrySet());
        values.sort(Map.Entry.comparingByValue());


//        CollectionSortingDictionary sorter = new CollectionSortingDictionary();

        for (Map.Entry<Integer, String> entry : values) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

//        Collections.sort(values);
//        values = sorter.sort(values);
//        Collection<String> values = map.values();
//        List<String> valueList = new ArrayList<String>(values);
//
////        List<String> valueList = (ArrayList<String>) map.values();
//        valueList = sorter.sort(valueList);
////        valueList = sorter.sort(map.values());
//
//        for (String lst : valueList) {
//            sortedMap.put(entry.getKey(), entry.getValue());
//        }


        return sortedMap;
    }
}
