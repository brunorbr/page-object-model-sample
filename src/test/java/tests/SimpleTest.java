package tests;

import org.junit.jupiter.api.*;
import pages.HomePage;
import pages.SignInPage;

public class SimpleTest extends BaseTest{
    private final String TEST_USER = "bolinhoTenhoDiverticulite";
    private final String PASSWORD = "tataWerneck123";
    HomePage homePage;
    SignInPage signInPage;

    @Test
    @DisplayName("Teste sem nome do miojo")
    public void signInWithInvalidData(){
        driver.get("https://github.com/");
        homePage = new HomePage(driver);
        signInPage = homePage.clickOnSignInButton(driver);
        signInPage.inputLoginData(TEST_USER);
        signInPage.inputPasswordData(PASSWORD);
        signInPage.clickSignInButton();
        Assertions.assertTrue(signInPage.checkErrorMessageVisibility());
    }
}
