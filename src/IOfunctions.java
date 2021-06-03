import java.io.*;
import java.util.*;

public class IOfunctions {

    public ArrayList<String> readFromFile(String filename) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
//        int s1 = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    list.add(s);
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public Map<Integer, String> readMapFromFile(String filename) throws FileNotFoundException {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        int s1 = 0;
        try {
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
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return map;
    }

    public void display(List<String> list, Integer count) {
        Iterator<String> it = list.iterator();
        for (int i = 0; i < 10; i++) System.out.println((i + 1) + ". " + it.next());

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
