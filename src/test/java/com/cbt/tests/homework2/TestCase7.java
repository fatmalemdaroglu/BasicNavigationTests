package com.cbt.tests.homework2;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7 {

    @Test
    public void test7(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.id("file-upload")).sendKeys("C:/Users/Cocuklar/Desktop/testfile.txt");
        Wait.wait(2);
        driver.findElement(By.id("file-submit")).click();
        String ExpectedHeader = "File Uploaded!";
        String ActualHeader = driver.findElement(By.cssSelector("div h3")).getText();
        Assert.assertEquals(ActualHeader,ExpectedHeader);
        String ExpectedFileName = "testfile.txt";
        String ActualFileName = driver.findElement(By.id("uploaded-files")).getText();
        Assert.assertEquals(ActualFileName,ExpectedFileName);
        driver.quit();
    }
}
