package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumTestDockering {

    @Test
    public void SeleniumGridTest() throws MalformedURLException {
        // Define ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Set capabilities
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(ChromeOptions.CAPABILITY, options);

        // Set the URL of the Selenium Grid hub
        URL url = new URL("http://localhost:4445/wd/hub");

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



