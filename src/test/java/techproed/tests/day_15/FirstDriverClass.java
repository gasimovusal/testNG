package techproed.tests.day_15;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class FirstDriverClass {
    @Test
    public void firstDriverClass(){
        Driver.getDriver().get("https://www.techproeducation.com");
        Driver.closeDriver();
    }
}
