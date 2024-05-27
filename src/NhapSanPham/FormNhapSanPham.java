/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NhapSanPham;

import ConnectDB.ConnectionDB;
import DonHang.DonHangObject;
import Menu.FormMenu;
import SanPham.SanPhamObject;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Giang Phan
 */
public class FormNhapSanPham extends javax.swing.JFrame {
    DefaultTableModel dtm=null;
    /**
     * Creates new form FormNhapSanPham
     */
    public FormNhapSanPham() {
        initComponents();
        dtm=(DefaultTableModel) tblPhieuNhap.getModel();
        loadCombo();
        loadBang();
    }
    private void loadBang(){
        for(int i=tblPhieuNhap.getRowCount()-1; i>=0; i--){
            dtm.removeRow(i);
        }
        ConnectionDB conn=new ConnectionDB();
        for(ThongTinNhapObject tt :conn.dsThongTinPhieuNhap()){
            Vector<Object>vec=new Vector<>();
            vec.add(tt.getMaPhieu());
            vec.add(tt.getNgayNhap());
            vec.add(tt.getMaDH());
            vec.add(tt.getMaSp());
            vec.add(tt.getSlNhap());
            vec.add(tt.getDonGia());
            dtm.addRow(vec);
        }
    }
    private void loadCombo(){
        ConnectionDB conn=new ConnectionDB();
        cboDonHang.removeAllItems();
        for(DonHangObject dh:conn.dsDonHang()){
            cboDonHang.addItem(dh);
        }
        cboPhieuNhap.removeAllItems();
        for(PhieuNhapObject phieu :conn.dsPhieu()){
            cboPhieuNhap.addItem(phieu);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        dateNgayNhap = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDonHang = new javax.swing.JComboBox<DonHangObject>();
        btnReset = new javax.swing.JButton();
        btnTaoPhieu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cboPhieuNhap = new javax.swing.JComboBox<PhieuNhapObject>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnNhapPhieu = new javax.swing.JButton();
        btnXoaPhieu = new javax.swing.JButton();
        cboSanPham = new javax.swing.JComboBox<SanPhamObject>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPhieuNhap = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnQuayLai = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Mã phiếu nhập:");

        dateNgayNhap.setDateFormatString("dd/MM/yyyy");

        jLabel2.setText("Ngày nhập:");

        jLabel3.setText("Đơn hàng:");

        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SanPham/refresh-page-option.png"))); // NOI18N
        btnReset.setText("Reset");

        btnTaoPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SanPham/them.png"))); // NOI18N
        btnTaoPhieu.setText("Tạo phiếu");
        btnTaoPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnReset)
                            .addGap(35, 35, 35)
                            .addComponent(btnTaoPhieu))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cboDonHang, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dateNgayNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cboDonHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnTaoPhieu))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 86, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel6.setText("Mã phiếu nhập:");

        cboPhieuNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboPhieuNhapActionPerformed(evt);
            }
        });

        jLabel7.setText("Sản phẩm:");

        jLabel8.setText("Số lượng nhập:");

        jLabel9.setText("Đơn giá nhập:");

        btnNhapPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SanPham/them.png"))); // NOI18N
        btnNhapPhieu.setText("Nhập phiếu");
        btnNhapPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapPhieuActionPerformed(evt);
            }
        });

        btnXoaPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SanPham/cross-remove-sign.png"))); // NOI18N
        btnXoaPhieu.setText("Xoá phiếu");
        btnXoaPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaPhieuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNhapPhieu)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoaPhieu))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboSanPham, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSoLuong)
                            .addComponent(txtDonGia)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cboPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(98, 98, 98))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNhapPhieu)
                    .addComponent(btnXoaPhieu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 600, 250));

        jLabel5.setText("Chi tiết nhập hàng");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        tblPhieuNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã phiếu nhập", "Ngày nhập", "Mã đơn hàng", "Mã sản phẩm", "Số lượng", "Đơn giá"
            }
        ));
        jScrollPane1.setViewportView(tblPhieuNhap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 1000, 220));

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));

        btnQuayLai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SanPham/reply.png"))); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Quản lý nhập sản phẩm");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(btnQuayLai)
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addContainerGap(603, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(btnQuayLai))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 60));

        jLabel4.setText("Phiếu nhập hàng");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        FormMenu frm=new FormMenu();
        frm.pack();
        frm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnTaoPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoPhieuActionPerformed
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
        String maPhieu=txtMaPhieu.getText();
        String ngay=sdf.format(dateNgayNhap.getDate());
        DonHangObject dh=(DonHangObject) cboDonHang.getSelectedItem();
        ConnectionDB conn=new ConnectionDB();
        if(conn.themPhieuNhap(maPhieu, ngay, dh.getMaDH())){
            JOptionPane.showMessageDialog(null, "Tạo phiếu thành công");
            loadCombo();
        }
        else{
            JOptionPane.showMessageDialog(null, "Tạo phiếu thất bại");
            return;
        }
        
    }//GEN-LAST:event_btnTaoPhieuActionPerformed

    private void btnXoaPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaPhieuActionPerformed
        PhieuNhapObject phieu=(PhieuNhapObject) cboPhieuNhap.getSelectedItem();
        ConnectionDB cnn=new ConnectionDB();
        int cf=JOptionPane.showConfirmDialog(null, "Bạn có chắc xoá phiếu nhập ?", "Xác nhận xoá", JOptionPane.OK_CANCEL_OPTION);
        if(cf==JOptionPane.OK_OPTION){
            cnn.xoaChiTietPhieu(phieu.getMaPhieu());
            if(cnn.xoaPhieuNhap(phieu.getMaPhieu())){
                JOptionPane.showMessageDialog(null, "Xoá phiếu thành công !");
                loadBang();
                loadCombo();
            }
            else{
                JOptionPane.showMessageDialog(null, "Xoá phiếu thất bại !!!");
                return;
            }
        }
        else{
            return;
        }
    }//GEN-LAST:event_btnXoaPhieuActionPerformed

    private void btnNhapPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapPhieuActionPerformed
        SanPhamObject sanpham=(SanPhamObject) cboSanPham.getSelectedItem();
        PhieuNhapObject phieu=(PhieuNhapObject) cboPhieuNhap.getSelectedItem();
        int sl=Integer.parseInt(txtSoLuong.getText());
        float gia=Float.parseFloat(txtDonGia.getText());
        double thanhTien=sl*gia;
        ConnectionDB cnn=new ConnectionDB();
        if(cnn.themChiTietPhieu(phieu.getMaPhieu(), sanpham.getMaSP(), sl, gia,thanhTien)){
            JOptionPane.showMessageDialog(null, "Nhập phiếu thành công !");
                loadBang();
        }
        else{
            JOptionPane.showMessageDialog(null, "Nhập phiếu thất bại !");
            return;
        }
    }//GEN-LAST:event_btnNhapPhieuActionPerformed

    private void cboPhieuNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboPhieuNhapActionPerformed
        PhieuNhapObject phieu=(PhieuNhapObject) cboPhieuNhap.getSelectedItem();
        if(phieu!=null){
            ConnectionDB cnn=new ConnectionDB();
        cboSanPham.removeAllItems();
        for(SanPhamObject sp:cnn.dsSanPham(phieu.getMaPhieu())){
            cboSanPham.addItem(sp);
        }
        }
        else{
            return;
        }
    }//GEN-LAST:event_cboPhieuNhapActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormNhapSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormNhapSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormNhapSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormNhapSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormNhapSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNhapPhieu;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnTaoPhieu;
    private javax.swing.JButton btnXoaPhieu;
    private javax.swing.JComboBox<DonHangObject> cboDonHang;
    private javax.swing.JComboBox<PhieuNhapObject> cboPhieuNhap;
    private javax.swing.JComboBox<SanPhamObject> cboSanPham;
    private com.toedter.calendar.JDateChooser dateNgayNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPhieuNhap;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables
}
