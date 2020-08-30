/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import crud.kategori_crud;
import entity.db_arac_kategori;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s_a-i
 */
public class kategori_formu extends javax.swing.JFrame {

    /**
     * Creates new form renk_formu
     */
    kategori_crud kc = new kategori_crud();
    ImageIcon i = new ImageIcon("src/ikonlar/polis2.png");

    public kategori_formu() {
        initComponents();
        kat_goster();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_katid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_katadi = new javax.swing.JTextField();
        btn_kaydet = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_kategori = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Satış Otomasyonu / Kategori");
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Kategori ID:");

        txt_katid.setEditable(false);
        txt_katid.setText("Read Only !");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Kategori Adı:");

        btn_kaydet.setText("Kaydet");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_temizle.setText("Temizle");
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        btn_geri.setText("Geri Dön");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        tablo_kategori.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kategori ID", "Kategori Adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_kategoriMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_kategori);
        if (tablo_kategori.getColumnModel().getColumnCount() > 0) {
            tablo_kategori.getColumnModel().getColumn(0).setResizable(false);
            tablo_kategori.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txt_katid, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txt_katadi))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guncelle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_temizle, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_geri)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 994, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_katid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_kaydet)
                            .addComponent(btn_guncelle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sil)
                            .addComponent(btn_temizle))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_geri, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_katadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        this.setVisible(false);
        ana_sayfa a = new ana_sayfa();
        a.setVisible(true);
    }//GEN-LAST:event_btn_geriActionPerformed

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        db_arac_kategori ak = new db_arac_kategori();
        kategori_crud kc = new kategori_crud();

        ak.setKategori_adi(txt_katadi.getText().trim());
        if (!ak.getKategori_adi().equals("")) {
            kc.kat_kaydet(ak);
            DefaultTableModel model = (DefaultTableModel) tablo_kategori.getModel();
            Object[] row = new Object[2];
            row[1] = ak.getKategori_adi();
            model.addRow(row);
            tabloyu_temizle();
            kat_goster();
            formuTemizle();
        } else {
            JOptionPane.showMessageDialog(this, "Kategori Adı Alanını Boş Bırakmayın!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        formuTemizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablo_kategori.getModel();
        kategori_crud kc = new kategori_crud();
        try {

            int a = (Integer.parseInt(model.getValueAt(tablo_kategori.getSelectedRow(), 0).toString()));
           
                kc.kat_sil(a);
                model.removeRow(tablo_kategori.getSelectedRow());
                model.fireTableDataChanged();
                formuTemizle();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Silinecek Kategoriyi Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }

    }//GEN-LAST:event_btn_silActionPerformed

    private void tablo_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_kategoriMouseClicked
        DefaultTableModel model = (DefaultTableModel) tablo_kategori.getModel();
        try {

            txt_katid.setText(model.getValueAt(tablo_kategori.getSelectedRow(), 0).toString());
            txt_katadi.setText(model.getValueAt(tablo_kategori.getSelectedRow(), 1).toString());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_tablo_kategoriMouseClicked

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablo_kategori.getModel();
        db_arac_kategori r = new db_arac_kategori();
        kategori_crud kc = new kategori_crud();

        try {

            r.setKategori_id((int) (model.getValueAt(tablo_kategori.getSelectedRow(), 0)));
            if (!txt_katadi.getText().equals("")) {
                r.setKategori_adi(txt_katadi.getText());
                kc.kat_guncelle(r);
                model.setValueAt(txt_katadi.getText().trim(), tablo_kategori.getSelectedRow(), 1);
                formuTemizle();
            }else JOptionPane.showMessageDialog(this, "Kategori Adı Alanını Boş Bırakmayın!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Güncellenecek Kategoriyi Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    public void tabloyu_temizle() {
        tablo_kategori.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Kategori ID", "Kategori Adı"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jScrollPane1.setViewportView(tablo_kategori);

        if (tablo_kategori.getColumnModel().getColumnCount() > 0) {
            tablo_kategori.getColumnModel().getColumn(0).setResizable(false);
            tablo_kategori.getColumnModel().getColumn(1).setResizable(false);
        }

    }

    /**
     *
     *
     * @param args the command line arguments
     */
    public void kat_goster() {
        List<db_arac_kategori> kL = kc.getList();
        DefaultTableModel model = (DefaultTableModel) tablo_kategori.getModel();
        tablo_kategori.setFillsViewportHeight(true);
        Object[] row = new Object[2];
        for (int i = 0; i < kL.size(); i++) {
            row[0] = kL.get(i).getKategori_id();
            row[1] = kL.get(i).getKategori_adi();
            model.addRow(row);
        }
    }

    public void formuTemizle() {
        txt_katid.setText("Read Only !");
        txt_katadi.setText(null);
    }

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
            java.util.logging.Logger.getLogger(kategori_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kategori_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kategori_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kategori_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kategori_formu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo_kategori;
    private javax.swing.JTextField txt_katadi;
    private javax.swing.JTextField txt_katid;
    // End of variables declaration//GEN-END:variables
}
