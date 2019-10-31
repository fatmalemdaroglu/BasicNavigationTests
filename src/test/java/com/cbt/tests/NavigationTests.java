package com.cbt.tests;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import com.cbt.utilities.Wait;
import org.openqa.selenium.WebDriver;

public class NavigationTests {
    public static void main(String[] args) {
        getChrome();
        getFireFox();
        getEdge();
    }
    public static void getChrome(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://google.com");
        String titleFirst = driver.getTitle();
        System.out.println(titleFirst);
        Wait.wait(1);
        driver.navigate().to("https://etsy.com");
        String titleSecond = driver.getTitle();
        System.out.println(titleSecond);
        Wait.wait(1);
        driver.navigate().back();
        System.out.println(StringUtility.verifyEquals(titleFirst,driver.getTitle()));
        driver.navigate().forward();
        System.out.println(StringUtility.verifyEquals(titleSecond,driver.getTitle()));
        driver.quit();
    }

    public static void getFireFox(){
        WebDriver driver = BrowserFactory.getDriver("firefox");
        driver.get("http://google.com");
        String titleFirst = driver.getTitle();
        System.out.println(titleFirst);
        Wait.wait(1);
        driver.navigate().to("https://etsy.com");
        String titleSecond = driver.getTitle();
        System.out.println(titleSecond);
        Wait.wait(1);
        driver.navigate().back();
        System.out.println(StringUtility.verifyEquals(titleFirst,driver.getTitle()));
        driver.navigate().forward();
        System.out.println(StringUtility.verifyEquals(titleSecond,driver.getTitle()));
        driver.quit();
    }

    public static void getEdge() {
        WebDriver driver = BrowserFactory.getDriver("edge");
        driver.get("http://google.com");
        String titleFirst = driver.getTitle();
        System.out.println(titleFirst);
        Wait.wait(1);
        driver.navigate().to("https://etsy.com");
        String titleSecond = driver.getTitle();
        System.out.println(titleSecond);
        Wait.wait(1);
        driver.navigate().back();
        System.out.println(StringUtility.verifyEquals(titleFirst,driver.getTitle()));
        driver.navigate().forward();
        System.out.println(StringUtility.verifyEquals(titleSecond,driver.getTitle()));
        driver.quit();
    }
}
