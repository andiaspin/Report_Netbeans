/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication9;

/**
 *
 * @author NDIAPPINK
 */
import javax.swing.JOptionPane;
import cls.ClassDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;
import javax.swing.ImageIcon;
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form BackupRestore
     */
    public Laporan() {
        initComponents();
        setLocationRelativeTo(this);
        loadbulanjual();
        loadhari();
        loadtahunjual();
        
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
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 51, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PILIH JENIS LAPORAN");

        jButton3.setText("LAPORAN TAHUNAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("LAPORAN HARIAN");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("LAPORAN BULANAN");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(jComboBox1.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Pilih Hari Dulu");
        }
else{

try{
                String jrxmlFile = "src/Laporan/harian.jrxml";
                Connection con = ClassDB.getkoneksi();
                HashMap param = new HashMap();
                param.put("hari", jComboBox1.getSelectedItem().toString());
                JasperReport JRpt =JasperCompileManager.compileReport(jrxmlFile);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, param,con);

                JasperViewer.viewReport(JPrint, false);
            }

            catch(JRException e){
                JOptionPane.showMessageDialog(rootPane, e);
            } 
}

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(jComboBox2.getSelectedIndex()==0 && jComboBox3.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(rootPane, "Pilih Bulan Dan Tahun");
            }
            else if(jComboBox2.getSelectedIndex()>0 && jComboBox3.getSelectedIndex()>0){
                try{
                    String jrxmlFile = "src/Laporan/bulanan.jrxml";
                    Connection con = ClassDB.getkoneksi();
                    HashMap param = new HashMap();
                    param.put("bln", jComboBox2.getSelectedItem().toString());
                    param.put("thn", jComboBox3.getSelectedItem().toString());
                    JasperReport JRpt =JasperCompileManager.compileReport(jrxmlFile);
                    JasperPrint JPrint = JasperFillManager.fillReport(JRpt, param,con);

                    JasperViewer.viewReport(JPrint, false);
                }

                catch(JRException e){
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }
            else if(jComboBox2.getSelectedIndex()>0 && jComboBox3.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(rootPane, "Pilih Tahun Untuk Lihat Laporan Bulanan");
            }         
            else{
                JOptionPane.showMessageDialog(rootPane, "Pilih Bulan Untuk Lihat Laporan Bulanan");
            }

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jComboBox3.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Pilih Tahun Dulu");
        }
else{

try{
                String jrxmlFile = "src/Laporan/tahunan.jrxml";
                Connection con = ClassDB.getkoneksi();
                HashMap param = new HashMap();
                param.put("thn", jComboBox3.getSelectedItem().toString());
                JasperReport JRpt =JasperCompileManager.compileReport(jrxmlFile);
                JasperPrint JPrint = JasperFillManager.fillReport(JRpt, param,con);

                JasperViewer.viewReport(JPrint, false);
            }

            catch(JRException e){
                JOptionPane.showMessageDialog(rootPane, e);
            } 
}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        ImageIcon icon = new ImageIcon("src/logo.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public void loadhari(){
    try {        
            jComboBox1.removeAllItems();       
            Connection c=ClassDB.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select distinct tgl_transaksi as hari from penjualan ";
            ResultSet r=s.executeQuery(sql);
            jComboBox1.addItem("PILIH");
            while (r.next()) {  
                jComboBox1.addItem(r.getString("hari"));
            }
            
            r.close();
            s.close();
        }catch(SQLException e) {
           JOptionPane.showMessageDialog(rootPane,e);   
        }    
}
    public void loadbulanjual(){
    try {        
        jComboBox2.removeAllItems();       
            Connection c=ClassDB.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select distinct month(tgl_transaksi) as bulan from penjualan";
            ResultSet r=s.executeQuery(sql);
            jComboBox2.addItem("PILIH");
            while (r.next()) {
                
                jComboBox2.addItem(r.getString("bulan"));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
           JOptionPane.showMessageDialog(rootPane,e);   
        }
    }
    public void loadtahunjual(){
    try {        
        jComboBox3.removeAllItems();       
            Connection c=ClassDB.getkoneksi();
            Statement s= c.createStatement();
            String sql="Select distinct year(tgl_transaksi) as tahun from penjualan";
            ResultSet r=s.executeQuery(sql);
            jComboBox3.addItem("PILIH");
            while (r.next()) {
                
                jComboBox3.addItem(r.getString("tahun"));
            }
            r.close();
            s.close();
        }catch(SQLException e) {
           JOptionPane.showMessageDialog(rootPane,e);   
        }
    }
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
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laporan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laporan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
