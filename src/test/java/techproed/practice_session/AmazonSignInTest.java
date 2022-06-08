package techproed.practice_session;

import com.github.javafaker.Faker;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonSignInTest {

    AmazonSignInPage amazonSignInPage = new AmazonSignInPage();

    @Test
    public void amazonSignInTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url"));
        amazonSignInPage.signInTab.click();
        amazonSignInPage.emailBox.sendKeys(Faker.instance().internet().emailAddress());
        amazonSignInPage.continueButton.click();
        String warningMessage = amazonSignInPage.warningMessage.getText();
        Assert.assertEquals(warningMessage, "There was a problem");
        amazonSignInPage.needHelp.click();
        amazonSignInPage.forgotPasswordLink.click();
        Assert.assertTrue(amazonSignInPage.passwordAssistance.isDisplayed());
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().back();
        amazonSignInPage.createAccountButton.click();
        String createAccountText = amazonSignInPage.createAccountText.getText();
        Assert.assertEquals(createAccountText, "Create account");

        Driver.closeDriver();

    }
}
