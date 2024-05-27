
package NhapSanPham;

import java.sql.Date;

public class ThongTinNhapObject {
    private String maPhieu;
    private Date ngayNhap;
    private String maDH;
    private String maSp;
    private int slNhap;
    private float donGia;

    public ThongTinNhapObject() {
    }

    public ThongTinNhapObject(String maPhieu, Date ngayNhap, String maDH, String maSp, int slNhap, float donGia) {
        this.maPhieu = maPhieu;
        this.ngayNhap = ngayNhap;
        this.maDH = maDH;
        this.maSp = maSp;
        this.slNhap = slNhap;
        this.donGia = donGia;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public int getSlNhap() {
        return slNhap;
    }

    public void setSlNhap(int slNhap) {
        this.slNhap = slNhap;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    
}
