
package NhapSanPham;

import java.sql.Date;

public class PhieuNhapObject {
    private String maPhieu;
    private Date ngayNhap;
    private String maDH;

    public PhieuNhapObject() {
    }

    public PhieuNhapObject(String maPhieu, Date ngayNhap, String maDH) {
        this.maPhieu = maPhieu;
        this.ngayNhap = ngayNhap;
        this.maDH = maDH;
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

    @Override
    public String toString() {
        return this.maPhieu; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
