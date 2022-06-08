package techproed.tests.day_15.smoketests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class NegativeLogin {

    HomePage homePage;
    LoginPage loginPage;
    Faker faker;
    @Test
    public void negativeLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        homePage = new HomePage();
        loginPage = new LoginPage();
        faker = new Faker();
        String fakeUsername=faker.internet().emailAddress();
        String fakePassword=faker.internet().password();
        System.out.println(fakeUsername);
        System.out.println(fakePassword);
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(fakeUsername);
        loginPage.password.sendKeys(fakePassword);
        loginPage.loginButton.click();
        ReusableMethods.waitForVisibility(loginPage.invalidCredentialsErrorMessage,5);
        Assert.assertTrue(loginPage.invalidCredentialsErrorMessage.isDisplayed());
        Driver.closeDriver();

    }
}
