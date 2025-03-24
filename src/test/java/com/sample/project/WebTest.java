package com.sample.project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {


    private WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();

    }
    @Test
    public void test() {
        driver = new ChromeDriver();

        driver.get("https://www.flipkart.com/");

        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.close();
    }
}
