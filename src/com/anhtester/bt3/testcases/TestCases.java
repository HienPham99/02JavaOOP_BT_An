package com.anhtester.bt3.testcases;

import com.anhtester.bt3.common.BaseTest;

public class TestCases extends BaseTest {

    public void loginCMS(){
        createDriver();
        System.out.println("Navigation to url: https://cms.anhtester.com/login");
        System.out.println("Click icon Login");
        System.out.println("Input Email field and Password field");
        System.out.println("Click btn Login");
        System.out.println("Verify show my account page. ");

        closeDriver();

    }

    public  void addCategoryCMS(){
        createDriver();
        System.out.println("Navigation to url: https://cms.anhtester.com/login");
        System.out.println("Click icon Login");
        System.out.println("Input Email field and Password field");
        System.out.println("Click btn Login");
        System.out.println("Verify show my account page. ");

        System.out.println("Click Products menu");
        System.out.println("Click Category submenu");
        System.out.println("Click Add New category btn");
        System.out.println("Input all fields");
        System.out.println("Click Save btn");
        System.out.println("Verify add new category successfully");

        closeDriver();

    }

    public static void main(String[] args) {
        TestCases tc = new TestCases();
        tc.loginCMS();
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        tc.addCategoryCMS();
    }

}
