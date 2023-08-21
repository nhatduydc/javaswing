/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Administrator
 */
public class DanhSachQL extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachQL
     */
    String tentk="", quyen="";
    public DanhSachQL() {
        initComponents();
        setTenTK(tentk);
        KiemTraQuyen(quyen);
    }

    public void KiemTraQuyen(String quyen){
        if(quyen == "Quan ly"){
            btn_QLB.setEnabled(true);
            btn_QLNV.setEnabled(true);
            btn_QLSP.setEnabled(true);
        }else{
            btn_QLB.setEnabled(true);
            btn_QLNV.setEnabled(false);
            btn_QLSP.setEnabled(true);
        }
    }
    public void setTenTK(String tentk){
        lbl_TenTK.setText(tentk);
    }

    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_TenTK = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_QLB = new javax.swing.JButton();
        btn_QLSP = new javax.swing.JButton();
        btn_QLNV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("DANH SÁCH QUẢN LÝ");

        lbl_TenTK.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Quản lý bàn");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Quản lý sản phẩm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Quản lý nhân viên");

        btn_QLB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_QLB.setText("Bàn");
        btn_QLB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLBActionPerformed(evt);
            }
        });

        btn_QLSP.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_QLSP.setText("Sản phẩm");
        btn_QLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLSPActionPerformed(evt);
            }
        });

        btn_QLNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_QLNV.setText("Nhân viên");
        btn_QLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QLNVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(btn_QLB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TenTK)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_QLSP)
                        .addGap(18, 18, 18)
                        .addComponent(btn_QLNV)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbl_TenTK)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_QLB)
                    .addComponent(btn_QLSP)
                    .addComponent(btn_QLNV))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_QLBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLBActionPerformed
        // TODO add your handling code here:
        close();
        QL_Ban frmBan = new QL_Ban();
        frmBan.setVisible(true);
    }//GEN-LAST:event_btn_QLBActionPerformed

    private void btn_QLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLSPActionPerformed
        // TODO add your handling code here:
        close();
        QL_SanPham frmSP = new QL_SanPham();
        frmSP.setVisible(true);
    }//GEN-LAST:event_btn_QLSPActionPerformed

    private void btn_QLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QLNVActionPerformed
        // TODO add your handling code here:
        close();
        Ql_NhanVien frmNV = new Ql_NhanVien();
        frmNV.setVisible(true);
    }//GEN-LAST:event_btn_QLNVActionPerformed

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
            java.util.logging.Logger.getLogger(DanhSachQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachQL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_QLB;
    private javax.swing.JButton btn_QLNV;
    private javax.swing.JButton btn_QLSP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbl_TenTK;
    // End of variables declaration//GEN-END:variables
}