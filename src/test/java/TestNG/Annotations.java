package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
    @BeforeClass
    void beforeclass()
    {
        System.out.println("Execute before class");
    }
    @BeforeMethod
    void beforemethod()
    {
        System.out.println("Execute Before method");
    }
    @AfterMethod
    void aftermethod()
    {
        System.out.println("excute after method");
    }
    @Test
    void test1()
    {
        System.out.println("this is test1");
    }
    @Test
    void test2()
    {
        System.out.println("this is test2");
    }
}
