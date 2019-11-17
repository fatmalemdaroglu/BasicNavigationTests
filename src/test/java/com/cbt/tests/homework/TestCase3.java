package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/");
        driver.findElement(By.linkText("Multiple Buttons")).click();
        driver.findElement(By.xpath("/html/body/div/div[2]/div/div[1]/button[1]")).click();
        WebElement message = driver.findElement(By.id("result"));
        String expectedMessage = "Clicked on button one!";
        String result = StringUtility.verifyEquals(expectedMessage,message.getText());
        System.out.println(result);
        driver.close();
    }
}