package techproed.practice_session.AutomationPractice.TestCase14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class Elements {

    public Elements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "scrollUp")
    public WebElement scrollUpButton;
    @FindBy(xpath = "(//div[@class='col-sm-4'])[10]")
    public WebElement whiteWomenShirt;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[17]")
    public WebElement whiteShirtAddCart;
    @FindBy(xpath = "//*[text()='Continue Shopping']")
    public WebElement continueShopping;
    @FindBy(xpath = "(//div[@class='col-sm-4'])[17]")
    public WebElement pinkDress;
    @FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[31]")
    public WebElement pinkDressAddCart;
    @FindBy(linkText = "Cart")
    public WebElement cartPage;
    @FindBy(xpath = "//*[text()='Shopping Cart']")
    public WebElement shoppingCartText;
    @FindBy(linkText = "Proceed To Checkout")
    public WebElement proceedToCheckout;
    @FindBy(xpath = "(//a[@href='/login'])[2]")
    public WebElement registerButton;
    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameBox;
    @FindBy(xpath = "(//input[@name='email'])[2]")
    public WebElement emailBox;
    @FindBy(xpath = "//*[text()='Signup']")
    public WebElement signUpButton;
    @FindBy(xpath = "//*[text()='Enter Account Information']")
    public WebElement accountInformationText;
}
