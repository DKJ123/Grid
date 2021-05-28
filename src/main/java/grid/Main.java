package grid;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String [] args) throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "C://Selenium jars and drivers//Drivers//ChromeDriver/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        String url = "http://3.90.236.221:4444/wd/hub";
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setPlatform(Platform.ANDROID);
        WebDriver driver = new RemoteWebDriver(new URL(url), options);
        driver.get("https://Test.Com");
        System.out.println(driver.getCurrentUrl());
        driver.quit();

    }
}
