package TestNG;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = {"Sanity"})
    void test1()
    {
        System.out.println("This is test1");
    }
    @Test(groups = {"Sanity"})
    void test2()
    {
        System.out.println("This is test2");
    }
    @Test(groups = {"regression"})
    void test3()
    {
        System.out.println("this is test3");
    }
    @Test(groups = {"regression"})
    void test4()
    {
        System.out.println("this is test4");
    }
}