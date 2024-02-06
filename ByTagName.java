package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class ByTagName extends BrowserLaunch{
    @Test
    public void byid() throws InterruptedException {

        driver.get("https://www.google.com");

        driver.findElement(By.name("q")).sendKeys("Mobile automation Jobs", Keys.ENTER);

        Thread.sleep(5000);
        List<WebElement> links =  driver.findElements(By.tagName("a"));

        System.out.println("Total links: " + links.size());

        for(WebElement link : links){
            System.out.println(link.getText()+"--> " +link.getAttribute("href"));
        }


    }
}