
public class BookGuncellePanel extends javax.swing.JFrame {

    DatabaseOperation databaseOperation = new DatabaseOperation();
    
    public BookGuncellePanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kitapIsmiAlani = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        yazarAlani = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        turAlani = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        sayfaSayisiAlani = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        yeniIdAlani = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Guncelle");
        setBounds(new java.awt.Rectangle(650, 240, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Kitap Ismi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 69, 24));
        getContentPane().add(kitapIsmiAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 180, -1));

        updateButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\Apps-system-software-update-icon.png")); // NOI18N
        updateButton.setText("Guncelle");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 170, 40));

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\back-icon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 18, 115, 36));

        jLabel3.setText("Yazar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 60, -1));
        getContentPane().add(yazarAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 180, -1));

        jLabel4.setText("Tur");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 40, -1));

        turAlani.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deneme", "Edebiyat", "Eğitim", "Felsefe", "Gençlik", "Gezi", "Hikaye", "Hobi", "İnceleme", "İş Ekonomi - Hukuk", "Kişisel Gelişim", "Konuşmalar", "Masal", "Mektup", "Mizah", "Öykü", "Polisiye", "Psikoloji", "Resimli Öykü", "Roman", "Sağlık", "Sanat - Tasarım", "Sanat- Müzik", "Sinema Tarihi", "Söyleşi", "Şiir", "Tarih", "Yemek " }));
        getContentPane().add(turAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 120, -1));

        jLabel2.setText("Sayfa Sayisi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 70, -1));
        getContentPane().add(sayfaSayisiAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 180, -1));

        jLabel5.setText("Yeni Id");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 70, 20));
        getContentPane().add(yeniIdAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 180, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\background.png")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 0, 550, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        String kitapAdi = kitapIsmiAlani.getText();
        String yazar = yazarAlani.getText();
        String tur = String.valueOf(turAlani.getSelectedItem());
        String sayfaSayisi = sayfaSayisiAlani.getText();
        String yeniId = yeniIdAlani.getText();
        
        databaseOperation.kitapGuncelle(kitapAdi, yazar, tur, sayfaSayisi, yeniId);

    }//GEN-LAST:event_updateButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        MenuPanel menuPanel = new MenuPanel();
        setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookGuncellePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookGuncellePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookGuncellePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookGuncellePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookGuncellePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField kitapIsmiAlani;
    private javax.swing.JTextField sayfaSayisiAlani;
    private javax.swing.JComboBox<String> turAlani;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField yazarAlani;
    private javax.swing.JTextField yeniIdAlani;
    // End of variables declaration//GEN-END:variables
}
