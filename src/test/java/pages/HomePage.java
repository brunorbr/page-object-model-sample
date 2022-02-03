package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObjectBase {
    private WebDriver driver;

    @FindBy(xpath = "//a[contains(text(), \"Sign in\")]")
    WebElement signInButton;

    public HomePage(WebDriver driver){
        super(driver);
    }

    public SignInPage clickOnSignInButton(WebDriver driver){
        signInButton.click();
        return new SignInPage(driver);
    }




}
