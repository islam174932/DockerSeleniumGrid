package test;



import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Firfox {

    @Test
    public void SeleniumGridTest() throws MalformedURLException {
        // Define FirefoxOptions
        FirefoxOptions options = new FirefoxOptions();

        // Set capabilities
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

        // Set the URL of the Selenium Grid hub
        URL url = new URL("http://localhost:4444/wd/hub");

        // Initialize the WebDriver using RemoteWebDriver and connect to the hub
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);

        // Open the web application
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Print title
        System.out.println("Title: " + driver.getTitle());

        // Quit the browser
        driver.quit();
    }
}
