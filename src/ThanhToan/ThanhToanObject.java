/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThanhToan;

import java.sql.Date;

/**
 *
 * @author Đặng Minh Hằng
 */
public class ThanhToanObject {
    private String maPhieu;
    private Date ngayXuat;
    private String tenKH;

    public ThanhToanObject() {
    }

    public ThanhToanObject(String maPhieu, Date ngayXuat, String tenKH) {
        this.maPhieu = maPhieu;
        this.ngayXuat = ngayXuat;
        this.tenKH = tenKH;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Date getNgayXuat() {
        return ngayXuat;
    }

    public void setNgayXuat(Date ngayXuat) {
        this.ngayXuat = ngayXuat;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return this.maPhieu; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
