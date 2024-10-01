package com.sample.project.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class SearchIphonePriceSteps {
    WebDriver driver;
    @Given("User navigate to flipkart.com")
    public void navigateToFlipkart() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();
    }
    @When("User search for {string}")
    public void searchIphone(String productName) {
        WebElement searchIphone = driver.findElement(By.name("q"));
        searchIphone.sendKeys(productName);
        searchIphone.submit();
    }
    @Then("User should see the list of iphone prices")
    public void printListOfIphonePrices() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        List<WebElement> iphonePriceElements = driver.findElements(By.xpath("//div[contains(@class, 'cN1yYO')]"));
        System.out.println("Number of iphones available in page  " + iphonePriceElements.size());

        for (WebElement price : iphonePriceElements) {
            System.out.println(price.getText());
        }
    }
    @And("User should see the list of iphone models")
    public void listOfIphoneModelName() {
        List<WebElement> iphoneModelElements = driver.findElements(By.xpath("//div[contains(@class, 'KzDlHZ')]"));
        System.out.println("Number of iphones available in page  " + iphoneModelElements.size());

        for (WebElement iphoneModels : iphoneModelElements) {
            System.out.println(iphoneModels.getText());
        }
    }

}