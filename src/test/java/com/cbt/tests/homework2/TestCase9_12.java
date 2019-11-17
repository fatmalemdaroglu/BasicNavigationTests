package com.cbt.tests.homework2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase9_12 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Status Codes")).click();
    }

    @DataProvider(name = "testData")
    public static Object[][] testData() {
        return new Object[][]{  {"[href='status_codes/200']","This page returned a 200 status code.\n\n" +
                                        "For a definition and common list of HTTP status codes, go here"},
                                {"[href='status_codes/301']","This page returned a 301 status code.\n\n" +
                                        "For a definition and common list of HTTP status codes, go here"},
                                {"[href='status_codes/404']","This page returned a 404 status code.\n\n" +
                                        "For a definition and common list of HTTP status codes, go here"},
                                {"[href='status_codes/500']","This page returned a 500 status code.\n\n" +
                                        "For a definition and common list of HTTP status codes, go here"} };

    }
    @Test(dataProvider = "testData") // this test will run twice, because we have 2 sets of data
    public void testWithDataProvider(String url, String text) {
        driver.findElement(By.cssSelector(url)).click();
        String actual = driver.findElement(By.cssSelector("div p")).getText();
        Assert.assertEquals(actual,text);
    }

    @AfterMethod
    public void teardown () {
        driver.quit();
    }

}


