
import javax.swing.JOptionPane;

public class MenuPanel extends javax.swing.JFrame {

    public MenuPanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addBookButton = new javax.swing.JButton();
        updateBookButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        dataButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dataButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        menuHakkinda = new javax.swing.JMenuItem();
        cikisYapMenu = new javax.swing.JMenuItem();
        menuProgramiKapat = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setBounds(new java.awt.Rectangle(650, 240, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addBookButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        addBookButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\add book.png")); // NOI18N
        addBookButton.setText("Kitap Ekle");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 310, 60));

        updateBookButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        updateBookButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\Apps-system-software-update-icon.png")); // NOI18N
        updateBookButton.setText("Kitap Guncelle");
        updateBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 310, 60));

        deleteBookButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        deleteBookButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\delete.png")); // NOI18N
        deleteBookButton.setText("Kitap Sil");
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 310, 60));

        dataButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dataButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\Archive-icon (1).png")); // NOI18N
        dataButton.setText("Kutuphaneyi Getir");
        dataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataButtonActionPerformed(evt);
            }
        });
        getContentPane().add(dataButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 310, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\background.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 520));

        dataButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        dataButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\Archive-icon (1).png")); // NOI18N
        dataButton1.setText("Kutuphaneyi Getir");
        getContentPane().add(dataButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 310, 60));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jMenuBar1.setBorder(null);

        jMenu3.setText("Sistem");

        menuHakkinda.setText("Hakkinda");
        menuHakkinda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHakkindaActionPerformed(evt);
            }
        });
        jMenu3.add(menuHakkinda);

        cikisYapMenu.setText("Cikis Yap");
        cikisYapMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikisYapMenuActionPerformed(evt);
            }
        });
        jMenu3.add(cikisYapMenu);

        menuProgramiKapat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuProgramiKapat.setText("Programi Kapat");
        menuProgramiKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProgramiKapatActionPerformed(evt);
            }
        });
        jMenu3.add(menuProgramiKapat);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        AddBookPanel addBookPanel = new AddBookPanel();
        setVisible(false);
        addBookPanel.setVisible(true);
    
    }//GEN-LAST:event_addBookButtonActionPerformed

    private void updateBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookButtonActionPerformed
        
        BookGuncellePanel bookGuncellePanel = new BookGuncellePanel();
        setVisible(false);
        bookGuncellePanel.setVisible(true);
    }//GEN-LAST:event_updateBookButtonActionPerformed

    private void dataButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataButtonActionPerformed
        
        BookList bookList = new BookList();
        setVisible(false);
        bookList.setVisible(true);
    }//GEN-LAST:event_dataButtonActionPerformed

    private void menuProgramiKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProgramiKapatActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_menuProgramiKapatActionPerformed

    private void menuHakkindaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHakkindaActionPerformed
        
        HakkindaPanel hakkindaPanel = new HakkindaPanel();
        hakkindaPanel.setVisible(true);
        
    }//GEN-LAST:event_menuHakkindaActionPerformed

    private void cikisYapMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikisYapMenuActionPerformed
        
        LoginPanel loginPanel = new LoginPanel();
        setVisible(false);
        loginPanel.setVisible(true);
        
    }//GEN-LAST:event_cikisYapMenuActionPerformed

    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
        KitapSilPanel kitapSilPanel = new KitapSilPanel();
        setVisible(false);
        kitapSilPanel.setVisible(true);
        
    }//GEN-LAST:event_deleteBookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JMenuItem cikisYapMenu;
    private javax.swing.JButton dataButton;
    private javax.swing.JButton dataButton1;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuHakkinda;
    private javax.swing.JMenuItem menuProgramiKapat;
    private javax.swing.JButton updateBookButton;
    // End of variables declaration//GEN-END:variables

    
}
