package TestNG;

import BrowserLaunch.LaunchChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Case_04 extends LaunchChrome {


    @Test
    public void case4(){
        driver.get("https://www.amazon.in");
        String url = driver.getCurrentUrl();
        System.out.println("Search the url : " + url);
        String title = driver.getTitle();
        System.out.println("Title of the page : " + title);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12 pro ", Keys.ENTER);
        driver.findElement(By.cssSelector("#p_89\\/Samsung .a-icon")).click();
       // driver.findElement(By.linkText("Best Sellers")).click();

    }
}
