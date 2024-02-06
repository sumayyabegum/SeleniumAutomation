package TestNG;

import org.testng.annotations.Test;

public class Dependency {


    @Test(alwaysRun = true)
    void startcar()
    {
        System.out.println("car started");
    }
    @Test(dependsOnMethods = {"startcar"})
    void drivecar()
    {
        System.out.println("drive car");
    }
    @Test(dependsOnMethods = {"drivecar"})
    void stopcar()
    {
        System.out.println("car stoped");
    }
    @Test(dependsOnMethods = {"drive car","stopcar"})
    void parkcar()
    {
        System.out.println("car parked");
    }
}
