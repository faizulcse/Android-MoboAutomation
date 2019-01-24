package pages;

import helper.DriverSetUp;
import org.openqa.selenium.WebDriver;

public class BasePage extends DriverSetUp{
    public WebDriver driver;

    public BasePage() {
        driver = getDriver();
    }

    public void waitFor(double second) {
        try {
            Thread.sleep((int) (1000 * second));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
