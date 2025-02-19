package testNG;

import org.testng.annotations.Test;

public class GroupTest {

    //s= smoke , R=Regression

    @Test(groups = {"s","R"})
    public void test01(){

        System.out.println("This is smoke and regression test");
    }

    @Test()
    public void test02(){

        System.out.println("This is not smoke and regression test");
    }

    @Test(groups = {"R"})
    public void test03(){

        System.out.println("This is regression test");
    }

    @Test(groups = {"s"})
    public void test04(){

        System.out.println("This is smoke test");
    }
}
