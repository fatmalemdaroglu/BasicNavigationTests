package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase6 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        assert driver != null;
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("username")).sendKeys("user");
        String expectedResult = "The username must be more than 6 and less than 30 characters long";
        WebElement actualResult = driver.findElement(By.xpath("//small[contains(text(),'The username must')]"));
        String result = StringUtility.verifyEquals(expectedResult,actualResult.getText());
        System.out.println(result);
        driver.close();
    }
}
