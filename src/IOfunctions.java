import java.io.*;
import java.util.*;

public class IOfunctions {

    public List<String> readFromFile(String filename)  {
        List<String> list = new ArrayList<>();
        // Change to try with resources
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        return list;
    }

    public Map<Integer, String> readMapFromFile(String filename) {
        Map<Integer, String> map = new HashMap<>();
        int s1 = 0;
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            while ((line = in.readLine()) != null) {
                s1++;
                map.put(s1, line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        return map;
    }

    public Map<String, Integer> readMapFromFile1(String filename) {
        Map<String, Integer> map = new TreeMap<>();
        int s1 = 0;
        String line;
        try (BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()))) {
            while ((line = in.readLine()) != null) {
                s1++;
                map.put(line, s1);
            }
        } catch (IOException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
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

    public void display(Map<String, Integer> map, Integer count) {
        Integer i = 0;
        for (String mp : map.keySet()) {
            i++;
            if (i > count) break;
            System.out.println(i + ". " + " " + mp);
        }
    }


    void writeToFile(String filename, Collection<String> list) {
        try (PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile())) {
            for (String lst : list) {
                out.println(lst);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }

    void writeToFile(String filename, Map<Integer, String> map) {
        try (PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile())) {
            for (Map.Entry m : map.entrySet()) {
                out.println(m.getValue());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
    }


}
