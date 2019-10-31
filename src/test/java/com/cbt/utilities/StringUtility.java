package com.cbt.utilities;

public class StringUtility {
    public static String verifyEquals(String expected, String actual){
        if(expected.equals(actual)){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
    public static String verifyStartWith(String URL, String str){
        if(URL.startsWith(str)){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
    public static String verifyContains(String Url, String title){
        if(Url.contains(title)){
            return "PASS";
        }else{
            return "FAIL";
        }
    }
}
