package TestNG;

import BrowserLaunch.LaunchChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Case_03 extends LaunchChrome {

    @Test
    public void loginpage(){
        driver.get("https://www.google.com");
        String url = driver.getCurrentUrl();
        System.out.println("URL : " + url);
        String title = driver.getTitle();
        System.out.println("TITLE : " + title);
        driver.findElement(By.linkText("Images" )).click();
        driver.findElement(By.name("q")).sendKeys("Mickey mouse", Keys.ENTER);
        driver.findElement(By.linkText("disney")).click();

    }
}
