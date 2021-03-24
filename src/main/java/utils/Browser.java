package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser {

    public static WebDriver driver;
    public static By by;

    public static void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\selenium-java-3.141.59\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void quit(){
        driver.quit();
    }
}
