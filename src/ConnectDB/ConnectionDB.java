/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ConnectDB;

import DonHang.BangDonHangObject;
import DonHang.DonHangObject;
import NhaCC.NhaCCObject;
import NhapSanPham.PhieuNhapObject;
import NhapSanPham.ThongTinNhapObject;
import SanPham.SanPhamObject;
import TaiKhoan.TaiKhoanObject;
import ThanhToan.PhieuXuatObjet;
import ThanhToan.ThanhToanObject;
import ThongKe.ThongKeObject;
import TonKho.TonKhoObject;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Đặng Minh Hằng
 */
public class ConnectionDB {
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    
    
    public ConnectionDB()
    {
        try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connectionUrl=
					"jdbc:sqlserver://DESKTOP-4H2CDN2:1433;databaseName=DBQuanLyBanHang;integratedSecurity=true;";
			conn= DriverManager.getConnection(connectionUrl);
                        System.out.println("OK");
		}
		catch(Exception ex) {
                        System.out.println("connect failed !");
                        System.out.println("Lỗi: "+ex.getMessage());
		}
    }
    public ArrayList<TaiKhoanObject>dsTK(){
   
        ArrayList<TaiKhoanObject>dsTKhoan=new ArrayList<>();
        try{
        String sql="select * from TAIKHOAN";
        st=conn.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            String ma=rs.getString(1);
            String tenDN=rs.getString(2);
            String mk=rs.getString(3);
            String hoTen=rs.getString(4);
            String sdt=rs.getString(5);
            String diaChi=rs.getString(6);
            Date ngaySinh=rs.getDate(7);
            String qu=rs.getString(8);
            TaiKhoanObject tk=new TaiKhoanObject(ma, tenDN, mk, hoTen, sdt, diaChi,ngaySinh,qu);
            dsTKhoan.add(tk);
        }
        rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTKhoan;
    }
    public ArrayList<TaiKhoanObject>dsTK(String quyen){
   
        ArrayList<TaiKhoanObject>dsTKhoan=new ArrayList<>();
        try{
        String sql="select * from TAIKHOAN where quyen=N'"+quyen+"'";
        st=conn.createStatement();
        rs=st.executeQuery(sql);
        while(rs.next()){
            String ma=rs.getString(1);
            String tenDN=rs.getString(2);
            String mk=rs.getString(3);
            String hoTen=rs.getString(4);
            String sdt=rs.getString(5);
            String diaChi=rs.getString(6);
            Date ngaySinh=rs.getDate(7);
            String qu=rs.getString(8);
            TaiKhoanObject tk=new TaiKhoanObject(ma, tenDN, mk, hoTen,sdt, diaChi,ngaySinh,qu);
            dsTKhoan.add(tk);
        }
        rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTKhoan;
    }
    public boolean themTaiKhoan(String maTK, String tenDN, String matKhau, String hoTen, String soDT, String diaChi, String ngaySinh){
        try{
            String sql="INSERT INTO dbo.TAIKHOAN\n" +
"        \n" +
"VALUES  ( N'"+maTK+"' ,\n" +
"          N'"+tenDN+"' ,\n" +
"          N'"+matKhau+"' ,\n" +
"          N'"+hoTen+"' ,\n" +
"          '"+soDT+"' ,\n" +
"          N'"+diaChi+"' ,\n" +
"          '"+ngaySinh+"'\n" +
"        )";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaTaiKhoan(String ma){
        try{
            String sql="delete TAIKHOAN where maTK="+ma;
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean updateTaiKhoan(String maTK, String tenDN, String matKhau, String hoTen,  String soDT, String diaChi, String ngaySinh){
        try{
            String sql="UPDATE dbo.TAIKHOAN SET tenDN=N'"+tenDN+"',matKhau=N'"+matKhau+"',hoTen=N'"+hoTen+"',soDT='"+soDT+"',diaChi=N'"+diaChi+"',ngaySinh='"+ngaySinh+"' WHERE maTK='"+maTK+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    // SanPham
    public ArrayList<SanPhamObject>dsSanPham(){
       
        ArrayList<SanPhamObject>dsSanPham=new ArrayList<>();
        try{
            String sql="select*from SANPHAM";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String ma=rs.getString(1);
                String ten=rs.getString(2);
                String dviTinh=rs.getString(3);
                int sl=rs.getInt(4);
                SanPhamObject sp=new SanPhamObject(ma, ten, dviTinh, sl);
                dsSanPham.add(sp);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsSanPham;
    }
    public ArrayList<SanPhamObject>dsSanPham(String maPhieuNhap){
       
        ArrayList<SanPhamObject>dsSanPham=new ArrayList<>();
        try{
            String sql="{call PROC_SANPHAMTHEOPHIEU(?)}";
            CallableStatement call=conn.prepareCall(sql);
            call.setString(1, maPhieuNhap);
            rs=call.executeQuery();
            while(rs.next()){
                String ma=rs.getString(1);
                String ten=rs.getString(2);
                String dviTinh=rs.getString(3);
                int sl=rs.getInt(4);
                SanPhamObject sp=new SanPhamObject(ma, ten, dviTinh, sl);
                dsSanPham.add(sp);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsSanPham;
    }
    public boolean themSanPham(SanPhamObject sp){
        
        try{
            String sql="INSERT INTO dbo.SANPHAM\n" +
"VALUES  ( N'"+sp.getMaSP()+"', \n" +
"          N'"+sp.getTenSP()+"',\n" +
"          N'"+sp.getDonviTinh()+"', \n" +
"          "+sp.getSoLuong()+" \n" +
"          )";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean suaSanPham(SanPhamObject sp){
        try{
            String sql="UPDATE dbo.SANPHAM SET TENSP=N'"+sp.getTenSP()+"',DVTINH=N'"+sp.getDonviTinh()+" WHERE MASP=N'"+sp.getMaSP()+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaSanPham(String ma){
        try{
            String sql="delete dbo.SANPHAM where MASP=N'"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
   
    // Nhà cung cấp
    public ArrayList<NhaCCObject>dsNhaCungCap(){
        ArrayList<NhaCCObject>dsNhaCC=new ArrayList<>();
        try{
            String sql="select * from NHACC";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String maNcc=rs.getString(1);
                String tenNCC=rs.getString(2);
                String sdt=rs.getString(4);
                String diaChi=rs.getString(3);
                NhaCCObject nhcc= new NhaCCObject(maNcc, tenNCC, sdt, diaChi);
                dsNhaCC.add(nhcc);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsNhaCC;
    }
    public boolean themNhaCC(String ma,String ten,String sdt, String dc){
        try{
            
            String sql="insert into NHACC values(N'"+ma+"',N'"+ten+"',N'"+dc+"',N'"+sdt+"')";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaNCC(String ma){
        try{
            
            String sql="delete NHACC where maNCC=N'"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean suaNhaCC(String ma,String ten, String sdt, String dc){
        try{
            
            String sql="update NHACC set TENNCC=N'"+ten+"',PHONE=N'"+sdt+"',DIACHI=N'"+dc+"' where MANCC=N'"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    // Đơn hàng
    public ArrayList<DonHangObject>dsDonHang(){
        ArrayList<DonHangObject>dsDon=new ArrayList<>();
        try{
            String sql="select * from DONHANG";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String maD=rs.getString(1);
                Date ngay=rs.getDate(2);
                String diaChi=rs.getString(3);
                DonHangObject dh=new DonHangObject(maD, ngay, diaChi);
                dsDon.add(dh);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsDon;
    }
    public boolean themDonHang(String maDH, String ngaydat, String manCC){
        try{
            String sql="insert into DONHANG values('"+maDH+"','"+ngaydat+"','"+manCC+"')";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaDonHang(String ma){
        try{
            String sql="delete DONHANG where MADH='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    // Chi tiết đặt hàng
    public boolean themChiTietDatHang(String maDH,String masp,int sl){
        try{
            String sql="insert into CHITIETDH values('"+maDH+"','"+masp+"',"+sl+")";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaChiTietDatHang(String ma){
        try{
            String sql="delete CHITIETDH where MADH='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public ArrayList<BangDonHangObject>dsChiTietDonHang(){
        ArrayList<BangDonHangObject>dsCt=new ArrayList<>();
        try{
            String sql="{call CHITIET_DONHANG}";
            CallableStatement call=conn.prepareCall(sql);
            rs=call.executeQuery();
            while(rs.next()){
                String maD=rs.getString(1);
                Date ngay=rs.getDate(2);
                String maNCC=rs.getString(3);
                String maSP=rs.getString(4);
                int sl=rs.getInt(5);
                BangDonHangObject bang=new BangDonHangObject(maD, ngay, maNCC, maSP, sl);
                dsCt.add(bang);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsCt;
    }
    
    // Phiếu nhập
    
    public ArrayList<PhieuNhapObject>dsPhieu(){
        ArrayList<PhieuNhapObject>dsP=new ArrayList<>();
        try{
            String sql="select * from PHIEUNHAP";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String maP=rs.getString(1);
                Date ngayDat=rs.getDate(2);
                String maDH=rs.getString(3);
                PhieuNhapObject phieu=new PhieuNhapObject(maP, ngayDat, maDH);
                dsP.add(phieu);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsP;
    }
    public boolean themPhieuNhap(String maPN, String ngaydat, String manDH){
        try{
            String sql="insert into PHIEUNHAP values('"+maPN+"','"+ngaydat+"','"+manDH+"')";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaPhieuNhap(String ma){
        try{
            String sql="delete PHIEUNHAP where MAPHIEUNHAP='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaPhieuNhapTheoMaHD(String maDH){
        try{
            String sql="delete PHIEUNHAP where MADH='"+maDH+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaChiTietPhieu(String ma){
        try{
            String sql="delete CHITIETPHIEUNHAP where MAPHIEUNHAP='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    // Chi tiết hàng
    public boolean themChiTietPhieu(String maPhieu, String maSp,int slNhap, float donGia,double thanhTien){
        try{
            String sql="insert into CHITIETPHIEUNHAP values('"+maPhieu+"','"+maSp+"',"+slNhap+","+donGia+","+thanhTien+")";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public ArrayList<ThongTinNhapObject>dsThongTinPhieuNhap(){
        ArrayList<ThongTinNhapObject>dsCt=new ArrayList<>();
        try{
            String sql="{call PROC_CHITIET_PHIEUNHAP}";
            CallableStatement call=conn.prepareCall(sql);
            rs=call.executeQuery();
            while(rs.next()){
                String maP=rs.getString(1);
                Date ngayN=rs.getDate(2);
                String maDH=rs.getString(3);
                String sp=rs.getString(4);
                int sl=rs.getInt(5);
                float donGia=rs.getFloat(6);
                ThongTinNhapObject tt=new ThongTinNhapObject(maP, ngayN, maDH, sp, sl, donGia);
                dsCt.add(tt);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsCt;
    }
    // PHIEU XUAT
    public ArrayList<ThanhToanObject>dsThanhToan(){
        ArrayList<ThanhToanObject>dsTT=new ArrayList<>();
        try{
            String sql="select * from PHIEUXUAT";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String ma=rs.getString(1);
                Date ngay=rs.getDate(2);
                String tenKH=rs.getString(3);
                ThanhToanObject tt=new ThanhToanObject(ma, ngay, tenKH);
                dsTT.add(tt);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTT;
    }
    public boolean themPhieuXuat(String ma, String ngayX, String tenKH){
        try{
            String sql="insert into PHIEUXUAT values('"+ma+"','"+ngayX+"',N'"+tenKH+"')";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaPhieuXuat(String ma){
        try{
            String sql="delete PHIEUXUAT where MAPHIEUXUAT='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    // CHI TIẾT PHIẾU XUÂT
    public boolean themChiTietPhieuXuat(String ma, String maSP, int slx,float donGia,double thanhTien){
        try{
            String sql="insert into CHITIETPHIEUXUAT values('"+ma+"','"+maSP+"',"+slx+","+donGia+","+thanhTien+")";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    //
    public ArrayList<PhieuXuatObjet>dsPhieuXuat(){
        ArrayList<PhieuXuatObjet>dsPhieu=new ArrayList<>();
        try{
            String sql="{call PROC_CHITIETPHIEUXUAT}";
            CallableStatement call=conn.prepareCall(sql);
            rs=call.executeQuery();
            while(rs.next()){
                String maP=rs.getString(1);
                Date ngay=rs.getDate(2);
                String tenKH=rs.getString(3);
                String maSP=rs.getString(4);
                int sl=rs.getInt(5);
                float gia=rs.getFloat(6);
                PhieuXuatObjet p=new PhieuXuatObjet(maP, ngay, tenKH, maSP, sl, gia);
                dsPhieu.add(p);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsPhieu;
    }
    
    // TỒN KHO
    public int slNhap(String ma){
        int sl=0;
        try{
            String sql="{call PROC_SLNHAP(?)}";
            CallableStatement call=conn.prepareCall(sql);
            call.setString(1, ma);
            rs=call.executeQuery();
            if(rs.next()){
                sl=rs.getInt(1);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return sl;
    }
    public int slXUAT(String ma){
        int sl=0;
        try{
            String sql="{call PROC_SLXUAT(?)}";
            CallableStatement call=conn.prepareCall(sql);
            call.setString(1, ma);
            rs=call.executeQuery();
            if(rs.next()){
                sl=rs.getInt(1);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return sl;
    }
    public ArrayList<TonKhoObject>dsTonKho(){
        ArrayList<TonKhoObject>dsT=new ArrayList<>();
        try{
            String sql="select * from TONKHO";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                String ma=rs.getString(1);
                String maSP=rs.getString(2);
                int slNhap=rs.getInt(3);
                int slXuat=rs.getInt(4);
                TonKhoObject tk=new TonKhoObject(ma, maSP, slNhap, slXuat);
                dsT.add(tk);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsT;
    }
    public boolean themTonKho(String ma,String masp, int slNhap, int slXuat ){
        try{
            String sql="insert into TONKHO values('"+ma+"','"+masp+"',"+slNhap+","+slXuat+")";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public boolean xoaTonKho(String ma){
        try{
            String sql="delete TONKHO where MATON='"+ma+"'";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    
    // THONG KE
    public double tongTienNhap(String ngay1, String ngay2){
        double tien=0;
        try{
            String sql="SELECT SUM(THANHTIEN)  FROM dbo.PHIEUNHAP INNER JOIN dbo.CHITIETPHIEUNHAP \n" +
"	ON CHITIETPHIEUNHAP.MAPHIEUNHAP = PHIEUNHAP.MAPHIEUNHAP\n" +
"	WHERE NGAYNHAP BETWEEN '"+ngay1+"'  AND '"+ngay2+"'";
            
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                tien=rs.getDouble(1);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return tien;
    }
    public double tongTienXuat(String ngay1, String ngay2){
        double tien=0;
        try{
            String sql="SELECT SUM(THANHTIEN) AS 'TONGTHANHTIEN' FROM dbo.CHITIETPHIEUXUAT INNER JOIN dbo.PHIEUXUAT\n" +
"	ON PHIEUXUAT.MAPHIEUXUAT = CHITIETPHIEUXUAT.MAPHIEUXUAT\n" +
"	WHERE NGAYXUAT BETWEEN '"+ngay1+"' AND '"+ngay2+"'";
            
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            if(rs.next()){
                tien=rs.getDouble(1);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return tien;
    }
    //
    public boolean themPhieuThongKe(String ngay1, String ngay2,double tongTienNhap, double tongTienXuat){
        try{
            String sql="insert into THONGKE values('"+ngay1+"','"+ngay2+"',"+tongTienNhap+","+tongTienXuat+")";
            st=conn.createStatement();
            st.executeUpdate(sql);
            return true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return false;
    }
    public ArrayList<ThongKeObject>dsThongKe(){
        ArrayList<ThongKeObject>dsTK=new ArrayList<>();
        try{
            String sql="select * from THONGKE";
            st=conn.createStatement();
            rs=st.executeQuery(sql);
            while(rs.next()){
                Date ngay1=rs.getDate(1);
                Date ngay2=rs.getDate(2);
                double tienNhap=rs.getDouble(3);
                double tienX=rs.getDouble(4);
                ThongKeObject tk=new ThongKeObject(ngay1, ngay2, tienNhap, tienX);
                dsTK.add(tk);
            }
            rs.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        return dsTK;
    }
}
