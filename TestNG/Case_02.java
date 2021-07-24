package TestNG;

import BrowserLaunch.LaunchChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**     Locators
* id
 * link text
 * class name

 */
public class Case_02 extends LaunchChrome {


    @Test
    public void case2(){
        driver.get("https://www.amazon.com");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macbook pro 13 inch" , Keys.ENTER);
        driver.findElement(By.linkText("Customer Service")).click();
        driver.findElement(By.className("hm-icon-label")).click();

    }
}
