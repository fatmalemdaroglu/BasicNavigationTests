package com.cbt.tests.homework2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase6 {
    @Test
    public void Test6(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://www.tempmailaddress.com/");
        String email = driver.findElement(By.id("email")).getText();
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.cssSelector("[href='/sign_up']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Fatma Alem");
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement message = driver.findElement(By.name("signup_message"));
        Assert.assertTrue(message.isDisplayed());
        driver.navigate().to("https://www.tempmailaddress.com/");
        driver.findElement(By.xpath("//*[@id='schranka']/tr[1]/td[1]")).click();
        String emailAddress = driver.findElement(By.cssSelector("[id='odesilatel']")).getText();
        Assert.assertEquals(emailAddress,"do-not-reply@practice.cybertekschool.com");
        String subject = driver.findElement(By.cssSelector("[id='predmet']")).getText();
        Assert.assertEquals(subject,"Thanks for subscribing to practice.cybertekschool.com!");
        driver.quit();
    }
}
