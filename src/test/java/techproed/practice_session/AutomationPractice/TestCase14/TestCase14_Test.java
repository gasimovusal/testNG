package techproed.practice_session.AutomationPractice.TestCase14;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.JSUtils;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class TestCase14_Test {

    Elements allElements;
    Faker faker;

    @Test
    public void test() throws IOException {

        Driver.getDriver().get(ConfigReader.getProperty("automation_url"));
        allElements = new Elements();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        if(allElements.scrollUpButton.isDisplayed()){
            allElements.scrollUpButton.click();
        }
        actions.moveToElement(allElements.whiteWomenShirt).perform();
        allElements.whiteShirtAddCart.click();
        allElements.continueShopping.click();
        actions.moveToElement(allElements.pinkDress).perform();
        allElements.pinkDressAddCart.click();
        allElements.continueShopping.click();
        allElements.cartPage.click();
        Assert.assertTrue(allElements.shoppingCartText.isDisplayed());
        allElements.proceedToCheckout.click();
        allElements.registerButton.click();
        faker = new Faker();
        allElements.nameBox.sendKeys(faker.name().fullName());
        allElements.emailBox.sendKeys(faker.internet().emailAddress());
        allElements.signUpButton.click();
        Assert.assertTrue(allElements.accountInformationText.isDisplayed());
        ReusableMethods.waitFor(2);

    }

    @AfterTest
    public void tearDown(){
        Driver.closeDriver();
    }
}
