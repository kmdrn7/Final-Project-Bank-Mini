/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.BaseTransaksi;
import repository.Database;

/**
 *
 * @author kmdr7
 */
public class frmTransaksi extends javax.swing.JFrame {

    /**
     * Creates new form TransaksiLayout
     */
    private String typeTransaksi;
    private Database db;
    private BaseTransaksi base;
    private frmMain frmM;
    
    public frmTransaksi(){
        initComponents();
    }
    
    public frmTransaksi(String title, String type, Database db, BaseTransaksi base, frmMain m) {
        initComponents();
        this.db = db;
        this.typeTransaksi = type;
        this.base = base;
        this.frmM = m;
        if (typeTransaksi == "Online") {
           btnSetor.setVisible(false);
           btnTarik.setVisible(false); 
        }else if(typeTransaksi == "ATM"){
           btnSetor.setVisible(false);
        }
        LabelTransaksi.setText(title);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LabelTransaksi = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCekSaldo = new javax.swing.JButton();
        btnTransfer = new javax.swing.JButton();
        btnTarik = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSetor = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 100));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        LabelTransaksi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LabelTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        LabelTransaksi.setText("Selamat Datang di BankMini");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTransaksi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(LabelTransaksi)
                .addGap(22, 22, 22))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCekSaldo.setText("Cek Saldo");
        btnCekSaldo.setPreferredSize(new java.awt.Dimension(300, 60));
        btnCekSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekSaldoActionPerformed(evt);
            }
        });
        jPanel2.add(btnCekSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 230, -1));

        btnTransfer.setText("Transfer");
        btnTransfer.setPreferredSize(new java.awt.Dimension(300, 60));
        btnTransfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferActionPerformed(evt);
            }
        });
        jPanel2.add(btnTransfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 260, -1));

        btnTarik.setText("Tarik Tunai");
        btnTarik.setPreferredSize(new java.awt.Dimension(300, 60));
        btnTarik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTarikActionPerformed(evt);
            }
        });
        jPanel2.add(btnTarik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 260, -1));

        jLabel2.setText("Pilih transaksi");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btnSetor.setText("Setor Tunai");
        btnSetor.setPreferredSize(new java.awt.Dimension(300, 60));
        btnSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetorActionPerformed(evt);
            }
        });
        jPanel2.add(btnSetor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 230, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnLogout.setText("Logout");
        btnLogout.setPreferredSize(new java.awt.Dimension(200, 60));
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnCekSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekSaldoActionPerformed
        frmSaldo saldo = new frmSaldo(base, this);
        saldo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCekSaldoActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        frmM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetorActionPerformed
        frmSetor setorV = new frmSetor(base, this);
        setorV.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSetorActionPerformed

    private void btnTransferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferActionPerformed
       frmTransfer transferV = new frmTransfer(base, this);
       transferV.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTransferActionPerformed

    private void btnTarikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTarikActionPerformed
       frmTarik tarikV = new frmTarik(base, this);
       tarikV.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnTarikActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel LabelTransaksi;
    private javax.swing.JButton btnCekSaldo;
    private javax.swing.JButton btnLogout;
    public javax.swing.JButton btnSetor;
    public javax.swing.JButton btnTarik;
    private javax.swing.JButton btnTransfer;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
