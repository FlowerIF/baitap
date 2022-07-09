package baitap;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so ngay di lam:");

        int soN = sc.nextInt();
        System.out.println("nhap vao he so luong");
        float hS = sc.nextFloat();
        baitap.TinhLuong luong = new baitap.TinhLuong();

        System.out.println(luong.toString());

        System.out.println("tong so luong : " + luong.luongthang(soN,hS));

    }
}
