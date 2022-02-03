package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;
import pages.SignInPage;

public class SimpleTest {
    private WebDriver driver;
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
        Assertions.assertFalse(signInPage.checkErrorMessageVisibility());
    }

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

    @BeforeAll
    static void setupClass(){
        WebDriverManager.chromedriver().setup();
    }
}
