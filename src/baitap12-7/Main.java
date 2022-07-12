package dagiac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("nhap lua chon :");
        System.out.println("1:da giac");
        System.out.println("2:tam giac");
        int i = new Scanner(System.in).nextInt();

        switch (i){
            case 1:DaGiac dc = new DaGiac();
                   dc.hienThi();
                   break;
            case 2:TamGiac tg = new TamGiac();
                   tg.hienThi();
                   break;
            default:
                System.out.println("lua chon khong hop le, chuong trinh ket thuc");
        }

// phan chuong trinh tam giac - chua lam duoc
//        DoDaiCanh dd  = new DoDaiCanh();
//        dd.nhap();
//        dd.hienThi();
//        dd.dienTichLonNhat();
    }
}
