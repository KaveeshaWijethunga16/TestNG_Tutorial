package dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {




    @Test(dataProvider = "getData")
    public  void loginTest(String name,String password){
        System.out.println("Credential " +name +" " +password);
    }


    @DataProvider
    public Object[][] getData() {
        Object[][] data = {{"abc@gmail.com", "abc"}, {"xyz@gmail.com", "xyz"}, {"nmo@gmail.com", "nmp"}};
        return data;
    }

}
