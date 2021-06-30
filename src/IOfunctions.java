import java.io.*;
import java.util.*;

public class IOfunctions {

    public List<String> readFromFile(String filename) throws IOException {
        List<String> list = new ArrayList<>();
        // Change to try with resources
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
        }
        return list;
    }

    public Map<Integer, String> readMapFromFile(String filename) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        int s1 = 0;
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            while ((line = in.readLine()) != null) {
                s1++;
                map.put(s1, line);
            }
        }
        return map;
    }

    public Map<String, Integer> readMapFromFile1(String filename) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        int s1 = 0;
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            while ((line = in.readLine()) != null) {
                s1++;
                map.put(line, s1);
            }
        }
        return map;
    }

    public void display(List<String> list, Integer count) {
        Integer i = 0;
        for (String lst : list) {
            i++;
            if (i > count) break;
            System.out.println((i + 1) + ". " + lst);
        }
    }

    public void display(Map<Integer, String> map, Integer count) {
        Integer i = 0;
        for (String mp : map.values()) {
            i++;
            if (i > count) break;
            System.out.println(i + ". " + " " + mp);
        }
    }


    void writeToFile(String filename, List<String> list) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile())) {
            for (String lst : list) {
                out.println(lst);
            }
        }
    }
}
