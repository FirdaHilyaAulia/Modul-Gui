/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author firdahilya
 */
public class Latihan1 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan1
     */
    public Latihan1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        absenn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        kelas = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        namaa = new javax.swing.JTextField();
        kelass = new javax.swing.JTextField();
        proses = new javax.swing.JButton();
        absennn = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));
        jPanel1.setLayout(null);
        jPanel1.add(absenn);
        absenn.setBounds(226, 583, 208, 26);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Buxton Sketch", 1, 48)); // NOI18N
        jLabel1.setText("Formulir");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 20, 280, 60);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 120, 41, 20);

        jLabel3.setText("Kelas");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 190, 36, 20);

        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(90, 290, 44, 20);

        jLabel6.setText("Nama");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(90, 410, 41, 20);

        jLabel7.setText("Kelas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(90, 490, 36, 20);

        jLabel8.setText("Absen");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(90, 580, 44, 20);
        getContentPane().add(nama);
        nama.setBounds(220, 110, 208, 26);
        getContentPane().add(kelas);
        kelas.setBounds(220, 190, 208, 26);
        getContentPane().add(absen);
        absen.setBounds(220, 280, 208, 26);

        namaa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaaActionPerformed(evt);
            }
        });
        getContentPane().add(namaa);
        namaa.setBounds(230, 410, 208, 26);
        getContentPane().add(kelass);
        kelass.setBounds(230, 490, 208, 30);

        proses.setText("Proses");
        proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prosesActionPerformed(evt);
            }
        });
        getContentPane().add(proses);
        proses.setBounds(292, 337, 79, 29);

        absennn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                absennnActionPerformed(evt);
            }
        });
        getContentPane().add(absennn);
        absennn.setBounds(230, 570, 208, 26);

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(-10, 0, 570, 170);

        jPanel3.setBackground(new java.awt.Color(0, 255, 102));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 170, 560, 180);

        jPanel4.setBackground(new java.awt.Color(102, 255, 204));
        getContentPane().add(jPanel4);
        jPanel4.setBounds(-10, 350, 570, 160);

        jPanel5.setBackground(new java.awt.Color(51, 255, 102));
        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 510, 560, 150);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prosesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prosesActionPerformed
          String Nama = nama.getText();
              namaa.setText(Nama);
              String Kelas = kelas.getText();
              kelass.setText(Kelas);
              String Absen =absen.getText();
              absennn.setText(Absen);
        
// TODO add your handling code here:
    }//GEN-LAST:event_prosesActionPerformed

    private void absennnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absennnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absennnActionPerformed

    private void namaaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaaActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JTextField absenn;
    private javax.swing.JTextField absennn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField kelass;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField namaa;
    private javax.swing.JButton proses;
    // End of variables declaration//GEN-END:variables
}
