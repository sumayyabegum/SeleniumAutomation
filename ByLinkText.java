package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class ByLinkText extends BrowserLaunch {
    @Test
    public void byid() throws InterruptedException {

        driver.get("https://www.google.com");

        driver.findElement(By.linkText("Images")).click();
        Thread.sleep(3000);

        driver.findElement(By.name("q")).sendKeys("Kormangla", Keys.ENTER);


    }
}