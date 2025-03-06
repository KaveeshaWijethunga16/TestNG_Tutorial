package testNG;

import org.testng.annotations.*;

public class AnnotationHierachyExample {

    @Test
    public void test01() {

        System.out.println("This test 01 ");
    }

    @BeforeMethod
    public void BeforeMethod() {

        System.out.println("This BeforeMethod ");
    }

    @AfterMethod
    public void AfterMethod() {
        System.out.println("This AfterMethod ");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This beforeClass ");

    }

    @AfterClass
    public void afterClass() {
        System.out.println("This afterClass ");

    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This beforesuite ");

    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This aftersuite ");

    }
}
