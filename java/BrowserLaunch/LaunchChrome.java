package BrowserLaunch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.FileReader;

public class LaunchChrome {

   protected WebDriver driver;

    @BeforeClass
    public void setup()
    {
        String path = System.getProperty("user.dir")+ File.separator+"webdriver"+File.separator + "chromedriver.exe";
        System.out.println("Path of directory : "+ path);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }
    @AfterClass
    public  void teardown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
