package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageObjectBase{

    @FindBy(id = "login_field")
    WebElement loginField;
    @FindBy(id = "password")
    WebElement passwordField;
    @FindBy(xpath = "//input[@name=\"commit\"]")
    WebElement signButton;
    @FindBy(xpath = "//div[@class=\"container-lg px-2\"]")
    WebElement errorMessage;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void inputLoginData(String userData){
        loginField.sendKeys(userData);
    }

    public void inputPasswordData(String password){
        passwordField.sendKeys(password);
    }

    public boolean checkErrorMessageVisibility(){
        return errorMessage.isDisplayed();
    }

    public void clickSignInButton(){
        signButton.click();
    }
}
