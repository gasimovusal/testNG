package techproed.practice_session.AutomationPractice.TestCase09;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class TestCase09_Test {

    /*
1. Launch browser
2. Navigate to url 'http://automationexercise.com'
3. Verify that home page is visible successfully
4. Click on 'Products' button
5. Verify user is navigated to ALL PRODUCTS page successfully
6. Enter product name in search input and click search button
7. Verify 'SEARCHED PRODUCTS' is visible
8. Verify all the products related to search are visible
     */

    TestCase09_Elements allElements;

    @Test
    public void test(){

        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
        allElements = new TestCase09_Elements();
        Assert.assertTrue(allElements.homePage.isDisplayed());
        allElements.productsPage.click();
        Assert.assertTrue(allElements.allProductsText.isDisplayed());
        allElements.searchBox.sendKeys("men tshirt");
        allElements.searchButton.click();
        Assert.assertTrue(allElements.searchProductsText.isDisplayed());
        String shirt = allElements.menTshirt.getText();

    }

    @AfterTest
    public void tearDown(){
        Driver.closeDriver();
    }
}
