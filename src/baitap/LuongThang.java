package baitap;

public class LuongThang {

    private long luongCoBan = 100000;


    public LuongThang(){

    }
    public LuongThang(long luongCoBan){
        this.luongCoBan = luongCoBan;
    }

    public long getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(long luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float luongthang(int soNgay,float heSo){
        float tongLuong = luongCoBan * heSo * soNgay;
        return tongLuong;
    }

    @Override
    public String toString() {
        return "luongCoBan=" + luongCoBan ;
    }
}
