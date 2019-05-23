package fuzzy;


import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Statement;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;


public class MenuUtama extends javax.swing.JFrame {
    hitung a = new hitung();
    Connection sambung;
    Statement stm;
                
    public MenuUtama() {
       initComponents();
       openDB(); 
       layar_tengah();
    }
    
    private void layar_tengah(){
    // mengambil ukuran layar
        Dimension layar = Toolkit.getDefaultToolkit().getScreenSize();

        // membuat titik x dan y
        int x = layar.width / 2  - this.getSize().width / 2;
        int y = layar.height / 2 - this.getSize().height / 2;

        this.setLocation(x, y);
       
    }
    
    
    private void openDB(){
     try{
         Koneksi kon = new Koneksi();
         sambung = kon.getConnection();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Tidak Terkoneksi Database");
        }
    }
    
    public void bersih(){
    txt_pdrb_aceh.setText("");
    txt_pdrb_bali.setText("");
    txt_pdrb_bangka.setText("");
    txt_pdrb_banten.setText("");
    txt_pdrb_bengkulu.setText("");
    txt_pdrb_gorontalo.setText("");
    txt_pdrb_jabar.setText("");
    txt_pdrb_jakarta.setText("");
    txt_pdrb_jambi.setText("");
    txt_pdrb_jateng.setText("");
    txt_pdrb_jatim.setText("");
    txt_pdrb_kab_bandung.setText("");
    txt_pdrb_kab_bandung_barat.setText("");
    txt_pdrb_kab_bekasi.setText("");
    txt_pdrb_kab_bogor.setText("");
    txt_pdrb_kab_ciamis.setText("");
    txt_pdrb_kab_cianjur.setText("");
    txt_pdrb_kab_cirebon.setText("");
    txt_pdrb_kab_garut.setText("");
    txt_pdrb_kab_indramayu.setText("");
    txt_pdrb_kab_karawang.setText("");
    txt_pdrb_kab_kuningan.setText("");
    txt_pdrb_kab_majalengka.setText("");
    txt_pdrb_kab_pangandaran.setText("");
    txt_pdrb_kab_purwakarta.setText("");
    txt_pdrb_kab_subang.setText("");
    txt_pdrb_kab_sukabumi.setText("");
    txt_pdrb_kab_sumedang.setText("");
    txt_pdrb_kab_tasik.setText("");
    txt_pdrb_kalbar.setText("");
    txt_pdrb_kalsel.setText("");
    txt_pdrb_kaltara.setText("");
    txt_pdrb_kalteng.setText("");
    txt_pdrb_kaltim.setText("");
    txt_pdrb_kep_riau.setText("");
    txt_pdrb_kota_bandung.setText("");
    txt_pdrb_kota_banjar.setText("");
    txt_pdrb_kota_bekasi.setText("");
    txt_pdrb_kota_bogor.setText("");
    txt_pdrb_kota_cimahi.setText("");
    txt_pdrb_kota_cirebon.setText("");
    txt_pdrb_kota_depok.setText("");
    txt_pdrb_kota_sukabumi.setText("");
    txt_pdrb_kota_tasik.setText("");
    txt_pdrb_lampung.setText("");
    txt_pdrb_malkutar.setText("");
    txt_pdrb_maluku.setText("");
    txt_pdrb_ntb.setText("");
    txt_pdrb_ntt.setText("");
    txt_pdrb_papbar.setText("");
    txt_pdrb_papua.setText("");
    txt_pdrb_riau.setText("");
    txt_pdrb_sulbar.setText("");
    txt_pdrb_sulsel.setText("");
    txt_pdrb_sulteng.setText("");
    txt_pdrb_sultenggara.setText("");
    txt_pdrb_sulut.setText("");
    txt_pdrb_sumut.setText("");
    txt_pdrb_sumsel.setText("");
    txt_pdrb_sumbar.setText("");
    txt_pdrb_yogyakarta.setText("");
    txt_tahun.setText("");
    }
         
    public void simpan(){
        
       String tahun = txt_tahun.getText();  
        //jlabel kabupaten
       String k1,k2,k3,k4,k5,k6,k7,k8,k9,k10,k11,k12,k13,k14,k15,k16,k17,k18,k19,k20,k21,k22,k23,k24,k25,k26,k27;
         k1=kab_bandung.getText();     k2=kab_bdg_barat.getText();   k3=kab_bekasi.getText();    k4=kab_bogor.getText(); 
         k5=kab_ciamis.getText();      k6=kab_cianjur.getText();     k7=kab_cirebon.getText();   k8=kab_garut.getText();
         k9=kab_indramayu.getText();   k10=kab_karawang.getText();   k11=kab_kuningan.getText(); k12=kab_majalengka.getText();
         k13=kab_pangandaran.getText();k14=kab_purwakarta.getText(); k15=kab_subang.getText();   k16=kab_sukabumi.getText();
         k17=kab_sumedang.getText();   k18=kab_tasik.getText();      k19=kota_bandung.getText(); k20=kota_banjar.getText();
         k21=kota_bekasi.getText();    k22=kota_bogor.getText();     k23=kota_cimahi.getText();  k24=kota_cirebon.getText();
         k25=kota_depok.getText();     k26=kota_sukabumi.getText();  k27=kota_tasik.getText(); 
        //textfield kabupaten
       String l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27;
         l1=txt_pdrb_kab_bandung.getText();      l2=txt_pdrb_kab_bandung_barat.getText(); l3=txt_pdrb_kab_bekasi.getText();
         l4=txt_pdrb_kab_bogor.getText();        l5=txt_pdrb_kab_ciamis.getText();        l6=txt_pdrb_kab_cianjur.getText();
         l7=txt_pdrb_kab_cirebon.getText();      l8=txt_pdrb_kab_garut.getText();         l9=txt_pdrb_kab_indramayu.getText();
         l10=txt_pdrb_kab_karawang.getText();    l11=txt_pdrb_kab_kuningan.getText();     l12=txt_pdrb_kab_majalengka.getText();
         l13=txt_pdrb_kab_pangandaran.getText(); l14=txt_pdrb_kab_purwakarta.getText();   l15=txt_pdrb_kab_subang.getText();
         l16=txt_pdrb_kab_sukabumi.getText();    l17=txt_pdrb_kab_sumedang.getText();     l18=txt_pdrb_kab_tasik.getText();         
         l19=txt_pdrb_kota_bandung.getText();    l20=txt_pdrb_kota_banjar.getText();      l21=txt_pdrb_kota_bekasi.getText();       
         l22=txt_pdrb_kota_bogor.getText();      l23=txt_pdrb_kota_cimahi.getText();      l24=txt_pdrb_kota_cirebon.getText();      
         l25=txt_pdrb_kota_depok.getText();      l26=txt_pdrb_kota_sukabumi.getText();    l27=txt_pdrb_kota_tasik.getText();
        //label provinsi    
       String lv1,lv2,lv3,lv4,lv5,lv6,lv7,lv8,lv9,lv10,lv11,lv12,lv13,lv14,lv15,lv16,lv17,lv18,lv19,lv20,lv21,lv22,lv23,lv24,lv25,lv26,lv27,lv28,lv29,lv30,lv31,lv32,lv33,lv34; //lbel provinsi
         lv1=aceh.getText();     lv2=sumut.getText();       lv3=sumbar.getText();   lv4=riau.getText();       lv5=jambi.getText();      lv6=sumsel.getText();
         lv7=bengkulu.getText(); lv8=lampung.getText();     lv9=bangka.getText();   lv10=kep_riau.getText();  lv11=jakarta.getText();   lv12=jabar.getText();
         lv13=jateng.getText();  lv14=yogyakarta.getText(); lv15=jatim.getText();   lv16=banten.getText();    lv17=bali.getText();      lv18=ntb.getText();
         lv19 = ntt.getText();   lv20=kalbar.getText();     lv21=kalteng.getText(); lv22=kalsel.getText();    lv23=kaltim.getText();    lv24=kaltara.getText();
         lv25=sulut.getText();   lv26 = sulteng.getText();  lv27=sulsel.getText();  lv28=sultenggara.getText();   lv29=gorontalo.getText(); lv30=sulbar.getText();
         lv31=maluku.getText();  lv32=malkutar.getText();   lv33=papbar.getText();  lv34=papua.getText();
       //texfield provinsi    
       String tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15,tv16,tv17,tv18,tv19,tv20,tv21,tv22,tv23,tv24,tv25,tv26,tv27,tv28,tv29,tv30,tv31,tv32,tv33,tv34;//text field provinsi
         tv1=txt_pdrb_aceh.getText();      tv2=txt_pdrb_sumbar.getText();       tv3=txt_pdrb_sumut.getText();  tv4=txt_pdrb_riau.getText();
         tv5=txt_pdrb_jambi.getText();     tv6=txt_pdrb_sumsel.getText();      tv7=txt_pdrb_bengkulu.getText();tv8=txt_pdrb_lampung.getText();
         tv9=txt_pdrb_bangka.getText();    tv10=txt_pdrb_kep_riau.getText();   tv11=txt_pdrb_jakarta.getText();tv12=txt_pdrb_jabar.getText();
         tv13=txt_pdrb_jateng.getText();   tv14=txt_pdrb_yogyakarta.getText(); tv15=txt_pdrb_jatim.getText();  tv16=txt_pdrb_banten.getText();
         tv17=txt_pdrb_bali.getText();     tv18=txt_pdrb_ntb.getText();        tv19=txt_pdrb_ntt.getText();    tv20=txt_pdrb_kalbar.getText();
         tv21=txt_pdrb_kalteng.getText();  tv22=txt_pdrb_kalsel.getText();     tv23=txt_pdrb_kaltim.getText(); tv24=txt_pdrb_kaltara.getText();
         tv25=txt_pdrb_sulut.getText();    tv26=txt_pdrb_sulteng.getText();    tv27=txt_pdrb_sulsel.getText(); tv28=txt_pdrb_sultenggara.getText();
         tv29=txt_pdrb_gorontalo.getText();tv30=txt_pdrb_sulbar.getText();     tv31=txt_pdrb_maluku.getText(); tv32=txt_pdrb_malkutar.getText();
         tv33=txt_pdrb_papbar.getText();   tv34=txt_pdrb_papua.getText();
           
        int thn = Integer.parseInt(txt_tahun.getText());
        //id kabupaten   
        int idk1,idk2,idk3,idk4,idk5,idk6,idk7,idk8,idk9,idk10,idk11,idk12,idk13,idk14,idk15,idk16,idk17,idk18,idk19,idk20,idk21,idk22,idk23,idk24,idk25,idk26,idk27;
          idk1=(thn)+(1010000);  idk2=(thn)+(1020000);  idk3=(thn)+(1030000);  idk4=(thn)+(1040000);  idk5=(thn)+(1050000);
          idk6=(thn)+(1060000);  idk7=(thn)+(1070000);  idk8=(thn)+(1080000);  idk9=(thn)+(1090000);  idk10=(thn)+(1100000);
          idk11=(thn)+(1110000); idk12=(thn)+(1120000); idk13=(thn)+(1130000); idk14=(thn)+(1140000); idk15=(thn)+(1150000);
          idk16=(thn)+(1160000); idk17=(thn)+(1170000); idk18=(thn)+(1180000); idk19=(thn)+(1190000); idk20=(thn)+(1200000);
          idk21=(thn)+(1210000); idk22=(thn)+(1220000); idk23=(thn)+(1230000); idk24=(thn)+(1240000); idk25=(thn)+(1250000);
          idk26=(thn)+(1260000); idk27=(thn)+(1270000);
            
        //id provinsi
        int idp1,idp2,idp3,idp4,idp5,idp6,idp7,idp8,idp9,idp10,idp11,idp12,idp13,idp14,idp15,idp16,idp17,idp18,idp19,idp20,idp21,idp22,idp23,idp24,idp25,idp26,idp27,idp28,idp29,idp30,idp31,idp32,idp33,idp34;
          idp1=(thn)+(2010000);  idp2=(thn)+(2020000);  idp3=(thn)+(2030000);   idp4=(thn)+(2040000);  idp5=(thn)+(2050000);
          idp6=(thn)+(2060000);  idp7=(thn)+(2070000);  idp8=(thn)+(2080000);  idp9=(thn)+(2090000);  idp10=(thn)+(2100000);
          idp11=(thn)+(2110000); idp12=(thn)+(2120000); idp13=(thn)+(2130000); idp14=(thn)+(2140000); idp15=(thn)+(2150000);
          idp16=(thn)+(2160000); idp17=(thn)+(2170000); idp18=(thn)+(2180000); idp19=(thn)+(2190000); idp20=(thn)+(2200000);
          idp21=(thn)+(2210000); idp22=(thn)+(2220000); idp23=(thn)+(2230000); idp24=(thn)+(2240000); idp25=(thn)+(2250000);
          idp26=(thn)+(2260000); idp27=(thn)+(2270000); idp28=(thn)+(2280000); idp29=(thn)+(2290000); idp30=(thn)+(2300000);
          idp31=(thn)+(2310000); idp32=(thn)+(2320000); idp33=(thn)+(2330000); idp34=(thn)+(2340000);
          
        
    try {
    //simpan kabupaten
    stm = (Statement) sambung.createStatement();
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk1+"','"+k1+"','"+tahun+"','"+l1+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk2+"','"+k2+"','"+tahun+"','"+l2+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk3+"','"+k3+"','"+tahun+"','"+l3+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk4+"','"+k4+"','"+tahun+"','"+l4+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk5+"','"+k5+"','"+tahun+"','"+l5+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk6+"','"+k6+"','"+tahun+"','"+l6+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk7+"','"+k7+"','"+tahun+"','"+l7+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk8+"','"+k8+"','"+tahun+"','"+l8+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk9+"','"+k9+"','"+tahun+"','"+l9+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk10+"','"+k10+"','"+tahun+"','"+l10+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk11+"','"+k11+"','"+tahun+"','"+l11+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk12+"','"+k12+"','"+tahun+"','"+l12+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk13+"','"+k13+"','"+tahun+"','"+l13+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk14+"','"+k14+"','"+tahun+"','"+l14+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk15+"','"+k15+"','"+tahun+"','"+l15+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk16+"','"+k16+"','"+tahun+"','"+l16+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk17+"','"+k17+"','"+tahun+"','"+l17+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk18+"','"+k18+"','"+tahun+"','"+l18+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk19+"','"+k19+"','"+tahun+"','"+l19+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk20+"','"+k20+"','"+tahun+"','"+l20+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk21+"','"+k21+"','"+tahun+"','"+l21+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk22+"','"+k22+"','"+tahun+"','"+l22+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk23+"','"+k23+"','"+tahun+"','"+l23+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk24+"','"+k24+"','"+tahun+"','"+l24+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk25+"','"+k25+"','"+tahun+"','"+l25+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk26+"','"+k26+"','"+tahun+"','"+l26+"');");
    stm.executeUpdate("INSERT INTO tbl_kabupaten VALUES ('"+idk27+"','"+k27+"','"+tahun+"','"+l27+"');");
       
    //simpan provinsi
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp1+"','"+lv1+"','"+tahun+"','"+tv1+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp2+"','"+lv2+"','"+tahun+"','"+tv2+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp3+"','"+lv3+"','"+tahun+"','"+tv3+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp4+"','"+lv4+"','"+tahun+"','"+tv4+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp5+"','"+lv5+"','"+tahun+"','"+tv5+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp6+"','"+lv6+"','"+tahun+"','"+tv6+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp7+"','"+lv7+"','"+tahun+"','"+tv7+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp8+"','"+lv8+"','"+tahun+"','"+tv8+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp9+"','"+lv9+"','"+tahun+"','"+tv9+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp10+"','"+lv10+"','"+tahun+"','"+tv10+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp11+"','"+lv11+"','"+tahun+"','"+tv11+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp12+"','"+lv12+"','"+tahun+"','"+tv12+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp13+"','"+lv13+"','"+tahun+"','"+tv13+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp14+"','"+lv14+"','"+tahun+"','"+tv14+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp15+"','"+lv15+"','"+tahun+"','"+tv15+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp16+"','"+lv16+"','"+tahun+"','"+tv16+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp17+"','"+lv17+"','"+tahun+"','"+tv17+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp18+"','"+lv18+"','"+tahun+"','"+tv18+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp19+"','"+lv19+"','"+tahun+"','"+tv19+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp20+"','"+lv20+"','"+tahun+"','"+tv20+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp21+"','"+lv21+"','"+tahun+"','"+tv21+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp22+"','"+lv22+"','"+tahun+"','"+tv22+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp23+"','"+lv23+"','"+tahun+"','"+tv23+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp24+"','"+lv24+"','"+tahun+"','"+tv24+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp25+"','"+lv25+"','"+tahun+"','"+tv25+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp26+"','"+lv26+"','"+tahun+"','"+tv26+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp27+"','"+lv27+"','"+tahun+"','"+tv27+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp28+"','"+lv28+"','"+tahun+"','"+tv28+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp29+"','"+lv29+"','"+tahun+"','"+tv29+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp30+"','"+lv30+"','"+tahun+"','"+tv30+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp31+"','"+lv31+"','"+tahun+"','"+tv31+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp32+"','"+lv32+"','"+tahun+"','"+tv32+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp33+"','"+lv33+"','"+tahun+"','"+tv33+"');");
    stm.executeUpdate("INSERT INTO tbl_provinsi VALUES ('"+idp34+"','"+lv34+"','"+tahun+"','"+tv34+"');");
    JOptionPane.showMessageDialog(null,"Data Bersahil Tersimpan"); 
    }
    catch (SQLException e) {
        JOptionPane.showMessageDialog(null,"Erorr/Data Sudah Ada");
         
    }
    }
    /**
     * 
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        tppn1 = new javax.swing.JTextField();
        tppn2 = new javax.swing.JTextField();
        tppn3 = new javax.swing.JTextField();
        tppn4 = new javax.swing.JTextField();
        tppn5 = new javax.swing.JTextField();
        tppn6 = new javax.swing.JTextField();
        tppn7 = new javax.swing.JTextField();
        tppn8 = new javax.swing.JTextField();
        tppn9 = new javax.swing.JTextField();
        tppn10 = new javax.swing.JTextField();
        tppn11 = new javax.swing.JTextField();
        tppn12 = new javax.swing.JTextField();
        tppn13 = new javax.swing.JTextField();
        tppn14 = new javax.swing.JTextField();
        tppn15 = new javax.swing.JTextField();
        tppn16 = new javax.swing.JTextField();
        tppn17 = new javax.swing.JTextField();
        tppn18 = new javax.swing.JTextField();
        tppn19 = new javax.swing.JTextField();
        tppn20 = new javax.swing.JTextField();
        tppn21 = new javax.swing.JTextField();
        tppn22 = new javax.swing.JTextField();
        tppn23 = new javax.swing.JTextField();
        tppn24 = new javax.swing.JTextField();
        tppn25 = new javax.swing.JTextField();
        tppn26 = new javax.swing.JTextField();
        tppn27 = new javax.swing.JTextField();
        tppn28 = new javax.swing.JTextField();
        tppn29 = new javax.swing.JTextField();
        tppn30 = new javax.swing.JTextField();
        tppn31 = new javax.swing.JTextField();
        tppn32 = new javax.swing.JTextField();
        tppn33 = new javax.swing.JTextField();
        tppn34 = new javax.swing.JTextField();
        rdp1 = new javax.swing.JTextField();
        rdp2 = new javax.swing.JTextField();
        rdp3 = new javax.swing.JTextField();
        rdp4 = new javax.swing.JTextField();
        rdp5 = new javax.swing.JTextField();
        rdp6 = new javax.swing.JTextField();
        rdp7 = new javax.swing.JTextField();
        rdp8 = new javax.swing.JTextField();
        rdp9 = new javax.swing.JTextField();
        rdp10 = new javax.swing.JTextField();
        rdp11 = new javax.swing.JTextField();
        rdp12 = new javax.swing.JTextField();
        rdp13 = new javax.swing.JTextField();
        rdp14 = new javax.swing.JTextField();
        rdp15 = new javax.swing.JTextField();
        rdp16 = new javax.swing.JTextField();
        rdp17 = new javax.swing.JTextField();
        rdp18 = new javax.swing.JTextField();
        rdp19 = new javax.swing.JTextField();
        rdp20 = new javax.swing.JTextField();
        rdp21 = new javax.swing.JTextField();
        rdp22 = new javax.swing.JTextField();
        rdp23 = new javax.swing.JTextField();
        rdp24 = new javax.swing.JTextField();
        rdp25 = new javax.swing.JTextField();
        rdp26 = new javax.swing.JTextField();
        rdp27 = new javax.swing.JTextField();
        rdp28 = new javax.swing.JTextField();
        rdp29 = new javax.swing.JTextField();
        rdp30 = new javax.swing.JTextField();
        rdp31 = new javax.swing.JTextField();
        rdp32 = new javax.swing.JTextField();
        rdp33 = new javax.swing.JTextField();
        rdp34 = new javax.swing.JTextField();
        rcp1 = new javax.swing.JTextField();
        rcp2 = new javax.swing.JTextField();
        rcp3 = new javax.swing.JTextField();
        rcp4 = new javax.swing.JTextField();
        rcp5 = new javax.swing.JTextField();
        rcp6 = new javax.swing.JTextField();
        rcp7 = new javax.swing.JTextField();
        rcp8 = new javax.swing.JTextField();
        rcp9 = new javax.swing.JTextField();
        rcp10 = new javax.swing.JTextField();
        rcp11 = new javax.swing.JTextField();
        rcp12 = new javax.swing.JTextField();
        rcp13 = new javax.swing.JTextField();
        rcp14 = new javax.swing.JTextField();
        rcp15 = new javax.swing.JTextField();
        rcp16 = new javax.swing.JTextField();
        rcp17 = new javax.swing.JTextField();
        rcp18 = new javax.swing.JTextField();
        rcp19 = new javax.swing.JTextField();
        rcp20 = new javax.swing.JTextField();
        rcp21 = new javax.swing.JTextField();
        rcp22 = new javax.swing.JTextField();
        rcp23 = new javax.swing.JTextField();
        rcp24 = new javax.swing.JTextField();
        rcp25 = new javax.swing.JTextField();
        rcp26 = new javax.swing.JTextField();
        rcp27 = new javax.swing.JTextField();
        rcp28 = new javax.swing.JTextField();
        rcp29 = new javax.swing.JTextField();
        rcp30 = new javax.swing.JTextField();
        rcp31 = new javax.swing.JTextField();
        rcp32 = new javax.swing.JTextField();
        rcp33 = new javax.swing.JTextField();
        rcp34 = new javax.swing.JTextField();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txt_tahun = new javax.swing.JTextField();
        label_tahun = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jpanel_kabupaten_title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jscroll_kabupaten = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        kab_bandung = new javax.swing.JLabel();
        kab_bdg_barat = new javax.swing.JLabel();
        kab_bekasi = new javax.swing.JLabel();
        kab_bogor = new javax.swing.JLabel();
        kab_ciamis = new javax.swing.JLabel();
        kab_cianjur = new javax.swing.JLabel();
        kab_cirebon = new javax.swing.JLabel();
        kab_garut = new javax.swing.JLabel();
        kab_indramayu = new javax.swing.JLabel();
        kab_karawang = new javax.swing.JLabel();
        kab_kuningan = new javax.swing.JLabel();
        kab_majalengka = new javax.swing.JLabel();
        kab_pangandaran = new javax.swing.JLabel();
        kab_purwakarta = new javax.swing.JLabel();
        kab_subang = new javax.swing.JLabel();
        kab_sukabumi = new javax.swing.JLabel();
        kab_sumedang = new javax.swing.JLabel();
        kab_tasik = new javax.swing.JLabel();
        kota_bandung = new javax.swing.JLabel();
        kota_banjar = new javax.swing.JLabel();
        kota_bekasi = new javax.swing.JLabel();
        kota_bogor = new javax.swing.JLabel();
        kota_cimahi = new javax.swing.JLabel();
        kota_cirebon = new javax.swing.JLabel();
        kota_depok = new javax.swing.JLabel();
        kota_sukabumi = new javax.swing.JLabel();
        kota_tasik = new javax.swing.JLabel();
        txt_pdrb_kab_bandung = new javax.swing.JTextField();
        txt_pdrb_kab_bandung_barat = new javax.swing.JTextField();
        txt_pdrb_kab_bekasi = new javax.swing.JTextField();
        txt_pdrb_kab_bogor = new javax.swing.JTextField();
        txt_pdrb_kab_ciamis = new javax.swing.JTextField();
        txt_pdrb_kab_cianjur = new javax.swing.JTextField();
        txt_pdrb_kab_cirebon = new javax.swing.JTextField();
        txt_pdrb_kab_garut = new javax.swing.JTextField();
        txt_pdrb_kab_indramayu = new javax.swing.JTextField();
        txt_pdrb_kab_karawang = new javax.swing.JTextField();
        txt_pdrb_kab_kuningan = new javax.swing.JTextField();
        txt_pdrb_kab_majalengka = new javax.swing.JTextField();
        txt_pdrb_kab_pangandaran = new javax.swing.JTextField();
        txt_pdrb_kab_purwakarta = new javax.swing.JTextField();
        txt_pdrb_kab_subang = new javax.swing.JTextField();
        txt_pdrb_kab_sukabumi = new javax.swing.JTextField();
        txt_pdrb_kab_sumedang = new javax.swing.JTextField();
        txt_pdrb_kab_tasik = new javax.swing.JTextField();
        txt_pdrb_kota_bandung = new javax.swing.JTextField();
        txt_pdrb_kota_banjar = new javax.swing.JTextField();
        txt_pdrb_kota_bekasi = new javax.swing.JTextField();
        txt_pdrb_kota_bogor = new javax.swing.JTextField();
        txt_pdrb_kota_cimahi = new javax.swing.JTextField();
        txt_pdrb_kota_cirebon = new javax.swing.JTextField();
        txt_pdrb_kota_depok = new javax.swing.JTextField();
        txt_pdrb_kota_sukabumi = new javax.swing.JTextField();
        txt_pdrb_kota_tasik = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        label4 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpanel_Provinsi = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        aceh = new javax.swing.JLabel();
        sumbar = new javax.swing.JLabel();
        sumut = new javax.swing.JLabel();
        riau = new javax.swing.JLabel();
        jambi = new javax.swing.JLabel();
        sumsel = new javax.swing.JLabel();
        bengkulu = new javax.swing.JLabel();
        lampung = new javax.swing.JLabel();
        bangka = new javax.swing.JLabel();
        kep_riau = new javax.swing.JLabel();
        jakarta = new javax.swing.JLabel();
        jabar = new javax.swing.JLabel();
        jateng = new javax.swing.JLabel();
        yogyakarta = new javax.swing.JLabel();
        jatim = new javax.swing.JLabel();
        banten = new javax.swing.JLabel();
        bali = new javax.swing.JLabel();
        ntb = new javax.swing.JLabel();
        ntt = new javax.swing.JLabel();
        kalbar = new javax.swing.JLabel();
        kalteng = new javax.swing.JLabel();
        kalsel = new javax.swing.JLabel();
        kaltim = new javax.swing.JLabel();
        kaltara = new javax.swing.JLabel();
        sulut = new javax.swing.JLabel();
        sulteng = new javax.swing.JLabel();
        sulsel = new javax.swing.JLabel();
        sultenggara = new javax.swing.JLabel();
        gorontalo = new javax.swing.JLabel();
        sulbar = new javax.swing.JLabel();
        maluku = new javax.swing.JLabel();
        malkutar = new javax.swing.JLabel();
        papbar = new javax.swing.JLabel();
        papua = new javax.swing.JLabel();
        txt_pdrb_aceh = new javax.swing.JTextField();
        txt_pdrb_sumut = new javax.swing.JTextField();
        txt_pdrb_sumbar = new javax.swing.JTextField();
        txt_pdrb_riau = new javax.swing.JTextField();
        txt_pdrb_jambi = new javax.swing.JTextField();
        txt_pdrb_sumsel = new javax.swing.JTextField();
        txt_pdrb_bengkulu = new javax.swing.JTextField();
        txt_pdrb_lampung = new javax.swing.JTextField();
        txt_pdrb_bangka = new javax.swing.JTextField();
        txt_pdrb_kep_riau = new javax.swing.JTextField();
        txt_pdrb_jakarta = new javax.swing.JTextField();
        txt_pdrb_jabar = new javax.swing.JTextField();
        txt_pdrb_jateng = new javax.swing.JTextField();
        txt_pdrb_yogyakarta = new javax.swing.JTextField();
        txt_pdrb_jatim = new javax.swing.JTextField();
        txt_pdrb_banten = new javax.swing.JTextField();
        txt_pdrb_bali = new javax.swing.JTextField();
        txt_pdrb_ntb = new javax.swing.JTextField();
        txt_pdrb_ntt = new javax.swing.JTextField();
        txt_pdrb_kalbar = new javax.swing.JTextField();
        txt_pdrb_kalteng = new javax.swing.JTextField();
        txt_pdrb_kalsel = new javax.swing.JTextField();
        txt_pdrb_kaltim = new javax.swing.JTextField();
        txt_pdrb_kaltara = new javax.swing.JTextField();
        txt_pdrb_sulut = new javax.swing.JTextField();
        txt_pdrb_sulteng = new javax.swing.JTextField();
        txt_pdrb_sulsel = new javax.swing.JTextField();
        txt_pdrb_sultenggara = new javax.swing.JTextField();
        txt_pdrb_gorontalo = new javax.swing.JTextField();
        txt_pdrb_sulbar = new javax.swing.JTextField();
        txt_pdrb_maluku = new javax.swing.JTextField();
        txt_pdrb_malkutar = new javax.swing.JTextField();
        txt_pdrb_papbar = new javax.swing.JTextField();
        txt_pdrb_papua = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Tambah_PDRB = new javax.swing.JMenuItem();
        hitung_coba = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Klasifikasi = new javax.swing.JMenuItem();
        kelola_data_klasifikasi = new javax.swing.JMenuItem();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tppn33, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn32, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn31, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn34, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn28, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn22, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn21, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn19, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn18, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn17, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn16, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn15, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tppn11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(tppn8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tppn1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdp33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rdp11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rdp8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdp10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rcp33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rcp11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rcp8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcp1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tppn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tppn34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rdp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rdp34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(rcp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rcp34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setForeground(java.awt.Color.white);

        jPanel_title.setBackground(new java.awt.Color(255, 255, 102));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("INPUT DATA PRODUK DOMESTIK REGIONAL BRUTO");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(189, 189, 189))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("* Masukan Nilai PDRB dalam Juta Rupiah");

        jLabel36.setText("*Input Tahun PDRB");

        label_tahun.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_tahun.setText("Tahun");

        btn_simpan.setText("Simpan");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jpanel_kabupaten_title.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_kabupaten_title.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.blue, 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Input Data PDRB Kabupaten/Kota");

        jscroll_kabupaten.setBorder(null);
        jscroll_kabupaten.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        kab_bandung.setText("Kab. Bandung");

        kab_bdg_barat.setText("Kab. Bandung Barat");

        kab_bekasi.setText("Kab. Bekasi");

        kab_bogor.setText("Kab. Bogor");

        kab_ciamis.setText("Kab. Ciamis");

        kab_cianjur.setText("Kab. Cianjur");
        kab_cianjur.setMaximumSize(new java.awt.Dimension(59, 22));
        kab_cianjur.setPreferredSize(new java.awt.Dimension(2, 2));

        kab_cirebon.setText("Kab. Cirebon");

        kab_garut.setText("Kab. Garut");

        kab_indramayu.setText("Kab. Indramayu");

        kab_karawang.setText("Kab. Karawang");

        kab_kuningan.setText("Kab. Kuningan");

        kab_majalengka.setText("Kab. Majalengka");

        kab_pangandaran.setText("Kab. Pangandaran");

        kab_purwakarta.setText("Kab. Purwakarta");

        kab_subang.setText("Kab. Subang");

        kab_sukabumi.setText("Kab. Sukabumi");

        kab_sumedang.setText("Kab. Sumedang");

        kab_tasik.setText("Kab. Tasik");

        kota_bandung.setText("Kota Bandung");

        kota_banjar.setText("Kota Banjar");

        kota_bekasi.setText("Kota Bekasi");

        kota_bogor.setText("Kota Bogor");

        kota_cimahi.setText("Kota Cimahi");

        kota_cirebon.setText("Kota Cirebon");

        kota_depok.setText("Kota Depok");

        kota_sukabumi.setText("Kota Sukabumi");

        kota_tasik.setText("Kota Tasik");

        txt_pdrb_kab_bandung.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_pdrb_kab_bandung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pdrb_kab_bandungActionPerformed(evt);
            }
        });

        txt_pdrb_kab_bandung_barat.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_bekasi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_bogor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_ciamis.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_cianjur.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_cirebon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_garut.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_indramayu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_karawang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_kuningan.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_majalengka.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_pangandaran.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_purwakarta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_subang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_sukabumi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_sumedang.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kab_tasik.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_bandung.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_banjar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_bekasi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_bogor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_cimahi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_cirebon.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_depok.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_sukabumi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kota_tasik.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel9.setText("1.");

        jLabel10.setText("2.");

        jLabel11.setText("3.");

        jLabel12.setText("4.");

        jLabel13.setText("5.");

        jLabel14.setText("6.");

        jLabel15.setText("7.");

        jLabel16.setText("8.");

        jLabel17.setText("9.");

        jLabel18.setText("10.");

        jLabel19.setText("11.");

        jLabel20.setText("12.");

        jLabel21.setText("13.");

        jLabel22.setText("14.");

        jLabel23.setText("15.");

        jLabel24.setText("16.");

        jLabel25.setText("17.");

        jLabel26.setText("18.");

        jLabel27.setText("19.");

        jLabel28.setText("20.");

        jLabel29.setText("21.");

        jLabel30.setText("22.");

        jLabel31.setText("23.");

        jLabel32.setText("24.");

        jLabel33.setText("25.");

        jLabel34.setText("26.");

        jLabel35.setText("27.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jLabel32))
                    .addComponent(jLabel31)
                    .addComponent(jLabel30)
                    .addComponent(jLabel29)
                    .addComponent(jLabel28)
                    .addComponent(jLabel27)
                    .addComponent(jLabel26)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kab_bdg_barat)
                            .addComponent(kab_bandung)
                            .addComponent(kab_bekasi)
                            .addComponent(kab_bogor)
                            .addComponent(kab_ciamis)
                            .addComponent(kab_cianjur, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kab_cirebon)
                            .addComponent(kab_garut)
                            .addComponent(kab_indramayu)
                            .addComponent(kab_karawang)
                            .addComponent(kab_kuningan)
                            .addComponent(kab_majalengka)
                            .addComponent(kab_pangandaran)
                            .addComponent(kab_sumedang)
                            .addComponent(kab_tasik)
                            .addComponent(kota_bandung)
                            .addComponent(kota_banjar)
                            .addComponent(kota_bogor)
                            .addComponent(kota_cimahi)
                            .addComponent(kota_cirebon)
                            .addComponent(kota_depok)
                            .addComponent(kota_sukabumi)
                            .addComponent(kota_tasik)
                            .addComponent(kab_purwakarta)
                            .addComponent(kab_subang)
                            .addComponent(kab_sukabumi))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txt_pdrb_kota_banjar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_bandung, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_bogor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_cimahi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_cirebon, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_depok, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_sukabumi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_tasik, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kota_bekasi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_pdrb_kab_sukabumi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_subang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_purwakarta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_pangandaran, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_majalengka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_kuningan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_karawang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_indramayu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_garut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_cirebon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_pdrb_kab_bandung_barat, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_pdrb_kab_bogor, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_pdrb_kab_ciamis, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_pdrb_kab_cianjur, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_pdrb_kab_bekasi, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txt_pdrb_kab_bandung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                .addComponent(txt_pdrb_kab_sumedang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_pdrb_kab_tasik, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(kota_bekasi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_bandung)
                    .addComponent(jLabel9)
                    .addComponent(txt_pdrb_kab_bandung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_bdg_barat)
                    .addComponent(txt_pdrb_kab_bandung_barat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_bekasi)
                    .addComponent(txt_pdrb_kab_bekasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_bogor)
                    .addComponent(txt_pdrb_kab_bogor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_ciamis)
                    .addComponent(txt_pdrb_kab_ciamis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_cianjur, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_kab_cianjur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_cirebon)
                    .addComponent(txt_pdrb_kab_cirebon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_garut)
                    .addComponent(txt_pdrb_kab_garut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pdrb_kab_indramayu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kab_indramayu)
                    .addComponent(jLabel17))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_karawang)
                    .addComponent(jLabel18)
                    .addComponent(txt_pdrb_kab_karawang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_kuningan)
                    .addComponent(jLabel19)
                    .addComponent(txt_pdrb_kab_kuningan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_majalengka)
                    .addComponent(jLabel20)
                    .addComponent(txt_pdrb_kab_majalengka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_pangandaran)
                    .addComponent(jLabel21)
                    .addComponent(txt_pdrb_kab_pangandaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kab_purwakarta)
                    .addComponent(jLabel22)
                    .addComponent(txt_pdrb_kab_purwakarta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(kab_subang)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_pdrb_kab_subang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(kab_sukabumi)
                            .addComponent(txt_pdrb_kab_sukabumi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kab_sumedang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kab_sumedang)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kab_tasik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kab_tasik)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_bandung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_bandung)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_banjar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_banjar)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_bekasi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_bekasi)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_bogor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_bogor)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_cimahi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_cimahi)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_cirebon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_cirebon)
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_depok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_depok)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_sukabumi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_sukabumi)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_pdrb_kota_tasik, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kota_tasik)
                            .addComponent(jLabel35))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kab_bekasi.getAccessibleContext().setAccessibleDescription("");

        jscroll_kabupaten.setViewportView(jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Nama Kota");

        label4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label4.setText("Nilai PDRB");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Provinsi Jawa Barat");

        javax.swing.GroupLayout jpanel_kabupaten_titleLayout = new javax.swing.GroupLayout(jpanel_kabupaten_title);
        jpanel_kabupaten_title.setLayout(jpanel_kabupaten_titleLayout);
        jpanel_kabupaten_titleLayout.setHorizontalGroup(
            jpanel_kabupaten_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_kabupaten_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jscroll_kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_kabupaten_titleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(36, 36, 36))
            .addGroup(jpanel_kabupaten_titleLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jpanel_kabupaten_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jpanel_kabupaten_titleLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(142, 142, 142)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(label4)
                .addGap(28, 28, 28))
        );
        jpanel_kabupaten_titleLayout.setVerticalGroup(
            jpanel_kabupaten_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_kabupaten_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jpanel_kabupaten_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jscroll_kabupaten, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        jpanel_Provinsi.setBackground(new java.awt.Color(255, 255, 255));
        jpanel_Provinsi.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.green, 2));

        jLabel78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel78.setText("Input Data PDRB Provinsi Indonesia");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Nama Provinsi");

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel40.setText("Nilai PDRB");

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        aceh.setText("Aceh ");

        sumbar.setText("SUMBAR");

        sumut.setText("SUMUT");

        riau.setText("Riau");

        jambi.setText("Jambi");

        sumsel.setText("SUMSEL");

        bengkulu.setText("Bengkulu");

        lampung.setText("Lampung");

        bangka.setText("Bangka Belitung");

        kep_riau.setText("Kep. Riau");

        jakarta.setText("DKI Jakarta");

        jabar.setText("Jawa Barat");

        jateng.setText("Jawa Tengah");

        yogyakarta.setText("DI. Yogyakarta");

        jatim.setText("Jawa Timur");

        banten.setText("Banten");

        bali.setText("Bali");

        ntb.setText("NTB");

        ntt.setText("NTT");

        kalbar.setText("KALBAR");

        kalteng.setText("KALTENG");

        kalsel.setText("KALSEL");

        kaltim.setText("KALTIM");

        kaltara.setText("KALTARA");

        sulut.setText("SULUT");

        sulteng.setText("SULTENG");

        sulsel.setText("SULSEL");

        sultenggara.setText("SULTENGGARA");

        gorontalo.setText("GORONTALO");

        sulbar.setText("SULBAR");

        maluku.setText("MALUKU");

        malkutar.setText("MALKUTAR");

        papbar.setText("PAPBAR");

        papua.setText("PAPUA");

        txt_pdrb_aceh.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sumut.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sumbar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_riau.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_jambi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sumsel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_bengkulu.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_lampung.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_bangka.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kep_riau.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_jakarta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_jabar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_jateng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_yogyakarta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_jatim.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_banten.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_bali.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_ntb.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_ntt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kalbar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kalteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kalsel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kaltim.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_kaltara.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sulut.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sulteng.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sulsel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sultenggara.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_gorontalo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_sulbar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_maluku.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_malkutar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_papbar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        txt_pdrb_papua.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel43.setText("1.");

        jLabel44.setText("2.");

        jLabel45.setText("3.");

        jLabel46.setText("4.");

        jLabel47.setText("5.");

        jLabel48.setText("6.");

        jLabel49.setText("7.");

        jLabel50.setText("8.");

        jLabel51.setText("9.");

        jLabel52.setText("10.");

        jLabel53.setText("11.");

        jLabel54.setText("12.");

        jLabel55.setText("13");

        jLabel56.setText("14.");

        jLabel57.setText("15.");

        jLabel58.setText("16.");

        jLabel59.setText("17.");

        jLabel60.setText("18.");

        jLabel61.setText("19.");

        jLabel62.setText("20.");

        jLabel63.setText("21.");

        jLabel64.setText("22.");

        jLabel65.setText("23.");

        jLabel66.setText("24.");

        jLabel67.setText("25.");

        jLabel68.setText("26.");

        jLabel69.setText("27.");

        jLabel70.setText("28.");

        jLabel71.setText("29.");

        jLabel72.setText("30.");

        jLabel73.setText("31.");

        jLabel74.setText("32.");

        jLabel75.setText("33.");

        jLabel76.setText("34.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(papua))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kalsel))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73)
                            .addComponent(jLabel74)
                            .addComponent(jLabel75))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lampung)
                            .addComponent(sumsel)
                            .addComponent(jambi)
                            .addComponent(riau)
                            .addComponent(aceh)
                            .addComponent(kep_riau)
                            .addComponent(jakarta)
                            .addComponent(jabar)
                            .addComponent(jateng)
                            .addComponent(yogyakarta)
                            .addComponent(bengkulu)
                            .addComponent(sultenggara)
                            .addComponent(gorontalo)
                            .addComponent(sulbar)
                            .addComponent(maluku)
                            .addComponent(malkutar)
                            .addComponent(papbar)
                            .addComponent(jatim)
                            .addComponent(banten)
                            .addComponent(bali)
                            .addComponent(ntb)
                            .addComponent(ntt)
                            .addComponent(kalbar)
                            .addComponent(kalteng)
                            .addComponent(kaltim)
                            .addComponent(kaltara)
                            .addComponent(sulut)
                            .addComponent(sulteng)
                            .addComponent(sulsel)
                            .addComponent(bangka)
                            .addComponent(sumbar)
                            .addComponent(sumut))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_pdrb_papbar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_malkutar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_maluku, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_sulbar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_gorontalo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_papua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_sultenggara, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_sulsel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_sulteng, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_sulut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_kaltara, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_kaltim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_kalsel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_kalteng, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_kalbar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_ntt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_ntb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_bali, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_banten, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_jatim, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_yogyakarta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_jateng, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_jabar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_pdrb_jakarta, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_pdrb_lampung, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_bangka, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_bengkulu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_sumsel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_jambi, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_riau, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_sumbar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_sumut, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_kep_riau, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pdrb_aceh, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(234, 234, 234))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceh)
                    .addComponent(txt_pdrb_aceh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pdrb_sumut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(sumut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pdrb_sumbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(sumbar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(riau)
                    .addComponent(txt_pdrb_riau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jambi)
                    .addComponent(txt_pdrb_jambi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumsel)
                    .addComponent(txt_pdrb_sumsel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bengkulu)
                    .addComponent(txt_pdrb_bengkulu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lampung)
                    .addComponent(txt_pdrb_lampung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bangka)
                    .addComponent(txt_pdrb_bangka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kep_riau)
                    .addComponent(txt_pdrb_kep_riau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jakarta)
                    .addComponent(txt_pdrb_jakarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jabar)
                    .addComponent(txt_pdrb_jabar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jateng)
                    .addComponent(txt_pdrb_jateng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yogyakarta)
                    .addComponent(txt_pdrb_yogyakarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jatim)
                    .addComponent(txt_pdrb_jatim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(banten)
                    .addComponent(txt_pdrb_banten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bali)
                    .addComponent(txt_pdrb_bali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ntb)
                    .addComponent(txt_pdrb_ntb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel60))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ntt)
                    .addComponent(txt_pdrb_ntt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalbar)
                    .addComponent(txt_pdrb_kalbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalteng)
                    .addComponent(txt_pdrb_kalteng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kalsel)
                    .addComponent(txt_pdrb_kalsel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pdrb_kaltim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaltim)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaltara)
                    .addComponent(txt_pdrb_kaltara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sulut)
                    .addComponent(txt_pdrb_sulut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sulteng)
                    .addComponent(txt_pdrb_sulteng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sulsel)
                    .addComponent(txt_pdrb_sulsel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sultenggara)
                    .addComponent(txt_pdrb_sultenggara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gorontalo)
                    .addComponent(txt_pdrb_gorontalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sulbar)
                    .addComponent(txt_pdrb_sulbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maluku)
                    .addComponent(txt_pdrb_maluku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(malkutar)
                    .addComponent(txt_pdrb_malkutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(papbar)
                    .addComponent(txt_pdrb_papbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(papua)
                    .addComponent(jLabel76)
                    .addComponent(txt_pdrb_papua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jScrollPane2.setViewportView(jPanel2);

        javax.swing.GroupLayout jpanel_ProvinsiLayout = new javax.swing.GroupLayout(jpanel_Provinsi);
        jpanel_Provinsi.setLayout(jpanel_ProvinsiLayout);
        jpanel_ProvinsiLayout.setHorizontalGroup(
            jpanel_ProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ProvinsiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40)
                .addGap(44, 44, 44))
            .addGroup(jpanel_ProvinsiLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanel_ProvinsiLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addGap(23, 23, 23))
        );
        jpanel_ProvinsiLayout.setVerticalGroup(
            jpanel_ProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanel_ProvinsiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addGroup(jpanel_ProvinsiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("File");

        Tambah_PDRB.setText("Tambah Data PDRB");
        Tambah_PDRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tambah_PDRBActionPerformed(evt);
            }
        });
        jMenu1.add(Tambah_PDRB);

        hitung_coba.setText("Lihat Data PDRB");
        hitung_coba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung_cobaActionPerformed(evt);
            }
        });
        jMenu1.add(hitung_coba);

        jMenuItem1.setText("Halaman Utama");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Klasifikasi");

        Klasifikasi.setText("Klasifikasi Kab/Kota");
        Klasifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlasifikasiActionPerformed(evt);
            }
        });
        jMenu2.add(Klasifikasi);

        kelola_data_klasifikasi.setText("Data Klasifikasi");
        kelola_data_klasifikasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelola_data_klasifikasiActionPerformed(evt);
            }
        });
        jMenu2.add(kelola_data_klasifikasi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_tahun)
                        .addGap(18, 18, 18)
                        .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel36))
                    .addComponent(jpanel_kabupaten_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(btn_simpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpanel_Provinsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_tahun)
                    .addComponent(txt_tahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(btn_simpan)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpanel_kabupaten_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpanel_Provinsi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
    openDB();
        if (txt_pdrb_aceh.getText().equals("")||txt_pdrb_bali.getText().equals("")||txt_pdrb_bangka.getText().equals("")||txt_pdrb_banten.getText().equals("")||txt_pdrb_bengkulu.getText().equals("")||
        txt_pdrb_gorontalo.getText().equals("")||txt_pdrb_jabar.getText().equals("")||txt_pdrb_jakarta.getText().equals("")||txt_pdrb_jambi.getText().equals("")||txt_pdrb_jateng.getText().equals("")||
        txt_pdrb_jatim.getText().equals("")||txt_pdrb_kab_bandung.getText().equals("")||txt_pdrb_kab_bandung_barat.getText().equals("")||txt_pdrb_kab_bekasi.getText().equals("")||
        txt_pdrb_kab_bogor.getText().equals("")||txt_pdrb_kab_ciamis.getText().equals("")||txt_pdrb_kab_cianjur.getText().equals("")||txt_pdrb_kab_cirebon.getText().equals("")||
        txt_pdrb_kab_garut.getText().equals("")||txt_pdrb_kab_indramayu.getText().equals("")||txt_pdrb_kab_karawang.getText().equals("")||txt_pdrb_kab_kuningan.getText().equals("")||
        txt_pdrb_kab_majalengka.getText().equals("")||txt_pdrb_kab_pangandaran.getText().equals("")||txt_pdrb_kab_purwakarta.getText().equals("")||txt_pdrb_kab_subang.getText().equals("")||
        txt_pdrb_kab_sukabumi.getText().equals("")||txt_pdrb_kab_sumedang.getText().equals("")||txt_pdrb_kab_tasik.getText().equals("")||txt_pdrb_kalbar.getText().equals("")||
        txt_pdrb_kalsel.getText().equals("")||txt_pdrb_kaltara.getText().equals("")||txt_pdrb_kalteng.getText().equals("")||txt_pdrb_kaltim.getText().equals("")||txt_pdrb_kep_riau.getText().equals("")||
        txt_pdrb_kota_bandung.getText().equals("")||txt_pdrb_kota_banjar.getText().equals("")||txt_pdrb_kota_bekasi.getText().equals("")||txt_pdrb_kota_bogor.getText().equals("")||
        txt_pdrb_kota_cimahi.getText().equals("")||txt_pdrb_kota_cirebon.getText().equals("")||txt_pdrb_kota_depok.getText().equals("")||txt_pdrb_kota_sukabumi.getText().equals("")||
        txt_pdrb_kota_tasik.getText().equals("")||txt_pdrb_lampung.getText().equals("")||txt_pdrb_malkutar.getText().equals("")||txt_pdrb_maluku.getText().equals("")||txt_pdrb_ntb.getText().equals("")||
        txt_pdrb_ntt.getText().equals("")||txt_pdrb_papbar.getText().equals("")||txt_pdrb_papua.getText().equals("")||txt_pdrb_riau.getText().equals("")||txt_pdrb_sulbar.getText().equals("")||
        txt_pdrb_sulsel.getText().equals("")||txt_pdrb_sulteng.getText().equals("")||txt_pdrb_sultenggara.getText().equals("")||txt_pdrb_sulut.getText().equals("")||txt_pdrb_sumut.getText().equals("")||
        txt_pdrb_sumsel.getText().equals("")||txt_pdrb_sumbar.getText().equals("")||txt_pdrb_yogyakarta.getText().equals("")||txt_tahun.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Semua Nilai PDRB Harus Diisi");
    }else{
        simpan();
    }
        
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    bersih();       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_pdrb_kab_bandungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pdrb_kab_bandungActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pdrb_kab_bandungActionPerformed

    private void hitung_cobaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitung_cobaActionPerformed
        this.dispose();
        new Kelola_PDRB().show();
    }//GEN-LAST:event_hitung_cobaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        new Halaman_Home();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void KlasifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlasifikasiActionPerformed
        this.dispose();
        new coba().show();
    }//GEN-LAST:event_KlasifikasiActionPerformed

    private void kelola_data_klasifikasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelola_data_klasifikasiActionPerformed
        this.dispose();
        new Klasifikasi().show();
    }//GEN-LAST:event_kelola_data_klasifikasiActionPerformed

    private void Tambah_PDRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tambah_PDRBActionPerformed
        this.dispose();
        new MenuUtama().show();
    }//GEN-LAST:event_Tambah_PDRBActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Klasifikasi;
    private javax.swing.JMenuItem Tambah_PDRB;
    private javax.swing.JLabel aceh;
    private javax.swing.JLabel bali;
    private javax.swing.JLabel bangka;
    private javax.swing.JLabel banten;
    private javax.swing.JLabel bengkulu;
    private javax.swing.JToggleButton btn_simpan;
    private javax.swing.JLabel gorontalo;
    private javax.swing.JMenuItem hitung_coba;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jabar;
    private javax.swing.JLabel jakarta;
    private javax.swing.JLabel jambi;
    private javax.swing.JLabel jateng;
    private javax.swing.JLabel jatim;
    private javax.swing.JPanel jpanel_Provinsi;
    private javax.swing.JPanel jpanel_kabupaten_title;
    private javax.swing.JScrollPane jscroll_kabupaten;
    private javax.swing.JLabel kab_bandung;
    private javax.swing.JLabel kab_bdg_barat;
    private javax.swing.JLabel kab_bekasi;
    private javax.swing.JLabel kab_bogor;
    private javax.swing.JLabel kab_ciamis;
    private javax.swing.JLabel kab_cianjur;
    private javax.swing.JLabel kab_cirebon;
    private javax.swing.JLabel kab_garut;
    private javax.swing.JLabel kab_indramayu;
    private javax.swing.JLabel kab_karawang;
    private javax.swing.JLabel kab_kuningan;
    private javax.swing.JLabel kab_majalengka;
    private javax.swing.JLabel kab_pangandaran;
    private javax.swing.JLabel kab_purwakarta;
    private javax.swing.JLabel kab_subang;
    private javax.swing.JLabel kab_sukabumi;
    private javax.swing.JLabel kab_sumedang;
    private javax.swing.JLabel kab_tasik;
    private javax.swing.JLabel kalbar;
    private javax.swing.JLabel kalsel;
    private javax.swing.JLabel kaltara;
    private javax.swing.JLabel kalteng;
    private javax.swing.JLabel kaltim;
    private javax.swing.JMenuItem kelola_data_klasifikasi;
    private javax.swing.JLabel kep_riau;
    private javax.swing.JLabel kota_bandung;
    private javax.swing.JLabel kota_banjar;
    private javax.swing.JLabel kota_bekasi;
    private javax.swing.JLabel kota_bogor;
    private javax.swing.JLabel kota_cimahi;
    private javax.swing.JLabel kota_cirebon;
    private javax.swing.JLabel kota_depok;
    private javax.swing.JLabel kota_sukabumi;
    private javax.swing.JLabel kota_tasik;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label_tahun;
    private javax.swing.JLabel lampung;
    private javax.swing.JLabel malkutar;
    private javax.swing.JLabel maluku;
    private javax.swing.JLabel ntb;
    private javax.swing.JLabel ntt;
    private javax.swing.JLabel papbar;
    private javax.swing.JLabel papua;
    private javax.swing.JTextField rcp1;
    private javax.swing.JTextField rcp10;
    private javax.swing.JTextField rcp11;
    private javax.swing.JTextField rcp12;
    private javax.swing.JTextField rcp13;
    private javax.swing.JTextField rcp14;
    private javax.swing.JTextField rcp15;
    private javax.swing.JTextField rcp16;
    private javax.swing.JTextField rcp17;
    private javax.swing.JTextField rcp18;
    private javax.swing.JTextField rcp19;
    private javax.swing.JTextField rcp2;
    private javax.swing.JTextField rcp20;
    private javax.swing.JTextField rcp21;
    private javax.swing.JTextField rcp22;
    private javax.swing.JTextField rcp23;
    private javax.swing.JTextField rcp24;
    private javax.swing.JTextField rcp25;
    private javax.swing.JTextField rcp26;
    private javax.swing.JTextField rcp27;
    private javax.swing.JTextField rcp28;
    private javax.swing.JTextField rcp29;
    private javax.swing.JTextField rcp3;
    private javax.swing.JTextField rcp30;
    private javax.swing.JTextField rcp31;
    private javax.swing.JTextField rcp32;
    private javax.swing.JTextField rcp33;
    private javax.swing.JTextField rcp34;
    private javax.swing.JTextField rcp4;
    private javax.swing.JTextField rcp5;
    private javax.swing.JTextField rcp6;
    private javax.swing.JTextField rcp7;
    private javax.swing.JTextField rcp8;
    private javax.swing.JTextField rcp9;
    private javax.swing.JTextField rdp1;
    private javax.swing.JTextField rdp10;
    private javax.swing.JTextField rdp11;
    private javax.swing.JTextField rdp12;
    private javax.swing.JTextField rdp13;
    private javax.swing.JTextField rdp14;
    private javax.swing.JTextField rdp15;
    private javax.swing.JTextField rdp16;
    private javax.swing.JTextField rdp17;
    private javax.swing.JTextField rdp18;
    private javax.swing.JTextField rdp19;
    private javax.swing.JTextField rdp2;
    private javax.swing.JTextField rdp20;
    private javax.swing.JTextField rdp21;
    private javax.swing.JTextField rdp22;
    private javax.swing.JTextField rdp23;
    private javax.swing.JTextField rdp24;
    private javax.swing.JTextField rdp25;
    private javax.swing.JTextField rdp26;
    private javax.swing.JTextField rdp27;
    private javax.swing.JTextField rdp28;
    private javax.swing.JTextField rdp29;
    private javax.swing.JTextField rdp3;
    private javax.swing.JTextField rdp30;
    private javax.swing.JTextField rdp31;
    private javax.swing.JTextField rdp32;
    private javax.swing.JTextField rdp33;
    private javax.swing.JTextField rdp34;
    private javax.swing.JTextField rdp4;
    private javax.swing.JTextField rdp5;
    private javax.swing.JTextField rdp6;
    private javax.swing.JTextField rdp7;
    private javax.swing.JTextField rdp8;
    private javax.swing.JTextField rdp9;
    private javax.swing.JLabel riau;
    private javax.swing.JLabel sulbar;
    private javax.swing.JLabel sulsel;
    private javax.swing.JLabel sulteng;
    private javax.swing.JLabel sultenggara;
    private javax.swing.JLabel sulut;
    private javax.swing.JLabel sumbar;
    private javax.swing.JLabel sumsel;
    private javax.swing.JLabel sumut;
    private javax.swing.JTextField tppn1;
    private javax.swing.JTextField tppn10;
    private javax.swing.JTextField tppn11;
    private javax.swing.JTextField tppn12;
    private javax.swing.JTextField tppn13;
    private javax.swing.JTextField tppn14;
    private javax.swing.JTextField tppn15;
    private javax.swing.JTextField tppn16;
    private javax.swing.JTextField tppn17;
    private javax.swing.JTextField tppn18;
    private javax.swing.JTextField tppn19;
    private javax.swing.JTextField tppn2;
    private javax.swing.JTextField tppn20;
    private javax.swing.JTextField tppn21;
    private javax.swing.JTextField tppn22;
    private javax.swing.JTextField tppn23;
    private javax.swing.JTextField tppn24;
    private javax.swing.JTextField tppn25;
    private javax.swing.JTextField tppn26;
    private javax.swing.JTextField tppn27;
    private javax.swing.JTextField tppn28;
    private javax.swing.JTextField tppn29;
    private javax.swing.JTextField tppn3;
    private javax.swing.JTextField tppn30;
    private javax.swing.JTextField tppn31;
    private javax.swing.JTextField tppn32;
    private javax.swing.JTextField tppn33;
    private javax.swing.JTextField tppn34;
    private javax.swing.JTextField tppn4;
    private javax.swing.JTextField tppn5;
    private javax.swing.JTextField tppn6;
    private javax.swing.JTextField tppn7;
    private javax.swing.JTextField tppn8;
    private javax.swing.JTextField tppn9;
    private javax.swing.JTextField txt_pdrb_aceh;
    private javax.swing.JTextField txt_pdrb_bali;
    private javax.swing.JTextField txt_pdrb_bangka;
    private javax.swing.JTextField txt_pdrb_banten;
    private javax.swing.JTextField txt_pdrb_bengkulu;
    private javax.swing.JTextField txt_pdrb_gorontalo;
    private javax.swing.JTextField txt_pdrb_jabar;
    private javax.swing.JTextField txt_pdrb_jakarta;
    private javax.swing.JTextField txt_pdrb_jambi;
    private javax.swing.JTextField txt_pdrb_jateng;
    private javax.swing.JTextField txt_pdrb_jatim;
    private javax.swing.JTextField txt_pdrb_kab_bandung;
    private javax.swing.JTextField txt_pdrb_kab_bandung_barat;
    private javax.swing.JTextField txt_pdrb_kab_bekasi;
    private javax.swing.JTextField txt_pdrb_kab_bogor;
    private javax.swing.JTextField txt_pdrb_kab_ciamis;
    private javax.swing.JTextField txt_pdrb_kab_cianjur;
    private javax.swing.JTextField txt_pdrb_kab_cirebon;
    private javax.swing.JTextField txt_pdrb_kab_garut;
    private javax.swing.JTextField txt_pdrb_kab_indramayu;
    private javax.swing.JTextField txt_pdrb_kab_karawang;
    private javax.swing.JTextField txt_pdrb_kab_kuningan;
    private javax.swing.JTextField txt_pdrb_kab_majalengka;
    private javax.swing.JTextField txt_pdrb_kab_pangandaran;
    private javax.swing.JTextField txt_pdrb_kab_purwakarta;
    private javax.swing.JTextField txt_pdrb_kab_subang;
    private javax.swing.JTextField txt_pdrb_kab_sukabumi;
    private javax.swing.JTextField txt_pdrb_kab_sumedang;
    private javax.swing.JTextField txt_pdrb_kab_tasik;
    private javax.swing.JTextField txt_pdrb_kalbar;
    private javax.swing.JTextField txt_pdrb_kalsel;
    private javax.swing.JTextField txt_pdrb_kaltara;
    private javax.swing.JTextField txt_pdrb_kalteng;
    private javax.swing.JTextField txt_pdrb_kaltim;
    private javax.swing.JTextField txt_pdrb_kep_riau;
    private javax.swing.JTextField txt_pdrb_kota_bandung;
    private javax.swing.JTextField txt_pdrb_kota_banjar;
    private javax.swing.JTextField txt_pdrb_kota_bekasi;
    private javax.swing.JTextField txt_pdrb_kota_bogor;
    private javax.swing.JTextField txt_pdrb_kota_cimahi;
    private javax.swing.JTextField txt_pdrb_kota_cirebon;
    private javax.swing.JTextField txt_pdrb_kota_depok;
    private javax.swing.JTextField txt_pdrb_kota_sukabumi;
    private javax.swing.JTextField txt_pdrb_kota_tasik;
    private javax.swing.JTextField txt_pdrb_lampung;
    private javax.swing.JTextField txt_pdrb_malkutar;
    private javax.swing.JTextField txt_pdrb_maluku;
    private javax.swing.JTextField txt_pdrb_ntb;
    private javax.swing.JTextField txt_pdrb_ntt;
    private javax.swing.JTextField txt_pdrb_papbar;
    private javax.swing.JTextField txt_pdrb_papua;
    private javax.swing.JTextField txt_pdrb_riau;
    private javax.swing.JTextField txt_pdrb_sulbar;
    private javax.swing.JTextField txt_pdrb_sulsel;
    private javax.swing.JTextField txt_pdrb_sulteng;
    private javax.swing.JTextField txt_pdrb_sultenggara;
    private javax.swing.JTextField txt_pdrb_sulut;
    private javax.swing.JTextField txt_pdrb_sumbar;
    private javax.swing.JTextField txt_pdrb_sumsel;
    private javax.swing.JTextField txt_pdrb_sumut;
    private javax.swing.JTextField txt_pdrb_yogyakarta;
    private javax.swing.JTextField txt_tahun;
    private javax.swing.JLabel yogyakarta;
    // End of variables declaration//GEN-END:variables
}
