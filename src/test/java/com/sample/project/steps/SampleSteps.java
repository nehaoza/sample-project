package com.sample.project.steps;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSteps {

    @Given("Sample step is executed")
    // Setup ChromeDriver using WebDrivermanager
    public void sample_step_is_executed() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

// Open Amazon website
        driver.get("https://www.amazon.co.uk/");

    }
}
