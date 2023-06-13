package com.anhtester.bt3.common;

public class BaseTest {

    public void createDriver(){
        System.out.println("Broser: " + Constants.browser);
        System.out.println("Reporr: " + Constants.report);
        System.out.println("Headless: " + Constants.headless);

    }

    public void closeDriver(){
        System.out.println("Closed browser:  " + Constants.browser);

    }

    //Có thể truyền thêm giá trị browser khi chạy theo cách sau
    public void setBrowser(String browser){
        System.out.println("Closed browser:  " + browser);

    }

}
