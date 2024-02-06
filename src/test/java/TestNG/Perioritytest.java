package TestNG;

import org.testng.annotations.Test;

public class Perioritytest {
    @Test(priority = 2)
    void setup()
    {
        System.out.println("Opening Browser");
    }
    @Test(priority = 1)
    void login()
    {
        System.out.println("This is login test");
    }
    @Test(priority = 3)
    void Teardown()
    {
        System.out.println("closing browser");
    }
}

