package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase7 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        assert driver != null;
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("email")).sendKeys("testers@email");
        String expectedResult = "email address is not a valid";
        WebElement actualResult = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[4]/div/small[2]"));
        String result = StringUtility.verifyEquals(expectedResult,actualResult.getText());
        System.out.println(result);
        String expectedResult2 = "Email format is not correct";
        WebElement actualResult2 = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/form/div[4]/div/small[3]"));
        String result2 = StringUtility.verifyEquals(expectedResult2,actualResult2.getText());
        System.out.println(result2);
        driver.close();
    }
}
