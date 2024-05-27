
package DonHang;

import java.sql.Date;

public class DonHangObject {
    private String maDH;
    private Date ngayDat;
    private String maNCC;

    public DonHangObject(String maDH, Date ngayDat, String maNCC) {
        this.maDH = maDH;
        this.ngayDat = ngayDat;
        this.maNCC = maNCC;
    }

    public DonHangObject() {
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getMaNCC() {
        return maNCC;
    }

    public void setMaNCC(String maNCC) {
        this.maNCC = maNCC;
    }

    @Override
    public String toString() {
        return this.maDH; //To change body of generated methods, choose Tools | Templates.
    }
    
}
