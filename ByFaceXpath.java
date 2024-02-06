package seleniumPrograms;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ByFaceXpath extends BrowserLaunch{
    @Test
    public void byid() throws InterruptedException {

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
    }
}