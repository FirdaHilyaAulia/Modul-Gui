/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author firdahilya
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nama = new javax.swing.JLabel();
        Absen = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rpl = new javax.swing.JRadioButton();
        tkj = new javax.swing.JRadioButton();
        hoby = new javax.swing.JLabel();
        programming = new javax.swing.JCheckBox();
        teknisi = new javax.swing.JCheckBox();
        animator = new javax.swing.JCheckBox();
        designer = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hasil = new javax.swing.JTextArea();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\ipiners\\Untitled-1.png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Love Ya Like A Sister", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Biodata Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 230, 50);

        Nama.setText("Nama");
        getContentPane().add(Nama);
        Nama.setBounds(40, 260, 41, 20);

        Absen.setText("Absen");
        getContentPane().add(Absen);
        Absen.setBounds(40, 310, 44, 20);

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 360, 55, 29);

        rpl.setText("RPL");
        getContentPane().add(rpl);
        rpl.setBounds(130, 360, 59, 29);

        tkj.setText("TKJ");
        getContentPane().add(tkj);
        tkj.setBounds(230, 360, 59, 29);

        hoby.setText("Hobi");
        getContentPane().add(hoby);
        hoby.setBounds(40, 410, 33, 20);

        programming.setText("Programming");
        getContentPane().add(programming);
        programming.setBounds(130, 410, 129, 29);

        teknisi.setText("Teknisi");
        getContentPane().add(teknisi);
        teknisi.setBounds(130, 460, 83, 29);

        animator.setText("Animator");
        getContentPane().add(animator);
        animator.setBounds(320, 410, 99, 29);

        designer.setText("Designer");
        getContentPane().add(designer);
        designer.setBounds(320, 460, 95, 29);

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit);
        submit.setBounds(80, 510, 83, 29);

        hapus.setText("Hapus");
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        getContentPane().add(hapus);
        hapus.setBounds(200, 510, 77, 29);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(310, 510, 59, 29);

        jLabel6.setText("Hasil");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(210, 560, 34, 20);

        hasil.setColumns(20);
        hasil.setRows(5);
        jScrollPane1.setViewportView(hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 590, 349, 149);
        getContentPane().add(nama);
        nama.setBounds(110, 260, 220, 26);
        getContentPane().add(absen);
        absen.setBounds(110, 310, 220, 26);

        jLabel3.setIcon(new javax.swing.ImageIcon("E:\\ipiners\\Untitled-1.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -140, 520, 1030);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String  Namaa = nama.getText();
        String Abseen = absen.getText();
        String jurusan;
        String hoby="";
        //untuk rd
        if(rpl.isSelected())
            jurusan = "RPL";
        else if(tkj.isSelected())
            jurusan = "TKJ";
        else
            jurusan= "";
//untuk checbock
if(programming.isSelected())
    hoby+=programming.getText()+", ";
if(teknisi.isSelected())
    hoby+=teknisi.getText()+", ";
if(animator.isSelected())
    hoby+=animator.getText()+", ";
if(designer.isSelected())
    hoby+=designer.getText()+", ";

hasil.setText("Nama Siswa : " +Namaa+"\n"+"Absen siswa : "+Abseen+"\n"+
        " Jurusan anda : "+jurusan +"\n"+"Hoby anda : "+hoby); // TODO add your handling code here:
    }//GEN-LAST:event_submitActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
               // TODO add your handling code here:
    }//GEN-LAST:event_hapusActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Latihan4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Absen;
    private javax.swing.JLabel Nama;
    private javax.swing.JTextField absen;
    private javax.swing.JCheckBox animator;
    private javax.swing.JCheckBox designer;
    private javax.swing.JButton exit;
    private javax.swing.JButton hapus;
    private javax.swing.JTextArea hasil;
    private javax.swing.JLabel hoby;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nama;
    private javax.swing.JCheckBox programming;
    private javax.swing.JRadioButton rpl;
    private javax.swing.JButton submit;
    private javax.swing.JCheckBox teknisi;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
