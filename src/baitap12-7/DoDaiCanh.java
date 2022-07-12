package dagiac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DoDaiCanh {
    private ArrayList<ChuongTrinhTamGiac> list = new ArrayList<>();

    public void nhap(){
        System.out.println("nhap danh sach tam giac");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tam giac:");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.println("tam giac " + i);
            System.out.println("nhap vao canh A: ");
            int x = sc.nextInt();
            System.out.println("nhap vao canh B: ");
            int y = sc.nextInt();
            System.out.println("nhap vao canh C: ");
            int z = sc.nextInt();
            i++;
            n--;
            if(((x+y) > z) && ((x + z) > y) && ((y + z ) > x)){
                System.out.println("tam giac hop le");
            }else{
                System.out.println("canh khong hop le , vui long nhap lai");
                n = 0;
            }
            double nuaChuVi = (x + y + z)/2;
            double dienTich = Math.sqrt(nuaChuVi)*(nuaChuVi - x)*(nuaChuVi-y)*(nuaChuVi-z);
            list.add(new ChuongTrinhTamGiac(x,y,z,dienTich));


        }while(n>0);
    }


    public void hienThi(){
        System.out.println("danh sach tam giac");
        System.out.println("ten\t\tdo dai canh\t\t");
        int i = 0;
        for (ChuongTrinhTamGiac tamGiac:list
             ) {
            System.out.printf("%d %10d | %10d | %10d |\n",i+1,tamGiac.getCanhA(),tamGiac.getCanhB(),tamGiac.getCanhC());
            i++;

        }
    }
    public void dienTichLonNhat(){
        Collections.sort(list,(a,b) -> (int) (a.getDienTich()-b.getDienTich()));
        System.out.println("danh sach sau khi sap xep");
        hienThi();
    }
}
