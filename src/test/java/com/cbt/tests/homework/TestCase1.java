package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        assert driver != null;
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Sign Up For Mailing List")).click();
        driver.findElement(By.name("full_name")).sendKeys("Fatma Alemdar");
        driver.findElement(By.name("email")).sendKeys("aselmaliye@gmail.com");
        driver.findElement(By.name("wooden_spoon")).click();
        WebElement actualMessage = driver.findElement(By.name("signup_message"));
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
        String result = StringUtility.verifyEquals(expectedMessage,actualMessage.getText());
        System.out.println(result);
        driver.close();
    }
}
