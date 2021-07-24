package FileHandling;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Generic {

    public static String getValue(String key) {
        String path = System.getProperty("user.dir") + File.separator + "TestData" + File.separator + "config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties pro = new Properties();
            pro.load(fis);
            value = pro.getProperty(key);
           // System.out.println(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return value;
    }


    }



