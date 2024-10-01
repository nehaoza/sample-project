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
public class SampleSteps {
    WebDriver driver;
    @Given("Initial setUp to navigate flipkart.com")
    // Setup ChromeDriver using WebDrivermanager
    public void sample_step_is_executed() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Open Flipkart website
        driver.get("https://www.flipkart.com/");

        // Maximise the browser window
        driver.manage().window().maximize();
    }

    @When("User search for {string}")
    public void searchIphone(String productName) {
        //find the search box and enter the product name
        WebElement searchIphone = driver.findElement(By.name("q"));
        searchIphone.sendKeys(productName);
        searchIphone.submit();
    }
    @Then("User should see the list of iphone prices")
    public void printListOfIphonePrices() {
        //Wait for search results to load
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Get all elements that display prices of iphone
        List<WebElement> iphonePriceElements = driver.findElements(By.xpath("//div[contains(@class, 'cN1yYO')]"));
        System.out.println("Number of iphones available in page  " + iphonePriceElements.size());

        for (WebElement price : iphonePriceElements) {
            System.out.println(price.getText());
        }
    }
    @And("User should see the list of iphone models")
    public void listOfIphoneModelName() {
        //Get all elements that display models of iphone
        List<WebElement> iphoneModelElements = driver.findElements(By.xpath("//div[contains(@class, 'KzDlHZ')]"));
        System.out.println("Number of iphones available in page  " + iphoneModelElements.size());

        for (WebElement iphoneModels : iphoneModelElements) {
            System.out.println(iphoneModels.getText());
        }
    }

}