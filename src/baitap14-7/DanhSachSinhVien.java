package arraylist.lab5;

import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DanhSachSinhVien {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> dsSinhvien = new ArrayList<>();
    public void nhap(){
        System.out.println("nhap so luong sinh vien: ");
        int i = sc.nextInt();sc.nextLine();
        int t = 0;
        while(t < i){
            System.out.println("sinh vien thu " + (t+1));
            String sv = sc.nextLine();
            dsSinhvien.add(sv);
            t++;
        }
    }
    public void xuat(){
        for (String item:dsSinhvien
             ) {
            System.out.println("sv:" + item);
        }
    }
    public void xuatNgauNhien(){
        Collections.shuffle(dsSinhvien);
        xuat();
    }
    public void sapXepGiamDan(){
        Collections.sort(dsSinhvien,(a,b)->a.compareTo(b));//sap xep giam dan
        xuat();
    }
    public void xoaSV(){
        System.out.println("nhap vao sinh vien can xoa");
        String xoa = sc.nextLine();
        for (String item:dsSinhvien
             ) {
            if(item.equals(xoa)){
                dsSinhvien.remove(item);
                System.out.println("da xoa sinh vien");
                break;
            }
            else {
                System.out.println("khong tim thay sinh vien nay");
            }
        }
    }
    public void hienThi(){
        int i;
        do {
            System.out.println("Menu chuc nang:");
            System.out.println("1:nhap danh sach");
            System.out.println("2:hien thi danh sach");
            System.out.println("3:sap xep danh sach");
            System.out.println("4:hien thi ngau nhien danh sach");
            System.out.println("5:tim kiem va xoa sinh vien");
            System.out.println("6:thoat");
            System.out.print("lua chon cua ban la: ");
            i = sc.nextInt();
            sc.nextLine();
            if(i!=6){
                switch (i){
                    case 1:nhap();
                        break;
                    case 2:xuat();
                        break;
                    case 3:sapXepGiamDan();
                        break;
                    case 4:xuatNgauNhien();
                        break;
                    case 5:xoaSV();
                        break;
                    default:
                        System.out.println("lua chon khong hop la, vui long chon lai");

                }
            }

        }while (i!=6);
        System.out.println("Chuong trinh ket thuc");
    }




}
