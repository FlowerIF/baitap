package dagiac;

public class ChuongTrinhTamGiac {
    private int canhA;
    private int canhB;
    private int canhC;
    private double dienTich;
    public ChuongTrinhTamGiac(){
        this.canhA = 0;
        this.canhB = 0;
        this.canhC = 0;
        this.dienTich = 0;
    }

    public ChuongTrinhTamGiac(int canhA, int canhB, int canhC,double dienTich) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
        this.dienTich = dienTich;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public void setCanhA(int canhA) {
        this.canhA = canhA;
    }

    public void setCanhB(int canhB) {
        this.canhB = canhB;
    }

    public void setCanhC(int canhC) {
        this.canhC = canhC;
    }

    public int getCanhA() {
        return canhA;
    }

    public int getCanhB() {
        return canhB;
    }

    public int getCanhC() {
        return canhC;
    }
}
