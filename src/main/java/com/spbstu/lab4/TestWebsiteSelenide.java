package com.spbstu.lab4;

public class TestWebsiteSelenide {

    static public HomePageSelenide homePageSelenide;
    static public DifferentElementsPages differentElementsPages;
    public static void init(){
        homePageSelenide = new HomePageSelenide();
        differentElementsPages = new DifferentElementsPages();
    }
}
