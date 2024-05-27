/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SanPham;

/**
 *
 * @author Đặng Minh Hằng
 */
public class SanPhamObject {
    private String maSP,tenSP;
    private String donviTinh;
    private int soLuong;

    public SanPhamObject() {
    }

    public SanPhamObject(String maSP, String tenSP, String dviTinh, int sl) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donviTinh=dviTinh;
        this.soLuong=sl;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getDonviTinh() {
        return donviTinh;
    }

    public void setDonviTinh(String donviTinh) {
        this.donviTinh = donviTinh;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    

    @Override
    public String toString() {
        return this.tenSP; //To change body of generated methods, choose Tools | Templates.
    }
    
}
