package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByXpath extends BrowserLaunch{
    @Test
    public void byid() throws InterruptedException {

        driver.get("https://www.google.com");

        driver.findElement(By.xpath("//textarea[@id = 'APjFqb']")).sendKeys("Autoamtion jobs", Keys.ENTER);

    }
}