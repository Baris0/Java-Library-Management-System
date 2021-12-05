
import javax.swing.JOptionPane;
public class KitapSilPanel extends javax.swing.JFrame {

    DatabaseOperation databaseOperation = new DatabaseOperation();
    
    public KitapSilPanel() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kitapIdAlani = new javax.swing.JTextField();
        silButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sil");
        setBounds(new java.awt.Rectangle(650, 240, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kitap Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 60, 30));
        getContentPane().add(kitapIdAlani, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 230, -1));

        silButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\delete.png")); // NOI18N
        silButton.setText("Sil");
        silButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silButtonActionPerformed(evt);
            }
        });
        getContentPane().add(silButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 160, 40));

        backButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\back-icon.png")); // NOI18N
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\baris\\Desktop\\Project Files\\background.png")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 520, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void silButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silButtonActionPerformed

        String id = kitapIdAlani.getText();
        if(id.length() > 0){
        int cevap = JOptionPane.showConfirmDialog(this, "Gercekten Silmak Istiyor Musunuz?");
        if(cevap == 0){
            databaseOperation.kitapSil(id);
            JOptionPane.showMessageDialog(this, "Silme Islemi Basarili");
            kitapIdAlani.setText("");
        }
        else if(cevap == 1){
            JOptionPane.showMessageDialog(this, "Silme Islemi Iptal Edildi");
            kitapIdAlani.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Lutfen Gecerli Bir Id Girin!");
        }
    }//GEN-LAST:event_silButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        
        MenuPanel menuPanel = new MenuPanel();
        setVisible(false);
        menuPanel.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(KitapSilPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KitapSilPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KitapSilPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KitapSilPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KitapSilPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kitapIdAlani;
    private javax.swing.JButton silButton;
    // End of variables declaration//GEN-END:variables
}
