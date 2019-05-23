/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzy;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author user
 */
public class Klasifikasi1 extends javax.swing.JFrame {
private Connection con;
private Statement stat;
private ResultSet res;
java.util.Date tglnow = new java.util.Date();
    private SimpleDateFormat sm = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
    private String tanggal = sm.format(tglnow);
    
    
    Koneksi konek = new Koneksi();
    
    
    /**
     * Creates new form Klasifikasi
     */
    public Klasifikasi1() {
        initComponents();
        koneksi();
        layar_tengah();
        btn_1.setEnabled(false);
        
        thn.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        PANEL_PDRB = new javax.swing.JPanel();
        tahun_kab = new javax.swing.JLabel();
        thn = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        kab = new javax.swing.JScrollPane();
        tbl_kab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_tahun = new javax.swing.JTextField();
        proses = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        halaman_utama = new javax.swing.JMenuItem();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Mengetahui\n\n\n\n\n\n\n____________");
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PANEL_PDRB.setBackground(new java.awt.Color(255, 255, 255));
        PANEL_PDRB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        tahun_kab.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tahun_kab.setText("Tahun ");

        thn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        thn.setText("jLabel6");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Data Klasifikasi Kabupaten / Kota  Di JAWA BARAT");

        tbl_kab.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        tbl_kab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        kab.setViewportView(tbl_kab);

        javax.swing.GroupLayout PANEL_PDRBLayout = new javax.swing.GroupLayout(PANEL_PDRB);
        PANEL_PDRB.setLayout(PANEL_PDRBLayout);
        PANEL_PDRBLayout.setHorizontalGroup(
            PANEL_PDRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_PDRBLayout.createSequentialGroup()
                .addGroup(PANEL_PDRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PANEL_PDRBLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PANEL_PDRBLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(tahun_kab)
                        .addGap(51, 51, 51)
                        .addComponent(thn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PANEL_PDRBLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(96, 96, 96))
        );
        PANEL_PDRBLayout.setVerticalGroup(
            PANEL_PDRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PANEL_PDRBLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PANEL_PDRBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(thn)
                    .addComponent(tahun_kab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kab, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setText("Input Tahun :");

        txt_tahun.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        proses.setText("Lihat Data");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });

        btn_1.setText("Print");
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        halaman_utama.setText("Halaman Utama");
        halaman_utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halaman_utamaActionPerformed(evt);
            }
        });
        jMenu1.add(halaman_utama);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(proses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_1))
                    .addComponent(PANEL_PDRB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proses)
                    .addComponent(btn_1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PANEL_PDRB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void layar_tengah(){
    // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
       
    }
    
    private void koneksi(){
        try {Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/klasifikasi", "root", "");
        stat=con.createStatement();}catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Tidak Terhubung dengan database");        }    }
    
    
    private void tableshow() {
        int tahun,tahun_n;
        tahun   = Integer.parseInt(txt_tahun.getText());      
        DefaultTableModel kb= new DefaultTableModel();
        kb.addColumn("Wilayah");
        kb.addColumn("PDRB "+tahun+" ");
        kb.addColumn("RD DeFuzzy");
        kb.addColumn("RC DeFuzzy");
        kb.addColumn("Klasifikasi");
        
        tbl_kab.setModel(kb);      
               try{
            res=stat.executeQuery("SELECT tbl_klasifikasi.kota, tbl_klasifikasi.pdrb, tbl_klasifikasi.RD, tbl_klasifikasi.RC, tbl_klasifikasi.klasifikasi, tbl_klasifikasi.tahun FROM tbl_klasifikasi WHERE tahun='"+txt_tahun.getText()+"'");
            while (res.next()){
            kb.addRow(new Object[]{
            res.getString("kota"),
            res.getString("pdrb"),
            res.getString("RD"),
            res.getString("RC"),
            res.getString("klasifikasi")});
            
            }
        }catch (Exception e){ JOptionPane.showMessageDialog(null, "Data Klasifikasi Kabupaten/ Kota Tahun "+txt_tahun.getText()+" tidak dimukan");}
        
         
    }
    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
        if (txt_tahun.getText().equals("")){JOptionPane.showMessageDialog(null, "Input Tahun Tidak Boleh Kosong");}
        else{
            tableshow();
            btn_1.setEnabled(true);
           
            thn.setVisible(true);
            thn.setText(txt_tahun.getText());
            
            

        }
    }//GEN-LAST:event_prosesActionPerformed

   
    
    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
 JasperReport JasRep;
    JasperPrint JasPri;
    Map <String,Object> tahun = new HashMap<String, Object>();
    JasperDesign JasDes;  
        try {          
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/klasifikasi", "root", "");
            String fileName = "src\\fuzzy\\report3.jrxml";
            String filetoFill = "src\\fuzzy\\report3.jasper";

            JasperCompileManager.compileReportToFile(fileName);
            Map param = new HashMap();
            String ttahun = txt_tahun.getText();
            param.put("tahun", ttahun);
            JasperFillManager.fillReportToFile(filetoFill, param, con);
            JasperPrint jip = JasperFillManager.fillReport(filetoFill, param, con);
            JasperViewer.viewReport(jip, true);
        } catch (JRException e) {
            System.out.println("gagal");
        } catch (SQLException ex) {
        Logger.getLogger(Klasifikasi1.class.getName()).log(Level.SEVERE, null, ex);
    }    
        
    }//GEN-LAST:event_btn_1ActionPerformed

    private void halaman_utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halaman_utamaActionPerformed
        this.dispose();
        new Halaman_Home1().show();    
            
    }//GEN-LAST:event_halaman_utamaActionPerformed

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
            java.util.logging.Logger.getLogger(Klasifikasi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Klasifikasi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Klasifikasi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Klasifikasi1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Klasifikasi1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PANEL_PDRB;
    private javax.swing.JButton btn_1;
    public javax.swing.JMenuItem halaman_utama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JScrollPane kab;
    private javax.swing.JButton proses;
    private javax.swing.JLabel tahun_kab;
    public javax.swing.JTable tbl_kab;
    private javax.swing.JLabel thn;
    public javax.swing.JTextField txt_tahun;
    // End of variables declaration//GEN-END:variables
}