package baitap;

public class LuongThang {

    private static long luongCoBan = 100000;


    public LuongThang(){

    }
    public LuongThang(long luongCoBan){
        this.luongCoBan = luongCoBan;
    }

    public static long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }




}
class TinhLuong{
    public float luongthang(int soNgay,float heSo){
        float tongLuong = LuongThang.getLuongCoBan() * heSo * soNgay;
        return tongLuong;
    }
}

class Xuat{
    @Override
    public String toString() {
        return "luongCoBan=" + LuongThang.getLuongCoBan() ;
    }
}