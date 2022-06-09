package techproed.self_practice.carrental_userstory5;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@name='car']")
    public WebElement carSelectionDropDown;

    @FindBy(xpath ="//input[@name='pickUpLocation']")
    public WebElement pickUpLocation;

    @FindBy(xpath ="//input[@name='dropOfLocation']")
    public WebElement dropOfLocation;

    @FindBy(xpath ="//input[@name='pickUpDate']")
    public WebElement pickUpDate;

    @FindBy(xpath ="//input[@name='pickUpTime']")
    public WebElement pickUpTime;

    @FindBy(xpath ="//input[@name='dropOffDate']")
    public WebElement dropOffDate;

    @FindBy(xpath ="//input[@name='dropOffTime']")
    public WebElement dropOffTime;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement continueReservationBtn;

    @FindBy(xpath = "//div[text()='Please first login']")
    public WebElement errorMessage;
}
