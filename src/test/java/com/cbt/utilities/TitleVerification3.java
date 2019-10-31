package com.cbt.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com",
                "https://wayfair.com", "https://walmart.com", "https://westelm.com");

        for(String each:urls){
            WebDriver driver1 = BrowserFactory.getDriver("chrome");
            driver1.get(each);
            String title = driver1.getTitle();
            String t = title.toLowerCase().replace(" ","");
            String Url = driver1.getCurrentUrl();
            System.out.println(StringUtility.verifyContains(Url,t));
            driver1.close();
        }
    }
}
