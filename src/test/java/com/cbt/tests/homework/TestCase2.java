package com.cbt.tests.homework;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class TestCase2 {
    public static void main(String[] args) {
    WebDriver driver = BrowserFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/");
        ArrayList<WebElement> list = new ArrayList<>(driver.findElements(By.className("list-group-item")));
    int listNumber = list.size();
        System.out.println(listNumber);
    if(listNumber == 48){
        System.out.println("pass");
    }else{
        System.out.println("fail");
    }
    driver.close();
    }
}
