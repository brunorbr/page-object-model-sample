package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectBase {
    public PageObjectBase(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
