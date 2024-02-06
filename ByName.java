package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByName extends BrowserLaunch{
    @Test
    public void byid(){

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Mobile automation Jobs", Keys.ENTER);


    }
}