package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.Browser;

import java.security.Key;

public class companyPage {

    public static By companyTab = By.xpath("//a[contains(text(),'Company')]");
    public static By aboutPageTab = By.xpath("//header/div[1]/div[2]/div[2]/div[2]/div[1]/ul[1]/li[5]/ul[1]/li[1]/a[1]");
    public static By contactUs = By.xpath("//body/div[1]/div[1]/a[1]");
    public static By body = By.xpath("/html/body");
    public static By firstName = By.xpath("//input[@id='field0']");
    public static By lastName = By.xpath("//input[@id='field1']");
    public static By country = By.xpath("//select[@id='field7']");
    public static By greece = By.xpath("//option[contains(text(),'GREECE - GR')]");
    public static By checkbox = By.xpath("//body/main[1]/section[1]/div[1]/form[1]/div[3]/div[2]/div[1]/div[1]/label[1]");
    public static By submitButton = By.cssSelector("p[class= 'field-p'] [value='Submit']");


    public static void navigateTo() {
        Browser.driver.get("https://cis.verint.com/contact/");
         }

    public static void scrollDown() {
//        JavascriptExecutor jse = (JavascriptExecutor) Browser.driver;
//        jse.executeScript("window.scrollBy(0, 1500)");
        Browser.driver.findElement(body).sendKeys(Keys.CONTROL, Keys.END);
    }


    public static void fillContactInfo() {

        WebElement firstNameElement = Browser.driver.findElement(firstName);
        firstNameElement.sendKeys("kuci");
        WebElement lastNameElement = Browser.driver.findElement(lastName);
        lastNameElement.sendKeys("muci");
        WebElement countrySelect = Browser.driver.findElement(country);
        Select select = new Select(countrySelect);
        select.selectByValue("GREECE - GR");

    }

    public static void checkCheckbox(){
        WebElement checkboxELement = Browser.driver.findElement(checkbox);
        Actions actions = new Actions(Browser.driver);
        actions.moveToElement(checkboxELement).click().perform();
    }

    public static void verifySubmission() {

        WebElement submitButtonElement = Browser.driver.findElement(submitButton);
        //String submitText =submitButtonElement.getText();
        boolean submit = submitButtonElement.isDisplayed();
        Assert.assertTrue(submit);
       // Assert.assertEquals(submitText, "Submit");
    }
}
