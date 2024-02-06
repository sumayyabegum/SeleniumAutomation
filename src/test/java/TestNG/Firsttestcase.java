package TestNG;

import org.testng.annotations.Test;

public class Firsttestcase {
    @Test
    void setup()
    {
        System.out.println("Opening Browser");
    }
    @Test
    void login()
    {
        System.out.println("This is login test");
    }
    @Test
    void teardown()
    {
        System.out.println("closing browser");
    }
}
