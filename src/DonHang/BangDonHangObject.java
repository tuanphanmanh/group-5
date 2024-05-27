
package DonHang;

import java.sql.Date;


public class BangDonHangObject {
    private String maDH;
    private Date ngayDat;
    private String maNCC;
    private String maSP;
    private int slDat;

    public BangDonHangObject(String maDH, Date ngayDat, String maNCC, String maSP, int slDat) {
        this.maDH = maDH;
        this.ngayDat = ngayDat;
        this.maNCC = maNCC;
        this.maSP = maSP;
        this.slDat = slDat;
    }

    public BangDonHangObject() {
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

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSlDat() {
        return slDat;
    }

    public void setSlDat(int slDat) {
        this.slDat = slDat;
    }
    
}
