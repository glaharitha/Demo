package TestNG;

import BrowserLaunch.LaunchChrome;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


/**        Locators
 * name
 * partial link text
 * tag name

**/
public class Case_01 extends LaunchChrome {

    @Test
    public void case1(){
       driver.get("https://www.google.com");
       // System.out.println(url);
        driver.findElement(By.name("q")).sendKeys("java point", Keys.ENTER);
        driver.findElement(By.partialLinkText("Books")).click();

       List<WebElement> list = driver.findElements(By.tagName("a"));
       System.out.println("List of tags : " + list.size());
       for(WebElement el : list){
           System.out.println(el.getText() + " " + el.getAttribute("href"));
       }

    }
}
