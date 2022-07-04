import java.util.Scanner;

public class helloworld {
    public static void helloWorld(){
        System.out.println("hello world");
    }
    public static void sumDaySo(int first,int last){
        int sum = 0;
        System.out.println("nhap vao so dau tien trong day: ");
        first = new Scanner(System.in).nextInt();
        System.out.println("nhap vao so cuoi cung trong day: ");
        last = new Scanner(System.in).nextInt();
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

    public static void main(String[] args) {
        helloWorld();
        sumDaySo(1,50);
    }
}
