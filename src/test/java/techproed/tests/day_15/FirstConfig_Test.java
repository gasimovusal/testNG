package techproed.tests.day_15;

import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class FirstConfig_Test {

    @Test
    public void firstConfigTest(){
        //        Driver.getDriver().get("https://www.techproeducation.com");//hard code
        // instead of using above code, we can use this, calling data from ConfigReader class9
        Driver.getDriver().get(ConfigReader.getProperty("techproed_url"));
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
        Driver.closeDriver();
    }
}
