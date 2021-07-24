package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleAssertion {

    @Test(priority = 1)
    public void hardassertion()
    {
        System.out.println("starting***********");
        String actual = "Laharitha";
        String expected = "laharitha";
        Assert.assertEquals(actual,expected,"mismatched");
        System.out.println("ending*******");
    }

    @Test(priority = 2)
    public void softassertion()
    {
        System.out.println("starting***********");
        String actual = "Laharitha";
        String expected = "laharitha";
        SoftAssert sf = new SoftAssert();
        Assert.assertEquals(actual,expected,"mismatched");
        System.out.println("ending*******");
        sf.assertAll();
    }
}
