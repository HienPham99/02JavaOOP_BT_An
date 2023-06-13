package com.anhtester.bt2.person;

public class Information {
    public static void main(String[] args) {
        Person person1 = new Person("Châu", 4, "Nữ", "Đông anh - Hà Nội", "0987654321");
        Person person2 = new Person("Giang", 7, "Nữ", "Đông anh - Hà Nội", "0936854321");
        person1.getInfo();
        System.out.println("+++++++++++++++++++++++");
        person2.getInfo();
    }
}
