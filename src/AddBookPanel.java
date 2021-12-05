
import javax.swing.JOptionPane;


public class AddBookPanel extends javax.swing.JFrame {
    
    DatabaseOperation databaseOperation = new DatabaseOperation();
    
    public AddBookPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        kitapIsmiAlani = new javax.swing.JTextField();
        yazarAlani = new javax.swing.JTextField();
        sayfaSayisiAlani = new javax.swing.JTextField();
        idAlani = new javax.swing.JTextField();
        cbTur = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(650, 240, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kitap Ismi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 95, 25));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Yazari");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 95, 25));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sayfa Sayisi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 95, 25));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 95, 25));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Turu");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 95, 25));

        kitapIsmiAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kitapIsmiAlaniActionPerformed(evt);
            }
        });
        getContentPane().add(kitapIsmiAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 221, -1));

        yazarAlani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yazarAlaniActionPerformed(evt);
            }
        });
        getContentPane().add(yazarAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 221, -1));
        getContentPane().add(sayfaSayisiAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 221, -1));
        getContentPane().add(idAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 221, -1));

        cbTur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deneme", "Edebiyat", "Eğitim", "Felsefe", "Gençlik", "Gezi", "Hikaye", "Hobi", "İnceleme", "İş Ekonomi - Hukuk", "Kişisel Gelişim", "Konuşmalar", "Masal", "Mektup", "Mizah", "Öykü", "Polisiye", "Psikoloji", "Resimli Öykü", "Roman", "Sağlık", "Sanat - Tasarım", "Sanat- Müzik", "Sinema Tarihi", "Söyleşi", "Şiir", "Tarih", "Yemek " }));
        getContentPane().add(cbTur, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 140, -1));

        addButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\Button-Add-icon.png")); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 130, 50));

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\back-icon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\background.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 550, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kitapIsmiAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kitapIsmiAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kitapIsmiAlaniActionPerformed

    private void yazarAlaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yazarAlaniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yazarAlaniActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        MenuPanel menuPanel = new MenuPanel();
        setVisible(false);
        menuPanel.setVisible(true);
        
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String message = "Lutfen Bilgileri Eksiksiz Giriniz!";
        
        String kitapAdi = kitapIsmiAlani.getText();
        String yazar = yazarAlani.getText();
        String tur = String.valueOf(cbTur.getSelectedItem());
        String sayfaSayisi = sayfaSayisiAlani.getText();
        String id = idAlani.getText();
        
        if(kitapAdi.length() < 1){
            JOptionPane.showMessageDialog(this, message);
        }
        else if(yazar.length() < 1){
            JOptionPane.showMessageDialog(this, message);
        }
        else if(sayfaSayisi.length() < 1){
            JOptionPane.showMessageDialog(this, message);
        }
        else if(id.length() < 1){
            JOptionPane.showMessageDialog(this, message);
        }
        else{
            databaseOperation.kitapEkle(kitapAdi, yazar, tur, sayfaSayisi, id);
            JOptionPane.showMessageDialog(this, "Basariyla Eklendi");
            kitapIsmiAlani.setText("");
            yazarAlani.setText("");
            sayfaSayisiAlani.setText("");
            idAlani.setText("");
        }
        
        
    }//GEN-LAST:event_addButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AddBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBookPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBookPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> cbTur;
    private javax.swing.JTextField idAlani;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kitapIsmiAlani;
    private javax.swing.JTextField sayfaSayisiAlani;
    private javax.swing.JTextField yazarAlani;
    // End of variables declaration//GEN-END:variables
}
