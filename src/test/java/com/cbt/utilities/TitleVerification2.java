package com.cbt.utilities;

import org.openqa.selenium.WebDriver;
import java.util.Arrays;
import java.util.List;

public class TitleVerification2 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com", "https://walmart.com", "https://westelm.com");
        WebDriver driver = BrowserFactory.getDriver("chrome");
        for (String each : urls) {
            driver.get(each);
            String title = driver.getTitle();
            String t = title.toLowerCase().replace(" ", "");
            String Url = driver.getCurrentUrl();
            System.out.println(StringUtility.verifyContains(Url, t));
        }
        driver.quit();
    }
}
