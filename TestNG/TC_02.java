package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_02 extends BaseClass{
    @Test
    public void test2()
    {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("iphone12 ", Keys.ENTER);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}

