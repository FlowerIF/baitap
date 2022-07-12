package dagiac;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class DaGiac {
    private int soCanh;
    ArrayList<Integer> doDaiCanh = new ArrayList<Integer>();
    Scanner sc = new Scanner(System.in);
    public DaGiac(int soCanh){
        this.soCanh = soCanh;

    }
    public DaGiac(){

    }

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public void nhap(){
        System.out.println("nhap vao so canh cua da giac");
        int i = sc.nextInt();sc.nextLine();
        if(doDaiCanh.size() > 0){
            doDaiCanh.removeAll(doDaiCanh);
        }

        int m = 0;
        while(m<i){
            System.out.println("canh "+ (m+1));
            int c = sc.nextInt();
            doDaiCanh.add(c);
            m++;
        }


    }
    public double chuVi(){
        int sum = 0;
        for (int item: doDaiCanh
             ) {
            sum += item;
        }
        System.out.println("chu vi cua da giac la: " + sum);
        return sum;
    }
    public void inGiaTri(){
        for(int i = 0;i<doDaiCanh.size();i++){
            System.out.println("canh: " + (i+1)+ " : "+ doDaiCanh.get(i));
        }
    }
    public void hienThi(){
        int check;
        do{
            System.out.println("chon cac chuc nang");
            System.out.println("1:nhap da giac");
            System.out.println("2:hien thi da giac");
            System.out.println("3:tinh chu vi ");
            System.out.println("4:thoat");
            System.out.println("lua chon cua ban la");
            check = sc.nextInt();
            sc.nextLine();
            switch (check){
                case 1:nhap();
                    break;
                case 2:inGiaTri();
                    break;
                case 3:chuVi();
                    break;
                case 4:break;
                default:
                    System.out.println("lua chon khong hop le vui long chon lai");
            }
        }while(check != 4 );
        System.out.println("chuong trinh ket thuc");

    }

}
