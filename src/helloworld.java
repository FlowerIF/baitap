import java.util.Scanner;

public class helloworld {
    public static void helloWorld(){
        System.out.println("hello world");
    }
    public static void sumDaySo(){
        int sum = 0;
        System.out.println("nhap vao so dau tien trong day: ");
        int first = new Scanner(System.in).nextInt();
        System.out.println("nhap vao so cuoi cung trong day: ");
        int last = new Scanner(System.in).nextInt();
        while(first > last){
            System.out.println("vui long nhap lai so dau va so cuoi");
            System.out.println("nhap vao so dau tien trong day: ");
            first = new Scanner(System.in).nextInt();
            System.out.println("nhap vao so cuoi cung trong day: ");
            last = new Scanner(System.in).nextInt();
        }
        for(int i = first ; i<=last;i++){
            sum += i;
        }
        System.out.println("tong cua day tu "+first+ " den " + last +" la: " + sum);
    }

    public static void ptBac2(){
        System.out.println("nhap vao a:");
        float a = new Scanner(System.in).nextFloat();
        System.out.println("nhap vao b:");
        float b = new Scanner(System.in).nextFloat();
        System.out.println("nhap vao c:");
        float c = new Scanner(System.in).nextFloat();
        if(a == 0){
            float x = -c/b;
            System.out.println("phuong trinh tro ve bac 1 dang " + b +"x + " + c +" = 0, co nghiem la x = "+ x);
        }
        else if(a == 0 && b == 0 && c != 0){
            System.out.println("phuong trinh vo nghiem");
        }
        else{
            float delta = b*b -  4*a*c;
            if(delta > 0){
                float x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
                float x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("phuong trinh co 2 nghiem phan biet : x1 = " + x1 +" va x2 = " + x2);
            } else if (delta  == 0) {
                System.out.println("phuong trinh co 2 nghiem kep x1=x2=" + (float)(-b/2*a));
            }
            else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }





    public static void diemTB(){

        int[] a = {3,6,3,8,6};
        int sum=0;
        for(int i = 0;i< a.length;i++){
            sum+=a[i];
        }

        sum = sum/(a.length);
        if(sum <= 4){
            System.out.println("xep loai yeu");
        } else if (sum <= 6) {
            System.out.println("xep loai trung binh");
        } else if (sum <= 8) {
            System.out.println("xep loai kha");
        }else {
            System.out.println("xep loai gioi");
        }

    }


    public static void main(String[] args) {
//        helloWorld();
//        sumDaySo();
//        ptBac2();
        diemTB();
    }
}
