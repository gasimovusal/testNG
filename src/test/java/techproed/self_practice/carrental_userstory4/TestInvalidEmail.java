package techproed.self_practice.carrental_userstory4;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class TestInvalidEmail {

    /*
Name:
Login screen error messages
Description:
User should see error message when a valid email domain is not entered
Acceptance Criteria:
As admin or customer, I should be able to see error message, when I do not provide a complete email address in email address box
Error Message: email must be a valid email
WhenI enter a valid email domain, then I should not see the error message
https://email-verify.my-addr.com/list-of-most-popular-email-domains.php
  */

    SignInPage signInPage;
    @Test
    public void signInPage(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        signInPage = new SignInPage();
        signInPage.loginPage.click();
        signInPage.emailBox.sendKeys(ConfigReader.getProperty("fake_email"));
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_password"));
        signInPage.loginButton.click();
        Assert.assertTrue(signInPage.invalidEmailMessage.isDisplayed());
        ReusableMethods.waitFor(2);

        Driver.getDriver().navigate().refresh();
        signInPage.emailBox.sendKeys(ConfigReader.getProperty("customer_username"));
        signInPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_password"));
        Assert.assertFalse(signInPage.invalidEmailMessage.isDisplayed());
    }

    @AfterTest
    public void tearDown(){
        Driver.closeDriver();
    }
}
