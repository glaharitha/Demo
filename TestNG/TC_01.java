package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_01 extends BaseClass {


    @Test
    public void test1()
    {
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbookpro ", Keys.ENTER);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
}
