package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_03 extends BaseClass{

    @Test
    public void test3()
    {
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("amazon",Keys.ENTER);
        driver.findElement(By.cssSelector(".cfxYMc")).click();
        driver.findElement(By.cssSelector(".hm-icon")).click();
        driver.findElement(By.cssSelector(".hmenu-visible > li:nth-child(2) > .hmenu-item")).click();


    }




}
