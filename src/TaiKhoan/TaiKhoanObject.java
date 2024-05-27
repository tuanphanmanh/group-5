/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TaiKhoan;

import java.sql.Date;

/**
 *
 * @author Đặng Minh Hằng
 */
public class TaiKhoanObject {
    private String maTK,tenDN,matKhau,hoTen,soDT;
    private String diaChi;
    private Date ngaySinh;
    private String quyen;

    public TaiKhoanObject() {
    }

    public TaiKhoanObject(String maTK, String tenDN, String matKhau, String hoTen,  String soDT, String diaChi, Date ngaySinh,String quyen) {
        this.maTK = maTK;
        this.tenDN = tenDN;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.quyen=quyen;
    }

    public String getQuyen() {
        return quyen;
    }

    public void setQuyen(String quyen) {
        this.quyen = quyen;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

   

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

   
    
}
