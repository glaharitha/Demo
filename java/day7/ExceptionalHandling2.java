package day7;

import java.io.FileInputStream;
import java.io.File;
public class ExceptionalHandling2  {

    public static void main(String[] args) {
        System.out.println("started***********");
        try {
            String path = "C:\\Users\\laharitha\\Documents\\New folder";
            FileInputStream fis = new FileInputStream(path);
            fis.read();
        } catch (Exception e) {
            e.getStackTrace();
        }

        finally {
            System.out.println("finally");
        }
        System.out.println("ending*******");
    }
}
