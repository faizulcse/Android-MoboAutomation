package pages.android;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;

public class TestPage extends BasePage {
    public TestPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id ="onboarding_skip_button")  WebElement skipButton;
    @FindBy(id ="intro_login") WebElement loginButton;

    public void testClick(){
        try {
            Thread.sleep(2000);
            skipButton.click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void loginClick(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginButton.click();
    }
}
