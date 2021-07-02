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
        Map<String, Integer> map = new TreeMap<>();
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
            System.out.println(i + ". " + lst);
        }
    }

    public void display(Map<String,Integer> map, Integer count) {
        Integer i = 0;
        for (String mp : map.keySet()) {
            i++;
            if (i > count) break;
            System.out.println(i + ". " + " " + mp);
        }
    }


    void writeToFile(String filename, Collection<String> list) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile())) {
            for (String lst : list) {
                out.println(lst);
            }
        }
    }

    void writeToFile(String filename, Map <Integer,String> map) throws FileNotFoundException {
        try (PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile())) {
            for (Map.Entry m : map.entrySet()) {
                out.println(m.getValue());
            }
        }
    }



}
