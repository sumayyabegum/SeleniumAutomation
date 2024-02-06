package Annotation;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;

import org.testng.annotations.Test;

public class TC_Google_002 extends BaseClass{
    @Test
    public void google_001()  {
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);

        Assert.assertEquals(pageTitle,"Googles","Title not match");

        driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Java Mobile automation Jobs", Keys.ENTER);
        Reporter.log(driver.getTitle());
    }
}