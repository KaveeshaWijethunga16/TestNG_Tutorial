package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest03 {


    @Test
    @Parameters("browser")

public void  browserExecution(String browser) {

    System.out.println("Passed browser value is :" + browser);

    if(browser.equalsIgnoreCase("chrome")){
        System.out.println("Browser should open with chrome");
    }else if(browser.equalsIgnoreCase("firefox")){
        System.out.println("Browser should open with  firefox");
    }else{
        System.out.println("Browser should open with  edge");
    }
}
}
