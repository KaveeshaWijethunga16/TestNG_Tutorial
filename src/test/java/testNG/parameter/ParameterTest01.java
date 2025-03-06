package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest01 {

    @Test
    @Parameters({"val1" , "val2"})
    public void Sum(int V1 , int v2){

        int finalSum = V1 + v2;
        System.out.println("Final Sum : " + finalSum);
    }
}
