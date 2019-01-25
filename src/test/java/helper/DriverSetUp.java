package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class DriverSetUp {

    public static WebDriver driver;
    public static Properties prop = null;
    public static DriverSetUp instanc = null;

    public static DriverSetUp getInstanc(){
        if (instanc == null){
            instanc = new DriverSetUp();
            //instanc.startDriver();
        }
        return instanc;
    }

    public void startDriver() {
        try {
            prop = new Properties();
            prop.load(new FileInputStream(AppConstant.ANDROID_DEVICE_SETTING));
            DesiredCapabilities cap = new DesiredCapabilities();
            cap.setCapability("deviceName", prop.getProperty("deviceName"));
            cap.setCapability("platformName", prop.getProperty("platformName"));
            cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
            cap.setCapability("app", prop.getProperty("app"));
            cap.setCapability("appPackage", prop.getProperty("appPackage"));
            cap.setCapability("appActivity", prop.getProperty("appActivity"));
            cap.setCapability("fullReset", prop.getProperty("fullReset"));
            cap.setCapability("noReset", prop.getProperty("noReset"));
            driver = new RemoteWebDriver(new URL(prop.getProperty("serverURL")), cap);
            setDriver(driver);
        }
        catch (Exception e) {
            System.out.println(AppConstant.APPIUM_ERROR);
            System.out.println(AppConstant.DEVICE_CONFIG_ERROR);
            System.exit(0);
        }
    }

    public void stopDriver(){
        if(driver!=null){
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }
}
