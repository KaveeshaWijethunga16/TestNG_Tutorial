package dataProvider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import simple.calculator.ArithmeticOperator;

public class ArithmeticCalculatorDataProvider {

    @Test(dataProvider = "setData")
    public void testSum(int num1, int num2, int expectedoutput) {
        Assert.assertEquals(ArithmeticOperator.calSum(num1, num2), expectedoutput ,"Failed to cal sum");

    }

    @DataProvider(name = "setData")
    public Object[][] getData(){
        Object[][] data = {
                {1,1,2},
                {0,-1,-1},
                {2,3,5}


        };
        return data;
    }
}
