package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ById extends BrowserLaunch{
    @Test
    public void byid(){

        driver.get("https://www.google.com");

        driver.findElement(By.id("taw")).sendKeys("Automation Jobs", Keys.ENTER);

    }
}
