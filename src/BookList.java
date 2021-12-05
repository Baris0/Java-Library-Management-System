
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class BookList extends javax.swing.JFrame {

    DefaultTableModel model;
    DatabaseOperation databaseOperation = new DatabaseOperation();
    
    
    public BookList() {
        initComponents();
        model = (DefaultTableModel)bookTable.getModel();
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        showButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kutuphane");
        setBounds(new java.awt.Rectangle(650, 240, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\back-icon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 16, 100, 30));

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kitap Adi", "Yazar", "Tur", "Sayfa Sayisi", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(bookTable);
        if (bookTable.getColumnModel().getColumnCount() > 0) {
            bookTable.getColumnModel().getColumn(0).setResizable(false);
            bookTable.getColumnModel().getColumn(1).setResizable(false);
            bookTable.getColumnModel().getColumn(2).setResizable(false);
            bookTable.getColumnModel().getColumn(3).setResizable(false);
            bookTable.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 910, 460));

        showButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\show.png")); // NOI18N
        showButton.setText("Kutuphaneyi Getir");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 270, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\background.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 530, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MenuPanel menuPanel = new MenuPanel();
        setVisible(false);
        menuPanel.setVisible(true);   
    }//GEN-LAST:event_backButtonActionPerformed

    public void kutuphaneGetir(){
        
        model.setRowCount(0);
        ArrayList<Book> book = new ArrayList<Book>();
        book = databaseOperation.kutuphaneGetir();
        
        if(book != null){
            
            for(Book temp : book){
                
                Object[] eklenecek = {temp.getKitapAdi(), temp.getYazar(), temp.getTur(), temp.getSayfaSayisi(), temp.getKitapId()};
                
                model.addRow(eklenecek);
                
            }    
        } 
    }
    
    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        kutuphaneGetir();   
    }//GEN-LAST:event_showButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable bookTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showButton;
    // End of variables declaration//GEN-END:variables
}
