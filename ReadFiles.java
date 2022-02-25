import java.io.*;
import java.util.*;
public class ReadFiles {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner( new File("file.dat"));
        int total = 0;
        while (in.hasNextLine()) {
            total += Integer.valueOf(in.nextInt());
        }
        System.out.println(total);
        in.close();
    }
}