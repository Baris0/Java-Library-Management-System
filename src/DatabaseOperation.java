import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseOperation {
    
    private Connection con = null;
    private Statement stmt = null;
    private PreparedStatement prstmt = null;
    
    public DatabaseOperation(){
        
        String url = "jdbc:mysql://" + DataInformation.HOST + ":" + DataInformation.PORT + "/" + DataInformation.DB_ISMI;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Bir Hata Meydana Geldi!");
        }
        
        try {
            con = DriverManager.getConnection(url, DataInformation.KULLANICI_ADI, DataInformation.PAROLA);
            
        } catch (SQLException ex) {
            System.out.println("Bir Hata Meydana Geldi!");
        }
        
    }
    
    public ArrayList<Book> kutuphaneGetir(){
        ArrayList<Book> cikti = new ArrayList<Book>();
        
        try {
            stmt = con.createStatement();
            
            String sorgu = "Select * From books";
            ResultSet rs = stmt.executeQuery(sorgu);
            
            while(rs.next()){
                String kitapIsmi = rs.getString("KitapIsmi");
                String yazar = rs.getString("Yazari");
                String tur = rs.getString("Turu");
                String sayfaSayisi = rs.getString("SayfaSayisi");
                String kitapId = rs.getString("KitapId");
                
                cikti.add(new Book(kitapIsmi, yazar, tur, sayfaSayisi, kitapId));
   
            }
            return cikti;
            
        } catch (SQLException ex) {
            System.out.println("Bir Hata Meydana Geldi!");
            return null;
        }
        
    }
    
    public boolean girisYapildiMi(String userName, String password){
        
        String sorgu = "Select * From admin where Username = ? and Password = ?";
        
        try {
            prstmt = con.prepareStatement(sorgu);
            
            prstmt.setString(1, userName);
            prstmt.setString(2, password);
            
            ResultSet rs = prstmt.executeQuery();
            return rs.next();
            
        } catch (SQLException ex) {
            System.out.println("Bir Hata Meydana Geldi!");
            return false;
        }
        
    }
    public void kitapSil(String id){
        
        try {
            stmt = con.createStatement();
            String sorgu = "Delete From books Where KitapId = " + id;
            stmt.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            System.out.println("Silinirken Bir Hata Meydana Geldi");
        }
        
    }
    public void kitapGuncelle(String kitapIsmi, String yazari, String turu, String sayfaSayisi, String yeniId){
        
        try {
            stmt = con.createStatement();
            String sorgu = "Update books Set KitapAdi = ?, Yazari = ?, Turu = ?, SayfaSayisi = ?, KitapId = ?, Where = KitapId";
            
            prstmt = con.prepareStatement(sorgu);
             
            prstmt.setString(1, kitapIsmi);
            prstmt.setString(2, yazari);
            prstmt.setString(3, turu);
            prstmt.setString(4, sayfaSayisi);
            prstmt.setString(5, yeniId);
            
        } catch (SQLException ex) {
            System.out.println("Guncellenirken Bir Hata Meydana Geldi!");
        }
        
        
    }
    public void kitapEkle(String kitapIsmi, String yazar, String tur, String sayfaSayisi, String kitapId){
        
        try {
            stmt = con.createStatement();
            
            String sorgu = "Insert Into books (KitapIsmi,Yazari,Turu,SayfaSayisi,KitapId) VALUES(" + "'" + kitapIsmi + "'," + "'" + yazar + "'," + "'" + tur + "'," + "'" + sayfaSayisi + "'," + "'" + kitapId + "')";
            
            stmt.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            System.out.println("Bir Hata Meydana Geldi!");
        }
              
    }
    
    public static void main(String[] args) {
        
        DatabaseOperation databaseOperation = new DatabaseOperation();
        
    }
    
}
