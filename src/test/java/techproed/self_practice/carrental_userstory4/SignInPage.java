package techproed.self_practice.carrental_userstory4;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class SignInPage {

    public SignInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Login")
    public WebElement loginPage;
    @FindBy(id = "formBasicEmail")
    public WebElement emailBox;
    @FindBy(id = "formBasicPassword")
    public WebElement passwordBox;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement loginButton;
    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement invalidEmailMessage;
}
