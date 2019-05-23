
package fuzzy;
import java.sql.*;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class menuhitung extends javax.swing.JFrame {
Connection sambung;
    Statement stm;
ResultSet res;
//coba a = new coba();
    /**
     * Creates new form menuhitung
     */
    public menuhitung() {
        initComponents();
        openDB();
        layar_tengah();
        
       
        
       
           
    }
     
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        kb1 = new javax.swing.JLabel();
        kb2 = new javax.swing.JLabel();
        kb3 = new javax.swing.JLabel();
        kb4 = new javax.swing.JLabel();
        kb5 = new javax.swing.JLabel();
        kb6 = new javax.swing.JLabel();
        kb7 = new javax.swing.JLabel();
        kb8 = new javax.swing.JLabel();
        kb9 = new javax.swing.JLabel();
        kb10 = new javax.swing.JLabel();
        kb11 = new javax.swing.JLabel();
        kb12 = new javax.swing.JLabel();
        kb13 = new javax.swing.JLabel();
        kb14 = new javax.swing.JLabel();
        kb15 = new javax.swing.JLabel();
        kb16 = new javax.swing.JLabel();
        kb17 = new javax.swing.JLabel();
        kb18 = new javax.swing.JLabel();
        kb19 = new javax.swing.JLabel();
        kb20 = new javax.swing.JLabel();
        kb21 = new javax.swing.JLabel();
        kb22 = new javax.swing.JLabel();
        kb23 = new javax.swing.JLabel();
        kb24 = new javax.swing.JLabel();
        kb25 = new javax.swing.JLabel();
        tahun_klasifikasi = new javax.swing.JTextField();
        kb26 = new javax.swing.JLabel();
        kb27 = new javax.swing.JLabel();
        kjabar = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        fuzzyfikasi = new javax.swing.JPanel();
        titik_a_b_variabel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        thn1 = new javax.swing.JLabel();
        thn2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        a_tahun = new javax.swing.JTextField();
        a_tahun_n = new javax.swing.JTextField();
        a_rd = new javax.swing.JTextField();
        a_rc = new javax.swing.JTextField();
        b_tahun = new javax.swing.JTextField();
        b_tahun_n = new javax.swing.JTextField();
        b_rd = new javax.swing.JTextField();
        b_rc = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        pa_tahun = new javax.swing.JTextField();
        pa_tahun_n = new javax.swing.JTextField();
        pa_rd = new javax.swing.JTextField();
        pa_rc = new javax.swing.JTextField();
        pb_rc = new javax.swing.JTextField();
        pb_rd = new javax.swing.JTextField();
        pb_tahun_n = new javax.swing.JTextField();
        pb_tahun = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        tahun_a_kab2 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        RD = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        RD1 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        RD2 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        RD3 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        RD4 = new javax.swing.JLabel();
        RD5 = new javax.swing.JLabel();
        RD6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        derajat_evaluasi = new javax.swing.JPanel();
        thn_l1 = new javax.swing.JTextField();
        thn_h1 = new javax.swing.JTextField();
        thn_n_l1 = new javax.swing.JTextField();
        thn_n_h1 = new javax.swing.JTextField();
        rd_l1 = new javax.swing.JTextField();
        rd_h1 = new javax.swing.JTextField();
        rc_l1 = new javax.swing.JTextField();
        rc_h1 = new javax.swing.JTextField();
        rde1_l1 = new javax.swing.JTextField();
        rce1_l1 = new javax.swing.JTextField();
        rde2_l1 = new javax.swing.JTextField();
        rce2_l1 = new javax.swing.JTextField();
        rde3_h1 = new javax.swing.JTextField();
        rce3_h1 = new javax.swing.JTextField();
        rde4_h1 = new javax.swing.JTextField();
        rce4_h1 = new javax.swing.JTextField();
        kab_bandung1 = new javax.swing.JLabel();
        thn_l2 = new javax.swing.JTextField();
        thn_h2 = new javax.swing.JTextField();
        thn_n_l2 = new javax.swing.JTextField();
        thn_n_h2 = new javax.swing.JTextField();
        rd_l2 = new javax.swing.JTextField();
        rd_h2 = new javax.swing.JTextField();
        rc_l2 = new javax.swing.JTextField();
        rc_h2 = new javax.swing.JTextField();
        rde1_l2 = new javax.swing.JTextField();
        rce1_l2 = new javax.swing.JTextField();
        rde2_l2 = new javax.swing.JTextField();
        rce2_l2 = new javax.swing.JTextField();
        rde3_h2 = new javax.swing.JTextField();
        rce3_h2 = new javax.swing.JTextField();
        rde4_h2 = new javax.swing.JTextField();
        rce4_h2 = new javax.swing.JTextField();
        kab_bandung6 = new javax.swing.JLabel();
        kab_bandung7 = new javax.swing.JLabel();
        kab_bandung8 = new javax.swing.JLabel();
        kab_bandung9 = new javax.swing.JLabel();
        kab_bandung10 = new javax.swing.JLabel();
        kab_bandung11 = new javax.swing.JLabel();
        kab_bandung12 = new javax.swing.JLabel();
        kab_bandung13 = new javax.swing.JLabel();
        kab_bandung14 = new javax.swing.JLabel();
        kab_bandung15 = new javax.swing.JLabel();
        kab_bandung17 = new javax.swing.JLabel();
        kab_bandung18 = new javax.swing.JLabel();
        kab_bandung19 = new javax.swing.JLabel();
        kab_bandung20 = new javax.swing.JLabel();
        kab_bandung21 = new javax.swing.JLabel();
        kab_bandung22 = new javax.swing.JLabel();
        kab_bandung23 = new javax.swing.JLabel();
        kab_bandung24 = new javax.swing.JLabel();
        kab_bandung25 = new javax.swing.JLabel();
        kab_bandung26 = new javax.swing.JLabel();
        kab_bandung27 = new javax.swing.JLabel();
        kab_bandung28 = new javax.swing.JLabel();
        kab_bandung29 = new javax.swing.JLabel();
        kab_bandung30 = new javax.swing.JLabel();
        kab_bandung4 = new javax.swing.JLabel();
        thn_l3 = new javax.swing.JTextField();
        thn_h3 = new javax.swing.JTextField();
        thn_n_l3 = new javax.swing.JTextField();
        thn_n_h3 = new javax.swing.JTextField();
        rd_l3 = new javax.swing.JTextField();
        rd_h3 = new javax.swing.JTextField();
        rc_l3 = new javax.swing.JTextField();
        rc_h3 = new javax.swing.JTextField();
        rde1_l3 = new javax.swing.JTextField();
        rce1_l3 = new javax.swing.JTextField();
        rde2_l3 = new javax.swing.JTextField();
        rce2_l3 = new javax.swing.JTextField();
        rde3_h3 = new javax.swing.JTextField();
        rce3_h3 = new javax.swing.JTextField();
        rde4_h3 = new javax.swing.JTextField();
        rce4_h3 = new javax.swing.JTextField();
        thn_l4 = new javax.swing.JTextField();
        thn_l5 = new javax.swing.JTextField();
        thn_l6 = new javax.swing.JTextField();
        thn_l7 = new javax.swing.JTextField();
        thn_l8 = new javax.swing.JTextField();
        thn_l9 = new javax.swing.JTextField();
        thn_l10 = new javax.swing.JTextField();
        thn_l11 = new javax.swing.JTextField();
        thn_l12 = new javax.swing.JTextField();
        thn_l13 = new javax.swing.JTextField();
        thn_l14 = new javax.swing.JTextField();
        thn_l15 = new javax.swing.JTextField();
        thn_l16 = new javax.swing.JTextField();
        thn_l17 = new javax.swing.JTextField();
        thn_l18 = new javax.swing.JTextField();
        thn_l19 = new javax.swing.JTextField();
        thn_l20 = new javax.swing.JTextField();
        thn_l21 = new javax.swing.JTextField();
        thn_l22 = new javax.swing.JTextField();
        thn_l23 = new javax.swing.JTextField();
        thn_l24 = new javax.swing.JTextField();
        thn_l25 = new javax.swing.JTextField();
        thn_l26 = new javax.swing.JTextField();
        thn_l27 = new javax.swing.JTextField();
        kab_bandung16 = new javax.swing.JLabel();
        thn_h4 = new javax.swing.JTextField();
        thn_n_l4 = new javax.swing.JTextField();
        thn_n_h4 = new javax.swing.JTextField();
        rd_l4 = new javax.swing.JTextField();
        rd_h4 = new javax.swing.JTextField();
        rc_l4 = new javax.swing.JTextField();
        rc_h4 = new javax.swing.JTextField();
        thn_h5 = new javax.swing.JTextField();
        thn_n_l5 = new javax.swing.JTextField();
        thn_n_h5 = new javax.swing.JTextField();
        rd_l5 = new javax.swing.JTextField();
        rd_h5 = new javax.swing.JTextField();
        rc_l5 = new javax.swing.JTextField();
        rc_h5 = new javax.swing.JTextField();
        thn_h6 = new javax.swing.JTextField();
        thn_n_l6 = new javax.swing.JTextField();
        thn_n_h6 = new javax.swing.JTextField();
        rd_l6 = new javax.swing.JTextField();
        rd_h6 = new javax.swing.JTextField();
        rc_l6 = new javax.swing.JTextField();
        rc_h6 = new javax.swing.JTextField();
        thn_h7 = new javax.swing.JTextField();
        thn_n_l7 = new javax.swing.JTextField();
        thn_n_h7 = new javax.swing.JTextField();
        rd_l7 = new javax.swing.JTextField();
        rd_h7 = new javax.swing.JTextField();
        rc_l7 = new javax.swing.JTextField();
        rc_h7 = new javax.swing.JTextField();
        thn_h8 = new javax.swing.JTextField();
        thn_n_l8 = new javax.swing.JTextField();
        thn_n_h8 = new javax.swing.JTextField();
        rd_l8 = new javax.swing.JTextField();
        rd_h8 = new javax.swing.JTextField();
        rc_l8 = new javax.swing.JTextField();
        rc_h8 = new javax.swing.JTextField();
        thn_h9 = new javax.swing.JTextField();
        thn_n_l9 = new javax.swing.JTextField();
        thn_n_h9 = new javax.swing.JTextField();
        rd_l9 = new javax.swing.JTextField();
        rd_h9 = new javax.swing.JTextField();
        rc_l9 = new javax.swing.JTextField();
        rc_h9 = new javax.swing.JTextField();
        thn_h10 = new javax.swing.JTextField();
        thn_n_l10 = new javax.swing.JTextField();
        thn_n_h10 = new javax.swing.JTextField();
        rd_l10 = new javax.swing.JTextField();
        rd_h10 = new javax.swing.JTextField();
        rc_l10 = new javax.swing.JTextField();
        rc_h10 = new javax.swing.JTextField();
        thn_h11 = new javax.swing.JTextField();
        thn_n_l11 = new javax.swing.JTextField();
        thn_n_h11 = new javax.swing.JTextField();
        rd_l11 = new javax.swing.JTextField();
        rd_h11 = new javax.swing.JTextField();
        rc_l11 = new javax.swing.JTextField();
        rc_h11 = new javax.swing.JTextField();
        thn_h12 = new javax.swing.JTextField();
        thn_n_l12 = new javax.swing.JTextField();
        thn_n_h12 = new javax.swing.JTextField();
        rd_l12 = new javax.swing.JTextField();
        rd_h12 = new javax.swing.JTextField();
        rc_l12 = new javax.swing.JTextField();
        rc_h12 = new javax.swing.JTextField();
        thn_h13 = new javax.swing.JTextField();
        thn_n_l13 = new javax.swing.JTextField();
        thn_n_h13 = new javax.swing.JTextField();
        rd_l13 = new javax.swing.JTextField();
        rd_h13 = new javax.swing.JTextField();
        rc_l13 = new javax.swing.JTextField();
        rc_h13 = new javax.swing.JTextField();
        thn_h14 = new javax.swing.JTextField();
        thn_n_l14 = new javax.swing.JTextField();
        thn_n_h14 = new javax.swing.JTextField();
        rd_l14 = new javax.swing.JTextField();
        rd_h14 = new javax.swing.JTextField();
        rc_l14 = new javax.swing.JTextField();
        rc_h14 = new javax.swing.JTextField();
        thn_h15 = new javax.swing.JTextField();
        thn_n_l15 = new javax.swing.JTextField();
        thn_n_h15 = new javax.swing.JTextField();
        rd_l15 = new javax.swing.JTextField();
        rd_h15 = new javax.swing.JTextField();
        rc_l15 = new javax.swing.JTextField();
        rc_h15 = new javax.swing.JTextField();
        thn_h16 = new javax.swing.JTextField();
        thn_n_l16 = new javax.swing.JTextField();
        thn_n_h16 = new javax.swing.JTextField();
        rd_l16 = new javax.swing.JTextField();
        rd_h16 = new javax.swing.JTextField();
        rc_l16 = new javax.swing.JTextField();
        rc_h16 = new javax.swing.JTextField();
        thn_h17 = new javax.swing.JTextField();
        thn_n_l17 = new javax.swing.JTextField();
        thn_n_h17 = new javax.swing.JTextField();
        rd_l17 = new javax.swing.JTextField();
        rd_h17 = new javax.swing.JTextField();
        rc_l17 = new javax.swing.JTextField();
        rc_h17 = new javax.swing.JTextField();
        thn_h18 = new javax.swing.JTextField();
        thn_n_l18 = new javax.swing.JTextField();
        thn_n_h18 = new javax.swing.JTextField();
        rd_l18 = new javax.swing.JTextField();
        rd_h18 = new javax.swing.JTextField();
        rc_l18 = new javax.swing.JTextField();
        rc_h18 = new javax.swing.JTextField();
        thn_h19 = new javax.swing.JTextField();
        thn_n_l19 = new javax.swing.JTextField();
        thn_n_h19 = new javax.swing.JTextField();
        rd_l19 = new javax.swing.JTextField();
        rd_h19 = new javax.swing.JTextField();
        rc_l19 = new javax.swing.JTextField();
        rc_h19 = new javax.swing.JTextField();
        thn_h20 = new javax.swing.JTextField();
        thn_n_l20 = new javax.swing.JTextField();
        thn_n_h20 = new javax.swing.JTextField();
        rd_l20 = new javax.swing.JTextField();
        rd_h20 = new javax.swing.JTextField();
        rc_l20 = new javax.swing.JTextField();
        rc_h20 = new javax.swing.JTextField();
        thn_h21 = new javax.swing.JTextField();
        thn_n_l21 = new javax.swing.JTextField();
        thn_n_h21 = new javax.swing.JTextField();
        rd_l21 = new javax.swing.JTextField();
        rd_h21 = new javax.swing.JTextField();
        rc_l21 = new javax.swing.JTextField();
        rc_h21 = new javax.swing.JTextField();
        thn_h22 = new javax.swing.JTextField();
        thn_n_l22 = new javax.swing.JTextField();
        thn_n_h22 = new javax.swing.JTextField();
        rd_l22 = new javax.swing.JTextField();
        rd_h22 = new javax.swing.JTextField();
        rc_l22 = new javax.swing.JTextField();
        rc_h22 = new javax.swing.JTextField();
        thn_h23 = new javax.swing.JTextField();
        thn_n_l23 = new javax.swing.JTextField();
        thn_n_h23 = new javax.swing.JTextField();
        rd_l23 = new javax.swing.JTextField();
        rd_h23 = new javax.swing.JTextField();
        rc_l23 = new javax.swing.JTextField();
        rc_h23 = new javax.swing.JTextField();
        thn_h24 = new javax.swing.JTextField();
        thn_n_l24 = new javax.swing.JTextField();
        thn_n_h24 = new javax.swing.JTextField();
        rd_l24 = new javax.swing.JTextField();
        rd_h24 = new javax.swing.JTextField();
        rc_l24 = new javax.swing.JTextField();
        rc_h24 = new javax.swing.JTextField();
        thn_h25 = new javax.swing.JTextField();
        thn_n_l25 = new javax.swing.JTextField();
        thn_n_h25 = new javax.swing.JTextField();
        rd_l25 = new javax.swing.JTextField();
        rd_h25 = new javax.swing.JTextField();
        rc_l25 = new javax.swing.JTextField();
        rc_h25 = new javax.swing.JTextField();
        thn_h26 = new javax.swing.JTextField();
        thn_n_l26 = new javax.swing.JTextField();
        thn_n_h26 = new javax.swing.JTextField();
        rd_l26 = new javax.swing.JTextField();
        rd_h26 = new javax.swing.JTextField();
        rc_l26 = new javax.swing.JTextField();
        rc_h26 = new javax.swing.JTextField();
        thn_h27 = new javax.swing.JTextField();
        thn_n_l27 = new javax.swing.JTextField();
        thn_n_h27 = new javax.swing.JTextField();
        rd_l27 = new javax.swing.JTextField();
        rd_h27 = new javax.swing.JTextField();
        rc_l27 = new javax.swing.JTextField();
        rc_h27 = new javax.swing.JTextField();
        rde1_l4 = new javax.swing.JTextField();
        rde1_l5 = new javax.swing.JTextField();
        rde1_l6 = new javax.swing.JTextField();
        rde1_l7 = new javax.swing.JTextField();
        rde1_l8 = new javax.swing.JTextField();
        rde1_l9 = new javax.swing.JTextField();
        rde1_l10 = new javax.swing.JTextField();
        rde1_l11 = new javax.swing.JTextField();
        rde1_l12 = new javax.swing.JTextField();
        rde1_l13 = new javax.swing.JTextField();
        rde1_l14 = new javax.swing.JTextField();
        rde1_l15 = new javax.swing.JTextField();
        rde1_l16 = new javax.swing.JTextField();
        rde1_l17 = new javax.swing.JTextField();
        rde1_l18 = new javax.swing.JTextField();
        rde1_l19 = new javax.swing.JTextField();
        rde1_l20 = new javax.swing.JTextField();
        rde1_l21 = new javax.swing.JTextField();
        rde1_l22 = new javax.swing.JTextField();
        rde1_l23 = new javax.swing.JTextField();
        rde1_l24 = new javax.swing.JTextField();
        rde1_l25 = new javax.swing.JTextField();
        rde1_l26 = new javax.swing.JTextField();
        rde1_l27 = new javax.swing.JTextField();
        rce1_l4 = new javax.swing.JTextField();
        rde2_l4 = new javax.swing.JTextField();
        rce2_l4 = new javax.swing.JTextField();
        rde3_h4 = new javax.swing.JTextField();
        rce3_h4 = new javax.swing.JTextField();
        rde4_h4 = new javax.swing.JTextField();
        rce4_h4 = new javax.swing.JTextField();
        rce1_l5 = new javax.swing.JTextField();
        rde2_l5 = new javax.swing.JTextField();
        rce2_l5 = new javax.swing.JTextField();
        rde3_h5 = new javax.swing.JTextField();
        rce3_h5 = new javax.swing.JTextField();
        rde4_h5 = new javax.swing.JTextField();
        rce4_h5 = new javax.swing.JTextField();
        rce1_l6 = new javax.swing.JTextField();
        rde2_l6 = new javax.swing.JTextField();
        rce2_l6 = new javax.swing.JTextField();
        rde3_h6 = new javax.swing.JTextField();
        rce3_h6 = new javax.swing.JTextField();
        rde4_h6 = new javax.swing.JTextField();
        rce4_h6 = new javax.swing.JTextField();
        rce1_l7 = new javax.swing.JTextField();
        rde2_l7 = new javax.swing.JTextField();
        rce2_l7 = new javax.swing.JTextField();
        rde3_h7 = new javax.swing.JTextField();
        rce3_h7 = new javax.swing.JTextField();
        rde4_h7 = new javax.swing.JTextField();
        rce4_h7 = new javax.swing.JTextField();
        rce1_l8 = new javax.swing.JTextField();
        rde2_l8 = new javax.swing.JTextField();
        rce2_l8 = new javax.swing.JTextField();
        rde3_h8 = new javax.swing.JTextField();
        rce3_h8 = new javax.swing.JTextField();
        rde4_h8 = new javax.swing.JTextField();
        rce4_h8 = new javax.swing.JTextField();
        rce1_l9 = new javax.swing.JTextField();
        rde2_l9 = new javax.swing.JTextField();
        rce2_l9 = new javax.swing.JTextField();
        rde3_h9 = new javax.swing.JTextField();
        rce3_h9 = new javax.swing.JTextField();
        rde4_h9 = new javax.swing.JTextField();
        rce4_h9 = new javax.swing.JTextField();
        rce1_l10 = new javax.swing.JTextField();
        rde2_l10 = new javax.swing.JTextField();
        rce2_l10 = new javax.swing.JTextField();
        rde3_h10 = new javax.swing.JTextField();
        rce3_h10 = new javax.swing.JTextField();
        rde4_h10 = new javax.swing.JTextField();
        rce4_h10 = new javax.swing.JTextField();
        rce1_l11 = new javax.swing.JTextField();
        rde2_l11 = new javax.swing.JTextField();
        rce2_l11 = new javax.swing.JTextField();
        rde3_h11 = new javax.swing.JTextField();
        rce3_h11 = new javax.swing.JTextField();
        rde4_h11 = new javax.swing.JTextField();
        rce4_h11 = new javax.swing.JTextField();
        rce1_l12 = new javax.swing.JTextField();
        rde2_l12 = new javax.swing.JTextField();
        rce2_l12 = new javax.swing.JTextField();
        rde3_h12 = new javax.swing.JTextField();
        rce3_h12 = new javax.swing.JTextField();
        rde4_h12 = new javax.swing.JTextField();
        rce4_h12 = new javax.swing.JTextField();
        rce1_l13 = new javax.swing.JTextField();
        rde2_l13 = new javax.swing.JTextField();
        rce2_l13 = new javax.swing.JTextField();
        rde3_h13 = new javax.swing.JTextField();
        rce3_h13 = new javax.swing.JTextField();
        rde4_h13 = new javax.swing.JTextField();
        rce4_h13 = new javax.swing.JTextField();
        rce1_l14 = new javax.swing.JTextField();
        rde2_l14 = new javax.swing.JTextField();
        rce2_l14 = new javax.swing.JTextField();
        rde3_h14 = new javax.swing.JTextField();
        rce3_h14 = new javax.swing.JTextField();
        rde4_h14 = new javax.swing.JTextField();
        rce4_h14 = new javax.swing.JTextField();
        rce1_l15 = new javax.swing.JTextField();
        rde2_l15 = new javax.swing.JTextField();
        rce2_l15 = new javax.swing.JTextField();
        rde3_h15 = new javax.swing.JTextField();
        rce3_h15 = new javax.swing.JTextField();
        rde4_h15 = new javax.swing.JTextField();
        rce4_h15 = new javax.swing.JTextField();
        rce1_l16 = new javax.swing.JTextField();
        rde2_l16 = new javax.swing.JTextField();
        rce2_l16 = new javax.swing.JTextField();
        rde3_h16 = new javax.swing.JTextField();
        rce3_h16 = new javax.swing.JTextField();
        rde4_h16 = new javax.swing.JTextField();
        rce4_h16 = new javax.swing.JTextField();
        rce1_l17 = new javax.swing.JTextField();
        rde2_l17 = new javax.swing.JTextField();
        rce2_l17 = new javax.swing.JTextField();
        rde3_h17 = new javax.swing.JTextField();
        rce3_h17 = new javax.swing.JTextField();
        rde4_h17 = new javax.swing.JTextField();
        rce4_h17 = new javax.swing.JTextField();
        rce1_l18 = new javax.swing.JTextField();
        rde2_l18 = new javax.swing.JTextField();
        rce2_l18 = new javax.swing.JTextField();
        rde3_h18 = new javax.swing.JTextField();
        rce3_h18 = new javax.swing.JTextField();
        rde4_h18 = new javax.swing.JTextField();
        rce4_h18 = new javax.swing.JTextField();
        rce1_l19 = new javax.swing.JTextField();
        rde2_l19 = new javax.swing.JTextField();
        rce2_l19 = new javax.swing.JTextField();
        rde3_h19 = new javax.swing.JTextField();
        rce3_h19 = new javax.swing.JTextField();
        rde4_h19 = new javax.swing.JTextField();
        rce4_h19 = new javax.swing.JTextField();
        rce1_l20 = new javax.swing.JTextField();
        rde2_l20 = new javax.swing.JTextField();
        rce2_l20 = new javax.swing.JTextField();
        rde3_h20 = new javax.swing.JTextField();
        rce3_h20 = new javax.swing.JTextField();
        rde4_h20 = new javax.swing.JTextField();
        rce4_h20 = new javax.swing.JTextField();
        rce1_l21 = new javax.swing.JTextField();
        rde2_l21 = new javax.swing.JTextField();
        rce2_l21 = new javax.swing.JTextField();
        rde3_h21 = new javax.swing.JTextField();
        rce3_h21 = new javax.swing.JTextField();
        rde4_h21 = new javax.swing.JTextField();
        rce4_h21 = new javax.swing.JTextField();
        rce1_l22 = new javax.swing.JTextField();
        rde2_l22 = new javax.swing.JTextField();
        rce2_l22 = new javax.swing.JTextField();
        rde3_h22 = new javax.swing.JTextField();
        rce3_h22 = new javax.swing.JTextField();
        rde4_h22 = new javax.swing.JTextField();
        rce4_h22 = new javax.swing.JTextField();
        rce1_l23 = new javax.swing.JTextField();
        rde2_l23 = new javax.swing.JTextField();
        rce2_l23 = new javax.swing.JTextField();
        rde3_h23 = new javax.swing.JTextField();
        rce3_h23 = new javax.swing.JTextField();
        rde4_h23 = new javax.swing.JTextField();
        rce4_h23 = new javax.swing.JTextField();
        rce1_l24 = new javax.swing.JTextField();
        rde2_l24 = new javax.swing.JTextField();
        rce2_l24 = new javax.swing.JTextField();
        rde3_h24 = new javax.swing.JTextField();
        rce3_h24 = new javax.swing.JTextField();
        rde4_h24 = new javax.swing.JTextField();
        rce4_h24 = new javax.swing.JTextField();
        rce1_l25 = new javax.swing.JTextField();
        rde2_l25 = new javax.swing.JTextField();
        rce2_l25 = new javax.swing.JTextField();
        rde3_h25 = new javax.swing.JTextField();
        rce3_h25 = new javax.swing.JTextField();
        rde4_h25 = new javax.swing.JTextField();
        rce4_h25 = new javax.swing.JTextField();
        rce1_l26 = new javax.swing.JTextField();
        rde2_l26 = new javax.swing.JTextField();
        rce2_l26 = new javax.swing.JTextField();
        rde3_h26 = new javax.swing.JTextField();
        rce3_h26 = new javax.swing.JTextField();
        rde4_h26 = new javax.swing.JTextField();
        rce4_h26 = new javax.swing.JTextField();
        rce1_l27 = new javax.swing.JTextField();
        rde2_l27 = new javax.swing.JTextField();
        rce2_l27 = new javax.swing.JTextField();
        rde3_h27 = new javax.swing.JTextField();
        rce3_h27 = new javax.swing.JTextField();
        rde4_h27 = new javax.swing.JTextField();
        rce4_h27 = new javax.swing.JTextField();
        p_rc_l = new javax.swing.JTextField();
        p_thn_l = new javax.swing.JTextField();
        p_rce1_l = new javax.swing.JTextField();
        p_rce3_h = new javax.swing.JTextField();
        p_rd_h = new javax.swing.JTextField();
        p_rce2_l = new javax.swing.JTextField();
        p_thn_high1 = new javax.swing.JTextField();
        p_rde4_h = new javax.swing.JTextField();
        p_thn_high = new javax.swing.JTextField();
        p_rde1_l = new javax.swing.JTextField();
        p_thn_low1 = new javax.swing.JTextField();
        p_rc_h = new javax.swing.JTextField();
        p_rd_l = new javax.swing.JTextField();
        p_rde2_l = new javax.swing.JTextField();
        p_rce4_h = new javax.swing.JTextField();
        p_rde3_l = new javax.swing.JTextField();
        kab_bandung2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        komposisi_rule = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Komposisi_RULE = new javax.swing.JPanel();
        rdkl1 = new javax.swing.JTextField();
        rdkh1 = new javax.swing.JTextField();
        rckl1 = new javax.swing.JTextField();
        rckh1 = new javax.swing.JTextField();
        z1rd1 = new javax.swing.JTextField();
        z2rd1 = new javax.swing.JTextField();
        z1rc1 = new javax.swing.JTextField();
        z2rc1 = new javax.swing.JTextField();
        dfrd1 = new javax.swing.JTextField();
        dfrc1 = new javax.swing.JTextField();
        klass1 = new javax.swing.JTextField();
        kab_bandung3 = new javax.swing.JLabel();
        kab_bandung31 = new javax.swing.JLabel();
        kab_bandung32 = new javax.swing.JLabel();
        kab_bandung33 = new javax.swing.JLabel();
        kab_bandung34 = new javax.swing.JLabel();
        kab_bandung35 = new javax.swing.JLabel();
        kab_bandung36 = new javax.swing.JLabel();
        kab_bandung37 = new javax.swing.JLabel();
        kab_bandung38 = new javax.swing.JLabel();
        kab_bandung39 = new javax.swing.JLabel();
        kab_bandung40 = new javax.swing.JLabel();
        kab_bandung41 = new javax.swing.JLabel();
        kab_bandung42 = new javax.swing.JLabel();
        kab_bandung43 = new javax.swing.JLabel();
        kab_bandung44 = new javax.swing.JLabel();
        kab_bandung45 = new javax.swing.JLabel();
        kab_bandung46 = new javax.swing.JLabel();
        kab_bandung47 = new javax.swing.JLabel();
        kab_bandung48 = new javax.swing.JLabel();
        kab_bandung49 = new javax.swing.JLabel();
        kab_bandung50 = new javax.swing.JLabel();
        kab_bandung51 = new javax.swing.JLabel();
        kab_bandung52 = new javax.swing.JLabel();
        kab_bandung53 = new javax.swing.JLabel();
        kab_bandung54 = new javax.swing.JLabel();
        kab_bandung5 = new javax.swing.JLabel();
        kab_bandung55 = new javax.swing.JLabel();
        rdkl2 = new javax.swing.JTextField();
        rdkh2 = new javax.swing.JTextField();
        rckl2 = new javax.swing.JTextField();
        rckh2 = new javax.swing.JTextField();
        z1rd2 = new javax.swing.JTextField();
        z2rd2 = new javax.swing.JTextField();
        z1rc2 = new javax.swing.JTextField();
        z2rc2 = new javax.swing.JTextField();
        dfrd2 = new javax.swing.JTextField();
        dfrc2 = new javax.swing.JTextField();
        klass2 = new javax.swing.JTextField();
        rdkl3 = new javax.swing.JTextField();
        rdkh3 = new javax.swing.JTextField();
        rckl3 = new javax.swing.JTextField();
        rckh3 = new javax.swing.JTextField();
        z1rd3 = new javax.swing.JTextField();
        z2rd3 = new javax.swing.JTextField();
        z1rc3 = new javax.swing.JTextField();
        z2rc3 = new javax.swing.JTextField();
        dfrd3 = new javax.swing.JTextField();
        dfrc3 = new javax.swing.JTextField();
        klass3 = new javax.swing.JTextField();
        rdkl4 = new javax.swing.JTextField();
        rdkh4 = new javax.swing.JTextField();
        rckl4 = new javax.swing.JTextField();
        rckh4 = new javax.swing.JTextField();
        z1rd4 = new javax.swing.JTextField();
        z2rd4 = new javax.swing.JTextField();
        z1rc4 = new javax.swing.JTextField();
        z2rc4 = new javax.swing.JTextField();
        dfrd4 = new javax.swing.JTextField();
        dfrc4 = new javax.swing.JTextField();
        klass4 = new javax.swing.JTextField();
        z1rd5 = new javax.swing.JTextField();
        rckl5 = new javax.swing.JTextField();
        rckh5 = new javax.swing.JTextField();
        rdkl5 = new javax.swing.JTextField();
        z2rc5 = new javax.swing.JTextField();
        dfrc5 = new javax.swing.JTextField();
        rdkh5 = new javax.swing.JTextField();
        z1rc5 = new javax.swing.JTextField();
        z2rd5 = new javax.swing.JTextField();
        klass5 = new javax.swing.JTextField();
        dfrd5 = new javax.swing.JTextField();
        z1rc6 = new javax.swing.JTextField();
        z2rd6 = new javax.swing.JTextField();
        rckh6 = new javax.swing.JTextField();
        klass6 = new javax.swing.JTextField();
        z2rc6 = new javax.swing.JTextField();
        rdkl6 = new javax.swing.JTextField();
        rdkh6 = new javax.swing.JTextField();
        rckl6 = new javax.swing.JTextField();
        dfrc6 = new javax.swing.JTextField();
        dfrd6 = new javax.swing.JTextField();
        z1rd6 = new javax.swing.JTextField();
        z1rc7 = new javax.swing.JTextField();
        z2rd7 = new javax.swing.JTextField();
        rckh7 = new javax.swing.JTextField();
        klass7 = new javax.swing.JTextField();
        z2rc7 = new javax.swing.JTextField();
        rdkl7 = new javax.swing.JTextField();
        rdkh7 = new javax.swing.JTextField();
        rckl7 = new javax.swing.JTextField();
        dfrc7 = new javax.swing.JTextField();
        dfrd7 = new javax.swing.JTextField();
        z1rd7 = new javax.swing.JTextField();
        z1rc8 = new javax.swing.JTextField();
        z2rd8 = new javax.swing.JTextField();
        rckh8 = new javax.swing.JTextField();
        klass8 = new javax.swing.JTextField();
        z2rc8 = new javax.swing.JTextField();
        rdkl8 = new javax.swing.JTextField();
        rdkh8 = new javax.swing.JTextField();
        rckl8 = new javax.swing.JTextField();
        dfrc8 = new javax.swing.JTextField();
        dfrd8 = new javax.swing.JTextField();
        z1rd8 = new javax.swing.JTextField();
        z1rc9 = new javax.swing.JTextField();
        z2rd9 = new javax.swing.JTextField();
        rckh9 = new javax.swing.JTextField();
        klass9 = new javax.swing.JTextField();
        z2rc9 = new javax.swing.JTextField();
        rdkl9 = new javax.swing.JTextField();
        rdkh9 = new javax.swing.JTextField();
        rckl9 = new javax.swing.JTextField();
        dfrc9 = new javax.swing.JTextField();
        dfrd9 = new javax.swing.JTextField();
        z1rd9 = new javax.swing.JTextField();
        z1rd10 = new javax.swing.JTextField();
        rckh10 = new javax.swing.JTextField();
        z1rc10 = new javax.swing.JTextField();
        rdkh10 = new javax.swing.JTextField();
        rdkl10 = new javax.swing.JTextField();
        dfrc10 = new javax.swing.JTextField();
        dfrd10 = new javax.swing.JTextField();
        rckl10 = new javax.swing.JTextField();
        klass10 = new javax.swing.JTextField();
        z2rc10 = new javax.swing.JTextField();
        z2rd10 = new javax.swing.JTextField();
        z1rd11 = new javax.swing.JTextField();
        rckh11 = new javax.swing.JTextField();
        z1rc11 = new javax.swing.JTextField();
        rdkh11 = new javax.swing.JTextField();
        rdkl11 = new javax.swing.JTextField();
        dfrc11 = new javax.swing.JTextField();
        dfrd11 = new javax.swing.JTextField();
        rckl11 = new javax.swing.JTextField();
        klass11 = new javax.swing.JTextField();
        z2rc11 = new javax.swing.JTextField();
        z2rd11 = new javax.swing.JTextField();
        z1rd12 = new javax.swing.JTextField();
        rckh12 = new javax.swing.JTextField();
        z1rc12 = new javax.swing.JTextField();
        rdkh12 = new javax.swing.JTextField();
        rdkl12 = new javax.swing.JTextField();
        dfrc12 = new javax.swing.JTextField();
        dfrd12 = new javax.swing.JTextField();
        rckl12 = new javax.swing.JTextField();
        klass12 = new javax.swing.JTextField();
        z2rc12 = new javax.swing.JTextField();
        z2rd12 = new javax.swing.JTextField();
        z1rd13 = new javax.swing.JTextField();
        rckh13 = new javax.swing.JTextField();
        z1rc13 = new javax.swing.JTextField();
        rdkh13 = new javax.swing.JTextField();
        rdkl13 = new javax.swing.JTextField();
        dfrc13 = new javax.swing.JTextField();
        dfrd13 = new javax.swing.JTextField();
        rckl13 = new javax.swing.JTextField();
        klass13 = new javax.swing.JTextField();
        z2rc13 = new javax.swing.JTextField();
        z2rd13 = new javax.swing.JTextField();
        z1rd14 = new javax.swing.JTextField();
        rckh14 = new javax.swing.JTextField();
        z1rc14 = new javax.swing.JTextField();
        rdkh14 = new javax.swing.JTextField();
        rdkl14 = new javax.swing.JTextField();
        dfrc14 = new javax.swing.JTextField();
        dfrd14 = new javax.swing.JTextField();
        rckl14 = new javax.swing.JTextField();
        klass14 = new javax.swing.JTextField();
        z2rc14 = new javax.swing.JTextField();
        z2rd14 = new javax.swing.JTextField();
        z1rd15 = new javax.swing.JTextField();
        rckh15 = new javax.swing.JTextField();
        z1rc15 = new javax.swing.JTextField();
        rdkh15 = new javax.swing.JTextField();
        rdkl15 = new javax.swing.JTextField();
        dfrc15 = new javax.swing.JTextField();
        dfrd15 = new javax.swing.JTextField();
        rckl15 = new javax.swing.JTextField();
        klass15 = new javax.swing.JTextField();
        z2rc15 = new javax.swing.JTextField();
        z2rd15 = new javax.swing.JTextField();
        z1rd16 = new javax.swing.JTextField();
        rckh16 = new javax.swing.JTextField();
        z1rc16 = new javax.swing.JTextField();
        rdkh16 = new javax.swing.JTextField();
        rdkl16 = new javax.swing.JTextField();
        dfrc16 = new javax.swing.JTextField();
        dfrd16 = new javax.swing.JTextField();
        rckl16 = new javax.swing.JTextField();
        klass16 = new javax.swing.JTextField();
        z2rc16 = new javax.swing.JTextField();
        z2rd16 = new javax.swing.JTextField();
        z1rd17 = new javax.swing.JTextField();
        rckh17 = new javax.swing.JTextField();
        z1rc17 = new javax.swing.JTextField();
        rdkh17 = new javax.swing.JTextField();
        rdkl17 = new javax.swing.JTextField();
        dfrc17 = new javax.swing.JTextField();
        dfrd17 = new javax.swing.JTextField();
        rckl17 = new javax.swing.JTextField();
        klass17 = new javax.swing.JTextField();
        z2rc17 = new javax.swing.JTextField();
        z2rd17 = new javax.swing.JTextField();
        z1rd18 = new javax.swing.JTextField();
        rckh18 = new javax.swing.JTextField();
        z1rc18 = new javax.swing.JTextField();
        rdkh18 = new javax.swing.JTextField();
        rdkl18 = new javax.swing.JTextField();
        dfrc18 = new javax.swing.JTextField();
        dfrd18 = new javax.swing.JTextField();
        rckl18 = new javax.swing.JTextField();
        klass18 = new javax.swing.JTextField();
        z2rc18 = new javax.swing.JTextField();
        z2rd18 = new javax.swing.JTextField();
        z1rd19 = new javax.swing.JTextField();
        rckh19 = new javax.swing.JTextField();
        z1rc19 = new javax.swing.JTextField();
        rdkh19 = new javax.swing.JTextField();
        rdkl19 = new javax.swing.JTextField();
        dfrc19 = new javax.swing.JTextField();
        dfrd19 = new javax.swing.JTextField();
        rckl19 = new javax.swing.JTextField();
        klass19 = new javax.swing.JTextField();
        z2rc19 = new javax.swing.JTextField();
        z2rd19 = new javax.swing.JTextField();
        z1rd20 = new javax.swing.JTextField();
        rckh20 = new javax.swing.JTextField();
        z1rc20 = new javax.swing.JTextField();
        rdkh20 = new javax.swing.JTextField();
        rdkl20 = new javax.swing.JTextField();
        dfrc20 = new javax.swing.JTextField();
        dfrd20 = new javax.swing.JTextField();
        rckl20 = new javax.swing.JTextField();
        klass20 = new javax.swing.JTextField();
        z2rc20 = new javax.swing.JTextField();
        z2rd20 = new javax.swing.JTextField();
        z1rd21 = new javax.swing.JTextField();
        rckh21 = new javax.swing.JTextField();
        z1rc21 = new javax.swing.JTextField();
        rdkh21 = new javax.swing.JTextField();
        rdkl21 = new javax.swing.JTextField();
        dfrc21 = new javax.swing.JTextField();
        dfrd21 = new javax.swing.JTextField();
        rckl21 = new javax.swing.JTextField();
        klass21 = new javax.swing.JTextField();
        z2rc21 = new javax.swing.JTextField();
        z2rd21 = new javax.swing.JTextField();
        z1rd22 = new javax.swing.JTextField();
        rckh22 = new javax.swing.JTextField();
        z1rc22 = new javax.swing.JTextField();
        rdkh22 = new javax.swing.JTextField();
        rdkl22 = new javax.swing.JTextField();
        dfrc22 = new javax.swing.JTextField();
        dfrd22 = new javax.swing.JTextField();
        rckl22 = new javax.swing.JTextField();
        klass22 = new javax.swing.JTextField();
        z2rc22 = new javax.swing.JTextField();
        z2rd22 = new javax.swing.JTextField();
        z1rd23 = new javax.swing.JTextField();
        rckh23 = new javax.swing.JTextField();
        z1rc23 = new javax.swing.JTextField();
        rdkh23 = new javax.swing.JTextField();
        rdkl23 = new javax.swing.JTextField();
        dfrc23 = new javax.swing.JTextField();
        dfrd23 = new javax.swing.JTextField();
        rckl23 = new javax.swing.JTextField();
        klass23 = new javax.swing.JTextField();
        z2rc23 = new javax.swing.JTextField();
        z2rd23 = new javax.swing.JTextField();
        z1rd24 = new javax.swing.JTextField();
        rckh24 = new javax.swing.JTextField();
        z1rc24 = new javax.swing.JTextField();
        rdkh24 = new javax.swing.JTextField();
        rdkl24 = new javax.swing.JTextField();
        dfrc24 = new javax.swing.JTextField();
        dfrd24 = new javax.swing.JTextField();
        rckl24 = new javax.swing.JTextField();
        klass24 = new javax.swing.JTextField();
        z2rc24 = new javax.swing.JTextField();
        z2rd24 = new javax.swing.JTextField();
        z1rd25 = new javax.swing.JTextField();
        rckh25 = new javax.swing.JTextField();
        z1rc25 = new javax.swing.JTextField();
        rdkh25 = new javax.swing.JTextField();
        rdkl25 = new javax.swing.JTextField();
        dfrc25 = new javax.swing.JTextField();
        dfrd25 = new javax.swing.JTextField();
        rckl25 = new javax.swing.JTextField();
        klass25 = new javax.swing.JTextField();
        z2rc25 = new javax.swing.JTextField();
        z2rd25 = new javax.swing.JTextField();
        z1rd26 = new javax.swing.JTextField();
        rckh26 = new javax.swing.JTextField();
        z1rc26 = new javax.swing.JTextField();
        rdkh26 = new javax.swing.JTextField();
        rdkl26 = new javax.swing.JTextField();
        dfrc26 = new javax.swing.JTextField();
        dfrd26 = new javax.swing.JTextField();
        rckl26 = new javax.swing.JTextField();
        klass26 = new javax.swing.JTextField();
        z2rc26 = new javax.swing.JTextField();
        z2rd26 = new javax.swing.JTextField();
        z1rd27 = new javax.swing.JTextField();
        rckh27 = new javax.swing.JTextField();
        z1rc27 = new javax.swing.JTextField();
        rdkh27 = new javax.swing.JTextField();
        rdkl27 = new javax.swing.JTextField();
        dfrc27 = new javax.swing.JTextField();
        dfrd27 = new javax.swing.JTextField();
        rckl27 = new javax.swing.JTextField();
        klass27 = new javax.swing.JTextField();
        z2rc27 = new javax.swing.JTextField();
        z2rd27 = new javax.swing.JTextField();
        kab_bandung56 = new javax.swing.JLabel();
        prdkl = new javax.swing.JTextField();
        prdkh = new javax.swing.JTextField();
        prckl = new javax.swing.JTextField();
        prckh = new javax.swing.JTextField();
        pz1rd = new javax.swing.JTextField();
        pz2rd = new javax.swing.JTextField();
        pz1rc = new javax.swing.JTextField();
        pz2rc = new javax.swing.JTextField();
        pdfrd = new javax.swing.JTextField();
        pdfrc = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        panel_dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        kb1.setText("jLabel11");

        kb2.setText("jLabel11");

        kb3.setText("jLabel11");

        kb4.setText("jLabel11");

        kb5.setText("jLabel11");

        kb6.setText("jLabel11");

        kb7.setText("jLabel11");

        kb8.setText("jLabel11");

        kb9.setText("jLabel11");

        kb10.setText("jLabel11");

        kb11.setText("jLabel11");

        kb12.setText("jLabel11");

        kb13.setText("jLabel11");

        kb14.setText("jLabel11");

        kb15.setText("jLabel11");

        kb16.setText("jLabel11");

        kb17.setText("jLabel11");

        kb18.setText("jLabel11");

        kb19.setText("jLabel11");

        kb20.setText("jLabel11");

        kb21.setText("jLabel11");

        kb22.setText("jLabel11");

        kb23.setText("jLabel11");

        kb24.setText("jLabel11");

        kb25.setText("jLabel11");

        tahun_klasifikasi.setText("jTextField1");

        kb26.setText("jLabel11");

        kb27.setText("jLabel11");

        kjabar.setText("jLabel11");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kb27)
                    .addComponent(kb26)
                    .addComponent(kb22)
                    .addComponent(kb21)
                    .addComponent(kb25)
                    .addComponent(kb24)
                    .addComponent(kb19)
                    .addComponent(kb23)
                    .addComponent(kb20)
                    .addComponent(kb17)
                    .addComponent(kb18)
                    .addComponent(kb13)
                    .addComponent(kb14)
                    .addComponent(kb15)
                    .addComponent(kb16)
                    .addComponent(kb11)
                    .addComponent(kb12)
                    .addComponent(kb7)
                    .addComponent(kb8)
                    .addComponent(kb9)
                    .addComponent(kb10)
                    .addComponent(kb6)
                    .addComponent(kb5)
                    .addComponent(kb4)
                    .addComponent(kb3)
                    .addComponent(kb2)
                    .addComponent(kb1))
                .addGap(69, 69, 69)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tahun_klasifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kjabar))
                .addContainerGap(1308, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kb1)
                    .addComponent(tahun_klasifikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kb2)
                    .addComponent(kjabar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kb26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(kb27))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rincian Klasifikasi");

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        titik_a_b_variabel.setBackground(new java.awt.Color(255, 255, 255));
        titik_a_b_variabel.setBorder(new javax.swing.border.LineBorder(java.awt.Color.yellow, 2, true));
        titik_a_b_variabel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Variabel");

        thn1.setText("PDRB ");

        thn2.setText("PDRB");

        jLabel16.setText("RD");

        jLabel17.setText("RC");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Nilai a");

        a_tahun.setEditable(false);
        a_tahun.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        a_tahun.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        a_tahun_n.setEditable(false);
        a_tahun_n.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        a_tahun_n.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        a_rd.setEditable(false);
        a_rd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        a_rd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        a_rc.setEditable(false);
        a_rc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        a_rc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        b_tahun.setEditable(false);
        b_tahun.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        b_tahun.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        b_tahun_n.setEditable(false);
        b_tahun_n.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        b_tahun_n.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        b_rd.setEditable(false);
        b_rd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        b_rd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        b_rc.setEditable(false);
        b_rc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        b_rc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Nilai b");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Kabupaten di Jawa Barat");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Provinsi di Indonesia");

        pa_tahun.setEditable(false);
        pa_tahun.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pa_tahun.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pa_tahun_n.setEditable(false);
        pa_tahun_n.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pa_tahun_n.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pa_rd.setEditable(false);
        pa_rd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pa_rd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pa_rc.setEditable(false);
        pa_rc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pa_rc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pb_rc.setEditable(false);
        pb_rc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pb_rc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pb_rd.setEditable(false);
        pb_rd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pb_rd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pb_tahun_n.setEditable(false);
        pb_tahun_n.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pb_tahun_n.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pb_tahun.setEditable(false);
        pb_tahun.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pb_tahun.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pb_tahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pb_tahunActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setText("Nilai b");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Fuzifikasi - Fungsi Keanggotaan Dengan Representasi Linier");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel33.setText("Nilai a");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihann/Grafik LINIER.png"))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihann/low.PNG"))); // NOI18N
        jLabel22.setText("Nilai a");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihann/high.PNG"))); // NOI18N
        jLabel23.setText("Nilai a");

        javax.swing.GroupLayout titik_a_b_variabelLayout = new javax.swing.GroupLayout(titik_a_b_variabel);
        titik_a_b_variabel.setLayout(titik_a_b_variabelLayout);
        titik_a_b_variabelLayout.setHorizontalGroup(
            titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(thn1)
                                            .addComponent(thn2)
                                            .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel17)
                                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGap(18, 18, 18)
                                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                                .addComponent(a_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(a_rd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(a_rc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(a_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(b_rc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(b_rd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(b_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel14)))
                                .addGap(1, 1, 1))
                            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addGap(33, 33, 33)))
                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel29)
                                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, titik_a_b_variabelLayout.createSequentialGroup()
                                        .addComponent(jLabel33)
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel28)))
                                .addGap(176, 176, 176))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, titik_a_b_variabelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pa_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pa_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pa_rd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pa_rc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pb_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pb_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pb_rd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pb_rc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                        .addComponent(tahun_a_kab2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel21)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        titik_a_b_variabelLayout.setVerticalGroup(
            titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tahun_a_kab2)
                    .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addGroup(titik_a_b_variabelLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel28)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(thn1)
                    .addComponent(a_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(a_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn2)
                    .addComponent(pa_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_tahun_n, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(a_rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pb_rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa_rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(titik_a_b_variabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(pb_rc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pa_rc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(a_rc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_rc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));

        jLabel97.setText("RI");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel100.setText("RCLow");

        jLabel98.setText("RII");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel99.setText("RDLow");

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel106.setText("RCHigh");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel102.setText("RCLow");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel104.setText("RCHigh");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel101.setText("RDLow");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel103.setText("RDLow");

        RD.setText("Tahun ");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel105.setText("RDLow");

        jLabel107.setText("RIII");

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel89.setText("Low");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel90.setText("High");

        RD1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RD1.setText("Kota/ Kabupaten");

        jLabel108.setText("RIV");

        RD2.setText("Tahun(n-1) ");

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel91.setText("Low");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel92.setText("High");

        RD3.setText("RD");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel93.setText("Low");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel94.setText("High");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel110.setText("Low");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel111.setText("High");

        RD4.setText("RC");

        RD5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RD5.setText("Nilai Derajat Keanggotaan");

        RD6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RD6.setText("Nilai Evalasi Rule");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        derajat_evaluasi.setBackground(new java.awt.Color(255, 255, 255));
        derajat_evaluasi.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue));

        thn_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        kab_bandung1.setText("1.   Kab. Bandung");

        thn_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        kab_bandung6.setText("3.   Kab. Bekasi");

        kab_bandung7.setText("4.   Kab. Bogor");

        kab_bandung8.setText("5.   Kab. Ciamis");

        kab_bandung9.setText("6.   Kab. Cianjur");

        kab_bandung10.setText("7.   Kab. Cirebon");

        kab_bandung11.setText("8.   Kab. Garut");

        kab_bandung12.setText("9.   Kab. Indramayu");

        kab_bandung13.setText("10.   Kab. Karawang");

        kab_bandung14.setText("11.   Kab. Kuningan");

        kab_bandung15.setText("12.   Kab. Majalengka");

        kab_bandung17.setText("14.   Kab. Purwakarta");

        kab_bandung18.setText("15.   Kab. Subang");

        kab_bandung19.setText("16.   Kab. Sukabuumi");

        kab_bandung20.setText("17.   Kab. Sumedang");

        kab_bandung21.setText("18.   Kab. Tasik");

        kab_bandung22.setText("19.   Kota Bandung");

        kab_bandung23.setText("20.   Kota Banjar");

        kab_bandung24.setText("21.   Kota Bekasi");

        kab_bandung25.setText("22.   Kota Bogor");

        kab_bandung26.setText("23.   Kota Cimahi");

        kab_bandung27.setText("24.   Kota Cirebon");

        kab_bandung28.setText("25.   Kota Depok");

        kab_bandung29.setText("26.   Kota Sukabuumi");

        kab_bandung30.setText("27.   Kota Tasik");

        kab_bandung4.setText("2.   Kab. Bandung Barat");

        thn_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        kab_bandung16.setText("13.   Kab. Pangandaran");

        thn_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        thn_n_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        thn_n_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rd_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rd_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rc_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rc_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde1_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde1_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce1_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce1_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde2_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde2_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce2_l27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce2_l27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde3_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde3_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce3_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce3_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rde4_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rde4_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rce4_h27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rce4_h27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rc_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rc_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_thn_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_thn_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rce1_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rce1_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rce3_h.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rce3_h.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rd_h.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rd_h.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rce2_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rce2_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_thn_high1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_thn_high1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rde4_h.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rde4_h.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_thn_high.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_thn_high.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rde1_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rde1_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_thn_low1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_thn_low1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rc_h.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rc_h.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rd_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rd_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rde2_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rde2_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rce4_h.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rce4_h.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        p_rde3_l.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        p_rde3_l.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        kab_bandung2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kab_bandung2.setText("Provinsi Jawa Barat");

        javax.swing.GroupLayout derajat_evaluasiLayout = new javax.swing.GroupLayout(derajat_evaluasi);
        derajat_evaluasi.setLayout(derajat_evaluasiLayout);
        derajat_evaluasiLayout.setHorizontalGroup(
            derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(kab_bandung28))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kab_bandung2)
                            .addComponent(kab_bandung1)))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung4))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung6))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung7))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung8))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung9))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung10))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung11))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung12))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung13))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung14))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung15))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung16))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung17))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung18))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung19))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung20))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung21))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung22))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung23))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung25))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung24))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(kab_bandung27))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung26))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung29))
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(kab_bandung30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_thn_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_thn_high, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_thn_low1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_thn_high1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rd_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rd_h, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rc_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rc_h, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rde1_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rce1_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rde2_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rde2_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rce2_l16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rce2_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rde3_l, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rce3_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rce3_h, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rde4_h, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(p_rce4_h, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        derajat_evaluasiLayout.setVerticalGroup(
            derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(kab_bandung2))
                    .addComponent(p_thn_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_thn_high, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_thn_low1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_thn_high1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rd_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rd_h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rc_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rc_h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rde1_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rce1_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rde2_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rce2_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rde3_l, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rce3_h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rde4_h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_rce4_h, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(kab_bandung1))
                    .addComponent(thn_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thn_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung4))
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_n_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(thn_n_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rd_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rd_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rc_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rce2_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rde2_l2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rde3_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung6))
                    .addComponent(thn_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rce1_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rde1_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(rde2_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung7))
                    .addComponent(thn_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung8))
                    .addComponent(thn_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung9))
                    .addComponent(thn_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung10))
                    .addComponent(thn_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung11))
                    .addComponent(thn_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung12))
                    .addComponent(thn_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung13))
                    .addComponent(thn_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung14))
                    .addComponent(thn_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung15))
                    .addComponent(thn_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung16))
                    .addComponent(thn_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung17))
                    .addComponent(thn_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung18))
                    .addComponent(thn_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung19))
                    .addComponent(thn_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung20))
                    .addComponent(thn_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung21))
                    .addComponent(thn_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung22))
                    .addComponent(thn_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung23))
                    .addComponent(thn_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung24))
                    .addComponent(thn_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung25))
                    .addComponent(thn_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(thn_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thn_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thn_n_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thn_n_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rd_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rc_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rde1_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rce1_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rde2_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rce2_l23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rde3_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rce3_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rde4_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rce4_h23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, derajat_evaluasiLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kab_bandung26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(kab_bandung27))
                    .addComponent(thn_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(kab_bandung28))
                    .addComponent(thn_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(thn_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung29))
                    .addComponent(thn_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(derajat_evaluasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(thn_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(thn_n_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rd_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rc_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde1_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce1_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde2_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce2_l27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde3_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce3_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rde4_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rce4_h27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kab_bandung30)))
        );

        jScrollPane1.setViewportView(derajat_evaluasi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(RD1)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel91)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel90)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel89)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel92))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(RD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RD2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(RD3)
                                .addGap(66, 66, 66)
                                .addComponent(RD4)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel97))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel93)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel94)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel110)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel111)
                                .addGap(28, 28, 28)
                                .addComponent(jLabel99)
                                .addGap(8, 8, 8))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(RD5)
                        .addGap(143, 143, 143)))
                .addComponent(jLabel100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel101)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel102)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel104)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel106)
                        .addContainerGap(66, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel98)
                                .addGap(61, 61, 61)
                                .addComponent(jLabel107))
                            .addComponent(RD6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel108)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RD6)
                    .addComponent(RD5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(RD)
                    .addComponent(RD2)
                    .addComponent(RD3)
                    .addComponent(RD4)
                    .addComponent(jLabel97)
                    .addComponent(jLabel98)
                    .addComponent(jLabel107)
                    .addComponent(jLabel108))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel91)
                    .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel89)
                    .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel110)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel100)
                    .addComponent(jLabel101)
                    .addComponent(jLabel102)
                    .addComponent(jLabel103)
                    .addComponent(jLabel104)
                    .addComponent(jLabel105)
                    .addComponent(jLabel106)
                    .addComponent(RD1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Evaluasi Rule\n\n[R1]. IF Tahun(n) = Low AND Tahun (n-1) = Low THEN RDe[1] = Low ALSO RCe[1]= Low\n\n[R2]. IF Tahun (n) = Low AND Tahun (n-1) = High THEN RD[2] = Low ALSO RCf[2]= Low\n\n[R3]. IF Tahun (n) = High AND Tahun (n-1) = Low THEN RD[3] = Low ALSO RCf[3]= High\n\n[R4]. IF Tahun (n) = High AND Tahun (n-1) = High THEN RDf[4] = High AND RCf[4]=High");
        jScrollPane3.setViewportView(jTextArea1);

        javax.swing.GroupLayout fuzzyfikasiLayout = new javax.swing.GroupLayout(fuzzyfikasi);
        fuzzyfikasi.setLayout(fuzzyfikasiLayout);
        fuzzyfikasiLayout.setHorizontalGroup(
            fuzzyfikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fuzzyfikasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fuzzyfikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titik_a_b_variabel, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fuzzyfikasiLayout.setVerticalGroup(
            fuzzyfikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fuzzyfikasiLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fuzzyfikasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(fuzzyfikasiLayout.createSequentialGroup()
                        .addComponent(titik_a_b_variabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tahap Fuzzyfikasi & Evaluasi Rule Kabupaten", fuzzyfikasi);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(java.awt.Color.blue, 2, true));

        jLabel115.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel115.setText("RD");

        jLabel88.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel88.setText("RDHigh");

        jLabel109.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel109.setText("z1RD");

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel116.setText("RC");

        jLabel117.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel117.setText("Klasifikasi");

        jLabel114.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel114.setText("z2RC");

        jLabel112.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel112.setText("z2Rd");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        rdkl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rc1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass1.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        kab_bandung3.setText("1.   Kab. Bandung");

        kab_bandung31.setText("3.   Kab. Bekasi");

        kab_bandung32.setText("4.   Kab. Bogor");

        kab_bandung33.setText("5.   Kab. Ciamis");

        kab_bandung34.setText("6.   Kab. Cianjur");

        kab_bandung35.setText("7.   Kab. Cirebon");

        kab_bandung36.setText("8.   Kab. Garut");

        kab_bandung37.setText("9.   Kab. Indramayu");

        kab_bandung38.setText("10.   Kab. Karawang");

        kab_bandung39.setText("11.   Kab. Kuningan");

        kab_bandung40.setText("12.   Kab. Majalengka");

        kab_bandung41.setText("14.   Kab. Purwakarta");

        kab_bandung42.setText("15.   Kab. Subang");

        kab_bandung43.setText("16.   Kab. Sukabuumi");

        kab_bandung44.setText("17.   Kab. Sumedang");

        kab_bandung45.setText("18.   Kab. Tasik");

        kab_bandung46.setText("19.   Kota Bandung");

        kab_bandung47.setText("20.   Kota Banjar");

        kab_bandung48.setText("21.   Kota Bekasi");

        kab_bandung49.setText("22.   Kota Bogor");

        kab_bandung50.setText("23.   Kota Cimahi");

        kab_bandung51.setText("24.   Kota Cirebon");

        kab_bandung52.setText("25.   Kota Depok");

        kab_bandung53.setText("26.   Kota Sukabuumi");

        kab_bandung54.setText("27.   Kota Tasik");

        kab_bandung5.setText("2.   Kab. Bandung Barat");

        kab_bandung55.setText("13.   Kab. Pangandaran");

        rdkl2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rc2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass2.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rdkl3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rc3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc3.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass3.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        rdkl4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rc4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc4.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass4.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z1rd5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rc5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass5.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        dfrd5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass7.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd7.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass8.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd8.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass9.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass10.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd10.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass11.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd11.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass12.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd12.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass13.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd13.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass14.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd14.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass15.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd15.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd15.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass16.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd16.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd16.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass17.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd17.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd17.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass18.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd18.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd18.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass19.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd19.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd19.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass20.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd20.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd20.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass21.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd21.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd21.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass22.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd22.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd22.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass23.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd23.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd23.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass24.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd24.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd24.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass25.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd25.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd25.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass26.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass26.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd26.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd26.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rd27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rd27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckh27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckh27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z1rc27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z1rc27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkh27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkh27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rdkl27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rdkl27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrc27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrc27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        dfrd27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        dfrd27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        rckl27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        rckl27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        klass27.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        klass27.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        z2rc27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rc27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        z2rd27.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        z2rd27.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        kab_bandung56.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kab_bandung56.setText("Provinsi Jawa Barat");

        prdkl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        prdkl.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        prdkh.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        prdkh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        prckl.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        prckl.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        prckh.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        prckh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pz1rd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pz1rd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pz2rd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pz2rd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pz1rc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pz1rc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pz2rc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pz2rc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pdfrd.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pdfrd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        pdfrc.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        pdfrc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout Komposisi_RULELayout = new javax.swing.GroupLayout(Komposisi_RULE);
        Komposisi_RULE.setLayout(Komposisi_RULELayout);
        Komposisi_RULELayout.setHorizontalGroup(
            Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Komposisi_RULELayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kab_bandung40)
                    .addComponent(kab_bandung39)
                    .addComponent(kab_bandung38)
                    .addComponent(kab_bandung37)
                    .addComponent(kab_bandung36)
                    .addComponent(kab_bandung33)
                    .addComponent(kab_bandung34)
                    .addComponent(kab_bandung35)
                    .addComponent(kab_bandung41)
                    .addComponent(kab_bandung42)
                    .addComponent(kab_bandung54)
                    .addComponent(kab_bandung53)
                    .addComponent(kab_bandung52)
                    .addComponent(kab_bandung51)
                    .addComponent(kab_bandung50)
                    .addComponent(kab_bandung49)
                    .addComponent(kab_bandung48)
                    .addComponent(kab_bandung47)
                    .addComponent(kab_bandung46)
                    .addComponent(kab_bandung45)
                    .addComponent(kab_bandung44)
                    .addComponent(kab_bandung43)
                    .addComponent(kab_bandung55)
                    .addComponent(kab_bandung32)
                    .addComponent(kab_bandung31)
                    .addComponent(kab_bandung5)
                    .addComponent(kab_bandung3)
                    .addComponent(kab_bandung56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdkl9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdkl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkl27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdkh18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prdkh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rckl18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prckl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rckh19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prckh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z1rd19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz1rd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z2rd18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz2rd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z1rc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz1rc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(z2rc1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc20, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc21, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc22, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc23, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc24, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz2rc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc25, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc26, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc27, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dfrd1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd20, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd21, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd22, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd24, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(pdfrd, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd15, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd17, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd25, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd26, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(dfrd27))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dfrc1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdfrc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(klass1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass18, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass20, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass10, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass14, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass15, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass16, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass17, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass21, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass22, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass23, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass24, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass25, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass26, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass27, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        Komposisi_RULELayout.setVerticalGroup(
            Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Komposisi_RULELayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(prdkl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung56))
                    .addComponent(prdkh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prckl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prckh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz1rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz2rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz1rc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pz2rc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdfrd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pdfrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kab_bandung3)
                        .addComponent(rdkl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dfrd1)
                        .addComponent(dfrc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_bandung5)
                    .addComponent(rdkl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(kab_bandung31))
                    .addComponent(rdkh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rdkl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdkh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckl4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rckh4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z1rc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z2rc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dfrc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(klass4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kab_bandung32))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung33))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung34))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung35))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung36))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung37))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung38))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung39))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung40))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung55))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung41))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung42))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung43))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung44))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung45))
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(rdkl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rdkh19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rckl19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rckh19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(z1rd19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(z2rd19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(z1rc19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(z2rc19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dfrd19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dfrc19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(kab_bandung46)))
                    .addGroup(Komposisi_RULELayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(klass19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung47))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung48))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung49))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung50))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung51))
                .addGap(5, 5, 5)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung52))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung53))
                .addGap(3, 3, 3)
                .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Komposisi_RULELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdkl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdkh27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckl27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rckh27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rd27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rd27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z1rc27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(z2rc27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrd27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dfrc27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(klass27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(kab_bandung54))
                .addContainerGap())
        );

        Komposisi_RULELayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {dfrc1, klass1});

        jScrollPane2.setViewportView(Komposisi_RULE);

        jLabel95.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel95.setText("RCLow");

        jLabel87.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel87.setText("RDLow");

        jLabel96.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel96.setText("RChigh");

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel113.setText("z1RC");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Komposisi Rule");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Titik z*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Defuzzyfikasi");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Klassen");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Kabupaten");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel10)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel87)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel88)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel95)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel96)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel109)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel112)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel113)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel114))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(104, 104, 104)
                                .addComponent(jLabel3)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel115)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel116))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel117)
                                .addGap(55, 55, 55))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel8)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel87)
                    .addComponent(jLabel88)
                    .addComponent(jLabel95)
                    .addComponent(jLabel96)
                    .addComponent(jLabel109)
                    .addComponent(jLabel112)
                    .addComponent(jLabel113)
                    .addComponent(jLabel114)
                    .addComponent(jLabel115)
                    .addComponent(jLabel116)
                    .addComponent(jLabel117)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(java.awt.Color.green, 2, true));

        jTextArea4.setEditable(false);
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("\t\t            Keterangan\n\n         ri = defuzzyfikasi RD (kabupaten)\tyi = Defuzzifikasi  RC Kabupaten \n         r = defuzzyfikasi RD (Jabar)\ty =  Defuzzyfikasi RC Jabar");
        jScrollPane7.setViewportView(jTextArea4);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/latihann/Klassen.PNG"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipologi Klassen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 542, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(215, 215, 215))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(java.awt.Color.yellow, 2, true));

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("                        \t                                               Defuzzyfikasi\n\n                 RD = ( (RD[k]Low * z1rd)+(RD[k]High*z1rd) ) / (RD[k]Low + RD[k]High)\n                  RC = ( (RC[k]Low * z1rd)+(RC[k]High*z1rd) ) / (RC[k]Low + RC[k]High)");
        jScrollPane8.setViewportView(jTextArea5);

        jTextArea3.setEditable(false);
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("\t                                                Komposisi RULE\n\t        RD\t\t\tRC\n         RD[k] Low = MAX ( Rde[1], Rde[1], Rde[1] )             RC[k]  Low = MAX ( Rce[1], Rce[2] )\n         RD[k] High = MAX ( Rde[4] )                                          RC[k]  High = MAX ( Rce[3], Rce[4] )");
        jScrollPane6.setViewportView(jTextArea3);

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("                                                                                   Titik Z*\n \t                       RD\t\t                                RC\n           \tz1rd =- ( (c*RD[k]Low) - b )      \t          z1rc =- ( (c*RC[k]Low) - b )\n           \tz2rd = ( b*RD[k]High) + a )                 z2rd = ( b*RC[k]High) + a )");
        jScrollPane5.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout komposisi_ruleLayout = new javax.swing.GroupLayout(komposisi_rule);
        komposisi_rule.setLayout(komposisi_ruleLayout);
        komposisi_ruleLayout.setHorizontalGroup(
            komposisi_ruleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(komposisi_ruleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(komposisi_ruleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(komposisi_ruleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(218, 218, 218))
        );
        komposisi_ruleLayout.setVerticalGroup(
            komposisi_ruleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, komposisi_ruleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(komposisi_ruleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(komposisi_ruleLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Tahap Komposisi, Defuzzyfikasi dan Klassen", komposisi_rule);

        getContentPane().add(jTabbedPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Proses Klasifikasi Pembangunan Kabupaten Dengan  Metode Fuzzy-Klassen ");

        javax.swing.GroupLayout panel_dashboardLayout = new javax.swing.GroupLayout(panel_dashboard);
        panel_dashboard.setLayout(panel_dashboardLayout);
        panel_dashboardLayout.setHorizontalGroup(
            panel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dashboardLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        panel_dashboardLayout.setVerticalGroup(
            panel_dashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_dashboardLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        getContentPane().add(panel_dashboard, java.awt.BorderLayout.PAGE_START);

        jMenu1.setText("File");

        jMenuItem1.setText("Tambah Data PDRB");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setText("Lihat Data PDRB");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem4.setText("Halaman Utama");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Data Klasifikasi");

        jMenuItem2.setText("Simpan Data");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setText("Lihat Data Klasifikasi");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

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
   
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        new MenuUtama().show(); 
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void pb_tahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pb_tahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pb_tahunActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
simpan();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        new Halaman_Home().show();    
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
      new Klasifikasi().show();
      this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      new Kelola_PDRB().show();
      this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void openDB(){
     try{
         Koneksi kon = new Koneksi();
         sambung = kon.getConnection();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak Terkoneksi Database");
        }
    }
    
    
    
    public void rule_kab(){
    double kl1,kl2,kl3,kl4,kl5,kl6,kl7,kl8,kl9,kl10,kl11,kl12,kl13,kl14,kl15,kl16,kl17,kl18,kl19,kl20,kl21,kl22,kl23,kl24,kl25,kl26,kl27;
    double kh1,kh2,kh3,kh4,kh5,kh6,kh7,kh8,kh9,kh10,kh11,kh12,kh13,kh14,kh15,kh16,kh17,kh18,kh19,kh20,kh21,kh22,kh23,kh24,kh25,kh26,kh27;	
    double knl1,knl2,knl3,knl4,knl5,knl6,knl7,knl8,knl9,knl10,knl11,knl12,knl13,knl14,knl15,knl16,knl17,knl18,knl19,knl20,knl21,knl22,knl23,knl24,knl25,knl26,knl27;
    double knh1,knh2,knh3,knh4,knh5,knh6,knh7,knh8,knh9,knh10,knh11,knh12,knh13,knh14,knh15,knh16,knh17,knh18,knh19,knh20,knh21,knh22,knh23,knh24,knh25,knh26,knh27;	
    double rdl1,rdl2,rdl3,rdl4,rdl5,rdl6,rdl7,rdl8,rdl9,rdl10,rdl11,rdl12,rdl13,rdl14,rdl15,rdl16,rdl17,rdl18,rdl19,rdl20,rdl21,rdl22,rdl23,rdl24,rdl25,rdl26,rdl27;	
    double rdh1,rdh2,rdh3,rdh4,rdh5,rdh6,rdh7,rdh8,rdh9,rdh10,rdh11,rdh12,rdh13,rdh14,rdh15,rdh16,rdh17,rdh18,rdh19,rdh20,rdh21,rdh22,rdh23,rdh24,rdh25,rdh26,rdh27;	
    double rcl1,rcl2,rcl3,rcl4,rcl5,rcl6,rcl7,rcl8,rcl9,rcl10,rcl11,rcl12,rcl13,rcl14,rcl15,rcl16,rcl17,rcl18,rcl19,rcl20,rcl21,rcl22,rcl23,rcl24,rcl25,rcl26,rcl27;	
    double rch1,rch2,rch3,rch4,rch5,rch6,rch7,rch8,rch9,rch10,rch11,rch12,rch13,rch14,rch15,rch16,rch17,rch18,rch19,rch20,rch21,rch22,rch23,rch24,rch25,rch26,rch27;	
       
    kl1=(Double.parseDouble(thn_l1.getText()));  kh1=(Double.parseDouble(thn_h1.getText()));  knl1=(Double.parseDouble(thn_n_l1.getText()));	knh1=(Double.parseDouble(thn_n_h1.getText()));	rdl1=(Double.parseDouble(rd_l1.getText()));	rdh1=(Double.parseDouble(rd_h1.getText()));  rcl1=(Double.parseDouble(rc_l1.getText()));  rch1=(Double.parseDouble(rc_h1.getText()));
    kl2=(Double.parseDouble(thn_l2.getText()));  kh2=(Double.parseDouble(thn_h2.getText()));  knl2=(Double.parseDouble(thn_n_l2.getText()));	knh2=(Double.parseDouble(thn_n_h2.getText()));	rdl2=(Double.parseDouble(rd_l2.getText()));	rdh2=(Double.parseDouble(rd_h2.getText()));  rcl2=(Double.parseDouble(rc_l2.getText()));  rch2=(Double.parseDouble(rc_h2.getText()));
    kl3=(Double.parseDouble(thn_l3.getText()));  kh3=(Double.parseDouble(thn_h3.getText()));  knl3=(Double.parseDouble(thn_n_l3.getText()));	knh3=(Double.parseDouble(thn_n_h3.getText()));	rdl3=(Double.parseDouble(rd_l3.getText()));	rdh3=(Double.parseDouble(rd_h3.getText()));  rcl3=(Double.parseDouble(rc_l3.getText()));  rch3=(Double.parseDouble(rc_h3.getText()));
    kl4=(Double.parseDouble(thn_l4.getText()));  kh4=(Double.parseDouble(thn_h4.getText()));  knl4=(Double.parseDouble(thn_n_l4.getText()));	knh4=(Double.parseDouble(thn_n_h4.getText()));	rdl4=(Double.parseDouble(rd_l4.getText()));	rdh4=(Double.parseDouble(rd_h4.getText()));  rcl4=(Double.parseDouble(rc_l4.getText()));  rch4=(Double.parseDouble(rc_h4.getText()));
    kl5=(Double.parseDouble(thn_l5.getText()));  kh5=(Double.parseDouble(thn_h5.getText()));  knl5=(Double.parseDouble(thn_n_l5.getText()));	knh5=(Double.parseDouble(thn_n_h5.getText()));	rdl5=(Double.parseDouble(rd_l5.getText()));	rdh5=(Double.parseDouble(rd_h5.getText()));  rcl5=(Double.parseDouble(rc_l5.getText()));  rch5=(Double.parseDouble(rc_h5.getText()));
    kl6=(Double.parseDouble(thn_l6.getText()));  kh6=(Double.parseDouble(thn_h6.getText()));  knl6=(Double.parseDouble(thn_n_l6.getText()));	knh6=(Double.parseDouble(thn_n_h6.getText()));	rdl6=(Double.parseDouble(rd_l6.getText()));	rdh6=(Double.parseDouble(rd_h6.getText()));  rcl6=(Double.parseDouble(rc_l6.getText()));  rch6=(Double.parseDouble(rc_h6.getText()));
    kl7=(Double.parseDouble(thn_l7.getText()));  kh7=(Double.parseDouble(thn_h7.getText()));  knl7=(Double.parseDouble(thn_n_l7.getText()));	knh7=(Double.parseDouble(thn_n_h7.getText()));	rdl7=(Double.parseDouble(rd_l7.getText()));	rdh7=(Double.parseDouble(rd_h7.getText()));  rcl7=(Double.parseDouble(rc_l7.getText()));  rch7=(Double.parseDouble(rc_h7.getText()));
    kl8=(Double.parseDouble(thn_l8.getText()));  kh8=(Double.parseDouble(thn_h8.getText()));  knl8=(Double.parseDouble(thn_n_l8.getText()));	knh8=(Double.parseDouble(thn_n_h8.getText()));	rdl8=(Double.parseDouble(rd_l8.getText()));	rdh8=(Double.parseDouble(rd_h8.getText()));  rcl8=(Double.parseDouble(rc_l8.getText()));  rch8=(Double.parseDouble(rc_h8.getText()));
    kl9=(Double.parseDouble(thn_l9.getText()));  kh9=(Double.parseDouble(thn_h9.getText()));  knl9=(Double.parseDouble(thn_n_l9.getText()));	knh9=(Double.parseDouble(thn_n_h9.getText()));	rdl9=(Double.parseDouble(rd_l9.getText()));	rdh9=(Double.parseDouble(rd_h9.getText()));  rcl9=(Double.parseDouble(rc_l9.getText()));  rch9=(Double.parseDouble(rc_h9.getText()));
    kl10=(Double.parseDouble(thn_l10.getText()));  kh10=(Double.parseDouble(thn_h10.getText()));  knl10=(Double.parseDouble(thn_n_l10.getText()));	knh10=(Double.parseDouble(thn_n_h10.getText()));	rdl10=(Double.parseDouble(rd_l10.getText()));	rdh10=(Double.parseDouble(rd_h10.getText()));  rcl10=(Double.parseDouble(rc_l10.getText()));  rch10=(Double.parseDouble(rc_h10.getText()));
    kl11=(Double.parseDouble(thn_l11.getText()));  kh11=(Double.parseDouble(thn_h11.getText()));  knl11=(Double.parseDouble(thn_n_l11.getText()));	knh11=(Double.parseDouble(thn_n_h11.getText()));	rdl11=(Double.parseDouble(rd_l11.getText()));	rdh11=(Double.parseDouble(rd_h11.getText()));  rcl11=(Double.parseDouble(rc_l11.getText()));  rch11=(Double.parseDouble(rc_h11.getText()));
    kl12=(Double.parseDouble(thn_l12.getText()));  kh12=(Double.parseDouble(thn_h12.getText()));  knl12=(Double.parseDouble(thn_n_l12.getText()));	knh12=(Double.parseDouble(thn_n_h12.getText()));	rdl12=(Double.parseDouble(rd_l12.getText()));	rdh12=(Double.parseDouble(rd_h12.getText()));  rcl12=(Double.parseDouble(rc_l12.getText()));  rch12=(Double.parseDouble(rc_h12.getText()));
    kl13=(Double.parseDouble(thn_l13.getText()));  kh13=(Double.parseDouble(thn_h13.getText()));  knl13=(Double.parseDouble(thn_n_l13.getText()));	knh13=(Double.parseDouble(thn_n_h13.getText()));	rdl13=(Double.parseDouble(rd_l13.getText()));	rdh13=(Double.parseDouble(rd_h13.getText()));  rcl13=(Double.parseDouble(rc_l13.getText()));  rch13=(Double.parseDouble(rc_h13.getText()));
    kl14=(Double.parseDouble(thn_l14.getText()));  kh14=(Double.parseDouble(thn_h14.getText()));  knl14=(Double.parseDouble(thn_n_l14.getText()));	knh14=(Double.parseDouble(thn_n_h14.getText()));	rdl14=(Double.parseDouble(rd_l14.getText()));	rdh14=(Double.parseDouble(rd_h14.getText()));  rcl14=(Double.parseDouble(rc_l14.getText()));  rch14=(Double.parseDouble(rc_h14.getText()));
    kl15=(Double.parseDouble(thn_l15.getText()));  kh15=(Double.parseDouble(thn_h15.getText()));  knl15=(Double.parseDouble(thn_n_l15.getText()));	knh15=(Double.parseDouble(thn_n_h15.getText()));	rdl15=(Double.parseDouble(rd_l15.getText()));	rdh15=(Double.parseDouble(rd_h15.getText()));  rcl15=(Double.parseDouble(rc_l15.getText()));  rch15=(Double.parseDouble(rc_h15.getText()));
    kl16=(Double.parseDouble(thn_l16.getText()));  kh16=(Double.parseDouble(thn_h16.getText()));  knl16=(Double.parseDouble(thn_n_l16.getText()));	knh16=(Double.parseDouble(thn_n_h16.getText()));	rdl16=(Double.parseDouble(rd_l16.getText()));	rdh16=(Double.parseDouble(rd_h16.getText()));  rcl16=(Double.parseDouble(rc_l16.getText()));  rch16=(Double.parseDouble(rc_h16.getText()));
    kl17=(Double.parseDouble(thn_l17.getText()));  kh17=(Double.parseDouble(thn_h17.getText()));  knl17=(Double.parseDouble(thn_n_l17.getText()));	knh17=(Double.parseDouble(thn_n_h17.getText()));	rdl17=(Double.parseDouble(rd_l17.getText()));	rdh17=(Double.parseDouble(rd_h17.getText()));  rcl17=(Double.parseDouble(rc_l17.getText()));  rch17=(Double.parseDouble(rc_h17.getText()));
    kl18=(Double.parseDouble(thn_l18.getText()));  kh18=(Double.parseDouble(thn_h18.getText()));  knl18=(Double.parseDouble(thn_n_l18.getText()));	knh18=(Double.parseDouble(thn_n_h18.getText()));	rdl18=(Double.parseDouble(rd_l18.getText()));	rdh18=(Double.parseDouble(rd_h18.getText()));  rcl18=(Double.parseDouble(rc_l18.getText()));  rch18=(Double.parseDouble(rc_h18.getText()));
    kl19=(Double.parseDouble(thn_l19.getText()));  kh19=(Double.parseDouble(thn_h19.getText()));  knl19=(Double.parseDouble(thn_n_l19.getText()));	knh19=(Double.parseDouble(thn_n_h19.getText()));	rdl19=(Double.parseDouble(rd_l19.getText()));	rdh19=(Double.parseDouble(rd_h19.getText()));  rcl19=(Double.parseDouble(rc_l19.getText()));  rch19=(Double.parseDouble(rc_h19.getText()));
    kl20=(Double.parseDouble(thn_l20.getText()));  kh20=(Double.parseDouble(thn_h20.getText()));  knl20=(Double.parseDouble(thn_n_l20.getText()));	knh20=(Double.parseDouble(thn_n_h20.getText()));	rdl20=(Double.parseDouble(rd_l20.getText()));	rdh20=(Double.parseDouble(rd_h20.getText()));  rcl20=(Double.parseDouble(rc_l20.getText()));  rch20=(Double.parseDouble(rc_h20.getText()));
    kl21=(Double.parseDouble(thn_l21.getText()));  kh21=(Double.parseDouble(thn_h21.getText()));  knl21=(Double.parseDouble(thn_n_l21.getText()));	knh21=(Double.parseDouble(thn_n_h21.getText()));	rdl21=(Double.parseDouble(rd_l21.getText()));	rdh21=(Double.parseDouble(rd_h21.getText()));  rcl21=(Double.parseDouble(rc_l21.getText()));  rch21=(Double.parseDouble(rc_h21.getText()));
    kl22=(Double.parseDouble(thn_l22.getText()));  kh22=(Double.parseDouble(thn_h22.getText()));  knl22=(Double.parseDouble(thn_n_l22.getText()));	knh22=(Double.parseDouble(thn_n_h22.getText()));	rdl22=(Double.parseDouble(rd_l22.getText()));	rdh22=(Double.parseDouble(rd_h22.getText()));  rcl22=(Double.parseDouble(rc_l22.getText()));  rch22=(Double.parseDouble(rc_h22.getText()));
    kl23=(Double.parseDouble(thn_l23.getText()));  kh23=(Double.parseDouble(thn_h23.getText()));  knl23=(Double.parseDouble(thn_n_l23.getText()));	knh23=(Double.parseDouble(thn_n_h23.getText()));	rdl23=(Double.parseDouble(rd_l23.getText()));	rdh23=(Double.parseDouble(rd_h23.getText()));  rcl23=(Double.parseDouble(rc_l23.getText()));  rch23=(Double.parseDouble(rc_h23.getText()));
    kl24=(Double.parseDouble(thn_l24.getText()));  kh24=(Double.parseDouble(thn_h24.getText()));  knl24=(Double.parseDouble(thn_n_l24.getText()));	knh24=(Double.parseDouble(thn_n_h24.getText()));	rdl24=(Double.parseDouble(rd_l24.getText()));	rdh24=(Double.parseDouble(rd_h24.getText()));  rcl24=(Double.parseDouble(rc_l24.getText()));  rch24=(Double.parseDouble(rc_h24.getText()));
    kl25=(Double.parseDouble(thn_l25.getText()));  kh25=(Double.parseDouble(thn_h25.getText()));  knl25=(Double.parseDouble(thn_n_l25.getText()));	knh25=(Double.parseDouble(thn_n_h25.getText()));	rdl25=(Double.parseDouble(rd_l25.getText()));	rdh25=(Double.parseDouble(rd_h25.getText()));  rcl25=(Double.parseDouble(rc_l25.getText()));  rch25=(Double.parseDouble(rc_h25.getText()));
    kl26=(Double.parseDouble(thn_l26.getText()));  kh26=(Double.parseDouble(thn_h26.getText()));  knl26=(Double.parseDouble(thn_n_l26.getText()));	knh26=(Double.parseDouble(thn_n_h26.getText()));	rdl26=(Double.parseDouble(rd_l26.getText()));	rdh26=(Double.parseDouble(rd_h26.getText()));  rcl26=(Double.parseDouble(rc_l26.getText()));  rch26=(Double.parseDouble(rc_h26.getText()));
    kl27=(Double.parseDouble(thn_l27.getText()));  kh27=(Double.parseDouble(thn_h27.getText()));  knl27=(Double.parseDouble(thn_n_l27.getText()));	knh27=(Double.parseDouble(thn_n_h27.getText()));	rdl27=(Double.parseDouble(rd_l27.getText()));	rdh27=(Double.parseDouble(rd_h27.getText()));  rcl27=(Double.parseDouble(rc_l27.getText()));  rch27=(Double.parseDouble(rc_h27.getText()));
    double min;
    
    //RULE1
    double r1d1,r1d2,r1d3,r1d4,r1d5,r1d6,r1d7,r1d8,r1d9,r1d10,r1d11,r1d12,r1d13,r1d14,r1d15,r1d16,r1d17,r1d18,r1d19,r1d20,r1d21,r1d22,r1d23,r1d24,r1d25,r1d26,r1d27;
    double r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9,r1c10,r1c11,r1c12,r1c13,r1c14,r1c15,r1c16,r1c17,r1c18,r1c19,r1c20,r1c21,r1c22,r1c23,r1c24,r1c25,r1c26,r1c27;
    double r1x1,r1x2,r1x3,r1x4,r1x5,r1x6,r1x7,r1x8,r1x9,r1x10,r1x11,r1x12,r1x13,r1x14,r1x15,r1x16,r1x17,r1x18,r1x19,r1x20,r1x21,r1x22,r1x23,r1x24,r1x25,r1x26,r1x27;
    //RD RC>>>>>                                                                                                                                          //RC
    r1x1=(kl1*knl1);    if(r1x1<rdl1){min=r1x1;}else{min=rdl1;} if(min>1-r1x1){r1d1=min;}else{r1d1=1-r1x1;} rde1_l1.setText(""+String.format("%.2f",r1d1));	 if(r1x1<rcl1){min=r1x1;}else{min=rcl1;}if(min>1-r1x1){r1c1=min;}else{r1c1=1-r1x1;} rce1_l1.setText(""+String.format("%.2f",r1c1));
    r1x2=(kl2*knl2);    if(r1x2<rdl2){min=r1x2;}else{min=rdl2;} if(min>1-r1x2){r1d2=min;}else{r1d2=1-r1x2;} rde1_l2.setText(""+String.format("%.2f",r1d2));	 if(r1x2<rcl2){min=r1x2;}else{min=rcl2;}if(min>1-r1x2){r1c2=min;}else{r1c2=1-r1x2;} rce1_l2.setText(""+String.format("%.2f",r1c2));
    r1x3=(kl3*knl3);    if(r1x3<rdl3){min=r1x3;}else{min=rdl3;} if(min>1-r1x3){r1d3=min;}else{r1d3=1-r1x3;} rde1_l3.setText(""+String.format("%.2f",r1d3));	 if(r1x3<rcl3){min=r1x3;}else{min=rcl3;}if(min>1-r1x3){r1c3=min;}else{r1c3=1-r1x3;} rce1_l3.setText(""+String.format("%.2f",r1c3));
    r1x4=(kl4*knl4);    if(r1x4<rdl4){min=r1x4;}else{min=rdl4;} if(min>1-r1x4){r1d4=min;}else{r1d4=1-r1x4;} rde1_l4.setText(""+String.format("%.2f",r1d4));	 if(r1x4<rcl4){min=r1x4;}else{min=rcl4;}if(min>1-r1x4){r1c4=min;}else{r1c4=1-r1x4;} rce1_l4.setText(""+String.format("%.2f",r1c4));
    r1x5=(kl5*knl5);    if(r1x5<rdl5){min=r1x5;}else{min=rdl5;} if(min>1-r1x5){r1d5=min;}else{r1d5=1-r1x5;} rde1_l5.setText(""+String.format("%.2f",r1d5));	 if(r1x5<rcl5){min=r1x5;}else{min=rcl5;}if(min>1-r1x5){r1c5=min;}else{r1c5=1-r1x5;} rce1_l5.setText(""+String.format("%.2f",r1c5));
    r1x6=(kl6*knl6);    if(r1x6<rdl6){min=r1x6;}else{min=rdl6;} if(min>1-r1x6){r1d6=min;}else{r1d6=1-r1x6;} rde1_l6.setText(""+String.format("%.2f",r1d6));	 if(r1x6<rcl6){min=r1x6;}else{min=rcl6;}if(min>1-r1x6){r1c6=min;}else{r1c6=1-r1x6;} rce1_l6.setText(""+String.format("%.2f",r1c6));
    r1x7=(kl7*knl7);    if(r1x7<rdl7){min=r1x7;}else{min=rdl7;} if(min>1-r1x7){r1d7=min;}else{r1d7=1-r1x7;} rde1_l7.setText(""+String.format("%.2f",r1d7));	 if(r1x7<rcl7){min=r1x7;}else{min=rcl7;}if(min>1-r1x7){r1c7=min;}else{r1c7=1-r1x7;} rce1_l7.setText(""+String.format("%.2f",r1c7));
    r1x8=(kl8*knl8);    if(r1x8<rdl8){min=r1x8;}else{min=rdl8;} if(min>1-r1x8){r1d8=min;}else{r1d8=1-r1x8;} rde1_l8.setText(""+String.format("%.2f",r1d8));	 if(r1x8<rcl8){min=r1x8;}else{min=rcl8;}if(min>1-r1x8){r1c8=min;}else{r1c8=1-r1x8;} rce1_l8.setText(""+String.format("%.2f",r1c8));
    r1x9=(kl9*knl9);    if(r1x9<rdl9){min=r1x9;}else{min=rdl9;} if(min>1-r1x9){r1d9=min;}else{r1d9=1-r1x9;} rde1_l9.setText(""+String.format("%.2f",r1d9));	 if(r1x9<rcl9){min=r1x9;}else{min=rcl9;}if(min>1-r1x9){r1c9=min;}else{r1c9=1-r1x9;} rce1_l9.setText(""+String.format("%.2f",r1c9));
    r1x10=(kl10*knl10); if(r1x10<rdl10){min=r1x10;}else{min=rdl10;} if(min>1-r1x10){r1d10=min;}else{r1d10=1-r1x10;} rde1_l10.setText(""+String.format("%.2f",r1d10));  if(r1x10<rcl10){min=r1x10;}else{min=rcl10;}if(min>1-r1x10){r1c10=min;}else{r1c10=1-r1x10;} rce1_l10.setText(""+String.format("%.2f",r1c10));
    r1x11=(kl11*knl11); if(r1x11<rdl11){min=r1x11;}else{min=rdl11;} if(min>1-r1x11){r1d11=min;}else{r1d11=1-r1x11;} rde1_l11.setText(""+String.format("%.2f",r1d11));  if(r1x11<rcl11){min=r1x11;}else{min=rcl11;}if(min>1-r1x11){r1c11=min;}else{r1c11=1-r1x11;} rce1_l11.setText(""+String.format("%.2f",r1c11));
    r1x12=(kl12*knl12); if(r1x12<rdl12){min=r1x12;}else{min=rdl12;} if(min>1-r1x12){r1d12=min;}else{r1d12=1-r1x12;} rde1_l12.setText(""+String.format("%.2f",r1d12));  if(r1x12<rcl12){min=r1x12;}else{min=rcl12;}if(min>1-r1x12){r1c12=min;}else{r1c12=1-r1x12;} rce1_l12.setText(""+String.format("%.2f",r1c12));
    r1x13=(kl13*knl13); if(r1x13<rdl13){min=r1x13;}else{min=rdl13;} if(min>1-r1x13){r1d13=min;}else{r1d13=1-r1x13;} rde1_l13.setText(""+String.format("%.2f",r1d13));  if(r1x13<rcl13){min=r1x13;}else{min=rcl13;}if(min>1-r1x13){r1c13=min;}else{r1c13=1-r1x13;} rce1_l13.setText(""+String.format("%.2f",r1c13));
    r1x14=(kl14*knl14); if(r1x14<rdl14){min=r1x14;}else{min=rdl14;} if(min>1-r1x14){r1d14=min;}else{r1d14=1-r1x14;} rde1_l14.setText(""+String.format("%.2f",r1d14));  if(r1x14<rcl14){min=r1x14;}else{min=rcl14;}if(min>1-r1x14){r1c14=min;}else{r1c14=1-r1x14;} rce1_l14.setText(""+String.format("%.2f",r1c14));
    r1x15=(kl15*knl15); if(r1x15<rdl15){min=r1x15;}else{min=rdl15;} if(min>1-r1x15){r1d15=min;}else{r1d15=1-r1x15;} rde1_l15.setText(""+String.format("%.2f",r1d15));  if(r1x15<rcl15){min=r1x15;}else{min=rcl15;}if(min>1-r1x15){r1c15=min;}else{r1c15=1-r1x15;} rce1_l15.setText(""+String.format("%.2f",r1c15));
    r1x16=(kl16*knl16); if(r1x16<rdl16){min=r1x16;}else{min=rdl16;} if(min>1-r1x16){r1d16=min;}else{r1d16=1-r1x16;} rde1_l16.setText(""+String.format("%.2f",r1d16));  if(r1x16<rcl16){min=r1x16;}else{min=rcl16;}if(min>1-r1x16){r1c16=min;}else{r1c16=1-r1x16;} rce1_l16.setText(""+String.format("%.2f",r1c16));
    r1x17=(kl17*knl17); if(r1x17<rdl17){min=r1x17;}else{min=rdl17;} if(min>1-r1x17){r1d17=min;}else{r1d17=1-r1x17;} rde1_l17.setText(""+String.format("%.2f",r1d17));  if(r1x17<rcl17){min=r1x17;}else{min=rcl17;}if(min>1-r1x17){r1c17=min;}else{r1c17=1-r1x17;} rce1_l17.setText(""+String.format("%.2f",r1c17));
    r1x18=(kl18*knl18); if(r1x18<rdl18){min=r1x18;}else{min=rdl18;} if(min>1-r1x18){r1d18=min;}else{r1d18=1-r1x18;} rde1_l18.setText(""+String.format("%.2f",r1d18));  if(r1x18<rcl18){min=r1x18;}else{min=rcl18;}if(min>1-r1x18){r1c18=min;}else{r1c18=1-r1x18;} rce1_l18.setText(""+String.format("%.2f",r1c18));
    r1x19=(kl19*knl19); if(r1x19<rdl19){min=r1x19;}else{min=rdl19;} if(min>1-r1x19){r1d19=min;}else{r1d19=1-r1x19;} rde1_l19.setText(""+String.format("%.2f",r1d19));  if(r1x19<rcl19){min=r1x19;}else{min=rcl19;}if(min>1-r1x19){r1c19=min;}else{r1c19=1-r1x19;} rce1_l19.setText(""+String.format("%.2f",r1c19));
    r1x20=(kl20*knl20); if(r1x20<rdl20){min=r1x20;}else{min=rdl20;} if(min>1-r1x20){r1d20=min;}else{r1d20=1-r1x20;} rde1_l20.setText(""+String.format("%.2f",r1d20));  if(r1x20<rcl20){min=r1x20;}else{min=rcl20;}if(min>1-r1x20){r1c20=min;}else{r1c20=1-r1x20;} rce1_l20.setText(""+String.format("%.2f",r1c20));
    r1x21=(kl21*knl21); if(r1x21<rdl21){min=r1x21;}else{min=rdl21;} if(min>1-r1x21){r1d21=min;}else{r1d21=1-r1x21;} rde1_l21.setText(""+String.format("%.2f",r1d21));  if(r1x21<rcl21){min=r1x21;}else{min=rcl21;}if(min>1-r1x21){r1c21=min;}else{r1c21=1-r1x21;} rce1_l21.setText(""+String.format("%.2f",r1c21));
    r1x22=(kl22*knl22); if(r1x22<rdl22){min=r1x22;}else{min=rdl22;} if(min>1-r1x22){r1d22=min;}else{r1d22=1-r1x22;} rde1_l22.setText(""+String.format("%.2f",r1d22));  if(r1x22<rcl22){min=r1x22;}else{min=rcl22;}if(min>1-r1x22){r1c22=min;}else{r1c22=1-r1x22;} rce1_l22.setText(""+String.format("%.2f",r1c22));
    r1x23=(kl23*knl23); if(r1x23<rdl23){min=r1x23;}else{min=rdl23;} if(min>1-r1x23){r1d23=min;}else{r1d23=1-r1x23;} rde1_l23.setText(""+String.format("%.2f",r1d23));  if(r1x23<rcl23){min=r1x23;}else{min=rcl23;}if(min>1-r1x23){r1c23=min;}else{r1c23=1-r1x23;} rce1_l23.setText(""+String.format("%.2f",r1c23));
    r1x24=(kl24*knl24); if(r1x24<rdl24){min=r1x24;}else{min=rdl24;} if(min>1-r1x24){r1d24=min;}else{r1d24=1-r1x24;} rde1_l24.setText(""+String.format("%.2f",r1d24));  if(r1x24<rcl24){min=r1x24;}else{min=rcl24;}if(min>1-r1x24){r1c24=min;}else{r1c24=1-r1x24;} rce1_l24.setText(""+String.format("%.2f",r1c24));
    r1x25=(kl25*knl25); if(r1x25<rdl25){min=r1x25;}else{min=rdl25;} if(min>1-r1x25){r1d25=min;}else{r1d25=1-r1x25;} rde1_l25.setText(""+String.format("%.2f",r1d25));  if(r1x25<rcl25){min=r1x25;}else{min=rcl25;}if(min>1-r1x25){r1c25=min;}else{r1c25=1-r1x25;} rce1_l25.setText(""+String.format("%.2f",r1c25));
    r1x26=(kl26*knl26); if(r1x26<rdl26){min=r1x26;}else{min=rdl26;} if(min>1-r1x26){r1d26=min;}else{r1d26=1-r1x26;} rde1_l26.setText(""+String.format("%.2f",r1d26));  if(r1x26<rcl26){min=r1x26;}else{min=rcl26;}if(min>1-r1x26){r1c26=min;}else{r1c26=1-r1x26;} rce1_l26.setText(""+String.format("%.2f",r1c26));
    r1x27=(kl27*knl27); if(r1x27<rdl27){min=r1x27;}else{min=rdl27;} if(min>1-r1x27){r1d27=min;}else{r1d27=1-r1x27;} rde1_l27.setText(""+String.format("%.2f",r1d27));  if(r1x27<rcl27){min=r1x27;}else{min=rcl27;}if(min>1-r1x27){r1c27=min;}else{r1c27=1-r1x27;} rce1_l27.setText(""+String.format("%.2f",r1c27));
    
    
    
    //RULE 2
    double r2d1,r2d2,r2d3,r2d4,r2d5,r2d6,r2d7,r2d8,r2d9,r2d10,r2d11,r2d12,r2d13,r2d14,r2d15,r2d16,r2d17,r2d18,r2d19,r2d20,r2d21,r2d22,r2d23,r2d24,r2d25,r2d26,r2d27;
    double r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9,r2c10,r2c11,r2c12,r2c13,r2c14,r2c15,r2c16,r2c17,r2c18,r2c19,r2c20,r2c21,r2c22,r2c23,r2c24,r2c25,r2c26,r2c27;
    double r2x1,r2x2,r2x3,r2x4,r2x5,r2x6,r2x7,r2x8,r2x9,r2x10,r2x11,r2x12,r2x13,r2x14,r2x15,r2x16,r2x17,r2x18,r2x19,r2x20,r2x21,r2x22,r2x23,r2x24,r2x25,r2x26,r2x27;
    
                                            //RD RC>>>>>                                                                                                                                          //RC
    r2x1=(kl1*knh1);    if(r2x1<rdl1){min=r2x1;}else{min=rdl1;} if(min>1-r2x1){r2d1=min;}else{r2d1=1-r2x1;} rde2_l1.setText(""+String.format("%.2f",r2d1));	 if(r2x1<rcl1){min=r2x1;}else{min=rcl1;}if(min>1-r2x1){r2c1=min;}else{r2c1=1-r2x1;} rce2_l1.setText(""+String.format("%.2f",r2c1));
    r2x2=(kl2*knh2);    if(r2x2<rdl2){min=r2x2;}else{min=rdl2;} if(min>1-r2x2){r2d2=min;}else{r2d2=1-r2x2;} rde2_l2.setText(""+String.format("%.2f",r2d2));	 if(r2x2<rcl2){min=r2x2;}else{min=rcl2;}if(min>1-r2x2){r2c2=min;}else{r2c2=1-r2x2;} rce2_l2.setText(""+String.format("%.2f",r2c2));
    r2x3=(kl3*knh3);    if(r2x3<rdl3){min=r2x3;}else{min=rdl3;} if(min>1-r2x3){r2d3=min;}else{r2d3=1-r2x3;} rde2_l3.setText(""+String.format("%.2f",r2d3));	 if(r2x3<rcl3){min=r2x3;}else{min=rcl3;}if(min>1-r2x3){r2c3=min;}else{r2c3=1-r2x3;} rce2_l3.setText(""+String.format("%.2f",r2c3));
    r2x4=(kl4*knh4);    if(r2x4<rdl4){min=r2x4;}else{min=rdl4;} if(min>1-r2x4){r2d4=min;}else{r2d4=1-r2x4;} rde2_l4.setText(""+String.format("%.2f",r2d4));	 if(r2x4<rcl4){min=r2x4;}else{min=rcl4;}if(min>1-r2x4){r2c4=min;}else{r2c4=1-r2x4;} rce2_l4.setText(""+String.format("%.2f",r2c4));
    r2x5=(kl5*knh5);    if(r2x5<rdl5){min=r2x5;}else{min=rdl5;} if(min>1-r2x5){r2d5=min;}else{r2d5=1-r2x5;} rde2_l5.setText(""+String.format("%.2f",r2d5));	 if(r2x5<rcl5){min=r2x5;}else{min=rcl5;}if(min>1-r2x5){r2c5=min;}else{r2c5=1-r2x5;} rce2_l5.setText(""+String.format("%.2f",r2c5));
    r2x6=(kl6*knh6);    if(r2x6<rdl6){min=r2x6;}else{min=rdl6;} if(min>1-r2x6){r2d6=min;}else{r2d6=1-r2x6;} rde2_l6.setText(""+String.format("%.2f",r2d6));	 if(r2x6<rcl6){min=r2x6;}else{min=rcl6;}if(min>1-r2x6){r2c6=min;}else{r2c6=1-r2x6;} rce2_l6.setText(""+String.format("%.2f",r2c6));
    r2x7=(kl7*knh7);    if(r2x7<rdl7){min=r2x7;}else{min=rdl7;} if(min>1-r2x7){r2d7=min;}else{r2d7=1-r2x7;} rde2_l7.setText(""+String.format("%.2f",r2d7));	 if(r2x7<rcl7){min=r2x7;}else{min=rcl7;}if(min>1-r2x7){r2c7=min;}else{r2c7=1-r2x7;} rce2_l7.setText(""+String.format("%.2f",r2c7));
    r2x8=(kl8*knh8);    if(r2x8<rdl8){min=r2x8;}else{min=rdl8;} if(min>1-r2x8){r2d8=min;}else{r2d8=1-r2x8;} rde2_l8.setText(""+String.format("%.2f",r2d8));	 if(r2x8<rcl8){min=r2x8;}else{min=rcl8;}if(min>1-r2x8){r2c8=min;}else{r2c8=1-r2x8;} rce2_l8.setText(""+String.format("%.2f",r2c8));
    r2x9=(kl9*knh9);    if(r2x9<rdl9){min=r2x9;}else{min=rdl9;} if(min>1-r2x9){r2d9=min;}else{r2d9=1-r2x9;} rde2_l9.setText(""+String.format("%.2f",r2d9));	 if(r2x9<rcl9){min=r2x9;}else{min=rcl9;}if(min>1-r2x9){r2c9=min;}else{r2c9=1-r2x9;} rce2_l9.setText(""+String.format("%.2f",r2c9));
    r2x10=(kl10*knh10); if(r2x10<rdl10){min=r2x10;}else{min=rdl10;} if(min>1-r2x10){r2d10=min;}else{r2d10=1-r2x10;} rde2_l10.setText(""+String.format("%.2f",r2d10));  if(r2x10<rcl10){min=r2x10;}else{min=rcl10;}if(min>1-r2x10){r2c10=min;}else{r2c10=1-r2x10;} rce2_l10.setText(""+String.format("%.2f",r2c10));
    r2x11=(kl11*knh11); if(r2x11<rdl11){min=r2x11;}else{min=rdl11;} if(min>1-r2x11){r2d11=min;}else{r2d11=1-r2x11;} rde2_l11.setText(""+String.format("%.2f",r2d11));  if(r2x11<rcl11){min=r2x11;}else{min=rcl11;}if(min>1-r2x11){r2c11=min;}else{r2c11=1-r2x11;} rce2_l11.setText(""+String.format("%.2f",r2c11));
    r2x12=(kl12*knh12); if(r2x12<rdl12){min=r2x12;}else{min=rdl12;} if(min>1-r2x12){r2d12=min;}else{r2d12=1-r2x12;} rde2_l12.setText(""+String.format("%.2f",r2d12));  if(r2x12<rcl12){min=r2x12;}else{min=rcl12;}if(min>1-r2x12){r2c12=min;}else{r2c12=1-r2x12;} rce2_l12.setText(""+String.format("%.2f",r2c12));
    r2x13=(kl13*knh13); if(r2x13<rdl13){min=r2x13;}else{min=rdl13;} if(min>1-r2x13){r2d13=min;}else{r2d13=1-r2x13;} rde2_l13.setText(""+String.format("%.2f",r2d13));  if(r2x13<rcl13){min=r2x13;}else{min=rcl13;}if(min>1-r2x13){r2c13=min;}else{r2c13=1-r2x13;} rce2_l13.setText(""+String.format("%.2f",r2c13));
    r2x14=(kl14*knh14); if(r2x14<rdl14){min=r2x14;}else{min=rdl14;} if(min>1-r2x14){r2d14=min;}else{r2d14=1-r2x14;} rde2_l14.setText(""+String.format("%.2f",r2d14));  if(r2x14<rcl14){min=r2x14;}else{min=rcl14;}if(min>1-r2x14){r2c14=min;}else{r2c14=1-r2x14;} rce2_l14.setText(""+String.format("%.2f",r2c14));
    r2x15=(kl15*knh15); if(r2x15<rdl15){min=r2x15;}else{min=rdl15;} if(min>1-r2x15){r2d15=min;}else{r2d15=1-r2x15;} rde2_l15.setText(""+String.format("%.2f",r2d15));  if(r2x15<rcl15){min=r2x15;}else{min=rcl15;}if(min>1-r2x15){r2c15=min;}else{r2c15=1-r2x15;} rce2_l15.setText(""+String.format("%.2f",r2c15));
    r2x16=(kl16*knh16); if(r2x16<rdl16){min=r2x16;}else{min=rdl16;} if(min>1-r2x16){r2d16=min;}else{r2d16=1-r2x16;} rde2_l16.setText(""+String.format("%.2f",r2d16));  if(r2x16<rcl16){min=r2x16;}else{min=rcl16;}if(min>1-r2x16){r2c16=min;}else{r2c16=1-r2x16;} rce2_l16.setText(""+String.format("%.2f",r2c16));
    r2x17=(kl17*knh17); if(r2x17<rdl17){min=r2x17;}else{min=rdl17;} if(min>1-r2x17){r2d17=min;}else{r2d17=1-r2x17;} rde2_l17.setText(""+String.format("%.2f",r2d17));  if(r2x17<rcl17){min=r2x17;}else{min=rcl17;}if(min>1-r2x17){r2c17=min;}else{r2c17=1-r2x17;} rce2_l17.setText(""+String.format("%.2f",r2c17));
    r2x18=(kl18*knh18); if(r2x18<rdl18){min=r2x18;}else{min=rdl18;} if(min>1-r2x18){r2d18=min;}else{r2d18=1-r2x18;} rde2_l18.setText(""+String.format("%.2f",r2d18));  if(r2x18<rcl18){min=r2x18;}else{min=rcl18;}if(min>1-r2x18){r2c18=min;}else{r2c18=1-r2x18;} rce2_l18.setText(""+String.format("%.2f",r2c18));
    r2x19=(kl19*knh19); if(r2x19<rdl19){min=r2x19;}else{min=rdl19;} if(min>1-r2x19){r2d19=min;}else{r2d19=1-r2x19;} rde2_l19.setText(""+String.format("%.2f",r2d19));  if(r2x19<rcl19){min=r2x19;}else{min=rcl19;}if(min>1-r2x19){r2c19=min;}else{r2c19=1-r2x19;} rce2_l19.setText(""+String.format("%.2f",r2c19));
    r2x20=(kl20*knh20); if(r2x20<rdl20){min=r2x20;}else{min=rdl20;} if(min>1-r2x20){r2d20=min;}else{r2d20=1-r2x20;} rde2_l20.setText(""+String.format("%.2f",r2d20));  if(r2x20<rcl20){min=r2x20;}else{min=rcl20;}if(min>1-r2x20){r2c20=min;}else{r2c20=1-r2x20;} rce2_l20.setText(""+String.format("%.2f",r2c20));
    r2x21=(kl21*knh21); if(r2x21<rdl21){min=r2x21;}else{min=rdl21;} if(min>1-r2x21){r2d21=min;}else{r2d21=1-r2x21;} rde2_l21.setText(""+String.format("%.2f",r2d21));  if(r2x21<rcl21){min=r2x21;}else{min=rcl21;}if(min>1-r2x21){r2c21=min;}else{r2c21=1-r2x21;} rce2_l21.setText(""+String.format("%.2f",r2c21));
    r2x22=(kl22*knh22); if(r2x22<rdl22){min=r2x22;}else{min=rdl22;} if(min>1-r2x22){r2d22=min;}else{r2d22=1-r2x22;} rde2_l22.setText(""+String.format("%.2f",r2d22));  if(r2x22<rcl22){min=r2x22;}else{min=rcl22;}if(min>1-r2x22){r2c22=min;}else{r2c22=1-r2x22;} rce2_l22.setText(""+String.format("%.2f",r2c22));
    r2x23=(kl23*knh23); if(r2x23<rdl23){min=r2x23;}else{min=rdl23;} if(min>1-r2x23){r2d23=min;}else{r2d23=1-r2x23;} rde2_l23.setText(""+String.format("%.2f",r2d23));  if(r2x23<rcl23){min=r2x23;}else{min=rcl23;}if(min>1-r2x23){r2c23=min;}else{r2c23=1-r2x23;} rce2_l23.setText(""+String.format("%.2f",r2c23));
    r2x24=(kl24*knh24); if(r2x24<rdl24){min=r2x24;}else{min=rdl24;} if(min>1-r2x24){r2d24=min;}else{r2d24=1-r2x24;} rde2_l24.setText(""+String.format("%.2f",r2d24));  if(r2x24<rcl24){min=r2x24;}else{min=rcl24;}if(min>1-r2x24){r2c24=min;}else{r2c24=1-r2x24;} rce2_l24.setText(""+String.format("%.2f",r2c24));
    r2x25=(kl25*knh25); if(r2x25<rdl25){min=r2x25;}else{min=rdl25;} if(min>1-r2x25){r2d25=min;}else{r2d25=1-r2x25;} rde2_l25.setText(""+String.format("%.2f",r2d25));  if(r2x25<rcl25){min=r2x25;}else{min=rcl25;}if(min>1-r2x25){r2c25=min;}else{r2c25=1-r2x25;} rce2_l25.setText(""+String.format("%.2f",r2c25));
    r2x26=(kl26*knh26); if(r2x26<rdl26){min=r2x26;}else{min=rdl26;} if(min>1-r2x26){r2d26=min;}else{r2d26=1-r2x26;} rde2_l26.setText(""+String.format("%.2f",r2d26));  if(r2x26<rcl26){min=r2x26;}else{min=rcl26;}if(min>1-r2x26){r2c26=min;}else{r2c26=1-r2x26;} rce2_l26.setText(""+String.format("%.2f",r2c26));
    r2x27=(kl27*knh27); if(r2x27<rdl27){min=r2x27;}else{min=rdl27;} if(min>1-r2x27){r2d27=min;}else{r2d27=1-r2x27;} rde2_l27.setText(""+String.format("%.2f",r2d27));  if(r2x27<rcl27){min=r2x27;}else{min=rcl27;}if(min>1-r2x27){r2c27=min;}else{r2c27=1-r2x27;} rce2_l27.setText(""+String.format("%.2f",r2c27));
    
     //RULE3
    double r3d1,r3d2,r3d3,r3d4,r3d5,r3d6,r3d7,r3d8,r3d9,r3d10,r3d11,r3d12,r3d13,r3d14,r3d15,r3d16,r3d17,r3d18,r3d19,r3d20,r3d21,r3d22,r3d23,r3d24,r3d25,r3d26,r3d27;
    double r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9,r3c10,r3c11,r3c12,r3c13,r3c14,r3c15,r3c16,r3c17,r3c18,r3c19,r3c20,r3c21,r3c22,r3c23,r3c24,r3c25,r3c26,r3c27;
    double r3x1,r3x2,r3x3,r3x4,r3x5,r3x6,r3x7,r3x8,r3x9,r3x10,r3x11,r3x12,r3x13,r3x14,r3x15,r3x16,r3x17,r3x18,r3x19,r3x20,r3x21,r3x22,r3x23,r3x24,r3x25,r3x26,r3x27;
    //RD RC>>>>>                                                                                                                                          //RC
    r3x1=(kh1*knl1);    if(r3x1<rdl1){min=r3x1;}else{min=rdl1;} if(min>1-r3x1){r3d1=min;}else{r3d1=1-r3x1;} rde3_h1.setText(""+String.format("%.2f",r3d1));	 if(r3x1<rch1){min=r3x1;}else{min=rch1;}if(min>1-r3x1){r3c1=min;}else{r3c1=1-r3x1;} rce3_h1.setText(""+String.format("%.2f",r3c1));
    r3x2=(kh2*knl2);    if(r3x2<rdl2){min=r3x2;}else{min=rdl2;} if(min>1-r3x2){r3d2=min;}else{r3d2=1-r3x2;} rde3_h2.setText(""+String.format("%.2f",r3d2));	 if(r3x2<rch2){min=r3x2;}else{min=rch2;}if(min>1-r3x2){r3c2=min;}else{r3c2=1-r3x2;} rce3_h2.setText(""+String.format("%.2f",r3c2));
    r3x3=(kh3*knl3);    if(r3x3<rdl3){min=r3x3;}else{min=rdl3;} if(min>1-r3x3){r3d3=min;}else{r3d3=1-r3x3;} rde3_h3.setText(""+String.format("%.2f",r3d3));	 if(r3x3<rch3){min=r3x3;}else{min=rch3;}if(min>1-r3x3){r3c3=min;}else{r3c3=1-r3x3;} rce3_h3.setText(""+String.format("%.2f",r3c3));
    r3x4=(kh4*knl4);    if(r3x4<rdl4){min=r3x4;}else{min=rdl4;} if(min>1-r3x4){r3d4=min;}else{r3d4=1-r3x4;} rde3_h4.setText(""+String.format("%.2f",r3d4));	 if(r3x4<rch4){min=r3x4;}else{min=rch4;}if(min>1-r3x4){r3c4=min;}else{r3c4=1-r3x4;} rce3_h4.setText(""+String.format("%.2f",r3c4));
    r3x5=(kh5*knl5);    if(r3x5<rdl5){min=r3x5;}else{min=rdl5;} if(min>1-r3x5){r3d5=min;}else{r3d5=1-r3x5;} rde3_h5.setText(""+String.format("%.2f",r3d5));	 if(r3x5<rch5){min=r3x5;}else{min=rch5;}if(min>1-r3x5){r3c5=min;}else{r3c5=1-r3x5;} rce3_h5.setText(""+String.format("%.2f",r3c5));
    r3x6=(kh6*knl6);    if(r3x6<rdl6){min=r3x6;}else{min=rdl6;} if(min>1-r3x6){r3d6=min;}else{r3d6=1-r3x6;} rde3_h6.setText(""+String.format("%.2f",r3d6));	 if(r3x6<rch6){min=r3x6;}else{min=rch6;}if(min>1-r3x6){r3c6=min;}else{r3c6=1-r3x6;} rce3_h6.setText(""+String.format("%.2f",r3c6));
    r3x7=(kh7*knl7);    if(r3x7<rdl7){min=r3x7;}else{min=rdl7;} if(min>1-r3x7){r3d7=min;}else{r3d7=1-r3x7;} rde3_h7.setText(""+String.format("%.2f",r3d7));	 if(r3x7<rch7){min=r3x7;}else{min=rch7;}if(min>1-r3x7){r3c7=min;}else{r3c7=1-r3x7;} rce3_h7.setText(""+String.format("%.2f",r3c7));
    r3x8=(kh8*knl8);    if(r3x8<rdl8){min=r3x8;}else{min=rdl8;} if(min>1-r3x8){r3d8=min;}else{r3d8=1-r3x8;} rde3_h8.setText(""+String.format("%.2f",r3d8));	 if(r3x8<rch8){min=r3x8;}else{min=rch8;}if(min>1-r3x8){r3c8=min;}else{r3c8=1-r3x8;} rce3_h8.setText(""+String.format("%.2f",r3c8));
    r3x9=(kh9*knl9);    if(r3x9<rdl9){min=r3x9;}else{min=rdl9;} if(min>1-r3x9){r3d9=min;}else{r3d9=1-r3x9;} rde3_h9.setText(""+String.format("%.2f",r3d9));	 if(r3x9<rch9){min=r3x9;}else{min=rch9;}if(min>1-r3x9){r3c9=min;}else{r3c9=1-r3x9;} rce3_h9.setText(""+String.format("%.2f",r3c9));
    r3x10=(kh10*knl10); if(r3x10<rdl10){min=r3x10;}else{min=rdl10;} if(min>1-r3x10){r3d10=min;}else{r3d10=1-r3x10;} rde3_h10.setText(""+String.format("%.2f",r3d10));  if(r3x10<rch10){min=r3x10;}else{min=rch10;}if(min>1-r3x10){r3c10=min;}else{r3c10=1-r3x10;} rce3_h10.setText(""+String.format("%.2f",r3c10));
    r3x11=(kh11*knl11); if(r3x11<rdl11){min=r3x11;}else{min=rdl11;} if(min>1-r3x11){r3d11=min;}else{r3d11=1-r3x11;} rde3_h11.setText(""+String.format("%.2f",r3d11));  if(r3x11<rch11){min=r3x11;}else{min=rch11;}if(min>1-r3x11){r3c11=min;}else{r3c11=1-r3x11;} rce3_h11.setText(""+String.format("%.2f",r3c11));
    r3x12=(kh12*knl12); if(r3x12<rdl12){min=r3x12;}else{min=rdl12;} if(min>1-r3x12){r3d12=min;}else{r3d12=1-r3x12;} rde3_h12.setText(""+String.format("%.2f",r3d12));  if(r3x12<rch12){min=r3x12;}else{min=rch12;}if(min>1-r3x12){r3c12=min;}else{r3c12=1-r3x12;} rce3_h12.setText(""+String.format("%.2f",r3c12));
    r3x13=(kh13*knl13); if(r3x13<rdl13){min=r3x13;}else{min=rdl13;} if(min>1-r3x13){r3d13=min;}else{r3d13=1-r3x13;} rde3_h13.setText(""+String.format("%.2f",r3d13));  if(r3x13<rch13){min=r3x13;}else{min=rch13;}if(min>1-r3x13){r3c13=min;}else{r3c13=1-r3x13;} rce3_h13.setText(""+String.format("%.2f",r3c13));
    r3x14=(kh14*knl14); if(r3x14<rdl14){min=r3x14;}else{min=rdl14;} if(min>1-r3x14){r3d14=min;}else{r3d14=1-r3x14;} rde3_h14.setText(""+String.format("%.2f",r3d14));  if(r3x14<rch14){min=r3x14;}else{min=rch14;}if(min>1-r3x14){r3c14=min;}else{r3c14=1-r3x14;} rce3_h14.setText(""+String.format("%.2f",r3c14));
    r3x15=(kh15*knl15); if(r3x15<rdl15){min=r3x15;}else{min=rdl15;} if(min>1-r3x15){r3d15=min;}else{r3d15=1-r3x15;} rde3_h15.setText(""+String.format("%.2f",r3d15));  if(r3x15<rch15){min=r3x15;}else{min=rch15;}if(min>1-r3x15){r3c15=min;}else{r3c15=1-r3x15;} rce3_h15.setText(""+String.format("%.2f",r3c15));
    r3x16=(kh16*knl16); if(r3x16<rdl16){min=r3x16;}else{min=rdl16;} if(min>1-r3x16){r3d16=min;}else{r3d16=1-r3x16;} rde3_h16.setText(""+String.format("%.2f",r3d16));  if(r3x16<rch16){min=r3x16;}else{min=rch16;}if(min>1-r3x16){r3c16=min;}else{r3c16=1-r3x16;} rce3_h16.setText(""+String.format("%.2f",r3c16));
    r3x17=(kh17*knl17); if(r3x17<rdl17){min=r3x17;}else{min=rdl17;} if(min>1-r3x17){r3d17=min;}else{r3d17=1-r3x17;} rde3_h17.setText(""+String.format("%.2f",r3d17));  if(r3x17<rch17){min=r3x17;}else{min=rch17;}if(min>1-r3x17){r3c17=min;}else{r3c17=1-r3x17;} rce3_h17.setText(""+String.format("%.2f",r3c17));
    r3x18=(kh18*knl18); if(r3x18<rdl18){min=r3x18;}else{min=rdl18;} if(min>1-r3x18){r3d18=min;}else{r3d18=1-r3x18;} rde3_h18.setText(""+String.format("%.2f",r3d18));  if(r3x18<rch18){min=r3x18;}else{min=rch18;}if(min>1-r3x18){r3c18=min;}else{r3c18=1-r3x18;} rce3_h18.setText(""+String.format("%.2f",r3c18));
    r3x19=(kh19*knl19); if(r3x19<rdl19){min=r3x19;}else{min=rdl19;} if(min>1-r3x19){r3d19=min;}else{r3d19=1-r3x19;} rde3_h19.setText(""+String.format("%.2f",r3d19));  if(r3x19<rch19){min=r3x19;}else{min=rch19;}if(min>1-r3x19){r3c19=min;}else{r3c19=1-r3x19;} rce3_h19.setText(""+String.format("%.2f",r3c19));
    r3x20=(kh20*knl20); if(r3x20<rdl20){min=r3x20;}else{min=rdl20;} if(min>1-r3x20){r3d20=min;}else{r3d20=1-r3x20;} rde3_h20.setText(""+String.format("%.2f",r3d20));  if(r3x20<rch20){min=r3x20;}else{min=rch20;}if(min>1-r3x20){r3c20=min;}else{r3c20=1-r3x20;} rce3_h20.setText(""+String.format("%.2f",r3c20));
    r3x21=(kh21*knl21); if(r3x21<rdl21){min=r3x21;}else{min=rdl21;} if(min>1-r3x21){r3d21=min;}else{r3d21=1-r3x21;} rde3_h21.setText(""+String.format("%.2f",r3d21));  if(r3x21<rch21){min=r3x21;}else{min=rch21;}if(min>1-r3x21){r3c21=min;}else{r3c21=1-r3x21;} rce3_h21.setText(""+String.format("%.2f",r3c21));
    r3x22=(kh22*knl22); if(r3x22<rdl22){min=r3x22;}else{min=rdl22;} if(min>1-r3x22){r3d22=min;}else{r3d22=1-r3x22;} rde3_h22.setText(""+String.format("%.2f",r3d22));  if(r3x22<rch22){min=r3x22;}else{min=rch22;}if(min>1-r3x22){r3c22=min;}else{r3c22=1-r3x22;} rce3_h22.setText(""+String.format("%.2f",r3c22));
    r3x23=(kh23*knl23); if(r3x23<rdl23){min=r3x23;}else{min=rdl23;} if(min>1-r3x23){r3d23=min;}else{r3d23=1-r3x23;} rde3_h23.setText(""+String.format("%.2f",r3d23));  if(r3x23<rch23){min=r3x23;}else{min=rch23;}if(min>1-r3x23){r3c23=min;}else{r3c23=1-r3x23;} rce3_h23.setText(""+String.format("%.2f",r3c23));
    r3x24=(kh24*knl24); if(r3x24<rdl24){min=r3x24;}else{min=rdl24;} if(min>1-r3x24){r3d24=min;}else{r3d24=1-r3x24;} rde3_h24.setText(""+String.format("%.2f",r3d24));  if(r3x24<rch24){min=r3x24;}else{min=rch24;}if(min>1-r3x24){r3c24=min;}else{r3c24=1-r3x24;} rce3_h24.setText(""+String.format("%.2f",r3c24));
    r3x25=(kh25*knl25); if(r3x25<rdl25){min=r3x25;}else{min=rdl25;} if(min>1-r3x25){r3d25=min;}else{r3d25=1-r3x25;} rde3_h25.setText(""+String.format("%.2f",r3d25));  if(r3x25<rch25){min=r3x25;}else{min=rch25;}if(min>1-r3x25){r3c25=min;}else{r3c25=1-r3x25;} rce3_h25.setText(""+String.format("%.2f",r3c25));
    r3x26=(kh26*knl26); if(r3x26<rdl26){min=r3x26;}else{min=rdl26;} if(min>1-r3x26){r3d26=min;}else{r3d26=1-r3x26;} rde3_h26.setText(""+String.format("%.2f",r3d26));  if(r3x26<rch26){min=r3x26;}else{min=rch26;}if(min>1-r3x26){r3c26=min;}else{r3c26=1-r3x26;} rce3_h26.setText(""+String.format("%.2f",r3c26));
    r3x27=(kh27*knl27); if(r3x27<rdl27){min=r3x27;}else{min=rdl27;} if(min>1-r3x27){r3d27=min;}else{r3d27=1-r3x27;} rde3_h27.setText(""+String.format("%.2f",r3d27));  if(r3x27<rch27){min=r3x27;}else{min=rch27;}if(min>1-r3x27){r3c27=min;}else{r3c27=1-r3x27;} rce3_h27.setText(""+String.format("%.2f",r3c27));
    
    //Rule4
    double r4d1,r4d2,r4d3,r4d4,r4d5,r4d6,r4d7,r4d8,r4d9,r4d10,r4d11,r4d12,r4d13,r4d14,r4d15,r4d16,r4d17,r4d18,r4d19,r4d20,r4d21,r4d22,r4d23,r4d24,r4d25,r4d26,r4d27;
    double r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9,r4c10,r4c11,r4c12,r4c13,r4c14,r4c15,r4c16,r4c17,r4c18,r4c19,r4c20,r4c21,r4c22,r4c23,r4c24,r4c25,r4c26,r4c27;
    double r4x1,r4x2,r4x3,r4x4,r4x5,r4x6,r4x7,r4x8,r4x9,r4x10,r4x11,r4x12,r4x13,r4x14,r4x15,r4x16,r4x17,r4x18,r4x19,r4x20,r4x21,r4x22,r4x23,r4x24,r4x25,r4x26,r4x27;
    //RD RC>>>>>                                                                                                                                          //RC
    r4x1=(kh1*knh1);    if(r4x1<rdh1){min=r4x1;}else{min=rdh1;} if(min>1-r4x1){r4d1=min;}else{r4d1=1-r4x1;} rde4_h1.setText(""+String.format("%.2f",r4d1));	 if(r4x1<rch1){min=r4x1;}else{min=rch1;}if(min>1-r4x1){r4c1=min;}else{r4c1=1-r4x1;} rce4_h1.setText(""+String.format("%.2f",r4c1));
    r4x2=(kh2*knh2);    if(r4x2<rdh2){min=r4x2;}else{min=rdh2;} if(min>1-r4x2){r4d2=min;}else{r4d2=1-r4x2;} rde4_h2.setText(""+String.format("%.2f",r4d2));	 if(r4x2<rch2){min=r4x2;}else{min=rch2;}if(min>1-r4x2){r4c2=min;}else{r4c2=1-r4x2;} rce4_h2.setText(""+String.format("%.2f",r4c2));
    r4x3=(kh3*knh3);    if(r4x3<rdh3){min=r4x3;}else{min=rdh3;} if(min>1-r4x3){r4d3=min;}else{r4d3=1-r4x3;} rde4_h3.setText(""+String.format("%.2f",r4d3));	 if(r4x3<rch3){min=r4x3;}else{min=rch3;}if(min>1-r4x3){r4c3=min;}else{r4c3=1-r4x3;} rce4_h3.setText(""+String.format("%.2f",r4c3));
    r4x4=(kh4*knh4);    if(r4x4<rdh4){min=r4x4;}else{min=rdh4;} if(min>1-r4x4){r4d4=min;}else{r4d4=1-r4x4;} rde4_h4.setText(""+String.format("%.2f",r4d4));	 if(r4x4<rch4){min=r4x4;}else{min=rch4;}if(min>1-r4x4){r4c4=min;}else{r4c4=1-r4x4;} rce4_h4.setText(""+String.format("%.2f",r4c4));
    r4x5=(kh5*knh5);    if(r4x5<rdh5){min=r4x5;}else{min=rdh5;} if(min>1-r4x5){r4d5=min;}else{r4d5=1-r4x5;} rde4_h5.setText(""+String.format("%.2f",r4d5));	 if(r4x5<rch5){min=r4x5;}else{min=rch5;}if(min>1-r4x5){r4c5=min;}else{r4c5=1-r4x5;} rce4_h5.setText(""+String.format("%.2f",r4c5));
    r4x6=(kh6*knh6);    if(r4x6<rdh6){min=r4x6;}else{min=rdh6;} if(min>1-r4x6){r4d6=min;}else{r4d6=1-r4x6;} rde4_h6.setText(""+String.format("%.2f",r4d6));	 if(r4x6<rch6){min=r4x6;}else{min=rch6;}if(min>1-r4x6){r4c6=min;}else{r4c6=1-r4x6;} rce4_h6.setText(""+String.format("%.2f",r4c6));
    r4x7=(kh7*knh7);    if(r4x7<rdh7){min=r4x7;}else{min=rdh7;} if(min>1-r4x7){r4d7=min;}else{r4d7=1-r4x7;} rde4_h7.setText(""+String.format("%.2f",r4d7));	 if(r4x7<rch7){min=r4x7;}else{min=rch7;}if(min>1-r4x7){r4c7=min;}else{r4c7=1-r4x7;} rce4_h7.setText(""+String.format("%.2f",r4c7));
    r4x8=(kh8*knh8);    if(r4x8<rdh8){min=r4x8;}else{min=rdh8;} if(min>1-r4x8){r4d8=min;}else{r4d8=1-r4x8;} rde4_h8.setText(""+String.format("%.2f",r4d8));	 if(r4x8<rch8){min=r4x8;}else{min=rch8;}if(min>1-r4x8){r4c8=min;}else{r4c8=1-r4x8;} rce4_h8.setText(""+String.format("%.2f",r4c8));
    r4x9=(kh9*knh9);    if(r4x9<rdh9){min=r4x9;}else{min=rdh9;} if(min>1-r4x9){r4d9=min;}else{r4d9=1-r4x9;} rde4_h9.setText(""+String.format("%.2f",r4d9));	 if(r4x9<rch9){min=r4x9;}else{min=rch9;}if(min>1-r4x9){r4c9=min;}else{r4c9=1-r4x9;} rce4_h9.setText(""+String.format("%.2f",r4c9));
    r4x10=(kh10*knh10); if(r4x10<rdh10){min=r4x10;}else{min=rdh10;} if(min>1-r4x10){r4d10=min;}else{r4d10=1-r4x10;} rde4_h10.setText(""+String.format("%.2f",r4d10));  if(r4x10<rch10){min=r4x10;}else{min=rch10;}if(min>1-r4x10){r4c10=min;}else{r4c10=1-r4x10;} rce4_h10.setText(""+String.format("%.2f",r4c10));
    r4x11=(kh11*knh11); if(r4x11<rdh11){min=r4x11;}else{min=rdh11;} if(min>1-r4x11){r4d11=min;}else{r4d11=1-r4x11;} rde4_h11.setText(""+String.format("%.2f",r4d11));  if(r4x11<rch11){min=r4x11;}else{min=rch11;}if(min>1-r4x11){r4c11=min;}else{r4c11=1-r4x11;} rce4_h11.setText(""+String.format("%.2f",r4c11));
    r4x12=(kh12*knh12); if(r4x12<rdh12){min=r4x12;}else{min=rdh12;} if(min>1-r4x12){r4d12=min;}else{r4d12=1-r4x12;} rde4_h12.setText(""+String.format("%.2f",r4d12));  if(r4x12<rch12){min=r4x12;}else{min=rch12;}if(min>1-r4x12){r4c12=min;}else{r4c12=1-r4x12;} rce4_h12.setText(""+String.format("%.2f",r4c12));
    r4x13=(kh13*knh13); if(r4x13<rdh13){min=r4x13;}else{min=rdh13;} if(min>1-r4x13){r4d13=min;}else{r4d13=1-r4x13;} rde4_h13.setText(""+String.format("%.2f",r4d13));  if(r4x13<rch13){min=r4x13;}else{min=rch13;}if(min>1-r4x13){r4c13=min;}else{r4c13=1-r4x13;} rce4_h13.setText(""+String.format("%.2f",r4c13));
    r4x14=(kh14*knh14); if(r4x14<rdh14){min=r4x14;}else{min=rdh14;} if(min>1-r4x14){r4d14=min;}else{r4d14=1-r4x14;} rde4_h14.setText(""+String.format("%.2f",r4d14));  if(r4x14<rch14){min=r4x14;}else{min=rch14;}if(min>1-r4x14){r4c14=min;}else{r4c14=1-r4x14;} rce4_h14.setText(""+String.format("%.2f",r4c14));
    r4x15=(kh15*knh15); if(r4x15<rdh15){min=r4x15;}else{min=rdh15;} if(min>1-r4x15){r4d15=min;}else{r4d15=1-r4x15;} rde4_h15.setText(""+String.format("%.2f",r4d15));  if(r4x15<rch15){min=r4x15;}else{min=rch15;}if(min>1-r4x15){r4c15=min;}else{r4c15=1-r4x15;} rce4_h15.setText(""+String.format("%.2f",r4c15));
    r4x16=(kh16*knh16); if(r4x16<rdh16){min=r4x16;}else{min=rdh16;} if(min>1-r4x16){r4d16=min;}else{r4d16=1-r4x16;} rde4_h16.setText(""+String.format("%.2f",r4d16));  if(r4x16<rch16){min=r4x16;}else{min=rch16;}if(min>1-r4x16){r4c16=min;}else{r4c16=1-r4x16;} rce4_h16.setText(""+String.format("%.2f",r4c16));
    r4x17=(kh17*knh17); if(r4x17<rdh17){min=r4x17;}else{min=rdh17;} if(min>1-r4x17){r4d17=min;}else{r4d17=1-r4x17;} rde4_h17.setText(""+String.format("%.2f",r4d17));  if(r4x17<rch17){min=r4x17;}else{min=rch17;}if(min>1-r4x17){r4c17=min;}else{r4c17=1-r4x17;} rce4_h17.setText(""+String.format("%.2f",r4c17));
    r4x18=(kh18*knh18); if(r4x18<rdh18){min=r4x18;}else{min=rdh18;} if(min>1-r4x18){r4d18=min;}else{r4d18=1-r4x18;} rde4_h18.setText(""+String.format("%.2f",r4d18));  if(r4x18<rch18){min=r4x18;}else{min=rch18;}if(min>1-r4x18){r4c18=min;}else{r4c18=1-r4x18;} rce4_h18.setText(""+String.format("%.2f",r4c18));
    r4x19=(kh19*knh19); if(r4x19<rdh19){min=r4x19;}else{min=rdh19;} if(min>1-r4x19){r4d19=min;}else{r4d19=1-r4x19;} rde4_h19.setText(""+String.format("%.2f",r4d19));  if(r4x19<rch19){min=r4x19;}else{min=rch19;}if(min>1-r4x19){r4c19=min;}else{r4c19=1-r4x19;} rce4_h19.setText(""+String.format("%.2f",r4c19));
    r4x20=(kh20*knh20); if(r4x20<rdh20){min=r4x20;}else{min=rdh20;} if(min>1-r4x20){r4d20=min;}else{r4d20=1-r4x20;} rde4_h20.setText(""+String.format("%.2f",r4d20));  if(r4x20<rch20){min=r4x20;}else{min=rch20;}if(min>1-r4x20){r4c20=min;}else{r4c20=1-r4x20;} rce4_h20.setText(""+String.format("%.2f",r4c20));
    r4x21=(kh21*knh21); if(r4x21<rdh21){min=r4x21;}else{min=rdh21;} if(min>1-r4x21){r4d21=min;}else{r4d21=1-r4x21;} rde4_h21.setText(""+String.format("%.2f",r4d21));  if(r4x21<rch21){min=r4x21;}else{min=rch21;}if(min>1-r4x21){r4c21=min;}else{r4c21=1-r4x21;} rce4_h21.setText(""+String.format("%.2f",r4c21));
    r4x22=(kh22*knh22); if(r4x22<rdh22){min=r4x22;}else{min=rdh22;} if(min>1-r4x22){r4d22=min;}else{r4d22=1-r4x22;} rde4_h22.setText(""+String.format("%.2f",r4d22));  if(r4x22<rch22){min=r4x22;}else{min=rch22;}if(min>1-r4x22){r4c22=min;}else{r4c22=1-r4x22;} rce4_h22.setText(""+String.format("%.2f",r4c22));
    r4x23=(kh23*knh23); if(r4x23<rdh23){min=r4x23;}else{min=rdh23;} if(min>1-r4x23){r4d23=min;}else{r4d23=1-r4x23;} rde4_h23.setText(""+String.format("%.2f",r4d23));  if(r4x23<rch23){min=r4x23;}else{min=rch23;}if(min>1-r4x23){r4c23=min;}else{r4c23=1-r4x23;} rce4_h23.setText(""+String.format("%.2f",r4c23));
    r4x24=(kh24*knh24); if(r4x24<rdh24){min=r4x24;}else{min=rdh24;} if(min>1-r4x24){r4d24=min;}else{r4d24=1-r4x24;} rde4_h24.setText(""+String.format("%.2f",r4d24));  if(r4x24<rch24){min=r4x24;}else{min=rch24;}if(min>1-r4x24){r4c24=min;}else{r4c24=1-r4x24;} rce4_h24.setText(""+String.format("%.2f",r4c24));
    r4x25=(kh25*knh25); if(r4x25<rdh25){min=r4x25;}else{min=rdh25;} if(min>1-r4x25){r4d25=min;}else{r4d25=1-r4x25;} rde4_h25.setText(""+String.format("%.2f",r4d25));  if(r4x25<rch25){min=r4x25;}else{min=rch25;}if(min>1-r4x25){r4c25=min;}else{r4c25=1-r4x25;} rce4_h25.setText(""+String.format("%.2f",r4c25));
    r4x26=(kh26*knh26); if(r4x26<rdh26){min=r4x26;}else{min=rdh26;} if(min>1-r4x26){r4d26=min;}else{r4d26=1-r4x26;} rde4_h26.setText(""+String.format("%.2f",r4d26));  if(r4x26<rch26){min=r4x26;}else{min=rch26;}if(min>1-r4x26){r4c26=min;}else{r4c26=1-r4x26;} rce4_h26.setText(""+String.format("%.2f",r4c26));
    r4x27=(kh27*knh27); if(r4x27<rdh27){min=r4x27;}else{min=rdh27;} if(min>1-r4x27){r4d27=min;}else{r4d27=1-r4x27;} rde4_h27.setText(""+String.format("%.2f",r4d27));  if(r4x27<rch27){min=r4x27;}else{min=rch27;}if(min>1-r4x27){r4c27=min;}else{r4c27=1-r4x27;} rce4_h27.setText(""+String.format("%.2f",r4c27));
    
    }
          
    public void komposisirule(){
    double r1d1,r1d2,r1d3,r1d4,r1d5,r1d6,r1d7,r1d8,r1d9,r1d10,r1d11,r1d12,r1d13,r1d14,r1d15,r1d16,r1d17,r1d18,r1d19,r1d20,r1d21,r1d22,r1d23,r1d24,r1d25,r1d26,r1d27,r2d1,r2d2,r2d3,r2d4,r2d5,r2d6,r2d7,r2d8,r2d9,r2d10,r2d11,r2d12,r2d13,r2d14,r2d15,r2d16,r2d17,r2d18,r2d19,r2d20,r2d21,r2d22,r2d23,r2d24,r2d25,r2d26,r2d27,r3d1,r3d2,r3d3,r3d4,r3d5,r3d6,r3d7,r3d8,r3d9,r3d10,r3d11,r3d12,r3d13,r3d14,r3d15,r3d16,r3d17,r3d18,r3d19,r3d20,r3d21,r3d22,r3d23,r3d24,r3d25,r3d26,r3d27,r4d1,r4d2,r4d3,r4d4,r4d5,r4d6,r4d7,r4d8,r4d9,r4d10,r4d11,r4d12,r4d13,r4d14,r4d15,r4d16,r4d17,r4d18,r4d19,r4d20,r4d21,r4d22,r4d23,r4d24,r4d25,r4d26,r4d27;
    double r1c1,r1c2,r1c3,r1c4,r1c5,r1c6,r1c7,r1c8,r1c9,r1c10,r1c11,r1c12,r1c13,r1c14,r1c15,r1c16,r1c17,r1c18,r1c19,r1c20,r1c21,r1c22,r1c23,r1c24,r1c25,r1c26,r1c27,    r2c1,r2c2,r2c3,r2c4,r2c5,r2c6,r2c7,r2c8,r2c9,r2c10,r2c11,r2c12,r2c13,r2c14,r2c15,r2c16,r2c17,r2c18,r2c19,r2c20,r2c21,r2c22,r2c23,r2c24,r2c25,r2c26,r2c27,    r3c1,r3c2,r3c3,r3c4,r3c5,r3c6,r3c7,r3c8,r3c9,r3c10,r3c11,r3c12,r3c13,r3c14,r3c15,r3c16,r3c17,r3c18,r3c19,r3c20,r3c21,r3c22,r3c23,r3c24,r3c25,r3c26,r3c27,  r4c1,r4c2,r4c3,r4c4,r4c5,r4c6,r4c7,r4c8,r4c9,r4c10,r4c11,r4c12,r4c13,r4c14,r4c15,r4c16,r4c17,r4c18,r4c19,r4c20,r4c21,r4c22,r4c23,r4c24,r4c25,r4c26,r4c27;
    
    r1d1=(Double.parseDouble(rde1_l1.getText()));  r2d1=(Double.parseDouble(rde2_l1.getText()));  r3d1=(Double.parseDouble(rde3_h1.getText()));  r4d1=(Double.parseDouble(rde4_h1.getText()));  r1c1=(Double.parseDouble(rce1_l1.getText()));  r2c1=(Double.parseDouble(rce2_l1.getText()));  r3c1=(Double.parseDouble(rce3_h1.getText()));  r4c1=(Double.parseDouble(rce4_h1.getText()));  
    r1d2=(Double.parseDouble(rde1_l2.getText()));  r2d2=(Double.parseDouble(rde2_l2.getText()));  r3d2=(Double.parseDouble(rde3_h2.getText()));  r4d2=(Double.parseDouble(rde4_h2.getText()));  r1c2=(Double.parseDouble(rce1_l2.getText()));  r2c2=(Double.parseDouble(rce2_l2.getText()));  r3c2=(Double.parseDouble(rce3_h2.getText()));  r4c2=(Double.parseDouble(rce4_h2.getText()));  
    r1d3=(Double.parseDouble(rde1_l3.getText()));  r2d3=(Double.parseDouble(rde2_l3.getText()));  r3d3=(Double.parseDouble(rde3_h3.getText()));  r4d3=(Double.parseDouble(rde4_h3.getText()));  r1c3=(Double.parseDouble(rce1_l3.getText()));  r2c3=(Double.parseDouble(rce2_l3.getText()));  r3c3=(Double.parseDouble(rce3_h3.getText()));  r4c3=(Double.parseDouble(rce4_h3.getText()));  
    r1d4=(Double.parseDouble(rde1_l4.getText()));  r2d4=(Double.parseDouble(rde2_l4.getText()));  r3d4=(Double.parseDouble(rde3_h4.getText()));  r4d4=(Double.parseDouble(rde4_h4.getText()));  r1c4=(Double.parseDouble(rce1_l4.getText()));  r2c4=(Double.parseDouble(rce2_l4.getText()));  r3c4=(Double.parseDouble(rce3_h4.getText()));  r4c4=(Double.parseDouble(rce4_h4.getText()));  
    r1d5=(Double.parseDouble(rde1_l5.getText()));  r2d5=(Double.parseDouble(rde2_l5.getText()));  r3d5=(Double.parseDouble(rde3_h5.getText()));  r4d5=(Double.parseDouble(rde4_h5.getText()));  r1c5=(Double.parseDouble(rce1_l5.getText()));  r2c5=(Double.parseDouble(rce2_l5.getText()));  r3c5=(Double.parseDouble(rce3_h5.getText()));  r4c5=(Double.parseDouble(rce4_h5.getText()));  
    r1d6=(Double.parseDouble(rde1_l6.getText()));  r2d6=(Double.parseDouble(rde2_l6.getText()));  r3d6=(Double.parseDouble(rde3_h6.getText()));  r4d6=(Double.parseDouble(rde4_h6.getText()));  r1c6=(Double.parseDouble(rce1_l6.getText()));  r2c6=(Double.parseDouble(rce2_l6.getText()));  r3c6=(Double.parseDouble(rce3_h6.getText()));  r4c6=(Double.parseDouble(rce4_h6.getText()));  
    r1d7=(Double.parseDouble(rde1_l7.getText()));  r2d7=(Double.parseDouble(rde2_l7.getText()));  r3d7=(Double.parseDouble(rde3_h7.getText()));  r4d7=(Double.parseDouble(rde4_h7.getText()));  r1c7=(Double.parseDouble(rce1_l7.getText()));  r2c7=(Double.parseDouble(rce2_l7.getText()));  r3c7=(Double.parseDouble(rce3_h7.getText()));  r4c7=(Double.parseDouble(rce4_h7.getText()));  
    r1d8=(Double.parseDouble(rde1_l8.getText()));  r2d8=(Double.parseDouble(rde2_l8.getText()));  r3d8=(Double.parseDouble(rde3_h8.getText()));  r4d8=(Double.parseDouble(rde4_h8.getText()));  r1c8=(Double.parseDouble(rce1_l8.getText()));  r2c8=(Double.parseDouble(rce2_l8.getText()));  r3c8=(Double.parseDouble(rce3_h8.getText()));  r4c8=(Double.parseDouble(rce4_h8.getText()));  
    r1d9=(Double.parseDouble(rde1_l9.getText()));  r2d9=(Double.parseDouble(rde2_l9.getText()));  r3d9=(Double.parseDouble(rde3_h9.getText()));  r4d9=(Double.parseDouble(rde4_h9.getText()));  r1c9=(Double.parseDouble(rce1_l9.getText()));  r2c9=(Double.parseDouble(rce2_l9.getText()));  r3c9=(Double.parseDouble(rce3_h9.getText()));  r4c9=(Double.parseDouble(rce4_h9.getText()));  
    r1d10=(Double.parseDouble(rde1_l10.getText()));  r2d10=(Double.parseDouble(rde2_l10.getText()));  r3d10=(Double.parseDouble(rde3_h10.getText()));  r4d10=(Double.parseDouble(rde4_h10.getText()));  r1c10=(Double.parseDouble(rce1_l10.getText()));  r2c10=(Double.parseDouble(rce2_l10.getText()));  r3c10=(Double.parseDouble(rce3_h10.getText()));  r4c10=(Double.parseDouble(rce4_h10.getText()));  
    r1d11=(Double.parseDouble(rde1_l11.getText()));  r2d11=(Double.parseDouble(rde2_l11.getText()));  r3d11=(Double.parseDouble(rde3_h11.getText()));  r4d11=(Double.parseDouble(rde4_h11.getText()));  r1c11=(Double.parseDouble(rce1_l11.getText()));  r2c11=(Double.parseDouble(rce2_l11.getText()));  r3c11=(Double.parseDouble(rce3_h11.getText()));  r4c11=(Double.parseDouble(rce4_h11.getText()));  
    r1d12=(Double.parseDouble(rde1_l12.getText()));  r2d12=(Double.parseDouble(rde2_l12.getText()));  r3d12=(Double.parseDouble(rde3_h12.getText()));  r4d12=(Double.parseDouble(rde4_h12.getText()));  r1c12=(Double.parseDouble(rce1_l12.getText()));  r2c12=(Double.parseDouble(rce2_l12.getText()));  r3c12=(Double.parseDouble(rce3_h12.getText()));  r4c12=(Double.parseDouble(rce4_h12.getText()));  
    r1d13=(Double.parseDouble(rde1_l13.getText()));  r2d13=(Double.parseDouble(rde2_l13.getText()));  r3d13=(Double.parseDouble(rde3_h13.getText()));  r4d13=(Double.parseDouble(rde4_h13.getText()));  r1c13=(Double.parseDouble(rce1_l13.getText()));  r2c13=(Double.parseDouble(rce2_l13.getText()));  r3c13=(Double.parseDouble(rce3_h13.getText()));  r4c13=(Double.parseDouble(rce4_h13.getText()));  
    r1d14=(Double.parseDouble(rde1_l14.getText()));  r2d14=(Double.parseDouble(rde2_l14.getText()));  r3d14=(Double.parseDouble(rde3_h14.getText()));  r4d14=(Double.parseDouble(rde4_h14.getText()));  r1c14=(Double.parseDouble(rce1_l14.getText()));  r2c14=(Double.parseDouble(rce2_l14.getText()));  r3c14=(Double.parseDouble(rce3_h14.getText()));  r4c14=(Double.parseDouble(rce4_h14.getText()));  
    r1d15=(Double.parseDouble(rde1_l15.getText()));  r2d15=(Double.parseDouble(rde2_l15.getText()));  r3d15=(Double.parseDouble(rde3_h15.getText()));  r4d15=(Double.parseDouble(rde4_h15.getText()));  r1c15=(Double.parseDouble(rce1_l15.getText()));  r2c15=(Double.parseDouble(rce2_l15.getText()));  r3c15=(Double.parseDouble(rce3_h15.getText()));  r4c15=(Double.parseDouble(rce4_h15.getText()));  
    r1d16=(Double.parseDouble(rde1_l16.getText()));  r2d16=(Double.parseDouble(rde2_l16.getText()));  r3d16=(Double.parseDouble(rde3_h16.getText()));  r4d16=(Double.parseDouble(rde4_h16.getText()));  r1c16=(Double.parseDouble(rce1_l16.getText()));  r2c16=(Double.parseDouble(rce2_l16.getText()));  r3c16=(Double.parseDouble(rce3_h16.getText()));  r4c16=(Double.parseDouble(rce4_h16.getText()));  
    r1d17=(Double.parseDouble(rde1_l17.getText()));  r2d17=(Double.parseDouble(rde2_l17.getText()));  r3d17=(Double.parseDouble(rde3_h17.getText()));  r4d17=(Double.parseDouble(rde4_h17.getText()));  r1c17=(Double.parseDouble(rce1_l17.getText()));  r2c17=(Double.parseDouble(rce2_l17.getText()));  r3c17=(Double.parseDouble(rce3_h17.getText()));  r4c17=(Double.parseDouble(rce4_h17.getText()));  
    r1d18=(Double.parseDouble(rde1_l18.getText()));  r2d18=(Double.parseDouble(rde2_l18.getText()));  r3d18=(Double.parseDouble(rde3_h18.getText()));  r4d18=(Double.parseDouble(rde4_h18.getText()));  r1c18=(Double.parseDouble(rce1_l18.getText()));  r2c18=(Double.parseDouble(rce2_l18.getText()));  r3c18=(Double.parseDouble(rce3_h18.getText()));  r4c18=(Double.parseDouble(rce4_h18.getText()));  
    r1d19=(Double.parseDouble(rde1_l19.getText()));  r2d19=(Double.parseDouble(rde2_l19.getText()));  r3d19=(Double.parseDouble(rde3_h19.getText()));  r4d19=(Double.parseDouble(rde4_h19.getText()));  r1c19=(Double.parseDouble(rce1_l19.getText()));  r2c19=(Double.parseDouble(rce2_l19.getText()));  r3c19=(Double.parseDouble(rce3_h19.getText()));  r4c19=(Double.parseDouble(rce4_h19.getText()));  
    r1d20=(Double.parseDouble(rde1_l20.getText()));  r2d20=(Double.parseDouble(rde2_l20.getText()));  r3d20=(Double.parseDouble(rde3_h20.getText()));  r4d20=(Double.parseDouble(rde4_h20.getText()));  r1c20=(Double.parseDouble(rce1_l20.getText()));  r2c20=(Double.parseDouble(rce2_l20.getText()));  r3c20=(Double.parseDouble(rce3_h20.getText()));  r4c20=(Double.parseDouble(rce4_h20.getText()));  
    r1d21=(Double.parseDouble(rde1_l21.getText()));  r2d21=(Double.parseDouble(rde2_l21.getText()));  r3d21=(Double.parseDouble(rde3_h21.getText()));  r4d21=(Double.parseDouble(rde4_h21.getText()));  r1c21=(Double.parseDouble(rce1_l21.getText()));  r2c21=(Double.parseDouble(rce2_l21.getText()));  r3c21=(Double.parseDouble(rce3_h21.getText()));  r4c21=(Double.parseDouble(rce4_h21.getText()));  
    r1d22=(Double.parseDouble(rde1_l22.getText()));  r2d22=(Double.parseDouble(rde2_l22.getText()));  r3d22=(Double.parseDouble(rde3_h22.getText()));  r4d22=(Double.parseDouble(rde4_h22.getText()));  r1c22=(Double.parseDouble(rce1_l22.getText()));  r2c22=(Double.parseDouble(rce2_l22.getText()));  r3c22=(Double.parseDouble(rce3_h22.getText()));  r4c22=(Double.parseDouble(rce4_h22.getText()));  
    r1d23=(Double.parseDouble(rde1_l23.getText()));  r2d23=(Double.parseDouble(rde2_l23.getText()));  r3d23=(Double.parseDouble(rde3_h23.getText()));  r4d23=(Double.parseDouble(rde4_h23.getText()));  r1c23=(Double.parseDouble(rce1_l23.getText()));  r2c23=(Double.parseDouble(rce2_l23.getText()));  r3c23=(Double.parseDouble(rce3_h23.getText()));  r4c23=(Double.parseDouble(rce4_h23.getText()));  
    r1d24=(Double.parseDouble(rde1_l24.getText()));  r2d24=(Double.parseDouble(rde2_l24.getText()));  r3d24=(Double.parseDouble(rde3_h24.getText()));  r4d24=(Double.parseDouble(rde4_h24.getText()));  r1c24=(Double.parseDouble(rce1_l24.getText()));  r2c24=(Double.parseDouble(rce2_l24.getText()));  r3c24=(Double.parseDouble(rce3_h24.getText()));  r4c24=(Double.parseDouble(rce4_h24.getText()));  
    r1d25=(Double.parseDouble(rde1_l25.getText()));  r2d25=(Double.parseDouble(rde2_l25.getText()));  r3d25=(Double.parseDouble(rde3_h25.getText()));  r4d25=(Double.parseDouble(rde4_h25.getText()));  r1c25=(Double.parseDouble(rce1_l25.getText()));  r2c25=(Double.parseDouble(rce2_l25.getText()));  r3c25=(Double.parseDouble(rce3_h25.getText()));  r4c25=(Double.parseDouble(rce4_h25.getText()));  
    r1d26=(Double.parseDouble(rde1_l26.getText()));  r2d26=(Double.parseDouble(rde2_l26.getText()));  r3d26=(Double.parseDouble(rde3_h26.getText()));  r4d26=(Double.parseDouble(rde4_h26.getText()));  r1c26=(Double.parseDouble(rce1_l26.getText()));  r2c26=(Double.parseDouble(rce2_l26.getText()));  r3c26=(Double.parseDouble(rce3_h26.getText()));  r4c26=(Double.parseDouble(rce4_h26.getText()));  
    r1d27=(Double.parseDouble(rde1_l27.getText()));  r2d27=(Double.parseDouble(rde2_l27.getText()));  r3d27=(Double.parseDouble(rde3_h27.getText()));  r4d27=(Double.parseDouble(rde4_h27.getText()));  r1c27=(Double.parseDouble(rce1_l27.getText()));  r2c27=(Double.parseDouble(rce2_l27.getText()));  r3c27=(Double.parseDouble(rce3_h27.getText()));  r4c27=(Double.parseDouble(rce4_h27.getText()));  
      //komposisi rule rd
        double [] rd1= {r1d1,r2d1,r3d1};     double rdk1= rd1[0];for(int i=0;i<3;i++){if(rdk1 < rd1[i])  {rdk1 = rd1[i];}rdkl1.setText(""+String.format("%.2f",rdk1));}     rdkh1.setText(""+String.format("%.2f",r4d1));
        double [] rd2= {r1d2,r2d2,r3d2};     double rdk2= rd2[0];for(int i=0;i<3;i++){if(rdk2< rd2[i])  {rdk2 = rd2[i];}rdkl2.setText(""+String.format("%.2f",rdk2));}     rdkh2.setText(""+String.format("%.2f",r4d2));
        double [] rd3= {r1d3,r2d3,r3d3};     double rdk3= rd3[0];for(int i=0;i<3;i++){if(rdk3< rd3[i])  {rdk3 = rd3[i];}rdkl3.setText(""+String.format("%.2f",rdk3));}     rdkh3.setText(""+String.format("%.2f",r4d3));
        double [] rd4= {r1d4,r2d4,r3d4};     double rdk4= rd4[0];for(int i=0;i<3;i++){if(rdk4< rd4[i])  {rdk4 = rd4[i];}rdkl4.setText(""+String.format("%.2f",rdk4));}     rdkh4.setText(""+String.format("%.2f",r4d4));
        double [] rd5= {r1d5,r2d5,r3d5};     double rdk5= rd5[0];for(int i=0;i<3;i++){if(rdk5< rd5[i])  {rdk5 = rd5[i];}rdkl5.setText(""+String.format("%.2f",rdk5));}     rdkh5.setText(""+String.format("%.2f",r4d5));
        double [] rd6= {r1d6,r2d6,r3d6};     double rdk6= rd6[0];for(int i=0;i<3;i++){if(rdk6< rd6[i])  {rdk6 = rd6[i];}rdkl6.setText(""+String.format("%.2f",rdk6));}     rdkh6.setText(""+String.format("%.2f",r4d6));
        double [] rd7= {r1d7,r2d7,r3d7};     double rdk7= rd7[0];for(int i=0;i<3;i++){if(rdk7< rd7[i])  {rdk7 = rd7[i];}rdkl7.setText(""+String.format("%.2f",rdk7));}     rdkh7.setText(""+String.format("%.2f",r4d7));
        double [] rd8= {r1d8,r2d8,r3d8};     double rdk8= rd8[0];for(int i=0;i<3;i++){if(rdk8< rd8[i])  {rdk8 = rd8[i];}rdkl8.setText(""+String.format("%.2f",rdk8));}     rdkh8.setText(""+String.format("%.2f",r4d8));
        double [] rd9= {r1d9,r2d9,r3d9};     double rdk9= rd9[0];for(int i=0;i<3;i++){if(rdk9< rd9[i])  {rdk9 = rd9[i];}rdkl9.setText(""+String.format("%.2f",rdk9));}     rdkh9.setText(""+String.format("%.2f",r4d9));
        double [] rd10= {r1d10,r2d10,r3d10}; double rdk10= rd10[0];for(int i=0;i<3;i++){if(rdk10< rd10[i])  {rdk10 = rd10[i];}rdkl10.setText(""+String.format("%.2f",rdk10));}     rdkh10.setText(""+String.format("%.2f",r4d10));
        double [] rd11= {r1d11,r2d11,r3d11}; double rdk11= rd11[0];for(int i=0;i<3;i++){if(rdk11< rd11[i])  {rdk11 = rd11[i];}rdkl11.setText(""+String.format("%.2f",rdk11));}     rdkh11.setText(""+String.format("%.2f",r4d11));
        double [] rd12= {r1d12,r2d12,r3d12}; double rdk12= rd12[0];for(int i=0;i<3;i++){if(rdk12< rd12[i])  {rdk12 = rd12[i];}rdkl12.setText(""+String.format("%.2f",rdk12));}     rdkh12.setText(""+String.format("%.2f",r4d12));
        double [] rd13= {r1d13,r2d13,r3d13}; double rdk13= rd13[0];for(int i=0;i<3;i++){if(rdk13< rd13[i])  {rdk13 = rd13[i];}rdkl13.setText(""+String.format("%.2f",rdk13));}     rdkh13.setText(""+String.format("%.2f",r4d13));
        double [] rd14= {r1d14,r2d14,r3d14}; double rdk14= rd14[0];for(int i=0;i<3;i++){if(rdk14< rd14[i])  {rdk14 = rd14[i];}rdkl14.setText(""+String.format("%.2f",rdk14));}     rdkh14.setText(""+String.format("%.2f",r4d14));
        double [] rd15= {r1d15,r2d15,r3d15}; double rdk15= rd15[0];for(int i=0;i<3;i++){if(rdk15< rd15[i])  {rdk15 = rd15[i];}rdkl15.setText(""+String.format("%.2f",rdk15));}     rdkh15.setText(""+String.format("%.2f",r4d15));
        double [] rd16= {r1d16,r2d16,r3d16}; double rdk16= rd16[0];for(int i=0;i<3;i++){if(rdk16< rd16[i])  {rdk16 = rd16[i];}rdkl16.setText(""+String.format("%.2f",rdk16));}     rdkh16.setText(""+String.format("%.2f",r4d16));
        double [] rd17= {r1d17,r2d17,r3d17}; double rdk17= rd17[0];for(int i=0;i<3;i++){if(rdk17< rd17[i])  {rdk17 = rd17[i];}rdkl17.setText(""+String.format("%.2f",rdk17));}     rdkh17.setText(""+String.format("%.2f",r4d17));
        double [] rd18= {r1d18,r2d18,r3d18}; double rdk18= rd18[0];for(int i=0;i<3;i++){if(rdk18< rd18[i])  {rdk18 = rd18[i];}rdkl18.setText(""+String.format("%.2f",rdk18));}     rdkh18.setText(""+String.format("%.2f",r4d18));
        double [] rd19= {r1d19,r2d19,r3d19}; double rdk19= rd19[0];for(int i=0;i<3;i++){if(rdk19< rd19[i])  {rdk19 = rd19[i];}rdkl19.setText(""+String.format("%.2f",rdk19));}     rdkh19.setText(""+String.format("%.2f",r4d19));
        double [] rd20= {r1d20,r2d20,r3d20}; double rdk20= rd20[0];for(int i=0;i<3;i++){if(rdk20< rd20[i])  {rdk20 = rd20[i];}rdkl20.setText(""+String.format("%.2f",rdk20));}     rdkh20.setText(""+String.format("%.2f",r4d20));
        double [] rd21= {r1d21,r2d21,r3d21}; double rdk21= rd21[0];for(int i=0;i<3;i++){if(rdk21< rd21[i])  {rdk21 = rd21[i];}rdkl21.setText(""+String.format("%.2f",rdk21));}     rdkh21.setText(""+String.format("%.2f",r4d21));
        double [] rd22= {r1d22,r2d22,r3d22}; double rdk22= rd22[0];for(int i=0;i<3;i++){if(rdk22< rd22[i])  {rdk22 = rd22[i];}rdkl22.setText(""+String.format("%.2f",rdk22));}     rdkh22.setText(""+String.format("%.2f",r4d22));
        double [] rd23= {r1d23,r2d23,r3d23}; double rdk23= rd23[0];for(int i=0;i<3;i++){if(rdk23< rd23[i])  {rdk23 = rd23[i];}rdkl23.setText(""+String.format("%.2f",rdk23));}     rdkh23.setText(""+String.format("%.2f",r4d23));
        double [] rd24= {r1d24,r2d24,r3d24}; double rdk24= rd24[0];for(int i=0;i<3;i++){if(rdk24< rd24[i])  {rdk24 = rd24[i];}rdkl24.setText(""+String.format("%.2f",rdk24));}     rdkh24.setText(""+String.format("%.2f",r4d24));
        double [] rd25= {r1d25,r2d25,r3d25}; double rdk25= rd25[0];for(int i=0;i<3;i++){if(rdk25< rd25[i])  {rdk25 = rd25[i];}rdkl25.setText(""+String.format("%.2f",rdk25));}     rdkh25.setText(""+String.format("%.2f",r4d25));
        double [] rd26= {r1d26,r2d26,r3d26}; double rdk26= rd26[0];for(int i=0;i<3;i++){if(rdk26< rd26[i])  {rdk26 = rd26[i];}rdkl26.setText(""+String.format("%.2f",rdk26));}     rdkh26.setText(""+String.format("%.2f",r4d26));
        double [] rd27= {r1d27,r2d27,r3d27}; double rdk27= rd27[0];for(int i=0;i<3;i++){if(rdk27< rd27[i])  {rdk27 = rd27[i];}rdkl27.setText(""+String.format("%.2f",rdk27));}     rdkh27.setText(""+String.format("%.2f",r4d27));
      //komposisi rulle rc
        double [] rc1= {r1c1,r2c1}; double rck1 = rc1[0];for(int i=0;i<2;i++){if(rck1 < rc1[i])  {rck1 = rc1[i];}rckl1.setText(""+String.format("%.2f",rck1));}     
        double [] rc2= {r1c2,r2c2}; double rck2= rc2[0];for(int i=0;i<2;i++){if(rck2< rc2[i])  {rck2 = rc2[i];}rckl2.setText(""+String.format("%.2f",rck2));}     
        double [] rc3= {r1c3,r2c3}; double rck3= rc3[0];for(int i=0;i<2;i++){if(rck3< rc3[i])  {rck3 = rc3[i];}rckl3.setText(""+String.format("%.2f",rck3));}     
        double [] rc4= {r1c4,r2c4}; double rck4= rc4[0];for(int i=0;i<2;i++){if(rck4< rc4[i])  {rck4 = rc4[i];}rckl4.setText(""+String.format("%.2f",rck4));}    
        double [] rc5= {r1c5,r2c5}; double rck5= rc5[0];for(int i=0;i<2;i++){if(rck5< rc5[i])  {rck5 = rc5[i];}rckl5.setText(""+String.format("%.2f",rck5));}     
        double [] rc6= {r1c6,r2c6}; double rck6= rc6[0];for(int i=0;i<2;i++){if(rck6< rc6[i])  {rck6 = rc6[i];}rckl6.setText(""+String.format("%.2f",rck6));}     
        double [] rc7= {r1c7,r2c7}; double rck7= rc7[0];for(int i=0;i<2;i++){if(rck7< rc7[i])  {rck7 = rc7[i];}rckl7.setText(""+String.format("%.2f",rck7));}     
        double [] rc8= {r1c8,r2c8}; double rck8= rc8[0];for(int i=0;i<2;i++){if(rck8< rc8[i])  {rck8 = rc8[i];}rckl8.setText(""+String.format("%.2f",rck8));}     
        double [] rc9= {r1c9,r2c9}; double rck9= rc9[0];for(int i=0;i<2;i++){if(rck9< rc9[i])  {rck9 = rc9[i];}rckl9.setText(""+String.format("%.2f",rck9));}     
        double [] rc10= {r1c10,r2c10}; double rck10= rc10[0];for(int i=0;i<2;i++){if(rck10< rc10[i])  {rck10 = rc10[i];}rckl10.setText(""+String.format("%.2f",rck10));}     
        double [] rc11= {r1c11,r2c11}; double rck11= rc11[0];for(int i=0;i<2;i++){if(rck11< rc11[i])  {rck11 = rc11[i];}rckl11.setText(""+String.format("%.2f",rck11));}     
        double [] rc12= {r1c12,r2c12}; double rck12= rc12[0];for(int i=0;i<2;i++){if(rck12< rc12[i])  {rck12 = rc12[i];}rckl12.setText(""+String.format("%.2f",rck12));}     
        double [] rc13= {r1c13,r2c13}; double rck13= rc13[0];for(int i=0;i<2;i++){if(rck13< rc13[i])  {rck13 = rc13[i];}rckl13.setText(""+String.format("%.2f",rck13));}     
        double [] rc14= {r1c14,r2c14}; double rck14= rc14[0];for(int i=0;i<2;i++){if(rck14< rc14[i])  {rck14 = rc14[i];}rckl14.setText(""+String.format("%.2f",rck14));}     
        double [] rc15= {r1c15,r2c15}; double rck15= rc15[0];for(int i=0;i<2;i++){if(rck15< rc15[i])  {rck15 = rc15[i];}rckl15.setText(""+String.format("%.2f",rck15));}     
        double [] rc16= {r1c16,r2c16}; double rck16= rc16[0];for(int i=0;i<2;i++){if(rck16< rc16[i])  {rck16 = rc16[i];}rckl16.setText(""+String.format("%.2f",rck16));}     
        double [] rc17= {r1c17,r2c17}; double rck17= rc17[0];for(int i=0;i<2;i++){if(rck17< rc17[i])  {rck17 = rc17[i];}rckl17.setText(""+String.format("%.2f",rck17));}     
        double [] rc18= {r1c18,r2c18}; double rck18= rc18[0];for(int i=0;i<2;i++){if(rck18< rc18[i])  {rck18 = rc18[i];}rckl18.setText(""+String.format("%.2f",rck18));}     
        double [] rc19= {r1c19,r2c19}; double rck19= rc19[0];for(int i=0;i<2;i++){if(rck19< rc19[i])  {rck19 = rc19[i];}rckl19.setText(""+String.format("%.2f",rck19));}     
        double [] rc20= {r1c20,r2c20}; double rck20= rc20[0];for(int i=0;i<2;i++){if(rck20< rc20[i])  {rck20 = rc20[i];}rckl20.setText(""+String.format("%.2f",rck20));}     
        double [] rc21= {r1c21,r2c21}; double rck21= rc21[0];for(int i=0;i<2;i++){if(rck21< rc21[i])  {rck21 = rc21[i];}rckl21.setText(""+String.format("%.2f",rck21));}     
        double [] rc22= {r1c22,r2c22}; double rck22= rc22[0];for(int i=0;i<2;i++){if(rck22< rc22[i])  {rck22 = rc22[i];}rckl22.setText(""+String.format("%.2f",rck22));}     
        double [] rc23= {r1c23,r2c23}; double rck23= rc23[0];for(int i=0;i<2;i++){if(rck23< rc23[i])  {rck23 = rc23[i];}rckl23.setText(""+String.format("%.2f",rck23));}     
        double [] rc24= {r1c24,r2c24}; double rck24= rc24[0];for(int i=0;i<2;i++){if(rck24< rc24[i])  {rck24 = rc24[i];}rckl24.setText(""+String.format("%.2f",rck24));}     
        double [] rc25= {r1c25,r2c25}; double rck25= rc25[0];for(int i=0;i<2;i++){if(rck25< rc25[i])  {rck25 = rc25[i];}rckl25.setText(""+String.format("%.2f",rck25));}     
        double [] rc26= {r1c26,r2c26}; double rck26= rc26[0];for(int i=0;i<2;i++){if(rck26< rc26[i])  {rck26 = rc26[i];}rckl26.setText(""+String.format("%.2f",rck26));}     
        double [] rc27= {r1c27,r2c27}; double rck27= rc27[0];for(int i=0;i<2;i++){if(rck27< rc27[i])  {rck27 = rc27[i];}rckl27.setText(""+String.format("%.2f",rck27));}

        double [] r_2c1= {r3c1,r4c1}; double rc2k1 = r_2c1[0];for(int i=0;i<2;i++){if(rc2k1< r_2c1[i])  {rc2k1 = r_2c1[i];}rckh1.setText(""+String.format("%.2f",rc2k1));}     
        double [] r_2c2= {r3c2,r4c2}; double rc2k2= r_2c2[0];for(int i=0;i<2;i++){if(rc2k2< r_2c2[i])  {rc2k2 = r_2c2[i];}rckh2.setText(""+String.format("%.2f",rc2k2));}     
        double [] r_2c3= {r3c3,r4c3}; double rc2k3= r_2c3[0];for(int i=0;i<2;i++){if(rc2k3< r_2c3[i])  {rc2k3 = r_2c3[i];}rckh3.setText(""+String.format("%.2f",rc2k3));}     
        double [] r_2c4= {r3c4,r4c4}; double rc2k4= r_2c4[0];for(int i=0;i<2;i++){if(rc2k4< r_2c4[i])  {rc2k4 = r_2c4[i];}rckh4.setText(""+String.format("%.2f",rc2k4));}    
        double [] r_2c5= {r3c5,r4c5}; double rc2k5= r_2c5[0];for(int i=0;i<2;i++){if(rc2k5< r_2c5[i])  {rc2k5 = r_2c5[i];}rckh5.setText(""+String.format("%.2f",rc2k5));}     
        double [] r_2c6= {r3c6,r4c6}; double rc2k6= r_2c6[0];for(int i=0;i<2;i++){if(rc2k6< r_2c6[i])  {rc2k6 = r_2c6[i];}rckh6.setText(""+String.format("%.2f",rc2k6));}     
        double [] r_2c7= {r3c7,r4c7}; double rc2k7= r_2c7[0];for(int i=0;i<2;i++){if(rc2k7< r_2c7[i])  {rc2k7 = r_2c7[i];}rckh7.setText(""+String.format("%.2f",rc2k7));}     
        double [] r_2c8= {r3c8,r4c8}; double rc2k8= r_2c8[0];for(int i=0;i<2;i++){if(rc2k8< r_2c8[i])  {rc2k8 = r_2c8[i];}rckh8.setText(""+String.format("%.2f",rc2k8));}     
        double [] r_2c9= {r3c9,r4c9}; double rc2k9= r_2c9[0];for(int i=0;i<2;i++){if(rc2k9< r_2c9[i])  {rc2k9 = r_2c9[i];}rckh9.setText(""+String.format("%.2f",rc2k9));}     
        double [] r_2c10= {r3c10,r4c10}; double rc2k10= r_2c10[0];for(int i=0;i<2;i++){if(rc2k10< r_2c10[i])  {rc2k10 = r_2c10[i];}rckh10.setText(""+String.format("%.2f",rc2k10));}     
        double [] r_2c11= {r3c11,r4c11}; double rc2k11= r_2c11[0];for(int i=0;i<2;i++){if(rc2k11< r_2c11[i])  {rc2k11 = r_2c11[i];}rckh11.setText(""+String.format("%.2f",rc2k11));}     
        double [] r_2c12= {r3c12,r4c12}; double rc2k12= r_2c12[0];for(int i=0;i<2;i++){if(rc2k12< r_2c12[i])  {rc2k12 = r_2c12[i];}rckh12.setText(""+String.format("%.2f",rc2k12));}     
        double [] r_2c13= {r3c13,r4c13}; double rc2k13= r_2c13[0];for(int i=0;i<2;i++){if(rc2k13< r_2c13[i])  {rc2k13 = r_2c13[i];}rckh13.setText(""+String.format("%.2f",rc2k13));}     
        double [] r_2c14= {r3c14,r4c14}; double rc2k14= r_2c14[0];for(int i=0;i<2;i++){if(rc2k14< r_2c14[i])  {rc2k14 = r_2c14[i];}rckh14.setText(""+String.format("%.2f",rc2k14));}     
        double [] r_2c15= {r3c15,r4c15}; double rc2k15= r_2c15[0];for(int i=0;i<2;i++){if(rc2k15< r_2c15[i])  {rc2k15 = r_2c15[i];}rckh15.setText(""+String.format("%.2f",rc2k15));}     
        double [] r_2c16= {r3c16,r4c16}; double rc2k16= r_2c16[0];for(int i=0;i<2;i++){if(rc2k16< r_2c16[i])  {rc2k16 = r_2c16[i];}rckh16.setText(""+String.format("%.2f",rc2k16));}     
        double [] r_2c17= {r3c17,r4c17}; double rc2k17= r_2c17[0];for(int i=0;i<2;i++){if(rc2k17< r_2c17[i])  {rc2k17 = r_2c17[i];}rckh17.setText(""+String.format("%.2f",rc2k17));}     
        double [] r_2c18= {r3c18,r4c18}; double rc2k18= r_2c18[0];for(int i=0;i<2;i++){if(rc2k18< r_2c18[i])  {rc2k18 = r_2c18[i];}rckh18.setText(""+String.format("%.2f",rc2k18));}     
        double [] r_2c19= {r3c19,r4c19}; double rc2k19= r_2c19[0];for(int i=0;i<2;i++){if(rc2k19< r_2c19[i])  {rc2k19 = r_2c19[i];}rckh19.setText(""+String.format("%.2f",rc2k19));}     
        double [] r_2c20= {r3c20,r4c20}; double rc2k20= r_2c20[0];for(int i=0;i<2;i++){if(rc2k20< r_2c20[i])  {rc2k20 = r_2c20[i];}rckh20.setText(""+String.format("%.2f",rc2k20));}     
        double [] r_2c21= {r3c21,r4c21}; double rc2k21= r_2c21[0];for(int i=0;i<2;i++){if(rc2k21< r_2c21[i])  {rc2k21 = r_2c21[i];}rckh21.setText(""+String.format("%.2f",rc2k21));}     
        double [] r_2c22= {r3c22,r4c22}; double rc2k22= r_2c22[0];for(int i=0;i<2;i++){if(rc2k22< r_2c22[i])  {rc2k22 = r_2c22[i];}rckh22.setText(""+String.format("%.2f",rc2k22));}     
        double [] r_2c23= {r3c23,r4c23}; double rc2k23= r_2c23[0];for(int i=0;i<2;i++){if(rc2k23< r_2c23[i])  {rc2k23 = r_2c23[i];}rckh23.setText(""+String.format("%.2f",rc2k23));}     
        double [] r_2c24= {r3c24,r4c24}; double rc2k24= r_2c24[0];for(int i=0;i<2;i++){if(rc2k24< r_2c24[i])  {rc2k24 = r_2c24[i];}rckh24.setText(""+String.format("%.2f",rc2k24));}     
        double [] r_2c25= {r3c25,r4c25}; double rc2k25= r_2c25[0];for(int i=0;i<2;i++){if(rc2k25< r_2c25[i])  {rc2k25 = r_2c25[i];}rckh25.setText(""+String.format("%.2f",rc2k25));}     
        double [] r_2c26= {r3c26,r4c26}; double rc2k26= r_2c26[0];for(int i=0;i<2;i++){if(rc2k26< r_2c26[i])  {rc2k26 = r_2c26[i];}rckh26.setText(""+String.format("%.2f",rc2k26));}     
        double [] r_2c27= {r3c27,r4c27}; double rc2k27= r_2c27[0];for(int i=0;i<2;i++){if(rc2k27< r_2c27[i])  {rc2k27 = r_2c27[i];}rckh27.setText(""+String.format("%.2f",rc2k27));}

        
        z1rd1.setText(""+String.format("%.2f",z1rd(rdk1)));  z2rd1.setText(""+String.format("%.2f",z2rd(r4d1)));  z1rc1.setText(""+String.format("%.2f",z1rc(rck1)));  z2rc1.setText(""+String.format("%.2f",z2rc(rc2k1)));
        z1rd2.setText(""+String.format("%.2f",z1rd(rdk2)));  z2rd2.setText(""+String.format("%.2f",z2rd(r4d2)));  z1rc2.setText(""+String.format("%.2f",z1rc(rck2)));  z2rc2.setText(""+String.format("%.2f",z2rc(rc2k2)));
        z1rd3.setText(""+String.format("%.2f",z1rd(rdk3)));  z2rd3.setText(""+String.format("%.2f",z2rd(r4d3)));  z1rc3.setText(""+String.format("%.2f",z1rc(rck3)));  z2rc3.setText(""+String.format("%.2f",z2rc(rc2k3)));
        z1rd4.setText(""+String.format("%.2f",z1rd(rdk4)));  z2rd4.setText(""+String.format("%.2f",z2rd(r4d4)));  z1rc4.setText(""+String.format("%.2f",z1rc(rck4)));  z2rc4.setText(""+String.format("%.2f",z2rc(rc2k4)));
        z1rd5.setText(""+String.format("%.2f",z1rd(rdk5)));  z2rd5.setText(""+String.format("%.2f",z2rd(r4d5)));  z1rc5.setText(""+String.format("%.2f",z1rc(rck5)));  z2rc5.setText(""+String.format("%.2f",z2rc(rc2k5)));
        z1rd6.setText(""+String.format("%.2f",z1rd(rdk6)));  z2rd6.setText(""+String.format("%.2f",z2rd(r4d6)));  z1rc6.setText(""+String.format("%.2f",z1rc(rck6)));  z2rc6.setText(""+String.format("%.2f",z2rc(rc2k6)));
        z1rd7.setText(""+String.format("%.2f",z1rd(rdk7)));  z2rd7.setText(""+String.format("%.2f",z2rd(r4d7)));  z1rc7.setText(""+String.format("%.2f",z1rc(rck7)));  z2rc7.setText(""+String.format("%.2f",z2rc(rc2k7)));
        z1rd8.setText(""+String.format("%.2f",z1rd(rdk8)));  z2rd8.setText(""+String.format("%.2f",z2rd(r4d8)));  z1rc8.setText(""+String.format("%.2f",z1rc(rck8)));  z2rc8.setText(""+String.format("%.2f",z2rc(rc2k8)));
        z1rd9.setText(""+String.format("%.2f",z1rd(rdk9)));  z2rd9.setText(""+String.format("%.2f",z2rd(r4d9)));  z1rc9.setText(""+String.format("%.2f",z1rc(rck9)));  z2rc9.setText(""+String.format("%.2f",z2rc(rc2k9)));
        z1rd10.setText(""+String.format("%.2f",z1rd(rdk10)));  z2rd10.setText(""+String.format("%.2f",z2rd(r4d10)));  z1rc10.setText(""+String.format("%.2f",z1rc(rck10)));  z2rc10.setText(""+String.format("%.2f",z2rc(rc2k10)));
        z1rd11.setText(""+String.format("%.2f",z1rd(rdk11)));  z2rd11.setText(""+String.format("%.2f",z2rd(r4d11)));  z1rc11.setText(""+String.format("%.2f",z1rc(rck11)));  z2rc11.setText(""+String.format("%.2f",z2rc(rc2k11)));
        z1rd12.setText(""+String.format("%.2f",z1rd(rdk12)));  z2rd12.setText(""+String.format("%.2f",z2rd(r4d12)));  z1rc12.setText(""+String.format("%.2f",z1rc(rck12)));  z2rc12.setText(""+String.format("%.2f",z2rc(rc2k12)));
        z1rd13.setText(""+String.format("%.2f",z1rd(rdk13)));  z2rd13.setText(""+String.format("%.2f",z2rd(r4d13)));  z1rc13.setText(""+String.format("%.2f",z1rc(rck13)));  z2rc13.setText(""+String.format("%.2f",z2rc(rc2k13)));
        z1rd14.setText(""+String.format("%.2f",z1rd(rdk14)));  z2rd14.setText(""+String.format("%.2f",z2rd(r4d14)));  z1rc14.setText(""+String.format("%.2f",z1rc(rck14)));  z2rc14.setText(""+String.format("%.2f",z2rc(rc2k14)));
        z1rd15.setText(""+String.format("%.2f",z1rd(rdk15)));  z2rd15.setText(""+String.format("%.2f",z2rd(r4d15)));  z1rc15.setText(""+String.format("%.2f",z1rc(rck15)));  z2rc15.setText(""+String.format("%.2f",z2rc(rc2k15)));
        z1rd16.setText(""+String.format("%.2f",z1rd(rdk16)));  z2rd16.setText(""+String.format("%.2f",z2rd(r4d16)));  z1rc16.setText(""+String.format("%.2f",z1rc(rck16)));  z2rc16.setText(""+String.format("%.2f",z2rc(rc2k16)));
        z1rd17.setText(""+String.format("%.2f",z1rd(rdk17)));  z2rd17.setText(""+String.format("%.2f",z2rd(r4d17)));  z1rc17.setText(""+String.format("%.2f",z1rc(rck17)));  z2rc17.setText(""+String.format("%.2f",z2rc(rc2k17)));
        z1rd18.setText(""+String.format("%.2f",z1rd(rdk18)));  z2rd18.setText(""+String.format("%.2f",z2rd(r4d18)));  z1rc18.setText(""+String.format("%.2f",z1rc(rck18)));  z2rc18.setText(""+String.format("%.2f",z2rc(rc2k18)));
        z1rd19.setText(""+String.format("%.2f",z1rd(rdk19)));  z2rd19.setText(""+String.format("%.2f",z2rd(r4d19)));  z1rc19.setText(""+String.format("%.2f",z1rc(rck19)));  z2rc19.setText(""+String.format("%.2f",z2rc(rc2k19)));
        z1rd20.setText(""+String.format("%.2f",z1rd(rdk20)));  z2rd20.setText(""+String.format("%.2f",z2rd(r4d20)));  z1rc20.setText(""+String.format("%.2f",z1rc(rck20)));  z2rc20.setText(""+String.format("%.2f",z2rc(rc2k20)));
        z1rd21.setText(""+String.format("%.2f",z1rd(rdk21)));  z2rd21.setText(""+String.format("%.2f",z2rd(r4d21)));  z1rc21.setText(""+String.format("%.2f",z1rc(rck21)));  z2rc21.setText(""+String.format("%.2f",z2rc(rc2k21)));
        z1rd22.setText(""+String.format("%.2f",z1rd(rdk22)));  z2rd22.setText(""+String.format("%.2f",z2rd(r4d22)));  z1rc22.setText(""+String.format("%.2f",z1rc(rck22)));  z2rc22.setText(""+String.format("%.2f",z2rc(rc2k22)));
        z1rd23.setText(""+String.format("%.2f",z1rd(rdk23)));  z2rd23.setText(""+String.format("%.2f",z2rd(r4d23)));  z1rc23.setText(""+String.format("%.2f",z1rc(rck23)));  z2rc23.setText(""+String.format("%.2f",z2rc(rc2k23)));
        z1rd24.setText(""+String.format("%.2f",z1rd(rdk24)));  z2rd24.setText(""+String.format("%.2f",z2rd(r4d24)));  z1rc24.setText(""+String.format("%.2f",z1rc(rck24)));  z2rc24.setText(""+String.format("%.2f",z2rc(rc2k24)));
        z1rd25.setText(""+String.format("%.2f",z1rd(rdk25)));  z2rd25.setText(""+String.format("%.2f",z2rd(r4d25)));  z1rc25.setText(""+String.format("%.2f",z1rc(rck25)));  z2rc25.setText(""+String.format("%.2f",z2rc(rc2k25)));
        z1rd26.setText(""+String.format("%.2f",z1rd(rdk26)));  z2rd26.setText(""+String.format("%.2f",z2rd(r4d26)));  z1rc26.setText(""+String.format("%.2f",z1rc(rck26)));  z2rc26.setText(""+String.format("%.2f",z2rc(rc2k26)));
        z1rd27.setText(""+String.format("%.2f",z1rd(rdk27)));  z2rd27.setText(""+String.format("%.2f",z2rd(r4d27)));  z1rc27.setText(""+String.format("%.2f",z1rc(rck27)));  z2rc27.setText(""+String.format("%.2f",z2rc(rc2k27)));

        //defuzzyfikasi
        double dfd1,dfd2,dfd3,dfd4,dfd5,dfd6,dfd7,dfd8,dfd9,dfd10,dfd11,dfd12,dfd13,dfd14,dfd15,dfd16,dfd17,dfd18,dfd19,dfd20,dfd21,dfd22,dfd23,dfd24,dfd25,dfd26,dfd27;
        double dfc1,dfc2,dfc3,dfc4,dfc5,dfc6,dfc7,dfc8,dfc9,dfc10,dfc11,dfc12,dfc13,dfc14,dfc15,dfc16,dfc17,dfc18,dfc19,dfc20,dfc21,dfc22,dfc23,dfc24,dfc25,dfc26,dfc27;dfd1=((rdk1*(z1rd(rdk1)))+(r4d1*z2rd(r4d1)))/(rdk1+r4d1); dfrd1.setText(""+String.format("%.2f",dfd1));
            dfd2=((rdk2*(z1rd(rdk2)))+(r4d2*z2rd(r4d2)))/(rdk2+r4d2); dfrd2.setText(""+String.format("%.2f",dfd2));
            dfd3=((rdk3*(z1rd(rdk3)))+(r4d3*z2rd(r4d3)))/(rdk3+r4d3); dfrd3.setText(""+String.format("%.2f",dfd3));
            dfd4=((rdk4*(z1rd(rdk4)))+(r4d4*z2rd(r4d4)))/(rdk4+r4d4); dfrd4.setText(""+String.format("%.2f",dfd4));
            dfd5=((rdk5*(z1rd(rdk5)))+(r4d5*z2rd(r4d5)))/(rdk5+r4d5); dfrd5.setText(""+String.format("%.2f",dfd5));
            dfd6=((rdk6*(z1rd(rdk6)))+(r4d6*z2rd(r4d6)))/(rdk6+r4d6); dfrd6.setText(""+String.format("%.2f",dfd6));
            dfd7=((rdk7*(z1rd(rdk7)))+(r4d7*z2rd(r4d7)))/(rdk7+r4d7); dfrd7.setText(""+String.format("%.2f",dfd7));
            dfd8=((rdk8*(z1rd(rdk8)))+(r4d8*z2rd(r4d8)))/(rdk8+r4d8); dfrd8.setText(""+String.format("%.2f",dfd8));
            dfd9=((rdk9*(z1rd(rdk9)))+(r4d9*z2rd(r4d9)))/(rdk9+r4d9); dfrd9.setText(""+String.format("%.2f",dfd9));
            dfd10=((rdk10*(z1rd(rdk10)))+(r4d10*z2rd(r4d10)))/(rdk10+r4d10); dfrd10.setText(""+String.format("%.2f",dfd10));
            dfd11=((rdk11*(z1rd(rdk11)))+(r4d11*z2rd(r4d11)))/(rdk11+r4d11); dfrd11.setText(""+String.format("%.2f",dfd11));
            dfd12=((rdk12*(z1rd(rdk12)))+(r4d12*z2rd(r4d12)))/(rdk12+r4d12); dfrd12.setText(""+String.format("%.2f",dfd12));
            dfd13=((rdk13*(z1rd(rdk13)))+(r4d13*z2rd(r4d13)))/(rdk13+r4d13); dfrd13.setText(""+String.format("%.2f",dfd13));
            dfd14=((rdk14*(z1rd(rdk14)))+(r4d14*z2rd(r4d14)))/(rdk14+r4d14); dfrd14.setText(""+String.format("%.2f",dfd14));
            dfd15=((rdk15*(z1rd(rdk15)))+(r4d15*z2rd(r4d15)))/(rdk15+r4d15); dfrd15.setText(""+String.format("%.2f",dfd15));
            dfd16=((rdk16*(z1rd(rdk16)))+(r4d16*z2rd(r4d16)))/(rdk16+r4d16); dfrd16.setText(""+String.format("%.2f",dfd16));
            dfd17=((rdk17*(z1rd(rdk17)))+(r4d17*z2rd(r4d17)))/(rdk17+r4d17); dfrd17.setText(""+String.format("%.2f",dfd17));
            dfd18=((rdk18*(z1rd(rdk18)))+(r4d18*z2rd(r4d18)))/(rdk18+r4d18); dfrd18.setText(""+String.format("%.2f",dfd18));
            dfd19=((rdk19*(z1rd(rdk19)))+(r4d19*z2rd(r4d19)))/(rdk19+r4d19); dfrd19.setText(""+String.format("%.2f",dfd19));
            dfd20=((rdk20*(z1rd(rdk20)))+(r4d20*z2rd(r4d20)))/(rdk20+r4d20); dfrd20.setText(""+String.format("%.2f",dfd20));
            dfd21=((rdk21*(z1rd(rdk21)))+(r4d21*z2rd(r4d21)))/(rdk21+r4d21); dfrd21.setText(""+String.format("%.2f",dfd21));
            dfd22=((rdk22*(z1rd(rdk22)))+(r4d22*z2rd(r4d22)))/(rdk22+r4d22); dfrd22.setText(""+String.format("%.2f",dfd22));
            dfd23=((rdk23*(z1rd(rdk23)))+(r4d23*z2rd(r4d23)))/(rdk23+r4d23); dfrd23.setText(""+String.format("%.2f",dfd23));
            dfd24=((rdk24*(z1rd(rdk24)))+(r4d24*z2rd(r4d24)))/(rdk24+r4d24); dfrd24.setText(""+String.format("%.2f",dfd24));
            dfd25=((rdk25*(z1rd(rdk25)))+(r4d25*z2rd(r4d25)))/(rdk25+r4d25); dfrd25.setText(""+String.format("%.2f",dfd25));
            dfd26=((rdk26*(z1rd(rdk26)))+(r4d26*z2rd(r4d26)))/(rdk26+r4d26); dfrd26.setText(""+String.format("%.2f",dfd26));
            dfd27=((rdk27*(z1rd(rdk27)))+(r4d27*z2rd(r4d27)))/(rdk27+r4d27); dfrd27.setText(""+String.format("%.2f",dfd27));
        
            dfc1=((rck1*(z1rc(rck1)))+(r4c1*z2rc(r4c1)))/(rck1+r4c1); dfrc1.setText(""+String.format("%.2f",dfc1));
            dfc2=((rck2*(z1rc(rck2)))+(r4c2*z2rc(r4c2)))/(rck2+r4c2); dfrc2.setText(""+String.format("%.2f",dfc2));
            dfc3=((rck3*(z1rc(rck3)))+(r4c3*z2rc(r4c3)))/(rck3+r4c3); dfrc3.setText(""+String.format("%.2f",dfc3));
            dfc4=((rck4*(z1rc(rck4)))+(r4c4*z2rc(r4c4)))/(rck4+r4c4); dfrc4.setText(""+String.format("%.2f",dfc4));
            dfc5=((rck5*(z1rc(rck5)))+(r4c5*z2rc(r4c5)))/(rck5+r4c5); dfrc5.setText(""+String.format("%.2f",dfc5));
            dfc6=((rck6*(z1rc(rck6)))+(r4c6*z2rc(r4c6)))/(rck6+r4c6); dfrc6.setText(""+String.format("%.2f",dfc6));
            dfc7=((rck7*(z1rc(rck7)))+(r4c7*z2rc(r4c7)))/(rck7+r4c7); dfrc7.setText(""+String.format("%.2f",dfc7));
            dfc8=((rck8*(z1rc(rck8)))+(r4c8*z2rc(r4c8)))/(rck8+r4c8); dfrc8.setText(""+String.format("%.2f",dfc8));
            dfc9=((rck9*(z1rc(rck9)))+(r4c9*z2rc(r4c9)))/(rck9+r4c9); dfrc9.setText(""+String.format("%.2f",dfc9));
            dfc10=((rck10*(z1rc(rck10)))+(r4c10*z2rc(r4c10)))/(rck10+r4c10); dfrc10.setText(""+String.format("%.2f",dfc10));
            dfc11=((rck11*(z1rc(rck11)))+(r4c11*z2rc(r4c11)))/(rck11+r4c11); dfrc11.setText(""+String.format("%.2f",dfc11));
            dfc12=((rck12*(z1rc(rck12)))+(r4c12*z2rc(r4c12)))/(rck12+r4c12); dfrc12.setText(""+String.format("%.2f",dfc12));
            dfc13=((rck13*(z1rc(rck13)))+(r4c13*z2rc(r4c13)))/(rck13+r4c13); dfrc13.setText(""+String.format("%.2f",dfc13));
            dfc14=((rck14*(z1rc(rck14)))+(r4c14*z2rc(r4c14)))/(rck14+r4c14); dfrc14.setText(""+String.format("%.2f",dfc14));
            dfc15=((rck15*(z1rc(rck15)))+(r4c15*z2rc(r4c15)))/(rck15+r4c15); dfrc15.setText(""+String.format("%.2f",dfc15));
            dfc16=((rck16*(z1rc(rck16)))+(r4c16*z2rc(r4c16)))/(rck16+r4c16); dfrc16.setText(""+String.format("%.2f",dfc16));
            dfc17=((rck17*(z1rc(rck17)))+(r4c17*z2rc(r4c17)))/(rck17+r4c17); dfrc17.setText(""+String.format("%.2f",dfc17));
            dfc18=((rck18*(z1rc(rck18)))+(r4c18*z2rc(r4c18)))/(rck18+r4c18); dfrc18.setText(""+String.format("%.2f",dfc18));
            dfc19=((rck19*(z1rc(rck19)))+(r4c19*z2rc(r4c19)))/(rck19+r4c19); dfrc19.setText(""+String.format("%.2f",dfc19));
            dfc20=((rck20*(z1rc(rck20)))+(r4c20*z2rc(r4c20)))/(rck20+r4c20); dfrc20.setText(""+String.format("%.2f",dfc20));
            dfc21=((rck21*(z1rc(rck21)))+(r4c21*z2rc(r4c21)))/(rck21+r4c21); dfrc21.setText(""+String.format("%.2f",dfc21));
            dfc22=((rck22*(z1rc(rck22)))+(r4c22*z2rc(r4c22)))/(rck22+r4c22); dfrc22.setText(""+String.format("%.2f",dfc22));
            dfc23=((rck23*(z1rc(rck23)))+(r4c23*z2rc(r4c23)))/(rck23+r4c23); dfrc23.setText(""+String.format("%.2f",dfc23));
            dfc24=((rck24*(z1rc(rck24)))+(r4c24*z2rc(r4c24)))/(rck24+r4c24); dfrc24.setText(""+String.format("%.2f",dfc24));
            dfc25=((rck25*(z1rc(rck25)))+(r4c25*z2rc(r4c25)))/(rck25+r4c25); dfrc25.setText(""+String.format("%.2f",dfc25));
            dfc26=((rck26*(z1rc(rck26)))+(r4c26*z2rc(r4c26)))/(rck26+r4c26); dfrc26.setText(""+String.format("%.2f",dfc26));
            dfc27=((rck27*(z1rc(rck27)))+(r4c27*z2rc(r4c27)))/(rck27+r4c27); dfrc27.setText(""+String.format("%.2f",dfc27));
        
    }
    
    public void komposisi_jabar(){
    double prd1,prd2,prd3,prd4,prc1,prc2,prc3,prc4;
    prd1=(Double.parseDouble(p_rde1_l.getText()));
    prd2=(Double.parseDouble(p_rde2_l.getText()));
    prd3=(Double.parseDouble(p_rde3_l.getText()));
    prd4=(Double.parseDouble(p_rde4_h.getText()));
    prc1=(Double.parseDouble(p_rce1_l.getText()));
    prc2=(Double.parseDouble(p_rce2_l.getText()));
    prc3=(Double.parseDouble(p_rce3_h.getText()));
    prc4=(Double.parseDouble(p_rce4_h.getText()));
  
    //komposisi rule jabar 
    double [] pd1= {prd1,prd2,prd3};     
        double rdk1= pd1[0];
        for(int i=0;i<3;i++){if(rdk1 < pd1[i])  
        {rdk1 = pd1[i];}
        prdkl.setText(""+String.format("%.2f",rdk1));}     
        prdkh.setText(""+String.format("%.2f",prd4));
   
    double [] pc1= {prc1,prc2};     
        double rck1= pc1[0];
        for(int i=0;i<2;i++){if(rck1 < pc1[i])  
        {rck1 = pc1[i];}
        prckl.setText(""+String.format("%.2f",rck1));}     
        
    
    double [] pc2= {prc3,prc4};     
        double rck2= pc2[0];
        for(int i=0;i<2;i++){if(rck2 < pc2[i])  
        {rck2 = pc2[i];}
        }        
        prckh.setText(""+String.format("%.2f",rck2));
    
    //z1 z2 RD jabar
        double a,b,c,z1rd,z2rd;
            a = (Double.parseDouble(pa_rd.getText()));
            b = (Double.parseDouble(pb_rd.getText()));
            c = b-a;
            z1rd =(-((c*rdk1)-b));
            z2rd =((b*prd4)+a);
            pz1rd.setText(""+String.format("%.2f",z1rd));
            pz2rd.setText(""+String.format("%.2f",z2rd));
        
        double a1,b1,c1,z1rc,z2rc;
            a = (Double.parseDouble(pa_rc.getText()));
            b = (Double.parseDouble(pb_rc.getText()));
            c = b-a;
            z1rc =(-((c*rck1)-b));
            z2rc =((b*rck2)+a);
            pz1rc.setText(""+String.format("%.2f",z1rc));
            pz2rc.setText(""+String.format("%.2f",z2rc));
            
          double dfrd,dfrc;
          
          dfrd =((rdk1*z1rd)+(prd4*z2rd))/(rdk1+prd4);
          dfrc =((rck1*z1rc)+(rck2*z2rc))/(rck1+rck2);
          pdfrd.setText(""+String.format("%.2f",dfrd));
          pdfrc.setText(""+String.format("%.2f",dfrc));
        
    } 
    
    public void klassen (){
    double dfd1,dfd2,dfd3,dfd4,dfd5,dfd6,dfd7,dfd8,dfd9,dfd10,dfd11,dfd12,dfd13,dfd14,dfd15,dfd16,dfd17,dfd18,dfd19,dfd20,dfd21,dfd22,dfd23,dfd24,dfd25,dfd26,dfd27;
    double dfc1,dfc2,dfc3,dfc4,dfc5,dfc6,dfc7,dfc8,dfc9,dfc10,dfc11,dfc12,dfc13,dfc14,dfc15,dfc16,dfc17,dfc18,dfc19,dfc20,dfc21,dfc22,dfc23,dfc24,dfc25,dfc26,dfc27;
        dfc1=(Double.parseDouble(dfrc1.getText()));dfc2=(Double.parseDouble(dfrc2.getText()));dfc3=(Double.parseDouble(dfrc3.getText()));dfc4=(Double.parseDouble(dfrc4.getText()));
        dfc5=(Double.parseDouble(dfrc5.getText()));dfc6=(Double.parseDouble(dfrc6.getText()));dfc7=(Double.parseDouble(dfrc7.getText()));dfc8=(Double.parseDouble(dfrc8.getText()));
        dfc9=(Double.parseDouble(dfrc9.getText()));dfc10=(Double.parseDouble(dfrc10.getText()));dfc11=(Double.parseDouble(dfrc11.getText()));dfc12=(Double.parseDouble(dfrc12.getText()));
        dfc13=(Double.parseDouble(dfrc13.getText()));dfc14=(Double.parseDouble(dfrc14.getText()));dfc15=(Double.parseDouble(dfrc15.getText()));dfc16=(Double.parseDouble(dfrc16.getText()));
        dfc17=(Double.parseDouble(dfrc17.getText()));dfc18=(Double.parseDouble(dfrc18.getText()));dfc19=(Double.parseDouble(dfrc19.getText()));dfc20=(Double.parseDouble(dfrc20.getText()));
        dfc21=(Double.parseDouble(dfrc21.getText()));dfc22=(Double.parseDouble(dfrc22.getText()));dfc23=(Double.parseDouble(dfrc23.getText()));dfc24=(Double.parseDouble(dfrc24.getText()));
        dfc25=(Double.parseDouble(dfrc25.getText()));dfc26=(Double.parseDouble(dfrc26.getText()));dfc27=(Double.parseDouble(dfrc27.getText()));
        dfd1=(Double.parseDouble(dfrd1.getText()));  dfd2=(Double.parseDouble(dfrd2.getText())); dfd3=(Double.parseDouble(dfrd3.getText()));  dfd4=(Double.parseDouble(dfrd4.getText()));
        dfd5=(Double.parseDouble(dfrd5.getText()));  dfd6=(Double.parseDouble(dfrd6.getText())); dfd7=(Double.parseDouble(dfrd7.getText()));  dfd8=(Double.parseDouble(dfrd8.getText()));
        dfd9=(Double.parseDouble(dfrd9.getText()));  dfd10=(Double.parseDouble(dfrd10.getText()));   dfd11=(Double.parseDouble(dfrd11.getText()));  dfd12=(Double.parseDouble(dfrd12.getText()));
        dfd13=(Double.parseDouble(dfrd13.getText()));  dfd14=(Double.parseDouble(dfrd14.getText())); dfd15=(Double.parseDouble(dfrd15.getText()));  dfd16=(Double.parseDouble(dfrd16.getText()));
        dfd17=(Double.parseDouble(dfrd17.getText()));  dfd18=(Double.parseDouble(dfrd18.getText())); dfd19=(Double.parseDouble(dfrd19.getText()));  dfd20=(Double.parseDouble(dfrd20.getText()));
        dfd21=(Double.parseDouble(dfrd21.getText()));  dfd22=(Double.parseDouble(dfrd22.getText())); dfd23=(Double.parseDouble(dfrd23.getText()));  dfd24=(Double.parseDouble(dfrd24.getText()));
        dfd25=(Double.parseDouble(dfrd25.getText()));  dfd26=(Double.parseDouble(dfrd26.getText())); dfd27=(Double.parseDouble(dfrd27.getText()));
        
      double rdjabar=(Double.parseDouble(pdfrd.getText()));
      double rcjabar=(Double.parseDouble(pdfrc.getText()));
      
      String ks1,ks2,ks3,ks4,ks5,ks6,ks7,ks8,ks9,ks10,ks11,ks12,ks13,ks14,ks15,ks16,ks17,ks18,ks19,ks20,ks21,ks22,ks23,ks24,ks25,ks26,ks27;
            
        if ((dfd1>=rdjabar)&&(dfc1>=rcjabar)){ks1="K1";}      else if((dfd1<rdjabar)&&(dfc1>=rcjabar)){ks1="K2";}      else if((dfd1>=rdjabar)&&(dfc1<rcjabar)){ks1="K3";}      else {ks1="K4";}
        if ((dfd2>=rdjabar)&&(dfc2>=rcjabar)){ks2="K1";}      else if((dfd2<rdjabar)&&(dfc2>=rcjabar)){ks2="K2";}      else if((dfd2>=rdjabar)&&(dfc2<rcjabar)){ks2="K3";}      else {ks2="K4";}
        if ((dfd3>=rdjabar)&&(dfc3>=rcjabar)){ks3="K1";}      else if((dfd3<rdjabar)&&(dfc3>=rcjabar)){ks3="K2";}      else if((dfd3>=rdjabar)&&(dfc3<rcjabar)){ks3="K3";}      else {ks3="K4";}
        if ((dfd4>=rdjabar)&&(dfc4>=rcjabar)){ks4="K1";}      else if((dfd4<rdjabar)&&(dfc4>=rcjabar)){ks4="K2";}      else if((dfd4>=rdjabar)&&(dfc4<rcjabar)){ks4="K3";}      else {ks4="K4";}
        if ((dfd5>=rdjabar)&&(dfc5>=rcjabar)){ks5="K1";}      else if((dfd5<rdjabar)&&(dfc5>=rcjabar)){ks5="K2";}      else if((dfd5>=rdjabar)&&(dfc5<rcjabar)){ks5="K3";}      else {ks5="K4";}
        if ((dfd6>=rdjabar)&&(dfc6>=rcjabar)){ks6="K1";}      else if((dfd6<rdjabar)&&(dfc6>=rcjabar)){ks6="K2";}      else if((dfd6>=rdjabar)&&(dfc6<rcjabar)){ks6="K3";}      else {ks6="K4";}
        if ((dfd7>=rdjabar)&&(dfc7>=rcjabar)){ks7="K1";}      else if((dfd7<rdjabar)&&(dfc7>=rcjabar)){ks7="K2";}      else if((dfd7>=rdjabar)&&(dfc7<rcjabar)){ks7="K3";}      else {ks7="K4";}
        if ((dfd8>=rdjabar)&&(dfc8>=rcjabar)){ks8="K1";}      else if((dfd8<rdjabar)&&(dfc8>=rcjabar)){ks8="K2";}      else if((dfd8>=rdjabar)&&(dfc8<rcjabar)){ks8="K3";}      else {ks8="K4";}
        if ((dfd9>=rdjabar)&&(dfc9>=rcjabar)){ks9="K1";}      else if((dfd9<rdjabar)&&(dfc9>=rcjabar)){ks9="K2";}      else if((dfd9>=rdjabar)&&(dfc9<rcjabar)){ks9="K3";}      else {ks9="K4";}
        if ((dfd10>=rdjabar)&&(dfc10>=rcjabar)){ks10="K1";}   else if((dfd10<rdjabar)&&(dfc10>=rcjabar)){ks10="K2";}   else if((dfd10>=rdjabar)&&(dfc10<rcjabar)){ks10="K3";}   else {ks10="K4";}
        if ((dfd11>=rdjabar)&&(dfc11>=rcjabar)){ks11="K1";}   else if((dfd11<rdjabar)&&(dfc11>=rcjabar)){ks11="K2";}   else if((dfd11>=rdjabar)&&(dfc11<rcjabar)){ks11="K3";}   else {ks11="K4";}
        if ((dfd12>=rdjabar)&&(dfc12>=rcjabar)){ks12="K1";}   else if((dfd12<rdjabar)&&(dfc12>=rcjabar)){ks12="K2";}   else if((dfd12>=rdjabar)&&(dfc12<rcjabar)){ks12="K3";}   else {ks12="K4";}
        if ((dfd13>=rdjabar)&&(dfc13>=rcjabar)){ks13="K1";}   else if((dfd13<rdjabar)&&(dfc13>=rcjabar)){ks13="K2";}   else if((dfd13>=rdjabar)&&(dfc13<rcjabar)){ks13="K3";}   else {ks13="K4";}
        if ((dfd14>=rdjabar)&&(dfc14>=rcjabar)){ks14="K1";}   else if((dfd14<rdjabar)&&(dfc14>=rcjabar)){ks14="K2";}   else if((dfd14>=rdjabar)&&(dfc14<rcjabar)){ks14="K3";}   else {ks14="K4";}
        if ((dfd15>=rdjabar)&&(dfc15>=rcjabar)){ks15="K1";}   else if((dfd15<rdjabar)&&(dfc15>=rcjabar)){ks15="K2";}   else if((dfd15>=rdjabar)&&(dfc15<rcjabar)){ks15="K3";}   else {ks15="K4";}
        if ((dfd16>=rdjabar)&&(dfc16>=rcjabar)){ks16="K1";}   else if((dfd16<rdjabar)&&(dfc16>=rcjabar)){ks16="K2";}   else if((dfd16>=rdjabar)&&(dfc16<rcjabar)){ks16="K3";}   else {ks16="K4";}
        if ((dfd17>=rdjabar)&&(dfc17>=rcjabar)){ks17="K1";}   else if((dfd17<rdjabar)&&(dfc17>=rcjabar)){ks17="K2";}   else if((dfd17>=rdjabar)&&(dfc17<rcjabar)){ks17="K3";}   else {ks17="K4";}
        if ((dfd18>=rdjabar)&&(dfc18>=rcjabar)){ks18="K1";}   else if((dfd18<rdjabar)&&(dfc18>=rcjabar)){ks18="K2";}   else if((dfd18>=rdjabar)&&(dfc18<rcjabar)){ks18="K3";}   else {ks18="K4";}
        if ((dfd19>=rdjabar)&&(dfc19>=rcjabar)){ks19="K1";}   else if((dfd19<rdjabar)&&(dfc19>=rcjabar)){ks19="K2";}   else if((dfd19>=rdjabar)&&(dfc19<rcjabar)){ks19="K3";}   else {ks19="K4";}
        if ((dfd20>=rdjabar)&&(dfc20>=rcjabar)){ks20="K1";}   else if((dfd20<rdjabar)&&(dfc20>=rcjabar)){ks20="K2";}   else if((dfd20>=rdjabar)&&(dfc20<rcjabar)){ks20="K3";}   else {ks20="K4";}
        if ((dfd21>=rdjabar)&&(dfc21>=rcjabar)){ks21="K1";}   else if((dfd21<rdjabar)&&(dfc21>=rcjabar)){ks21="K2";}   else if((dfd21>=rdjabar)&&(dfc21<rcjabar)){ks21="K3";}   else {ks21="K4";}
        if ((dfd22>=rdjabar)&&(dfc22>=rcjabar)){ks22="K1";}      else if((dfd22<rdjabar)&&(dfc22>=rcjabar)){ks22="K2";}      else if((dfd22>=rdjabar)&&(dfc22<rcjabar)){ks22="K3";}      else {ks22="K4";}
        if ((dfd23>=rdjabar)&&(dfc23>=rcjabar)){ks23="K1";}      else if((dfd23<rdjabar)&&(dfc23>=rcjabar)){ks23="K2";}      else if((dfd23>=rdjabar)&&(dfc23<rcjabar)){ks23="K3";}      else {ks23="K4";}
        if ((dfd24>=rdjabar)&&(dfc24>=rcjabar)){ks24="K1";}      else if((dfd24<rdjabar)&&(dfc24>=rcjabar)){ks24="K2";}      else if((dfd24>=rdjabar)&&(dfc24<rcjabar)){ks24="K3";}      else {ks24="K4";}
        if ((dfd25>=rdjabar)&&(dfc25>=rcjabar)){ks25="K1";}      else if((dfd25<rdjabar)&&(dfc25>=rcjabar)){ks25="K2";}      else if((dfd25>=rdjabar)&&(dfc25<rcjabar)){ks25="K3";}      else {ks25="K4";}
        if ((dfd26>=rdjabar)&&(dfc26>=rcjabar)){ks26="K1";}      else if((dfd26<rdjabar)&&(dfc26>=rcjabar)){ks26="K2";}      else if((dfd26>=rdjabar)&&(dfc26<rcjabar)){ks26="K3";}      else {ks26="K4";}
        if ((dfd27>=rdjabar)&&(dfc27>=rcjabar)){ks27="K1";}      else if((dfd27<rdjabar)&&(dfc27>=rcjabar)){ks27="K2";}      else if((dfd27>=rdjabar)&&(dfc27<rcjabar)){ks27="K3";}      else {ks27="K4";}
        
        klass1.setText(""+ks1);     klass1.setText(""+ks1);    klass2.setText(""+ks2);     klass3.setText(""+ks3);
        klass4.setText(""+ks4);     klass5.setText(""+ks5);    klass6.setText(""+ks6);     klass7.setText(""+ks7);
        klass8.setText(""+ks8);     klass9.setText(""+ks9);    klass10.setText(""+ks10);   klass11.setText(""+ks11);
        klass12.setText(""+ks12);   klass13.setText(""+ks13);  klass14.setText(""+ks14);   klass15.setText(""+ks15);
        klass16.setText(""+ks16);   klass17.setText(""+ks17);  klass18.setText(""+ks18);   klass19.setText(""+ks19);
        klass20.setText(""+ks20);   klass21.setText(""+ks21);  klass22.setText(""+ks22);   klass23.setText(""+ks23);
        klass24.setText(""+ks24);   klass25.setText(""+ks25);  klass26.setText(""+ks26);   klass27.setText(""+ks27);

          }
     
    
    public double z1rd (double rd){
        double a,b,c,x;
        
        a = (Double.parseDouble(a_rd.getText()));
        b = (Double.parseDouble(b_rd.getText()));
        c = b-a;
        x =(-((c*rd)-b));
                             
            return x;
    }
        
    //drajat keanggotaan untuk rd_high
    public double z2rd (double rd){
        double a,b,c,x;
        a = (Double.parseDouble(a_rd.getText()));
        b = (Double.parseDouble(b_rd.getText()));
        c = b-a;
        x =((b*rd)+a);
            return x;
    }
    
    public double z1rc (double rc){
        double a,b,c,x;
        a = (Double.parseDouble(a_rc.getText()));
        b = (Double.parseDouble(b_rc.getText()));
        c = b-a;
        x =(-((c*rc)-b));
            return x;
    }
        
    //drajat keanggotaan untuk rd_high
    public double z2rc (double rc){
        double a,b,c,x;
        a = (Double.parseDouble(a_rc.getText()));
        b = (Double.parseDouble(b_rc.getText()));
        c = b-a;
        x =((b*rc)+a);
            return x;
    }
        
    public void simpan (){
            
    //int thn = (Integer.parseInt(tahun_klasifikasi.getText()));
    
    int thn = (Integer.parseInt(RD.getText()));
    int thn_prov = thn+1000000;
    int idk1,idk2,idk3,idk4,idk5,idk6,idk7,idk8,idk9,idk10,idk11,idk12,idk13,idk14,idk15,idk16,idk17,idk18,idk19,idk20,idk21,idk22,idk23,idk24,idk25,idk26,idk27;
          idk1=(thn)+(1010000);  idk2=(thn)+(1020000);  idk3=(thn)+(1030000);  idk4=(thn)+(1040000);  idk5=(thn)+(1050000);
          idk6=(thn)+(1060000);  idk7=(thn)+(1070000);  idk8=(thn)+(1080000);  idk9=(thn)+(1090000);  idk10=(thn)+(1100000);
          idk11=(thn)+(1110000); idk12=(thn)+(1120000); idk13=(thn)+(1130000); idk14=(thn)+(1140000); idk15=(thn)+(1150000);
          idk16=(thn)+(1160000); idk17=(thn)+(1170000); idk18=(thn)+(1180000); idk19=(thn)+(1190000); idk20=(thn)+(1200000);
          idk21=(thn)+(1210000); idk22=(thn)+(1220000); idk23=(thn)+(1230000); idk24=(thn)+(1240000); idk25=(thn)+(1250000);
          idk26=(thn)+(1260000); idk27=(thn)+(1270000);
        try{
    stm = (Statement) sambung.createStatement();
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+thn_prov+"','"+RD.getText()+"','Jawa Barat','"+kjabar.getText()+"','"+pdfrd.getText()+"','"+pdfrc.getText()+"','__');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk1+"','"+RD.getText()+"','Kab. Bandung','"+kb1.getText()+"','"+dfrd1.getText()+"','"+dfrc1.getText()+"','"+klass1.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk2+"','"+RD.getText()+"','Kab. Bandung Barat','"+kb2.getText()+"','"+dfrd2.getText()+"','"+dfrc2.getText()+"','"+klass2.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk3+"','"+RD.getText()+"','Kab. Bekasi','"+kb3.getText()+"','"+dfrd3.getText()+"','"+dfrc3.getText()+"','"+klass3.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk4+"','"+RD.getText()+"','Kab. Bogor','"+kb4.getText()+"','"+dfrd4.getText()+"','"+dfrc4.getText()+"','"+klass4.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk5+"','"+RD.getText()+"','Kab. Ciamis','"+kb5.getText()+"','"+dfrd5.getText()+"','"+dfrc5.getText()+"','"+klass5.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk6+"','"+RD.getText()+"','Kab. Cianjur','"+kb6.getText()+"','"+dfrd6.getText()+"','"+dfrc6.getText()+"','"+klass6.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk7+"','"+RD.getText()+"','Kab. Cirebon','"+kb7.getText()+"','"+dfrd7.getText()+"','"+dfrc7.getText()+"','"+klass7.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk8+"','"+RD.getText()+"','Kab. Garut','"+kb8.getText()+"','"+dfrd8.getText()+"','"+dfrc8.getText()+"','"+klass8.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk9+"','"+RD.getText()+"','Kab. Indramayu','"+kb9.getText()+"','"+dfrd9.getText()+"','"+dfrc9.getText()+"','"+klass9.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk10+"','"+RD.getText()+"','Kab. Karawang','"+kb10.getText()+"','"+dfrd10.getText()+"','"+dfrc10.getText()+"','"+klass10.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk11+"','"+RD.getText()+"','Kab. Kuningan','"+kb11.getText()+"','"+dfrd11.getText()+"','"+dfrc11.getText()+"','"+klass11.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk12+"','"+RD.getText()+"','Kab. Majalengka','"+kb12.getText()+"','"+dfrd12.getText()+"','"+dfrc12.getText()+"','"+klass12.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk13+"','"+RD.getText()+"','Kab. Pangandaran','"+kb13.getText()+"','"+dfrd13.getText()+"','"+dfrc13.getText()+"','"+klass13.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk14+"','"+RD.getText()+"','Kab. Purwakarta','"+kb14.getText()+"','"+dfrd14.getText()+"','"+dfrc14.getText()+"','"+klass14.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk15+"','"+RD.getText()+"','Kab. Subang','"+kb15.getText()+"','"+dfrd15.getText()+"','"+dfrc15.getText()+"','"+klass15.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk16+"','"+RD.getText()+"','Kab. Sukabumi','"+kb16.getText()+"','"+dfrd16.getText()+"','"+dfrc16.getText()+"','"+klass16.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk17+"','"+RD.getText()+"','Kab. Sumedang','"+kb17.getText()+"','"+dfrd17.getText()+"','"+dfrc17.getText()+"','"+klass17.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk18+"','"+RD.getText()+"','Kab. Tasik','"+kb18.getText()+"','"+dfrd18.getText()+"','"+dfrc18.getText()+"','"+klass18.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk19+"','"+RD.getText()+"','Kota Bandung','"+kb19.getText()+"','"+dfrd19.getText()+"','"+dfrc19.getText()+"','"+klass19.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk20+"','"+RD.getText()+"','Kota Banjar','"+kb20.getText()+"','"+dfrd20.getText()+"','"+dfrc20.getText()+"','"+klass20.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk21+"','"+RD.getText()+"','Kota Bekasi','"+kb21.getText()+"','"+dfrd21.getText()+"','"+dfrc21.getText()+"','"+klass21.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk22+"','"+RD.getText()+"','Kota Bogor','"+kb22.getText()+"','"+dfrd22.getText()+"','"+dfrc22.getText()+"','"+klass22.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk23+"','"+RD.getText()+"','Kota Cimahi','"+kb23.getText()+"','"+dfrd23.getText()+"','"+dfrc23.getText()+"','"+klass23.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk24+"','"+RD.getText()+"','Kota Cirebon','"+kb24.getText()+"','"+dfrd24.getText()+"','"+dfrc24.getText()+"','"+klass24.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk25+"','"+RD.getText()+"','Kota Depok','"+kb25.getText()+"','"+dfrd25.getText()+"','"+dfrc25.getText()+"','"+klass25.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk26+"','"+RD.getText()+"','Kota Sukabumi','"+kb26.getText()+"','"+dfrd26.getText()+"','"+dfrc26.getText()+"','"+klass26.getText()+"');");
    stm.executeUpdate("INSERT INTO tbl_klasifikasi VALUES ('"+idk27+"','"+RD.getText()+"','Kota Tasik','"+kb27.getText()+"','"+dfrd27.getText()+"','"+dfrc27.getText()+"','"+klass27.getText()+"');");

    
    JOptionPane.showMessageDialog(null,"Data Klasifikasi Berhasil disimpan"); 
    }
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Data Sudah Ada");
         
    }
        
   
    }
    
    
    
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
            java.util.logging.Logger.getLogger(menuhitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuhitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuhitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuhitung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuhitung().setVisible(true);
            }
        });
    }
    
     
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Komposisi_RULE;
    public javax.swing.JLabel RD;
    private javax.swing.JLabel RD1;
    private javax.swing.JLabel RD2;
    private javax.swing.JLabel RD3;
    private javax.swing.JLabel RD4;
    private javax.swing.JLabel RD5;
    private javax.swing.JLabel RD6;
    public javax.swing.JTextField a_rc;
    public javax.swing.JTextField a_rd;
    public javax.swing.JTextField a_tahun;
    public javax.swing.JTextField a_tahun_n;
    public javax.swing.JTextField b_rc;
    public javax.swing.JTextField b_rd;
    public javax.swing.JTextField b_tahun;
    public javax.swing.JTextField b_tahun_n;
    private javax.swing.JPanel derajat_evaluasi;
    private javax.swing.JTextField dfrc1;
    private javax.swing.JTextField dfrc10;
    private javax.swing.JTextField dfrc11;
    private javax.swing.JTextField dfrc12;
    private javax.swing.JTextField dfrc13;
    private javax.swing.JTextField dfrc14;
    private javax.swing.JTextField dfrc15;
    private javax.swing.JTextField dfrc16;
    private javax.swing.JTextField dfrc17;
    private javax.swing.JTextField dfrc18;
    private javax.swing.JTextField dfrc19;
    private javax.swing.JTextField dfrc2;
    private javax.swing.JTextField dfrc20;
    private javax.swing.JTextField dfrc21;
    private javax.swing.JTextField dfrc22;
    private javax.swing.JTextField dfrc23;
    private javax.swing.JTextField dfrc24;
    private javax.swing.JTextField dfrc25;
    private javax.swing.JTextField dfrc26;
    private javax.swing.JTextField dfrc27;
    private javax.swing.JTextField dfrc3;
    private javax.swing.JTextField dfrc4;
    private javax.swing.JTextField dfrc5;
    private javax.swing.JTextField dfrc6;
    private javax.swing.JTextField dfrc7;
    private javax.swing.JTextField dfrc8;
    private javax.swing.JTextField dfrc9;
    private javax.swing.JTextField dfrd1;
    private javax.swing.JTextField dfrd10;
    private javax.swing.JTextField dfrd11;
    private javax.swing.JTextField dfrd12;
    private javax.swing.JTextField dfrd13;
    private javax.swing.JTextField dfrd14;
    private javax.swing.JTextField dfrd15;
    private javax.swing.JTextField dfrd16;
    private javax.swing.JTextField dfrd17;
    private javax.swing.JTextField dfrd18;
    private javax.swing.JTextField dfrd19;
    private javax.swing.JTextField dfrd2;
    private javax.swing.JTextField dfrd20;
    private javax.swing.JTextField dfrd21;
    private javax.swing.JTextField dfrd22;
    private javax.swing.JTextField dfrd23;
    private javax.swing.JTextField dfrd24;
    private javax.swing.JTextField dfrd25;
    private javax.swing.JTextField dfrd26;
    private javax.swing.JTextField dfrd27;
    private javax.swing.JTextField dfrd3;
    private javax.swing.JTextField dfrd4;
    private javax.swing.JTextField dfrd5;
    private javax.swing.JTextField dfrd6;
    private javax.swing.JTextField dfrd7;
    private javax.swing.JTextField dfrd8;
    private javax.swing.JTextField dfrd9;
    private javax.swing.JPanel fuzzyfikasi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel kab_bandung1;
    private javax.swing.JLabel kab_bandung10;
    private javax.swing.JLabel kab_bandung11;
    private javax.swing.JLabel kab_bandung12;
    private javax.swing.JLabel kab_bandung13;
    private javax.swing.JLabel kab_bandung14;
    private javax.swing.JLabel kab_bandung15;
    private javax.swing.JLabel kab_bandung16;
    private javax.swing.JLabel kab_bandung17;
    private javax.swing.JLabel kab_bandung18;
    private javax.swing.JLabel kab_bandung19;
    private javax.swing.JLabel kab_bandung2;
    private javax.swing.JLabel kab_bandung20;
    private javax.swing.JLabel kab_bandung21;
    private javax.swing.JLabel kab_bandung22;
    private javax.swing.JLabel kab_bandung23;
    private javax.swing.JLabel kab_bandung24;
    private javax.swing.JLabel kab_bandung25;
    private javax.swing.JLabel kab_bandung26;
    private javax.swing.JLabel kab_bandung27;
    private javax.swing.JLabel kab_bandung28;
    private javax.swing.JLabel kab_bandung29;
    private javax.swing.JLabel kab_bandung3;
    private javax.swing.JLabel kab_bandung30;
    private javax.swing.JLabel kab_bandung31;
    private javax.swing.JLabel kab_bandung32;
    private javax.swing.JLabel kab_bandung33;
    private javax.swing.JLabel kab_bandung34;
    private javax.swing.JLabel kab_bandung35;
    private javax.swing.JLabel kab_bandung36;
    private javax.swing.JLabel kab_bandung37;
    private javax.swing.JLabel kab_bandung38;
    private javax.swing.JLabel kab_bandung39;
    private javax.swing.JLabel kab_bandung4;
    private javax.swing.JLabel kab_bandung40;
    private javax.swing.JLabel kab_bandung41;
    private javax.swing.JLabel kab_bandung42;
    private javax.swing.JLabel kab_bandung43;
    private javax.swing.JLabel kab_bandung44;
    private javax.swing.JLabel kab_bandung45;
    private javax.swing.JLabel kab_bandung46;
    private javax.swing.JLabel kab_bandung47;
    private javax.swing.JLabel kab_bandung48;
    private javax.swing.JLabel kab_bandung49;
    private javax.swing.JLabel kab_bandung5;
    private javax.swing.JLabel kab_bandung50;
    private javax.swing.JLabel kab_bandung51;
    private javax.swing.JLabel kab_bandung52;
    private javax.swing.JLabel kab_bandung53;
    private javax.swing.JLabel kab_bandung54;
    private javax.swing.JLabel kab_bandung55;
    private javax.swing.JLabel kab_bandung56;
    private javax.swing.JLabel kab_bandung6;
    private javax.swing.JLabel kab_bandung7;
    private javax.swing.JLabel kab_bandung8;
    private javax.swing.JLabel kab_bandung9;
    public javax.swing.JLabel kb1;
    public javax.swing.JLabel kb10;
    public javax.swing.JLabel kb11;
    public javax.swing.JLabel kb12;
    public javax.swing.JLabel kb13;
    public javax.swing.JLabel kb14;
    public javax.swing.JLabel kb15;
    public javax.swing.JLabel kb16;
    public javax.swing.JLabel kb17;
    public javax.swing.JLabel kb18;
    public javax.swing.JLabel kb19;
    public javax.swing.JLabel kb2;
    public javax.swing.JLabel kb20;
    public javax.swing.JLabel kb21;
    public javax.swing.JLabel kb22;
    public javax.swing.JLabel kb23;
    public javax.swing.JLabel kb24;
    public javax.swing.JLabel kb25;
    public javax.swing.JLabel kb26;
    public javax.swing.JLabel kb27;
    public javax.swing.JLabel kb3;
    public javax.swing.JLabel kb4;
    public javax.swing.JLabel kb5;
    public javax.swing.JLabel kb6;
    public javax.swing.JLabel kb7;
    public javax.swing.JLabel kb8;
    public javax.swing.JLabel kb9;
    public javax.swing.JLabel kjabar;
    private javax.swing.JTextField klass1;
    private javax.swing.JTextField klass10;
    private javax.swing.JTextField klass11;
    private javax.swing.JTextField klass12;
    private javax.swing.JTextField klass13;
    private javax.swing.JTextField klass14;
    private javax.swing.JTextField klass15;
    private javax.swing.JTextField klass16;
    private javax.swing.JTextField klass17;
    private javax.swing.JTextField klass18;
    private javax.swing.JTextField klass19;
    private javax.swing.JTextField klass2;
    private javax.swing.JTextField klass20;
    private javax.swing.JTextField klass21;
    private javax.swing.JTextField klass22;
    private javax.swing.JTextField klass23;
    private javax.swing.JTextField klass24;
    private javax.swing.JTextField klass25;
    private javax.swing.JTextField klass26;
    private javax.swing.JTextField klass27;
    private javax.swing.JTextField klass3;
    private javax.swing.JTextField klass4;
    private javax.swing.JTextField klass5;
    private javax.swing.JTextField klass6;
    private javax.swing.JTextField klass7;
    private javax.swing.JTextField klass8;
    private javax.swing.JTextField klass9;
    private javax.swing.JPanel komposisi_rule;
    public javax.swing.JTextField p_rc_h;
    public javax.swing.JTextField p_rc_l;
    public javax.swing.JTextField p_rce1_l;
    public javax.swing.JTextField p_rce2_l;
    public javax.swing.JTextField p_rce3_h;
    public javax.swing.JTextField p_rce4_h;
    public javax.swing.JTextField p_rd_h;
    public javax.swing.JTextField p_rd_l;
    public javax.swing.JTextField p_rde1_l;
    public javax.swing.JTextField p_rde2_l;
    public javax.swing.JTextField p_rde3_l;
    public javax.swing.JTextField p_rde4_h;
    public javax.swing.JTextField p_thn_high;
    public javax.swing.JTextField p_thn_high1;
    public javax.swing.JTextField p_thn_l;
    public javax.swing.JTextField p_thn_low1;
    public javax.swing.JTextField pa_rc;
    public javax.swing.JTextField pa_rd;
    public javax.swing.JTextField pa_tahun;
    public javax.swing.JTextField pa_tahun_n;
    private javax.swing.JPanel panel_dashboard;
    public javax.swing.JTextField pb_rc;
    public javax.swing.JTextField pb_rd;
    public javax.swing.JTextField pb_tahun;
    public javax.swing.JTextField pb_tahun_n;
    private javax.swing.JTextField pdfrc;
    private javax.swing.JTextField pdfrd;
    private javax.swing.JTextField prckh;
    private javax.swing.JTextField prckl;
    private javax.swing.JTextField prdkh;
    public javax.swing.JTextField prdkl;
    private javax.swing.JTextField pz1rc;
    private javax.swing.JTextField pz1rd;
    private javax.swing.JTextField pz2rc;
    private javax.swing.JTextField pz2rd;
    public javax.swing.JTextField rc_h1;
    public javax.swing.JTextField rc_h10;
    public javax.swing.JTextField rc_h11;
    public javax.swing.JTextField rc_h12;
    public javax.swing.JTextField rc_h13;
    public javax.swing.JTextField rc_h14;
    public javax.swing.JTextField rc_h15;
    public javax.swing.JTextField rc_h16;
    public javax.swing.JTextField rc_h17;
    public javax.swing.JTextField rc_h18;
    public javax.swing.JTextField rc_h19;
    public javax.swing.JTextField rc_h2;
    public javax.swing.JTextField rc_h20;
    public javax.swing.JTextField rc_h21;
    public javax.swing.JTextField rc_h22;
    public javax.swing.JTextField rc_h23;
    public javax.swing.JTextField rc_h24;
    public javax.swing.JTextField rc_h25;
    public javax.swing.JTextField rc_h26;
    public javax.swing.JTextField rc_h27;
    public javax.swing.JTextField rc_h3;
    public javax.swing.JTextField rc_h4;
    public javax.swing.JTextField rc_h5;
    public javax.swing.JTextField rc_h6;
    public javax.swing.JTextField rc_h7;
    public javax.swing.JTextField rc_h8;
    public javax.swing.JTextField rc_h9;
    public javax.swing.JTextField rc_l1;
    public javax.swing.JTextField rc_l10;
    public javax.swing.JTextField rc_l11;
    public javax.swing.JTextField rc_l12;
    public javax.swing.JTextField rc_l13;
    public javax.swing.JTextField rc_l14;
    public javax.swing.JTextField rc_l15;
    public javax.swing.JTextField rc_l16;
    public javax.swing.JTextField rc_l17;
    public javax.swing.JTextField rc_l18;
    public javax.swing.JTextField rc_l19;
    public javax.swing.JTextField rc_l2;
    public javax.swing.JTextField rc_l20;
    public javax.swing.JTextField rc_l21;
    public javax.swing.JTextField rc_l22;
    public javax.swing.JTextField rc_l23;
    public javax.swing.JTextField rc_l24;
    public javax.swing.JTextField rc_l25;
    public javax.swing.JTextField rc_l26;
    public javax.swing.JTextField rc_l27;
    public javax.swing.JTextField rc_l3;
    public javax.swing.JTextField rc_l4;
    public javax.swing.JTextField rc_l5;
    public javax.swing.JTextField rc_l6;
    public javax.swing.JTextField rc_l7;
    public javax.swing.JTextField rc_l8;
    public javax.swing.JTextField rc_l9;
    public javax.swing.JTextField rce1_l1;
    public javax.swing.JTextField rce1_l10;
    public javax.swing.JTextField rce1_l11;
    public javax.swing.JTextField rce1_l12;
    public javax.swing.JTextField rce1_l13;
    public javax.swing.JTextField rce1_l14;
    public javax.swing.JTextField rce1_l15;
    public javax.swing.JTextField rce1_l16;
    public javax.swing.JTextField rce1_l17;
    public javax.swing.JTextField rce1_l18;
    public javax.swing.JTextField rce1_l19;
    public javax.swing.JTextField rce1_l2;
    public javax.swing.JTextField rce1_l20;
    public javax.swing.JTextField rce1_l21;
    public javax.swing.JTextField rce1_l22;
    public javax.swing.JTextField rce1_l23;
    public javax.swing.JTextField rce1_l24;
    public javax.swing.JTextField rce1_l25;
    public javax.swing.JTextField rce1_l26;
    public javax.swing.JTextField rce1_l27;
    public javax.swing.JTextField rce1_l3;
    public javax.swing.JTextField rce1_l4;
    public javax.swing.JTextField rce1_l5;
    public javax.swing.JTextField rce1_l6;
    public javax.swing.JTextField rce1_l7;
    public javax.swing.JTextField rce1_l8;
    public javax.swing.JTextField rce1_l9;
    public javax.swing.JTextField rce2_l1;
    public javax.swing.JTextField rce2_l10;
    public javax.swing.JTextField rce2_l11;
    public javax.swing.JTextField rce2_l12;
    public javax.swing.JTextField rce2_l13;
    public javax.swing.JTextField rce2_l14;
    public javax.swing.JTextField rce2_l15;
    public javax.swing.JTextField rce2_l16;
    public javax.swing.JTextField rce2_l17;
    public javax.swing.JTextField rce2_l18;
    public javax.swing.JTextField rce2_l19;
    public javax.swing.JTextField rce2_l2;
    public javax.swing.JTextField rce2_l20;
    public javax.swing.JTextField rce2_l21;
    public javax.swing.JTextField rce2_l22;
    public javax.swing.JTextField rce2_l23;
    public javax.swing.JTextField rce2_l24;
    public javax.swing.JTextField rce2_l25;
    public javax.swing.JTextField rce2_l26;
    public javax.swing.JTextField rce2_l27;
    public javax.swing.JTextField rce2_l3;
    public javax.swing.JTextField rce2_l4;
    public javax.swing.JTextField rce2_l5;
    public javax.swing.JTextField rce2_l6;
    public javax.swing.JTextField rce2_l7;
    public javax.swing.JTextField rce2_l8;
    public javax.swing.JTextField rce2_l9;
    public javax.swing.JTextField rce3_h1;
    public javax.swing.JTextField rce3_h10;
    public javax.swing.JTextField rce3_h11;
    public javax.swing.JTextField rce3_h12;
    public javax.swing.JTextField rce3_h13;
    public javax.swing.JTextField rce3_h14;
    public javax.swing.JTextField rce3_h15;
    public javax.swing.JTextField rce3_h16;
    public javax.swing.JTextField rce3_h17;
    public javax.swing.JTextField rce3_h18;
    public javax.swing.JTextField rce3_h19;
    public javax.swing.JTextField rce3_h2;
    public javax.swing.JTextField rce3_h20;
    public javax.swing.JTextField rce3_h21;
    public javax.swing.JTextField rce3_h22;
    public javax.swing.JTextField rce3_h23;
    public javax.swing.JTextField rce3_h24;
    public javax.swing.JTextField rce3_h25;
    public javax.swing.JTextField rce3_h26;
    public javax.swing.JTextField rce3_h27;
    public javax.swing.JTextField rce3_h3;
    public javax.swing.JTextField rce3_h4;
    public javax.swing.JTextField rce3_h5;
    public javax.swing.JTextField rce3_h6;
    public javax.swing.JTextField rce3_h7;
    public javax.swing.JTextField rce3_h8;
    public javax.swing.JTextField rce3_h9;
    public javax.swing.JTextField rce4_h1;
    public javax.swing.JTextField rce4_h10;
    public javax.swing.JTextField rce4_h11;
    public javax.swing.JTextField rce4_h12;
    public javax.swing.JTextField rce4_h13;
    public javax.swing.JTextField rce4_h14;
    public javax.swing.JTextField rce4_h15;
    public javax.swing.JTextField rce4_h16;
    public javax.swing.JTextField rce4_h17;
    public javax.swing.JTextField rce4_h18;
    public javax.swing.JTextField rce4_h19;
    public javax.swing.JTextField rce4_h2;
    public javax.swing.JTextField rce4_h20;
    public javax.swing.JTextField rce4_h21;
    public javax.swing.JTextField rce4_h22;
    public javax.swing.JTextField rce4_h23;
    public javax.swing.JTextField rce4_h24;
    public javax.swing.JTextField rce4_h25;
    public javax.swing.JTextField rce4_h26;
    public javax.swing.JTextField rce4_h27;
    public javax.swing.JTextField rce4_h3;
    public javax.swing.JTextField rce4_h4;
    public javax.swing.JTextField rce4_h5;
    public javax.swing.JTextField rce4_h6;
    public javax.swing.JTextField rce4_h7;
    public javax.swing.JTextField rce4_h8;
    public javax.swing.JTextField rce4_h9;
    private javax.swing.JTextField rckh1;
    private javax.swing.JTextField rckh10;
    private javax.swing.JTextField rckh11;
    private javax.swing.JTextField rckh12;
    private javax.swing.JTextField rckh13;
    private javax.swing.JTextField rckh14;
    private javax.swing.JTextField rckh15;
    private javax.swing.JTextField rckh16;
    private javax.swing.JTextField rckh17;
    private javax.swing.JTextField rckh18;
    private javax.swing.JTextField rckh19;
    private javax.swing.JTextField rckh2;
    private javax.swing.JTextField rckh20;
    private javax.swing.JTextField rckh21;
    private javax.swing.JTextField rckh22;
    private javax.swing.JTextField rckh23;
    private javax.swing.JTextField rckh24;
    private javax.swing.JTextField rckh25;
    private javax.swing.JTextField rckh26;
    private javax.swing.JTextField rckh27;
    private javax.swing.JTextField rckh3;
    private javax.swing.JTextField rckh4;
    private javax.swing.JTextField rckh5;
    private javax.swing.JTextField rckh6;
    private javax.swing.JTextField rckh7;
    private javax.swing.JTextField rckh8;
    private javax.swing.JTextField rckh9;
    private javax.swing.JTextField rckl1;
    private javax.swing.JTextField rckl10;
    private javax.swing.JTextField rckl11;
    private javax.swing.JTextField rckl12;
    private javax.swing.JTextField rckl13;
    private javax.swing.JTextField rckl14;
    private javax.swing.JTextField rckl15;
    private javax.swing.JTextField rckl16;
    private javax.swing.JTextField rckl17;
    private javax.swing.JTextField rckl18;
    private javax.swing.JTextField rckl19;
    private javax.swing.JTextField rckl2;
    private javax.swing.JTextField rckl20;
    private javax.swing.JTextField rckl21;
    private javax.swing.JTextField rckl22;
    private javax.swing.JTextField rckl23;
    private javax.swing.JTextField rckl24;
    private javax.swing.JTextField rckl25;
    private javax.swing.JTextField rckl26;
    private javax.swing.JTextField rckl27;
    private javax.swing.JTextField rckl3;
    private javax.swing.JTextField rckl4;
    private javax.swing.JTextField rckl5;
    private javax.swing.JTextField rckl6;
    private javax.swing.JTextField rckl7;
    private javax.swing.JTextField rckl8;
    private javax.swing.JTextField rckl9;
    public javax.swing.JTextField rd_h1;
    public javax.swing.JTextField rd_h10;
    public javax.swing.JTextField rd_h11;
    public javax.swing.JTextField rd_h12;
    public javax.swing.JTextField rd_h13;
    public javax.swing.JTextField rd_h14;
    public javax.swing.JTextField rd_h15;
    public javax.swing.JTextField rd_h16;
    public javax.swing.JTextField rd_h17;
    public javax.swing.JTextField rd_h18;
    public javax.swing.JTextField rd_h19;
    public javax.swing.JTextField rd_h2;
    public javax.swing.JTextField rd_h20;
    public javax.swing.JTextField rd_h21;
    public javax.swing.JTextField rd_h22;
    public javax.swing.JTextField rd_h23;
    public javax.swing.JTextField rd_h24;
    public javax.swing.JTextField rd_h25;
    public javax.swing.JTextField rd_h26;
    public javax.swing.JTextField rd_h27;
    public javax.swing.JTextField rd_h3;
    public javax.swing.JTextField rd_h4;
    public javax.swing.JTextField rd_h5;
    public javax.swing.JTextField rd_h6;
    public javax.swing.JTextField rd_h7;
    public javax.swing.JTextField rd_h8;
    public javax.swing.JTextField rd_h9;
    public javax.swing.JTextField rd_l1;
    public javax.swing.JTextField rd_l10;
    public javax.swing.JTextField rd_l11;
    public javax.swing.JTextField rd_l12;
    public javax.swing.JTextField rd_l13;
    public javax.swing.JTextField rd_l14;
    public javax.swing.JTextField rd_l15;
    public javax.swing.JTextField rd_l16;
    public javax.swing.JTextField rd_l17;
    public javax.swing.JTextField rd_l18;
    public javax.swing.JTextField rd_l19;
    public javax.swing.JTextField rd_l2;
    public javax.swing.JTextField rd_l20;
    public javax.swing.JTextField rd_l21;
    public javax.swing.JTextField rd_l22;
    public javax.swing.JTextField rd_l23;
    public javax.swing.JTextField rd_l24;
    public javax.swing.JTextField rd_l25;
    public javax.swing.JTextField rd_l26;
    public javax.swing.JTextField rd_l27;
    public javax.swing.JTextField rd_l3;
    public javax.swing.JTextField rd_l4;
    public javax.swing.JTextField rd_l5;
    public javax.swing.JTextField rd_l6;
    public javax.swing.JTextField rd_l7;
    public javax.swing.JTextField rd_l8;
    public javax.swing.JTextField rd_l9;
    public javax.swing.JTextField rde1_l1;
    public javax.swing.JTextField rde1_l10;
    public javax.swing.JTextField rde1_l11;
    public javax.swing.JTextField rde1_l12;
    public javax.swing.JTextField rde1_l13;
    public javax.swing.JTextField rde1_l14;
    public javax.swing.JTextField rde1_l15;
    public javax.swing.JTextField rde1_l16;
    public javax.swing.JTextField rde1_l17;
    public javax.swing.JTextField rde1_l18;
    public javax.swing.JTextField rde1_l19;
    public javax.swing.JTextField rde1_l2;
    public javax.swing.JTextField rde1_l20;
    public javax.swing.JTextField rde1_l21;
    public javax.swing.JTextField rde1_l22;
    public javax.swing.JTextField rde1_l23;
    public javax.swing.JTextField rde1_l24;
    public javax.swing.JTextField rde1_l25;
    public javax.swing.JTextField rde1_l26;
    public javax.swing.JTextField rde1_l27;
    public javax.swing.JTextField rde1_l3;
    public javax.swing.JTextField rde1_l4;
    public javax.swing.JTextField rde1_l5;
    public javax.swing.JTextField rde1_l6;
    public javax.swing.JTextField rde1_l7;
    public javax.swing.JTextField rde1_l8;
    public javax.swing.JTextField rde1_l9;
    public javax.swing.JTextField rde2_l1;
    public javax.swing.JTextField rde2_l10;
    public javax.swing.JTextField rde2_l11;
    public javax.swing.JTextField rde2_l12;
    public javax.swing.JTextField rde2_l13;
    public javax.swing.JTextField rde2_l14;
    public javax.swing.JTextField rde2_l15;
    public javax.swing.JTextField rde2_l16;
    public javax.swing.JTextField rde2_l17;
    public javax.swing.JTextField rde2_l18;
    public javax.swing.JTextField rde2_l19;
    public javax.swing.JTextField rde2_l2;
    public javax.swing.JTextField rde2_l20;
    public javax.swing.JTextField rde2_l21;
    public javax.swing.JTextField rde2_l22;
    public javax.swing.JTextField rde2_l23;
    public javax.swing.JTextField rde2_l24;
    public javax.swing.JTextField rde2_l25;
    public javax.swing.JTextField rde2_l26;
    public javax.swing.JTextField rde2_l27;
    public javax.swing.JTextField rde2_l3;
    public javax.swing.JTextField rde2_l4;
    public javax.swing.JTextField rde2_l5;
    public javax.swing.JTextField rde2_l6;
    public javax.swing.JTextField rde2_l7;
    public javax.swing.JTextField rde2_l8;
    public javax.swing.JTextField rde2_l9;
    public javax.swing.JTextField rde3_h1;
    public javax.swing.JTextField rde3_h10;
    public javax.swing.JTextField rde3_h11;
    public javax.swing.JTextField rde3_h12;
    public javax.swing.JTextField rde3_h13;
    public javax.swing.JTextField rde3_h14;
    public javax.swing.JTextField rde3_h15;
    public javax.swing.JTextField rde3_h16;
    public javax.swing.JTextField rde3_h17;
    public javax.swing.JTextField rde3_h18;
    public javax.swing.JTextField rde3_h19;
    public javax.swing.JTextField rde3_h2;
    public javax.swing.JTextField rde3_h20;
    public javax.swing.JTextField rde3_h21;
    public javax.swing.JTextField rde3_h22;
    public javax.swing.JTextField rde3_h23;
    public javax.swing.JTextField rde3_h24;
    public javax.swing.JTextField rde3_h25;
    public javax.swing.JTextField rde3_h26;
    public javax.swing.JTextField rde3_h27;
    public javax.swing.JTextField rde3_h3;
    public javax.swing.JTextField rde3_h4;
    public javax.swing.JTextField rde3_h5;
    public javax.swing.JTextField rde3_h6;
    public javax.swing.JTextField rde3_h7;
    public javax.swing.JTextField rde3_h8;
    public javax.swing.JTextField rde3_h9;
    public javax.swing.JTextField rde4_h1;
    public javax.swing.JTextField rde4_h10;
    public javax.swing.JTextField rde4_h11;
    public javax.swing.JTextField rde4_h12;
    public javax.swing.JTextField rde4_h13;
    public javax.swing.JTextField rde4_h14;
    public javax.swing.JTextField rde4_h15;
    public javax.swing.JTextField rde4_h16;
    public javax.swing.JTextField rde4_h17;
    public javax.swing.JTextField rde4_h18;
    public javax.swing.JTextField rde4_h19;
    public javax.swing.JTextField rde4_h2;
    public javax.swing.JTextField rde4_h20;
    public javax.swing.JTextField rde4_h21;
    public javax.swing.JTextField rde4_h22;
    public javax.swing.JTextField rde4_h23;
    public javax.swing.JTextField rde4_h24;
    public javax.swing.JTextField rde4_h25;
    public javax.swing.JTextField rde4_h26;
    public javax.swing.JTextField rde4_h27;
    public javax.swing.JTextField rde4_h3;
    public javax.swing.JTextField rde4_h4;
    public javax.swing.JTextField rde4_h5;
    public javax.swing.JTextField rde4_h6;
    public javax.swing.JTextField rde4_h7;
    public javax.swing.JTextField rde4_h8;
    public javax.swing.JTextField rde4_h9;
    private javax.swing.JTextField rdkh1;
    private javax.swing.JTextField rdkh10;
    private javax.swing.JTextField rdkh11;
    private javax.swing.JTextField rdkh12;
    private javax.swing.JTextField rdkh13;
    private javax.swing.JTextField rdkh14;
    private javax.swing.JTextField rdkh15;
    private javax.swing.JTextField rdkh16;
    private javax.swing.JTextField rdkh17;
    private javax.swing.JTextField rdkh18;
    private javax.swing.JTextField rdkh19;
    private javax.swing.JTextField rdkh2;
    private javax.swing.JTextField rdkh20;
    private javax.swing.JTextField rdkh21;
    private javax.swing.JTextField rdkh22;
    private javax.swing.JTextField rdkh23;
    private javax.swing.JTextField rdkh24;
    private javax.swing.JTextField rdkh25;
    private javax.swing.JTextField rdkh26;
    private javax.swing.JTextField rdkh27;
    private javax.swing.JTextField rdkh3;
    private javax.swing.JTextField rdkh4;
    private javax.swing.JTextField rdkh5;
    private javax.swing.JTextField rdkh6;
    private javax.swing.JTextField rdkh7;
    private javax.swing.JTextField rdkh8;
    private javax.swing.JTextField rdkh9;
    public javax.swing.JTextField rdkl1;
    public javax.swing.JTextField rdkl10;
    public javax.swing.JTextField rdkl11;
    public javax.swing.JTextField rdkl12;
    public javax.swing.JTextField rdkl13;
    public javax.swing.JTextField rdkl14;
    public javax.swing.JTextField rdkl15;
    public javax.swing.JTextField rdkl16;
    public javax.swing.JTextField rdkl17;
    public javax.swing.JTextField rdkl18;
    public javax.swing.JTextField rdkl19;
    public javax.swing.JTextField rdkl2;
    public javax.swing.JTextField rdkl20;
    public javax.swing.JTextField rdkl21;
    public javax.swing.JTextField rdkl22;
    public javax.swing.JTextField rdkl23;
    public javax.swing.JTextField rdkl24;
    public javax.swing.JTextField rdkl25;
    public javax.swing.JTextField rdkl26;
    public javax.swing.JTextField rdkl27;
    public javax.swing.JTextField rdkl3;
    public javax.swing.JTextField rdkl4;
    public javax.swing.JTextField rdkl5;
    public javax.swing.JTextField rdkl6;
    public javax.swing.JTextField rdkl7;
    public javax.swing.JTextField rdkl8;
    public javax.swing.JTextField rdkl9;
    private javax.swing.JLabel tahun_a_kab2;
    private javax.swing.JTextField tahun_klasifikasi;
    public javax.swing.JLabel thn1;
    public javax.swing.JLabel thn2;
    public javax.swing.JTextField thn_h1;
    public javax.swing.JTextField thn_h10;
    public javax.swing.JTextField thn_h11;
    public javax.swing.JTextField thn_h12;
    public javax.swing.JTextField thn_h13;
    public javax.swing.JTextField thn_h14;
    public javax.swing.JTextField thn_h15;
    public javax.swing.JTextField thn_h16;
    public javax.swing.JTextField thn_h17;
    public javax.swing.JTextField thn_h18;
    public javax.swing.JTextField thn_h19;
    public javax.swing.JTextField thn_h2;
    public javax.swing.JTextField thn_h20;
    public javax.swing.JTextField thn_h21;
    public javax.swing.JTextField thn_h22;
    public javax.swing.JTextField thn_h23;
    public javax.swing.JTextField thn_h24;
    public javax.swing.JTextField thn_h25;
    public javax.swing.JTextField thn_h26;
    public javax.swing.JTextField thn_h27;
    public javax.swing.JTextField thn_h3;
    public javax.swing.JTextField thn_h4;
    public javax.swing.JTextField thn_h5;
    public javax.swing.JTextField thn_h6;
    public javax.swing.JTextField thn_h7;
    public javax.swing.JTextField thn_h8;
    public javax.swing.JTextField thn_h9;
    public javax.swing.JTextField thn_l1;
    public javax.swing.JTextField thn_l10;
    public javax.swing.JTextField thn_l11;
    public javax.swing.JTextField thn_l12;
    public javax.swing.JTextField thn_l13;
    public javax.swing.JTextField thn_l14;
    public javax.swing.JTextField thn_l15;
    public javax.swing.JTextField thn_l16;
    public javax.swing.JTextField thn_l17;
    public javax.swing.JTextField thn_l18;
    public javax.swing.JTextField thn_l19;
    public javax.swing.JTextField thn_l2;
    public javax.swing.JTextField thn_l20;
    public javax.swing.JTextField thn_l21;
    public javax.swing.JTextField thn_l22;
    public javax.swing.JTextField thn_l23;
    public javax.swing.JTextField thn_l24;
    public javax.swing.JTextField thn_l25;
    public javax.swing.JTextField thn_l26;
    public javax.swing.JTextField thn_l27;
    public javax.swing.JTextField thn_l3;
    public javax.swing.JTextField thn_l4;
    public javax.swing.JTextField thn_l5;
    public javax.swing.JTextField thn_l6;
    public javax.swing.JTextField thn_l7;
    public javax.swing.JTextField thn_l8;
    public javax.swing.JTextField thn_l9;
    public javax.swing.JTextField thn_n_h1;
    public javax.swing.JTextField thn_n_h10;
    public javax.swing.JTextField thn_n_h11;
    public javax.swing.JTextField thn_n_h12;
    public javax.swing.JTextField thn_n_h13;
    public javax.swing.JTextField thn_n_h14;
    public javax.swing.JTextField thn_n_h15;
    public javax.swing.JTextField thn_n_h16;
    public javax.swing.JTextField thn_n_h17;
    public javax.swing.JTextField thn_n_h18;
    public javax.swing.JTextField thn_n_h19;
    public javax.swing.JTextField thn_n_h2;
    public javax.swing.JTextField thn_n_h20;
    public javax.swing.JTextField thn_n_h21;
    public javax.swing.JTextField thn_n_h22;
    public javax.swing.JTextField thn_n_h23;
    public javax.swing.JTextField thn_n_h24;
    public javax.swing.JTextField thn_n_h25;
    public javax.swing.JTextField thn_n_h26;
    public javax.swing.JTextField thn_n_h27;
    public javax.swing.JTextField thn_n_h3;
    public javax.swing.JTextField thn_n_h4;
    public javax.swing.JTextField thn_n_h5;
    public javax.swing.JTextField thn_n_h6;
    public javax.swing.JTextField thn_n_h7;
    public javax.swing.JTextField thn_n_h8;
    public javax.swing.JTextField thn_n_h9;
    public javax.swing.JTextField thn_n_l1;
    public javax.swing.JTextField thn_n_l10;
    public javax.swing.JTextField thn_n_l11;
    public javax.swing.JTextField thn_n_l12;
    public javax.swing.JTextField thn_n_l13;
    public javax.swing.JTextField thn_n_l14;
    public javax.swing.JTextField thn_n_l15;
    public javax.swing.JTextField thn_n_l16;
    public javax.swing.JTextField thn_n_l17;
    public javax.swing.JTextField thn_n_l18;
    public javax.swing.JTextField thn_n_l19;
    public javax.swing.JTextField thn_n_l2;
    public javax.swing.JTextField thn_n_l20;
    public javax.swing.JTextField thn_n_l21;
    public javax.swing.JTextField thn_n_l22;
    public javax.swing.JTextField thn_n_l23;
    public javax.swing.JTextField thn_n_l24;
    public javax.swing.JTextField thn_n_l25;
    public javax.swing.JTextField thn_n_l26;
    public javax.swing.JTextField thn_n_l27;
    public javax.swing.JTextField thn_n_l3;
    public javax.swing.JTextField thn_n_l4;
    public javax.swing.JTextField thn_n_l5;
    public javax.swing.JTextField thn_n_l6;
    public javax.swing.JTextField thn_n_l7;
    public javax.swing.JTextField thn_n_l8;
    public javax.swing.JTextField thn_n_l9;
    private javax.swing.JPanel titik_a_b_variabel;
    private javax.swing.JTextField z1rc1;
    private javax.swing.JTextField z1rc10;
    private javax.swing.JTextField z1rc11;
    private javax.swing.JTextField z1rc12;
    private javax.swing.JTextField z1rc13;
    private javax.swing.JTextField z1rc14;
    private javax.swing.JTextField z1rc15;
    private javax.swing.JTextField z1rc16;
    private javax.swing.JTextField z1rc17;
    private javax.swing.JTextField z1rc18;
    private javax.swing.JTextField z1rc19;
    private javax.swing.JTextField z1rc2;
    private javax.swing.JTextField z1rc20;
    private javax.swing.JTextField z1rc21;
    private javax.swing.JTextField z1rc22;
    private javax.swing.JTextField z1rc23;
    private javax.swing.JTextField z1rc24;
    private javax.swing.JTextField z1rc25;
    private javax.swing.JTextField z1rc26;
    private javax.swing.JTextField z1rc27;
    private javax.swing.JTextField z1rc3;
    private javax.swing.JTextField z1rc4;
    private javax.swing.JTextField z1rc5;
    private javax.swing.JTextField z1rc6;
    private javax.swing.JTextField z1rc7;
    private javax.swing.JTextField z1rc8;
    private javax.swing.JTextField z1rc9;
    private javax.swing.JTextField z1rd1;
    private javax.swing.JTextField z1rd10;
    private javax.swing.JTextField z1rd11;
    private javax.swing.JTextField z1rd12;
    private javax.swing.JTextField z1rd13;
    private javax.swing.JTextField z1rd14;
    private javax.swing.JTextField z1rd15;
    private javax.swing.JTextField z1rd16;
    private javax.swing.JTextField z1rd17;
    private javax.swing.JTextField z1rd18;
    private javax.swing.JTextField z1rd19;
    private javax.swing.JTextField z1rd2;
    private javax.swing.JTextField z1rd20;
    private javax.swing.JTextField z1rd21;
    private javax.swing.JTextField z1rd22;
    private javax.swing.JTextField z1rd23;
    private javax.swing.JTextField z1rd24;
    private javax.swing.JTextField z1rd25;
    private javax.swing.JTextField z1rd26;
    private javax.swing.JTextField z1rd27;
    private javax.swing.JTextField z1rd3;
    private javax.swing.JTextField z1rd4;
    private javax.swing.JTextField z1rd5;
    private javax.swing.JTextField z1rd6;
    private javax.swing.JTextField z1rd7;
    private javax.swing.JTextField z1rd8;
    private javax.swing.JTextField z1rd9;
    private javax.swing.JTextField z2rc1;
    private javax.swing.JTextField z2rc10;
    private javax.swing.JTextField z2rc11;
    private javax.swing.JTextField z2rc12;
    private javax.swing.JTextField z2rc13;
    private javax.swing.JTextField z2rc14;
    private javax.swing.JTextField z2rc15;
    private javax.swing.JTextField z2rc16;
    private javax.swing.JTextField z2rc17;
    private javax.swing.JTextField z2rc18;
    private javax.swing.JTextField z2rc19;
    private javax.swing.JTextField z2rc2;
    private javax.swing.JTextField z2rc20;
    private javax.swing.JTextField z2rc21;
    private javax.swing.JTextField z2rc22;
    private javax.swing.JTextField z2rc23;
    private javax.swing.JTextField z2rc24;
    private javax.swing.JTextField z2rc25;
    private javax.swing.JTextField z2rc26;
    private javax.swing.JTextField z2rc27;
    private javax.swing.JTextField z2rc3;
    private javax.swing.JTextField z2rc4;
    private javax.swing.JTextField z2rc5;
    private javax.swing.JTextField z2rc6;
    private javax.swing.JTextField z2rc7;
    private javax.swing.JTextField z2rc8;
    private javax.swing.JTextField z2rc9;
    private javax.swing.JTextField z2rd1;
    private javax.swing.JTextField z2rd10;
    private javax.swing.JTextField z2rd11;
    private javax.swing.JTextField z2rd12;
    private javax.swing.JTextField z2rd13;
    private javax.swing.JTextField z2rd14;
    private javax.swing.JTextField z2rd15;
    private javax.swing.JTextField z2rd16;
    private javax.swing.JTextField z2rd17;
    private javax.swing.JTextField z2rd18;
    private javax.swing.JTextField z2rd19;
    private javax.swing.JTextField z2rd2;
    private javax.swing.JTextField z2rd20;
    private javax.swing.JTextField z2rd21;
    private javax.swing.JTextField z2rd22;
    private javax.swing.JTextField z2rd23;
    private javax.swing.JTextField z2rd24;
    private javax.swing.JTextField z2rd25;
    private javax.swing.JTextField z2rd26;
    private javax.swing.JTextField z2rd27;
    private javax.swing.JTextField z2rd3;
    private javax.swing.JTextField z2rd4;
    private javax.swing.JTextField z2rd5;
    private javax.swing.JTextField z2rd6;
    private javax.swing.JTextField z2rd7;
    private javax.swing.JTextField z2rd8;
    private javax.swing.JTextField z2rd9;
    // End of variables declaration//GEN-END:variables
}
