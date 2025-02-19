package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependentOnTest {


    @Test()
    public  void oLevel(){
        System.out.println("oLevel");


    }

    @Test(dependsOnMethods = "oLevel")
    public  void aLevel(){
        System.out.println("aLevel");
    }

    @Test(dependsOnMethods = {"oLevel" , "aLevel"}, alwaysRun = true)
    public  void campus(){
        System.out.println("campus");
    }
}
