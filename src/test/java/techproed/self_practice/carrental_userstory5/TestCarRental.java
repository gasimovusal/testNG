package techproed.self_practice.carrental_userstory5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

import java.util.List;

public class TestCarRental {

    MainPage mainPage;
    Options options;

    @Test
    public void testMainPage(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        mainPage = new MainPage();
        options = new Options();
        Select carSelection = new Select(mainPage.carSelectionDropDown);
        ReusableMethods.selectRandomTextFromDropdown(carSelection);

        mainPage.pickUpLocation.sendKeys("asdf");
        mainPage.dropOfLocation.sendKeys("fsg");

        mainPage.pickUpDate.sendKeys("06182022");
        mainPage.pickUpTime.sendKeys("0900AM");
        mainPage.dropOffDate.sendKeys("06202022");
        mainPage.dropOffTime.sendKeys("0900AM");
        mainPage.continueReservationBtn.click();
        ReusableMethods.waitFor(2);
        Assert.assertTrue(mainPage.errorMessage.isDisplayed());

    }

    @AfterTest
    public void tearDown(){
        Driver.closeDriver();
    }
}
