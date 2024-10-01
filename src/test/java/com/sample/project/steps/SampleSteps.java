package com.sample.project.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSteps {
    WebDriver driver;

    @Given("Initial setUp to navigate flipkart.com")
    // Setup ChromeDriver using WebDrivermanager
    public void sample_step_is_executed() {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();

   // Open Amazon website
        driver.get("https://www.flipkart.com/");

  // Maximise the browser window
        driver.manage().window().maximize();
    }

@When("User search for {string}")
    public void searchIphone(String productName){
        //find the search box and enter the product name
        WebElement searchIphone = driver.findElement(By.name("q"));
        searchIphone.sendKeys(productName);
        searchIphone.submit();
}

}
