package dagiac;

import java.util.ArrayList;

public class TamGiac extends DaGiac{

    @Override
    public void nhap() {


        System.out.println("nhap vao do dai canh");
        if(doDaiCanh.size() > 0){
            doDaiCanh.removeAll(doDaiCanh);
        }
        int m = 0;
        while(m<3){
            System.out.println("canh "+ (m+1));
            int c = sc.nextInt();
            doDaiCanh.add(c);
            m++;
        }
        if((doDaiCanh.get(0) + doDaiCanh.get(1) > doDaiCanh.get(2)) && (doDaiCanh.get(0) < doDaiCanh.get(1) + doDaiCanh.get(2)) && (doDaiCanh.get(0) + doDaiCanh.get(2) > doDaiCanh.get(1)) ){
            System.out.println("cac canh hop le");
        }else{
            System.out.println("tam giac khong hop le , vui long nhap lai 3 canh");
            doDaiCanh.removeAll(doDaiCanh);


        }
    }

    @Override
    public void hienThi() {
        int check;
        do{
            System.out.println("chon cac chuc nang");
            System.out.println("1:nhap tam giac");
            System.out.println("2:hien thi tam giac");
            System.out.println("3:tinh chu vi ");
            System.out.println("4:tinh dien tich ");
            System.out.println("5:thoat");
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
                case 4:double nuaChuVi = chuVi()/2;
                        double dienTich = Math.sqrt(nuaChuVi) * (nuaChuVi
                            - doDaiCanh.get(0)) * (nuaChuVi - doDaiCanh.get(1)) * (nuaChuVi - doDaiCanh.get(2));
                        System.out.println("dien tich tam giac la: " + dienTich);
                        break;
                case 5:break;
                default:
                    System.out.println("lua chon khong hop le vui long chon lai");
            }
        }while(check != 5 );
        System.out.println("chuong trinh ket thuc");

    }
}
