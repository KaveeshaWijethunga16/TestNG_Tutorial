package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPriority {

    @Test(priority = 0)
    public void TestLogin() {
        System.out.println("TestLogin");
        Assert.assertEquals(1, 1);
    }

    @Test(priority = 1)
    public void TestCreate() {
        System.out.println("TestCreate");
    }

    @Test(enabled = false)
    public void TestEdit() {
        System.out.println("TestEdit");
    }

    @Test(priority = 3)
    public void TestDelete() {
        System.out.println("TestDelete");
    }

    @Test(priority = 4)
    public void TestLogout() {
        System.out.println("TestLogout");
    }


}
