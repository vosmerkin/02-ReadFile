import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class IOfunctions {

    public List<String> readFromFile(String filename) throws IOException {
        List<String> list = new ArrayList<>();
        // Change to try with resources
        BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
        try {
            String s;
            while ((s = in.readLine()) != null) {
                list.add(s);
            }
        } finally {
            in.close();
        }
        return list;
    }

    public Map<Integer, String> readMapFromFile(String filename) throws IOException {
        Map<Integer, String> map = new HashMap<>();
        int s1 = 0;
        String line;
        BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
        try {
            while ((line = in.readLine()) != null) {
                s1++;
                map.put(s1, line);
            }
        } finally {
            in.close();
        }
        return map;
    }

    public void display(List<String> list, Integer count) {
//        Iterator<String> it = list.iterator();
//        for (int i = 0; i < 10; i++) System.out.println((i + 1) + ". " + it.next());
        Integer i = 0;
        for (String lst : list) {
            i++;
            if (i > count) break;
            System.out.println((i + 1) + ". " + lst);
        }
//    for-each  List
    }

    public void display(Map<Integer, String> map, Integer count) {
//        Iterator<String> it = list.iterator();
//        for (int i = 0; i < 10; i++) System.out.println((i + 1) + ". " + it.next());
        Integer i = 0;
        for (String mp : map.values()) {
            i++;
            if (i > count) break;
            System.out.println(i + ". " + " " + mp);
        }
//    for-each  List
    }


    void writeToFile(String filename, List<String> list) throws FileNotFoundException {
//        for each:   List

//        Itera/tor<String> it = list.iterator();
        try {
            PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());

            for (String lst : list) {
                out.println(lst);
            }
//            while (it.hasNext()) {
//                out.println(it.next());
//            }
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
