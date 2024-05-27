
package ThongKe;

import java.sql.Date;


public class ThongKeObject {
    private Date ngay1;
    private Date ngay2;
    private double tongTienNhap;
    private double tongTienXuat;

    public ThongKeObject() {
    }

    public ThongKeObject(Date ngay1, Date ngay2, double tongTienNhap, double tongTienXuat) {
        this.ngay1 = ngay1;
        this.ngay2 = ngay2;
        this.tongTienNhap = tongTienNhap;
        this.tongTienXuat = tongTienXuat;
    }

    public Date getNgay1() {
        return ngay1;
    }

    public void setNgay1(Date ngay1) {
        this.ngay1 = ngay1;
    }

    public Date getNgay2() {
        return ngay2;
    }

    public void setNgay2(Date ngay2) {
        this.ngay2 = ngay2;
    }

    public double getTongTienNhap() {
        return tongTienNhap;
    }

    public void setTongTienNhap(double tongTienNhap) {
        this.tongTienNhap = tongTienNhap;
    }

    public double getTongTienXuat() {
        return tongTienXuat;
    }

    public void setTongTienXuat(double tongTienXuat) {
        this.tongTienXuat = tongTienXuat;
    }
    
}
