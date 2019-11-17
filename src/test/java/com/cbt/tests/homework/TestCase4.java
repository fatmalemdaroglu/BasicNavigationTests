package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        assert driver != null;
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("firstname")).sendKeys("123");
        String expectedResult = "first name can only consist of alphabetical letters";
        WebElement actualResult = driver.findElement(By.xpath("//small[text()='first name can only consist of alphabetical letters']"));
        String result = StringUtility.verifyEquals(expectedResult,actualResult.getText());
        System.out.println(result);
        driver.close();
    }
}
