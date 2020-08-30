/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import crud.adres_crud;
import crud.ilce_crud;
import crud.musteri_crud;
import crud.sehir_crud;
import entity.db_adres;
import entity.db_ilce;
import entity.db_musteri;
import entity.db_sehir;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s_a-i
 */
public class adres_formu extends javax.swing.JFrame {

    /**
     * Creates new form adres_formu
     */
    ImageIcon i = new ImageIcon("src/ikonlar/polis2.png");

    public adres_formu() {
        initComponents();
        adres_goster();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_guncelle = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_kaydet = new javax.swing.JButton();
        cmb_ilce = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmb_sehir = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txt_no = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_sok = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_mah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmb_musteri = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        btn_geri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_adres = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Satış Otomasyonu / Adres");
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        btn_guncelle.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_guncelle.setText("Güncelle");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_temizle.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_temizle.setText("Temizle");
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        btn_sil.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_kaydet.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_kaydet.setText("Kaydet");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        cmb_ilce.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_ilceMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("İlçe:");

        cmb_sehir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_sehirMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Şehir:");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("No:");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Sokak:");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Mahalle:");

        cmb_musteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_musteriMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 255));
        jLabel1.setText("Müşteri:");

        btn_geri.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_geri.setText("Geri Dön");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        tablo_adres.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "MÜŞTERİ", "MAHALLE", "SOKAK", "NO", "İLÇE", "ŞEHİR"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo_adres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_adresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_adres);
        if (tablo_adres.getColumnModel().getColumnCount() > 0) {
            tablo_adres.getColumnModel().getColumn(0).setResizable(false);
            tablo_adres.getColumnModel().getColumn(1).setResizable(false);
            tablo_adres.getColumnModel().getColumn(2).setResizable(false);
            tablo_adres.getColumnModel().getColumn(3).setResizable(false);
            tablo_adres.getColumnModel().getColumn(4).setResizable(false);
            tablo_adres.getColumnModel().getColumn(5).setResizable(false);
            tablo_adres.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/adr_big.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(cmb_musteri, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_mah, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_no, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmb_ilce, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txt_sok, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(cmb_sehir, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_geri, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_mah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_no, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_ilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_temizle)
                            .addComponent(btn_sil)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmb_musteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_sok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmb_sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_kaydet)
                                .addComponent(btn_guncelle))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)))
                        .addComponent(jLabel7)))
                .addGap(52, 52, 52)
                .addComponent(btn_geri)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_musteriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_musteriMouseClicked
        musteri_crud c = new musteri_crud();
        List<db_musteri> a = new ArrayList();
        a = c.listele();
        cmb_musteri.removeAllItems();
        for (int i = 0; i < a.size(); i++) {
            cmb_musteri.addItem(a.get(i).getMusteri_id() + "." + a.get(i).getMusteri_ad() + " " + a.get(i).getMusteri_soyad());
        }
        a.clear();
    }//GEN-LAST:event_cmb_musteriMouseClicked

    private void cmb_sehirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_sehirMouseClicked
        sehir_crud c = new sehir_crud();
        List<db_sehir> a = new ArrayList();
        a = c.getList();
        cmb_sehir.removeAllItems();
        for (int i = 0; i < a.size(); i++) {
            cmb_sehir.addItem(a.get(i).getSehir_adi());
        }
        a.clear();
    }//GEN-LAST:event_cmb_sehirMouseClicked

    private void cmb_ilceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_ilceMouseClicked
        ilce_crud c = new ilce_crud();
        sehir_crud mc = new sehir_crud();
        cmb_ilce.removeAllItems();

        try {
            List<db_ilce> m = c.getSelectedList(mc.idBul(cmb_sehir.getSelectedItem().toString()));
            for (int i = 0; i < m.size(); i++) {
                cmb_ilce.addItem(m.get(i).getIlce_adi());

            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_cmb_ilceMouseClicked

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        db_adres a = new db_adres();
        adres_crud ac = new adres_crud();
        sehir_crud sc = new sehir_crud();
        ilce_crud ic = new ilce_crud();
        try {

            String mst = cmb_musteri.getSelectedItem().toString();
            a.setMusteri_id(Integer.parseInt(mst.substring(0, mst.indexOf("."))));
            a.setAdres_mah(txt_mah.getText().trim());
            a.setAdres_sok(txt_sok.getText().trim());
            a.setAdres_no(Integer.parseInt(txt_no.getText().trim()));
            a.setAdres_sehir_id(sc.idBul(cmb_sehir.getSelectedItem().toString()));
            a.setAdres_ilce_id(ic.idBul(cmb_ilce.getSelectedItem().toString()));
            ac.adres_kaydet(a);
            tabloyu_temizle();
            formu_temizle();
            adres_goster();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "1.Hiçbir Alanı Boş Bırakmadığınızdan Emin Olun!\n2.Sayısal Değer İsteyen Alanlara Hatalı Giriş Yapmayın!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }

    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        formu_temizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        this.setVisible(false);
        ana_sayfa a = new ana_sayfa();
        a.setVisible(true);
    }//GEN-LAST:event_btn_geriActionPerformed

    private void tablo_adresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_adresMouseClicked
        DefaultTableModel model = (DefaultTableModel) tablo_adres.getModel();
        model_get();
        cmb_musteriMouseClicked(evt);
        cmb_sehirMouseClicked(evt);
        cmb_musteri.setSelectedItem(model.getValueAt(tablo_adres.getSelectedRow(), 1).toString());
        txt_mah.setText(model.getValueAt(tablo_adres.getSelectedRow(), 2).toString());
        txt_sok.setText(model.getValueAt(tablo_adres.getSelectedRow(), 3).toString());
        txt_no.setText(model.getValueAt(tablo_adres.getSelectedRow(), 4).toString());
        cmb_ilce.setSelectedItem(model.getValueAt(tablo_adres.getSelectedRow(), 5).toString());
        cmb_sehir.setSelectedItem(model.getValueAt(tablo_adres.getSelectedRow(), 6).toString());

    }//GEN-LAST:event_tablo_adresMouseClicked

    public void model_get() {
        ilce_crud ic = new ilce_crud();
        List<db_ilce> x = new ArrayList();
        x = ic.getList();
        cmb_ilce.removeAllItems();
        for (db_ilce m1 : x) {
            cmb_ilce.addItem(m1.getIlce_adi());
        }

        x.clear();
    }
    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablo_adres.getModel();
        ilce_crud ic = new ilce_crud();
        sehir_crud sc = new sehir_crud();
        musteri_crud msc = new musteri_crud();
        db_adres yeniAdres = new db_adres();
        try {

            yeniAdres.setAdres_id(Integer.parseInt(model.getValueAt(tablo_adres.getSelectedRow(), 0).toString()));
            yeniAdres.setAdres_mah(txt_mah.getText().trim());
            yeniAdres.setAdres_sok(txt_sok.getText().trim());
            yeniAdres.setAdres_no(Integer.parseInt(txt_no.getText().trim()));
            yeniAdres.setAdres_ilce_id(ic.idBul(cmb_ilce.getSelectedItem().toString()));
            yeniAdres.setAdres_sehir_id(sc.idBul(cmb_sehir.getSelectedItem().toString()));
            String mst = cmb_musteri.getSelectedItem().toString();
            yeniAdres.setMusteri_id(Integer.parseInt(mst.substring(0, mst.indexOf("."))));
            adres_crud ac = new adres_crud();
            ac.adres_guncelle(yeniAdres);
            tabloyu_temizle();
            adres_goster();
            formu_temizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "1.Tablodan Güncellenecek Adresi Seçtiğinizden Emin Olun!\n2.Sayısal Değer İsteyen Alanlara Hatalı Giriş Yapmayın!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablo_adres.getModel();

        adres_crud ac = new adres_crud();
        try {

            ac.adres_sil(Integer.parseInt(model.getValueAt(tablo_adres.getSelectedRow(), 0).toString()));
            tabloyu_temizle();
            adres_goster();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Silinecek Adresi Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_silActionPerformed

    public void tabloyu_temizle() {
        tablo_adres.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "MÜŞTERİ", "MAHALLE", "SOKAK", "NO", "İLÇE", "ŞEHİR"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tablo_adres.getColumnModel().getColumn(0).setResizable(false);
        tablo_adres.getColumnModel().getColumn(1).setResizable(false);
        tablo_adres.getColumnModel().getColumn(2).setResizable(false);
        tablo_adres.getColumnModel().getColumn(3).setResizable(false);
        tablo_adres.getColumnModel().getColumn(4).setResizable(false);
        tablo_adres.getColumnModel().getColumn(5).setResizable(false);
        tablo_adres.getColumnModel().getColumn(6).setResizable(false);

    }

    public void formu_temizle() {
        cmb_ilce.setSelectedIndex(-1);
        cmb_musteri.setSelectedIndex(-1);
        cmb_sehir.setSelectedIndex(-1);
        txt_mah.setText(null);
        txt_sok.setText(null);
        txt_no.setText(null);
    }

    public void adres_goster() {
        adres_crud ac = new adres_crud();
        ilce_crud ic = new ilce_crud();
        sehir_crud sc = new sehir_crud();
        musteri_crud mc = new musteri_crud();
        List<db_adres> aL = ac.getList();
        DefaultTableModel model = (DefaultTableModel) tablo_adres.getModel();
        tablo_adres.setFillsViewportHeight(true);
        Object[] row = new Object[7];
        for (int i = 0; i < aL.size(); i++) {
            row[0] = aL.get(i).getAdres_id();
            row[1] = aL.get(i).getMusteri_id() + "." + mc.musteriBul(aL.get(i).getMusteri_id()).getMusteri_ad() + " " + mc.musteriBul(aL.get(i).getMusteri_id()).getMusteri_soyad();
            row[2] = aL.get(i).getAdres_mah();
            row[3] = aL.get(i).getAdres_sok();
            row[4] = aL.get(i).getAdres_no();
            row[5] = ic.ilceBul(aL.get(i).getAdres_ilce_id());
            row[6] = sc.sehirBul(aL.get(i).getAdres_sehir_id());
            model.addRow(row);
        }
    }

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
            java.util.logging.Logger.getLogger(adres_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adres_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adres_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adres_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adres_formu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JComboBox cmb_ilce;
    private javax.swing.JComboBox cmb_musteri;
    private javax.swing.JComboBox cmb_sehir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo_adres;
    private javax.swing.JTextField txt_mah;
    private javax.swing.JTextField txt_no;
    private javax.swing.JTextField txt_sok;
    // End of variables declaration//GEN-END:variables
}
