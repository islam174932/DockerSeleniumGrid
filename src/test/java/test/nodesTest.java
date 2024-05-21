package test;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class nodesTest {

    @Test(threadPoolSize = 3, invocationCount = 3)
    public void openGoogleOnFirefox() throws MalformedURLException {
        // Define FirefoxOptions
        FirefoxOptions options = new FirefoxOptions();

        // Set capabilities
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);

        // Set the URL of the Selenium Grid hub
        URL url = new URL("http://localhost:4450/wd/hub");

        // Initialize the WebDriver using RemoteWebDriver and connect to the hub
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);

        // Open Google
        driver.get("https://www.google.com/");

        // Print title
        System.out.println("Title of Google on Firefox: " + driver.getTitle());

        // Quit the browser
        driver.quit();
    }

    @Test(threadPoolSize = 4, invocationCount = 4)
    public void openOurPageOnChrome() throws MalformedURLException {
        // Define ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Set capabilities
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(ChromeOptions.CAPABILITY, options);

        // Set the URL of the Selenium Grid hub
        URL url = new URL("http://localhost:4450/wd/hub");

        // Initialize the WebDriver using RemoteWebDriver and connect to the hub
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);

        // Open our web page
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // Print title
        System.out.println("Title of Our Page on Chrome: " + driver.getTitle());

        // Quit the browser
        driver.quit();
    }
}
