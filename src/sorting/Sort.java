package sorting;

import java.io.FileNotFoundException;
import java.util.List;

public interface Sort {
    List<String> sort(List<String> list) throws FileNotFoundException;

    List<String> intersect(List<String> list1, List<String> list2) throws FileNotFoundException;
}
