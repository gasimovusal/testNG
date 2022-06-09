package techproed.self_practice.carrental_userstory5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class Options {

    public Options(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//option[@value='13']")
    public WebElement car;
    @FindBy(xpath = "//*[text()='New York']")
    public WebElement pickUpLocation;
}
