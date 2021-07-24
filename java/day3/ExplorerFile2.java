package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExplorerFile2 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = null;
        String browser = "chrome";

        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            System.out.println("Open chrome browser");
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            System.out.println("Open firfox browser");
        }else{
            System.out.println("Please enter correct browser");
        }
        System.out.println("Out of condition!");
        driver.get("https://www.amazon.com");
        Thread.sleep(6000);
        driver.close();
    }
}
