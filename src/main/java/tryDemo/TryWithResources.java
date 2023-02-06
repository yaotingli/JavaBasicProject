package tryDemo;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        TryWithResources.copy();
    }

    public static void copy() {
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(new File("in.txt")));
             BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream(new File("out.txt")))
        ) {
            int b;
            while ((b = bi.read()) != -1) {
                bo.write(b);
            }

        } catch (IOException e) {
            System.out.println("e");
            e.printStackTrace();
        }
    }
}
