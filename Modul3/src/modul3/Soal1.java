/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package modul3;

import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Soal1 extends javax.swing.JFrame {

    /**
     * Creates new form Soal1
     */
    
   
    public Soal1() {
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

        jPanel5 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbPilih = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        lJudul = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lPenerbit = new javax.swing.JLabel();
        lPenulis = new javax.swing.JLabel();
        lSinopsis = new javax.swing.JLabel();
        lTahun = new javax.swing.JLabel();
        btPinjam = new javax.swing.JButton();

        jPanel5.setBackground(new java.awt.Color(153, 255, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 0, 153));

        jPanel2.setBackground(new java.awt.Color(204, 0, 153));
        jPanel2.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel4.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Forte", 1, 36)); // NOI18N
        jLabel1.setText("onze bibliotheek");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\kuliah\\Semester 3\\PRAKTIKUM\\PEMVIS\\MODUL3\\1.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\kuliah\\Semester 3\\PRAKTIKUM\\PEMVIS\\MODUL3\\1.png")); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(149, 149, 149)
                .addComponent(jLabel3)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, java.awt.BorderLayout.PAGE_START);

        cbPilih.setBackground(new java.awt.Color(255, 204, 102));
        cbPilih.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH BUKU", "HUJAN", "RICH DAD POOR DAD", "BULAN", "PANCASILA SEBAGAI IDEOLOGI", "PANCASILA : SEBUAH IKHTIAR FILSAFAT" }));
        cbPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPilihActionPerformed(evt);
            }
        });
        jPanel2.add(cbPilih, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBackground(new java.awt.Color(255, 204, 102));

        lJudul.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("PENULIS");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("JUDUL");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("TAHUN TERBIT");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("PENERBIT");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("SINOPSIS");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText(":");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText(":");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setText("INFORMASI BUKU");

        lPenerbit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lPenulis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lSinopsis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lSinopsis.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lTahun.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lPenulis, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel15)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel15)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lPenulis, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel12))
                    .addComponent(lPenerbit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel13)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel10))
                    .addComponent(lSinopsis, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, java.awt.BorderLayout.CENTER);

        btPinjam.setBackground(new java.awt.Color(255, 204, 102));
        btPinjam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btPinjam.setText("PINJAM BUKU");
        btPinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPinjamActionPerformed(evt);
            }
        });
        jPanel2.add(btPinjam, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPilihActionPerformed
        // TODO add your handling code here:
        int pilihBuku = cbPilih.getSelectedIndex();
        
        if (pilihBuku == 1){
            lJudul.setText("Hujan");
            lPenulis.setText("Tere Liye");
            lPenerbit.setText("Republika Penerbit");
            lTahun.setText("2006");
            lSinopsis.setText("<html>Sinopsis: \"Hujan\" mengikuti perjalanan seorang tokoh bernama Akira yang berusaha menyelamatkan desa yang mengalami kekeringan parah. Dengan tekadnya, Akira berusaha membangkitkan legenda hujan untuk mengembalikan harapan dan keyakinan penduduk desa.<html>");   
        }else if(pilihBuku == 2){
            lJudul.setText("Rich Dad Poor Dad");
            lPenulis.setText("Robert T. Kiyosaki");
            lPenerbit.setText("Plata Publishing");
            lTahun.setText("1997");
            lSinopsis.setText("<html>Buku ini berfokus pada pendidikan keuangan dan manajemen keuangan pribadi. Robert Kiyosaki membandingkan pendidikan finansial yang diterimanya dari dua figur ayah berbeda, yaitu ayah kaya (Rich Dad) dan ayah miskin (Poor Dad). Buku ini memberikan wawasan tentang pentingnya pendidikan keuangan, investasi, dan berpikir seperti seorang investor.<html>"); 
        }else if (pilihBuku == 3){
            lJudul.setText("Bulan");
            lPenulis.setText("Tere Liye");
            lPenerbit.setText("Gramedia Pustaka Utama");
            lTahun.setText("2010");
            lSinopsis.setText("<html>Bulan adalah bagian pertama dari seri Ang Bumi karya Tere Liye. Ini adalah kisah tentang petualangan remaja yang tiba-tiba mendapati diri mereka di Bulan dan harus mencari cara untuk kembali ke Bumi.<html>");
        }else if (pilihBuku == 4){
            lJudul.setText("Pancasila Sebagai Ideologi");
            lPenulis.setText("Dr. Notonagoro");
            lPenerbit.setText("Ghalia Indonesia");
            lTahun.setText("1975");
            lSinopsis.setText("<html>Sinopsis: Buku ini adalah karya klasik yang membahas Pancasila sebagai ideologi negara Indonesia. Penulis, Notonagoro, menjelaskan asal-usul dan pengertian Pancasila serta pentingnya Pancasila dalam pembangunan negara dan masyarakat.<html>");            
        }else if (pilihBuku == 5){
            lJudul.setText("Pancasila : Ikhtiar Filsafat");
            lPenulis.setText("Prof. Dr. Amien Rais");
            lPenerbit.setText("Paramadina");
            lTahun.setText("2001");
            lSinopsis.setText("<html>Sinopsis: Buku ini memberikan perspektif filsafati tentang Pancasila. Penulis, Amien Rais, membahas nilai-nilai dan prinsip-prinsip yang mendasari Pancasila, serta signifikansinya dalam membentuk identitas nasional Indonesia.<html>");      
        }else{
            lJudul.setText("");
            lPenulis.setText("");
            lPenerbit.setText("");
            lTahun.setText("");
            lSinopsis.setText("");
        }
    }//GEN-LAST:event_cbPilihActionPerformed

    private void btPinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPinjamActionPerformed
        // TODO add your handling code here:
       int pilihBuku = cbPilih.getSelectedIndex();
       
       if (pilihBuku == 0){
           JOptionPane.showMessageDialog(null, "KAMU BELUM MEMILIH BUKU", "ERROR!", JOptionPane.ERROR_MESSAGE);
           return;
       }else{
           int hasil = JOptionPane.showConfirmDialog(null, "YAKIN DENGAN BUKU YANG INGIN DIPINJAM", "PESAN", JOptionPane.YES_NO_OPTION);
           if (hasil == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "SILAHKAN AMBIL BUKU ANDA", "PESAN", JOptionPane.PLAIN_MESSAGE);
                lJudul.setText("");
                lPenulis.setText("");
                lPenerbit.setText("");
                lTahun.setText("");
                lSinopsis.setText("");
                return;
            }
       }
    }//GEN-LAST:event_btPinjamActionPerformed

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
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Soal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Soal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPinjam;
    private javax.swing.JComboBox<String> cbPilih;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lJudul;
    private javax.swing.JLabel lPenerbit;
    private javax.swing.JLabel lPenulis;
    private javax.swing.JLabel lSinopsis;
    private javax.swing.JLabel lTahun;
    // End of variables declaration//GEN-END:variables
}
