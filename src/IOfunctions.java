import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IOfunctions {

    public ArrayList<String> readFromFile(String filename) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<String>();
        int s1 = 0;
        try {
            BufferedReader in = new BufferedReader(new FileReader(new File(filename).getAbsoluteFile()));
            try {
                String s;
                while ((s = in.readLine()) != null) {
                    list.add(s);
                    s1 = s1 + 1;
                    //if (s1>1000) break;
                }
            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public void display10(List<String> list) {
        Iterator<String> it = list.iterator();
        for (int i = 0; i < 10; i++) System.out.println((i + 1) + ". " + it.next());

//    for-each  List
    }

    void writeToFile(String filename, List<String> list) throws FileNotFoundException {
//        for each:   List

        Iterator<String> it = list.iterator();
        try {
            PrintWriter out = new PrintWriter(new File(filename).getAbsoluteFile());

            while (it.hasNext()) {
                out.println(it.next());
            }
            out.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
