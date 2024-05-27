
package ThanhToan;

import java.sql.Date;


public class PhieuXuatObjet {
    private String maPhieu;
    private Date ngay;
    private String tenKH;
    private String maSP;
    private int sl;
    private double donGia;

    public PhieuXuatObjet() {
    }

    public PhieuXuatObjet(String maPhieu, Date ngay, String tenKH, String maSP, int sl, double donGia) {
        this.maPhieu = maPhieu;
        this.ngay = ngay;
        this.tenKH = tenKH;
        this.maSP = maSP;
        this.sl = sl;
        this.donGia = donGia;
    }
    public double thanhTien(){
        return this.sl*this.donGia;
    }
    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
