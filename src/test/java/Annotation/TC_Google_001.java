package Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Google_001 extends BaseClass{
    @Test
    public void google_001()  {
        driver.findElement(By.xpath("//textarea[@name='q']"))
                .sendKeys("Java Selenium Jobs", Keys.ENTER);

        Reporter.log(driver.getTitle());
    }

}
