package com.anhtester.bt1;

public class ThongTin {


    public static void main(String[] args) {
        NhanVien nhanvien = new NhanVien("Hiền", 32, "Nữ", "08/09/1990", "Đông anh, Hà Nội");
        //Cách 1 (tiếp)
        nhanvien.getInfo();
        //Cách 2.
//        System.out.println("Tên nhân viên: " + nhanvien.getName());
//        System.out.println("Tuổi: "+ nhanvien.getAge());
//        System.out.println("Giới tính: " +nhanvien.getGender());
//        System.out.println("Ngày sinh: "+ nhanvien.getBirthday());
//        System.out.println("Địa chỉ: "+ nhanvien.getAddress());

    }
}
