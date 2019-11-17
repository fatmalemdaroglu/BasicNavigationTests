package com.cbt.tests.homework2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;


public class TestCase1_5 {

    private WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
    }
    @Test(description = "Verify that warning message is displayed")
    public void test1(){
        driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
        WebElement warning = driver.findElement(By.xpath("//*[@id='registrationForm']/div[8]/div/small[2]"));
        String expectedMessage = "The date of birth is not valid";
        String actualMessage = warning.getText();
        Assert.assertEquals(expectedMessage,actualMessage);
    }

    @Test(description ="Verify that following options for programming languages are displayed")
    public void test2(){
        List<WebElement> options = driver.findElements(By.className("form-check-label"));
        for(WebElement option:options){
            if(option.isDisplayed()){
                System.out.println("Option is displayed: "+option.getText());
            }else{
                System.out.println("option is not displayed.");
            }
        }
    }
    @Test(description = "Verify first name warning message is displayed")
    public void test3(){
        driver.findElement(By.name("firstname")).sendKeys("f");
        WebElement warningMessage = driver.findElement(By.xpath("//*[@id='registrationForm']/div[1]/div/small[2]"));
        Assert.assertTrue(warningMessage.isDisplayed(),"Warning Message is: first name must be more than 2 and less than 64 characters long");
    }
    @Test(description = "Verify last name warning message is displayed")
    public void test4(){
        driver.findElement(By.name("lastname")).sendKeys("f");
        WebElement warningMessage = driver.findElement(By.xpath("//*[@id='registrationForm']/div[2]/div/small[2]"));
        if(warningMessage.isDisplayed()){
            System.out.println("Warning message is: "+warningMessage.getText());
        }else{
            System.out.println("Warning Message is not displayed.");
        }
    }
    @Test(description = "Verify registration form")
    public void Test5(){
        driver.findElement(By.name("firstname")).sendKeys("Fatma");
        driver.findElement(By.name("lastname")).sendKeys("Alemdar");
        driver.findElement(By.name("username")).sendKeys("fatmalemdar");
        driver.findElement(By.name("email")).sendKeys("aselmaliye@gmail.com");
        driver.findElement(By.name("password")).sendKeys("selmaliye");
        driver.findElement(By.name("phone")).sendKeys("206-693-1371");
        driver.findElement(By.cssSelector("[value='female']")).click();
        driver.findElement(By.name("birthday")).sendKeys("08/11/1983");
        Select select1 = new Select(driver.findElement(By.name("department")));
        select1.selectByValue("DE");
        Select select2 = new Select(driver.findElement(By.name("job_title")));
        select2.selectByVisibleText("SDET");
        driver.findElement(By.cssSelector("[value='java']")).click();
        driver.findElement(By.id("wooden_spoon")).click();
        WebElement Message = driver.findElement(By.cssSelector("div p"));
        Assert.assertEquals(Message.getText(),"You've successfully completed registration!");
    }

    @AfterMethod
    public void teardown(){
        driver.quit();
    }


}
