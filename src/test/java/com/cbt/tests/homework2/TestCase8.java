package com.cbt.tests.homework2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase8 {
    @Test
    public void test8(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Autocomplete")).click();
        driver.findElement(By.id("myCountry")).sendKeys("U");
        driver.findElement(By.cssSelector("div:nth-child(5)")).click();
        driver.findElement(By.cssSelector("[value='Submit']")).click();
        String actual = driver.findElement(By.id("result")).getText();
        String expected = "You selected: United States of America";
        Assert.assertEquals(actual,expected);
        driver.quit();
    }
}
