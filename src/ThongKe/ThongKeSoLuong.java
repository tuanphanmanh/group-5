/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ThongKe;

/**
 *
 * @author Đặng Minh Hằng
 */
public class ThongKeSoLuong {
    private String ngayTK;
    private int tongSLSP;
    private int tongSLDH;

    public ThongKeSoLuong() {
    }

    public ThongKeSoLuong(String ngayTK, int tongSLSP, int tongSLDH) {
        this.ngayTK = ngayTK;
        this.tongSLSP = tongSLSP;
        this.tongSLDH = tongSLDH;
    }

    public String getNgayTK() {
        return ngayTK;
    }

    public void setNgayTK(String ngayTK) {
        this.ngayTK = ngayTK;
    }

    public int getTongSLSP() {
        return tongSLSP;
    }

    public void setTongSLSP(int tongSLSP) {
        this.tongSLSP = tongSLSP;
    }

    public int getTongSLDH() {
        return tongSLDH;
    }

    public void setTongSLDH(int tongSLDH) {
        this.tongSLDH = tongSLDH;
    }
    
}
