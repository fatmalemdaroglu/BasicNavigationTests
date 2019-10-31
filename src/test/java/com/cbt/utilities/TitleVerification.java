package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                                    "http://practice.cybertekschool.com/dropdown",
                                    "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get(urls.get(0));
        String firstPageTitle = driver.getTitle();
        String Url1 = driver.getCurrentUrl();
        System.out.println(StringUtility.verifyStartWith(Url1,"http://practice.cybertekschool.com"));
        driver.get(urls.get(1));
        String secondPageTitle = driver.getTitle();
        System.out.println(StringUtility.verifyEquals(firstPageTitle,secondPageTitle));
        String Url2 = driver.getCurrentUrl();
        System.out.println(StringUtility.verifyStartWith(Url2,"http://practice.cybertekschool.com"));
        driver.get(urls.get(2));
        String thirdPageTitle = driver.getTitle();
        System.out.println(StringUtility.verifyEquals(firstPageTitle,thirdPageTitle));
        String Url3 = driver.getCurrentUrl();
        System.out.println(StringUtility.verifyStartWith(Url3,"http://practice.cybertekschool.com"));
        driver.quit();
    }
}
