package Annotation;
import Annotation.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Google_003 extends BaseClass {
    @Test
    public void google_001()  {

        driver.findElement(By.xpath("//textarea[@name='q']")).
                sendKeys("iphone 15 pro max", Keys.ENTER);
        Reporter.log(driver.getTitle());
    }
}