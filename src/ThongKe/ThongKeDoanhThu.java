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
public class ThongKeDoanhThu {
    private String ngayTK;
    private Double tongDT;

    public ThongKeDoanhThu() {
    }

    public ThongKeDoanhThu(String ngayTK, Double tongDT) {
        this.ngayTK = ngayTK;
        this.tongDT = tongDT;
    }

    
    public String getNgayTK() {
        return ngayTK;
    }

    public void setNgayTK(String ngayTK) {
        this.ngayTK = ngayTK;
    }

    public Double getTongDT() {
        return tongDT;
    }

    public void setTongDT(Double tongDT) {
        this.tongDT = tongDT;
    }
    
}
