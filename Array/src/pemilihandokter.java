/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Salsadila
 */
public class pemilihandokter extends javax.swing.JFrame {

    /**
     * Creates new form pemilihandokter
     */
    public pemilihandokter() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jconadokt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nama = new javax.swing.JLabel();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtwaktu = new javax.swing.JTextField();
        jtxtspesial = new javax.swing.JTextField();
        jtxtnama = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PEMILIHAN DOKTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, -10, 320, 60);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 90, 14);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar" }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(120, 50, 200, 30);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 150, 90, 14);

        jLabel4.setText("Usia");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 180, 90, 14);

        jLabel5.setText("Jenis Kelamin");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 210, 90, 14);

        jLabel6.setText("Golongan Darah");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 240, 90, 14);

        jLabel7.setText("Status");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 270, 80, 14);

        jLabel8.setText("Kewarganegaraan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 300, 88, 14);

        jLabel9.setText("Waktu Praktek");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 330, 90, 14);

        jLabel10.setText("Dokter Spelialis");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 360, 90, 14);

        nama.setText("Nama");
        getContentPane().add(nama);
        nama.setBounds(30, 120, 90, 14);
        getContentPane().add(jtxtalamat);
        jtxtalamat.setBounds(120, 140, 200, 30);
        getContentPane().add(jtxtusia);
        jtxtusia.setBounds(120, 170, 200, 30);
        getContentPane().add(jtxtjenis);
        jtxtjenis.setBounds(120, 200, 200, 30);
        getContentPane().add(jtxtgol);
        jtxtgol.setBounds(120, 230, 200, 30);
        getContentPane().add(jtxtstatus);
        jtxtstatus.setBounds(120, 260, 200, 30);
        getContentPane().add(jtxtkewar);
        jtxtkewar.setBounds(120, 290, 200, 30);
        getContentPane().add(jtxtwaktu);
        jtxtwaktu.setBounds(120, 320, 200, 30);
        getContentPane().add(jtxtspesial);
        jtxtspesial.setBounds(120, 350, 200, 30);

        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtnama);
        jtxtnama.setBounds(120, 110, 200, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 90, 330, 310);

        setBounds(0, 0, 416, 470);
    }// </editor-fold>//GEN-END:initComponents

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
       if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){
           jtxtnama.setText("DR. Farras Yassar");
           jtxtalamat.setText("Jl. Surabaya 16, Malang");
           jtxtusia.setText("20 Tahun");
           jtxtjenis.setText("Laki-laki");
           jtxtgol.setText("A");
           jtxtstatus.setText("Belum Menikah");
           jtxtkewar.setText("Indonesia");
           jtxtspesial.setText("Dokter Umum");
           jtxtwaktu.setText("Pagi (07.00-15.00)");
       }else if(jconadokt.getSelectedItem().equals("DR. Anisa Putri")){
           jtxtnama.setText("DR. Anisa Putri");
           jtxtalamat.setText("Jl. Veteran 3, Malang");
           jtxtusia.setText("20 Tahun");
           jtxtjenis.setText("Perempuan");
           jtxtgol.setText("O");
           jtxtstatus.setText("Belum Menikah");
           jtxtkewar.setText("Indonesia");
           jtxtspesial.setText("Dokter Gigi");
           jtxtwaktu.setText("Sore (16.00-22.00)");
       }else if(jconadokt.getSelectedItem().equals("DR. Harun Fajar")){
           jtxtnama.setText("DR. Harun Fajar");
           jtxtalamat.setText("Jl. Bandung 9, Malang");
           jtxtusia.setText("20 Tahun");
           jtxtjenis.setText("Laki-laki");
           jtxtgol.setText("B");
           jtxtstatus.setText("Belum Menikah");
           jtxtkewar.setText("Indonesia");
           jtxtspesial.setText("Dokter Gizi");
           jtxtwaktu.setText("Malam (22.00-06.00)");
       }
    }//GEN-LAST:event_jconadoktActionPerformed

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

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
            java.util.logging.Logger.getLogger(pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pemilihandokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pemilihandokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    private javax.swing.JLabel nama;
    // End of variables declaration//GEN-END:variables
}