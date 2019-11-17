package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase8 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        assert driver != null;
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Registration Form")).click();
        driver.findElement(By.name("phone")).sendKeys("5711234354");
        String expectedResult = "Phone format is not correct";
        WebElement actualResult = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[6]/div/small[2]"));
        String result = StringUtility.verifyEquals(expectedResult,actualResult.getText());
        System.out.println(result);
        driver.close();
    }
}
