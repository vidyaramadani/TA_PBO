package pack.view;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vidya
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko= new controllerToko(this);
        ctoko.isiTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        txtharga = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        Btn_Cari = new javax.swing.JButton();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Admin Toko :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(29, 20, 80, 14);

        txtadmin.setEditable(false);
        txtadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadminActionPerformed(evt);
            }
        });
        getContentPane().add(txtadmin);
        txtadmin.setBounds(100, 10, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel2.setText("Pencarian Berdasarkan Kategori Makanan");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 260, 290, 20);

        jLabel3.setText("Kode Barang");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 100, 120, 30);

        jLabel4.setText("Nama Barang");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 130, 120, 30);

        jLabel5.setText("Kategori Barang");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 160, 120, 30);

        jLabel6.setText("Jenis Packaging");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 190, 120, 30);

        jLabel7.setText("Harga");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 220, 120, 30);
        getContentPane().add(txtkode);
        txtkode.setBounds(150, 100, 230, 30);

        txtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnamaActionPerformed(evt);
            }
        });
        getContentPane().add(txtnama);
        txtnama.setBounds(150, 130, 230, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "ATM", "ART", "BarangLain" }));
        cbKategoriBrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKategoriBrgActionPerformed(evt);
            }
        });
        getContentPane().add(cbKategoriBrg);
        cbKategoriBrg.setBounds(150, 160, 230, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Saset", "Botol", "Lainnya" }));
        cbjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbjenisActionPerformed(evt);
            }
        });
        getContentPane().add(cbjenis);
        cbjenis.setBounds(150, 190, 230, 30);
        getContentPane().add(txtharga);
        txtharga.setBounds(150, 220, 230, 30);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 1, 18)); // NOI18N
        jLabel8.setText("Data Barang di Toko");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 30, 150, 30);

        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "ATM", "ART", "BarangLain" }));
        CbCariKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbCariKategoriActionPerformed(evt);
            }
        });
        getContentPane().add(CbCariKategori);
        CbCariKategori.setBounds(290, 260, 110, 20);

        Btn_Cari.setText("Cari");
        Btn_Cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CariActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Cari);
        Btn_Cari.setBounds(410, 260, 51, 23);

        Btn_Simpan.setText("Simpan");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Simpan);
        Btn_Simpan.setBounds(440, 100, 110, 23);

        Btn_Ubah.setText("Ubah");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Ubah);
        Btn_Ubah.setBounds(440, 130, 110, 23);

        Btn_Bersih.setText("Bersihkan");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Bersih);
        Btn_Bersih.setBounds(440, 160, 110, 23);

        Btn_Hapus.setText("Hapus");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Hapus);
        Btn_Hapus.setBounds(440, 190, 110, 23);

        Btn_Keluar.setText("Keluar");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        getContentPane().add(Btn_Keluar);
        Btn_Keluar.setBounds(440, 220, 110, 23);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 630, 80);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabel1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 300, 452, 230);

        setBounds(0, 0, 644, 586);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnamaActionPerformed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
// TODO add your handling code here:
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
       ctoko.Ubah();
       ctoko.isiTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        ctoko.Reset();
// TODO add your handling code here:
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
// TODO add your handling code here:
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
       dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_CariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CariActionPerformed
        ctoko.CariKategori();
       
// TODO add your handling code here:
    }//GEN-LAST:event_Btn_CariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String user1=login.user;
        txtadmin.setText(user1);
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void cbKategoriBrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKategoriBrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKategoriBrgActionPerformed

    private void cbjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbjenisActionPerformed

    private void CbCariKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbCariKategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbCariKategoriActionPerformed

    private void txtadminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadminActionPerformed

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        int baris = Tabel1.getSelectedRow();
        if(baris != -1){
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String)Tabel1.getValueAt(baris,1).toString());
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
            
            
        }
// TODO add your handling code here:
    }//GEN-LAST:event_Tabel1MouseClicked

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Cari;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
public JTextField getTxtKode(){
        return txtkode;
    }
    public JTextField getTxtNama(){
        return txtnama;
    }
    public JTextField getTxtHarga(){
        return txtharga;
    }
    public JComboBox getCbKategori(){
        return cbKategoriBrg;
    }
    public JComboBox getCbJenis(){
        return cbjenis;
    }
    public JComboBox getCbCariKategori(){
        return CbCariKategori;
    }
    public JButton getButtonHapus(){
        return Btn_Hapus;
    }
    
    public JButton getButtonBersih(){
        return Btn_Bersih;
    }
    public JButton getButtonSimpan(){
        return Btn_Simpan;
    }
    public JButton getButtonUbah(){
        return Btn_Ubah;
    }
    public JButton getButtonKeluar(){
        return Btn_Keluar;
    }
    public JTable getTableData(){
        return Tabel1;
    }


}