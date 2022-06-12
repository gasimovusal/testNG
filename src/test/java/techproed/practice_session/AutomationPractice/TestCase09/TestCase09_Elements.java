package techproed.practice_session.AutomationPractice.TestCase09;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TestCase09_Elements {

    public TestCase09_Elements(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Home")
    public WebElement homePage;
    @FindBy(xpath = "//a[@href='/products']")
    public WebElement productsPage;
    @FindBy(xpath = "//*[text()='All Products']")
    public WebElement allProductsText;
    @FindBy(id = "search_product")
    public WebElement searchBox;
    @FindBy(id = "submit_search")
    public WebElement searchButton;
    @FindBy(xpath = "//*[text()='Searched Products']")
    public WebElement searchProductsText;
    @FindBy(xpath = "(//*[text()='Men Tshirt'])[2]")
    public WebElement menTshirt;

}
