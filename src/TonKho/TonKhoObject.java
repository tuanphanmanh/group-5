
package TonKho;

public class TonKhoObject {
    private String ma;
    private String maSP;
    private int slNhap;
    private int slXuat;

    public TonKhoObject() {
    }

    public TonKhoObject(String ma, String maSP, int slNhap, int slXuat) {
        this.ma = ma;
        this.maSP = maSP;
        this.slNhap = slNhap;
        this.slXuat = slXuat;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public int getSlXuat() {
        return slXuat;
    }

    public void setSlXuat(int slXuat) {
        this.slXuat = slXuat;
    }
    
}
