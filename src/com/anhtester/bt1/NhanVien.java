package com.anhtester.bt1;

public class NhanVien {
  private   String name;
   private int age;
   private String gender;
   private String birthday;
   private String address;

    public NhanVien(String name, int age, String gender, String birthday, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    //Cách 1: có thể viết hàm hiển thị thông tin all ở class Nhân Viên or viết bên class Thông Tin (như cách 2)
    public void getInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Tuổi: " + getAge());
        System.out.println("Giới tính: " + getGender());
        System.out.println("Sinh nhật: " + getBirthday());
        System.out.println("Địa chỉ: " + getAddress());

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }


}
