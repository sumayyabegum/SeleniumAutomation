package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Assertion {
    WebDriver driver;
    @BeforeClass
    void setup() {
        System.setProperty("WebDriver.Chrome.driver", "\"C:\\Program Files\\Google\\Chrome\"");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=myntra&oq=mintr&gs_lcrp=EgZjaHJvbWUqDwgBEAAYChiDARixAxiABDIGCAAQRRg5Mg8IARAAGAoYgwEYsQMYgAQyDwgCEAAYChiDARixAxiABDIMCAMQABgKGLEDGIAEMgcIBBAAGIAEMgwIBRAAGAoYsQMYgAQyEggGEAAYChiDARixAxiABBiKBTIGCAcQBRhA0gEINTEwM2owajeoAgCwAgA&sourceid=chrome&ie=UTF-8");}

    
}