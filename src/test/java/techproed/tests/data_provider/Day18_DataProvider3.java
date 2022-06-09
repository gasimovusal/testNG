package techproed.tests.data_provider;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.DefaultPage;
import techproed.pages.HomePage;
import techproed.pages.LoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtil;
import techproed.utilities.ReusableMethods;

import java.io.IOException;

public class Day18_DataProvider3 {

    @DataProvider(name = "customer_login_data")
    public Object[][] dataProviderMethod(){
//        this method will be used to get the data from excel sheet

//        path of the excel sheet
        String path = "./src/test/java/resources/mysmoketestdata.xlsx";
//        customer data sheet
        String customerSheet="customer_info";
//        Use ExcelUtil to
        ExcelUtil excelUtil= new ExcelUtil(path,customerSheet);

        Object[][] empolyeeCreds = excelUtil.getDataArrayWithoutFirstRow();
        return empolyeeCreds;
    }


    HomePage homePage;
    LoginPage loginPage;
    DefaultPage defaultPage;

    public void login(){
//        going to the home page url
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
//        initiating pages
        homePage = new HomePage();
        loginPage = new LoginPage();
        defaultPage = new DefaultPage();
        try{
            homePage.homeLoginButton.click();
        }catch (Exception e){
//            e.printStackTrace();
        }
        try{
            defaultPage.userID.click();
            defaultPage.logOut.click();
            defaultPage.OK.click();
            homePage.homeLoginButton.click();
        }catch (Exception e){
        }
    }

    @Test(dataProvider = "customer_login_data")
    public void customerLogin(String user, String pass) throws IOException {
        login();
        loginPage.username.sendKeys(user);
        loginPage.password.sendKeys(pass.substring(0, 5));
        loginPage.loginButton.click();
        ReusableMethods.waitFor(1);
        Assert.assertTrue(defaultPage.userID.isDisplayed());
        ReusableMethods.getScreenshot("ManagerLoginTest");
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }
}
