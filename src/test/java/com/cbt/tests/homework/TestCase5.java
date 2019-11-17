package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        assert driver != null;
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("lastname")).sendKeys("123");
        String expectedResult = "The last name can only consist of alphabetical letters and dash";
        WebElement actualResult = driver.findElement(By.xpath("//*[starts-with(text(),'The last name can')]"));
        String result = StringUtility.verifyEquals(expectedResult,actualResult.getText());
        System.out.println(result);
        driver.close();
    }
}
