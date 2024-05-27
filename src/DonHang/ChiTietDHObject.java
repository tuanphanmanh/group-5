/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DonHang;


public class ChiTietDHObject {
    private String maDH;
    private String maSP;
    private int slDat;

    public ChiTietDHObject(String maDH, String maSP, int slDat) {
        this.maDH = maDH;
        this.maSP = maSP;
        this.slDat = slDat;
    }

    public ChiTietDHObject() {
    }

    public String getMaDH() {
        return maDH;
    }

    public void setMaDH(String maDH) {
        this.maDH = maDH;
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
