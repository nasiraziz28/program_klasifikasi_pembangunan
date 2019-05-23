package fuzzy;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Koneksi {
    Connection con;
    Statement stm;
    
    public void config(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/klasifikasi", "root", "");
            stm = con.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
        }
    }
    
    String user = "root";
                    String password = "";
    
    private static Connection Koneksi;
        public static Connection getConnection(){
            if(Koneksi == null){
                try {
                    String url = "jdbc:mysql://localhost:3306/klasifikasi";
                    String user = "root";
                    String password = "";

                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    Koneksi = DriverManager.getConnection(url, user, password);
                }
                catch(SQLException t) {
                    System.out.println("Lost Conected");
                }
            }
            return Koneksi;
    }
  private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost:3306/klasifikasi";
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    
}
