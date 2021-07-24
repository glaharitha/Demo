package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.FileNotFoundException;


public class ReadProperties {


    public static void main(String[] args) throws IOException {
     //   String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
     //   FileInputStream fis = new FileInputStream(path);
     //   Properties pro = new Properties();
     //   pro.load(fis);
      //  String val = pro.getProperty("url");
      //  System.out.println(val);


       String  val = Generic.getValue("url");
        String pass = Generic.getValue("password");
        System.out.println(val);
        System.out.println(pass);

    }

}
