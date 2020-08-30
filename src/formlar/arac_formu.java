/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import crud.arac_crud;
import crud.kategori_crud;
import crud.marka_crud;
import crud.model_crud;
import crud.renk_crud;
import crud.yil_crud;
import entity.db_arac;
import entity.db_arac_kategori;
import entity.db_arac_marka;
import entity.db_arac_model;
import entity.db_arac_renk;
import entity.db_arac_yil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s_a-i
 */
public class arac_formu extends javax.swing.JFrame {

    /**
     * Creates new form arac_formu
     *
     */
    db_arac yeniArac = new db_arac();
    arac_crud aa = new arac_crud();
    kategori_crud k = new kategori_crud();
    marka_crud m = new marka_crud();
    renk_crud r = new renk_crud();
    yil_crud y = new yil_crud();
    model_crud mm = new model_crud();
    ImageIcon i = new ImageIcon("src/ikonlar/polis2.png");

    public arac_formu() {
        initComponents();
        formu_temizle();
        aracGoster();

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btn_kaydet = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        cmb_kasa = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmb_yakit = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmb_vites = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmb_renk = new javax.swing.JComboBox();
        btn_geri = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmb_kategori = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmb_yil = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmb_model = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmb_marka = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_arac = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txt_ttt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Satış Otomasyonu / Araç");
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        btn_kaydet.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_kaydet.setText("Kaydet");
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

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

        cmb_kasa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sedan", "Hatchback" }));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Kasa:");

        cmb_yakit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Benzin", "Dizel", "Benzin-Lpg" }));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Yakıt:");

        cmb_vites.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manuel", "Otomatik", "Tiptronik" }));

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Vites:");

        cmb_renk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_renkMouseClicked(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_geri.setText("Geri Dön");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Renk:");

        cmb_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_kategoriMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Kategori:");

        cmb_yil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_yilMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Yıl:");

        cmb_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_modelMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Model:");

        cmb_marka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_markaMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Marka:");

        tablo_arac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Marka", "Model", "Yıl", "Kategori", "Renk", "Vites", "Yakıt", "Kasa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablo_arac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_aracMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablo_arac);
        if (tablo_arac.getColumnModel().getColumnCount() > 0) {
            tablo_arac.getColumnModel().getColumn(0).setResizable(false);
            tablo_arac.getColumnModel().getColumn(1).setResizable(false);
            tablo_arac.getColumnModel().getColumn(2).setResizable(false);
            tablo_arac.getColumnModel().getColumn(3).setResizable(false);
            tablo_arac.getColumnModel().getColumn(4).setResizable(false);
            tablo_arac.getColumnModel().getColumn(5).setResizable(false);
            tablo_arac.getColumnModel().getColumn(6).setResizable(false);
            tablo_arac.getColumnModel().getColumn(7).setResizable(false);
            tablo_arac.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/front_big.png"))); // NOI18N

        txt_ttt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_tttKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("Yıla Göre Arama:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ttt, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_geri)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(cmb_model, 0, 167, Short.MAX_VALUE)
                            .addComponent(cmb_marka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(cmb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_renk, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(cmb_vites, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmb_kasa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_temizle, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_guncelle)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_yil, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cmb_yakit, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_kasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_kaydet)
                            .addComponent(btn_guncelle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(btn_sil)
                            .addComponent(btn_temizle))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_vites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_yakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_geri)
                    .addComponent(txt_ttt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_geriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_geriActionPerformed
        if (giris_formu.k.getKullanici_adi().equals("özge")) {
                patron_sayfa p = new patron_sayfa();
                this.setVisible(false);
                p.setVisible(true);
            } else {
            this.setVisible(false);
                ana_sayfa a = new ana_sayfa();
                a.setVisible(true);

            }
    }//GEN-LAST:event_btn_geriActionPerformed

    private void cmb_modelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_modelMouseClicked
        model_crud c = new model_crud();
        marka_crud mc = new marka_crud();
        cmb_model.removeAllItems();

        try {
            List<db_arac_model> m = c.getSelectedList(mc.idBul(cmb_marka.getSelectedItem().toString()));
            for (int i = 0; i < m.size(); i++) {
                cmb_model.addItem(m.get(i).getModel_adi());

            }
        } catch (NullPointerException e) {

        }


    }//GEN-LAST:event_cmb_modelMouseClicked
    public void model_get() {

        List<db_arac_model> x = new ArrayList();
        x = mm.getList();
        cmb_model.removeAllItems();
        for (db_arac_model m1 : x) {
            cmb_model.addItem(m1.getModel_adi());
        }

        x.clear();
    }

    private void cmb_markaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_markaMouseClicked
        marka_crud c = new marka_crud();
        List<db_arac_marka> m = new ArrayList();
        m = c.getList();
        cmb_marka.removeAllItems();
        for (db_arac_marka m1 : m) {
            cmb_marka.addItem(m1.getMarka_adi());
        }

        m.clear();
    }//GEN-LAST:event_cmb_markaMouseClicked

    private void cmb_yilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_yilMouseClicked

        List<db_arac_yil> ay = new ArrayList();
        ay = y.getList();
        cmb_yil.removeAllItems();
        for (int i = 0; i < ay.size(); i++) {
            cmb_yil.addItem(ay.get(i).getYil_tarih());
        }
        ay.clear();
    }//GEN-LAST:event_cmb_yilMouseClicked

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        formu_temizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void cmb_renkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_renkMouseClicked
        renk_crud c = new renk_crud();
        List<db_arac_renk> a = new ArrayList();
        a = c.getList();
        cmb_renk.removeAllItems();
        for (int i = 0; i < a.size(); i++) {
            cmb_renk.addItem(a.get(i).getRenk_adi());
        }
        a.clear();
    }//GEN-LAST:event_cmb_renkMouseClicked

    private void cmb_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmb_kategoriMouseClicked
        kategori_crud c = new kategori_crud();
        List<db_arac_kategori> a = new ArrayList();
        a = c.getList();
        cmb_kategori.removeAllItems();
        for (int i = 0; i < a.size(); i++) {
            cmb_kategori.addItem(a.get(i).getKategori_adi());
        }
        a.clear();
    }//GEN-LAST:event_cmb_kategoriMouseClicked

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        db_arac a = new db_arac();
        try {

            a.setArac_kasa(cmb_kasa.getSelectedItem().toString());
            a.setArac_kategori_id(k.idBul(cmb_kategori.getSelectedItem().toString()));
            a.setArac_marka_id(m.idBul(cmb_marka.getSelectedItem().toString()));
            a.setArac_vites(cmb_vites.getSelectedItem().toString());
            a.setArac_yakit(cmb_yakit.getSelectedItem().toString());
            a.setArac_renk_id(r.idBul(cmb_renk.getSelectedItem().toString()));
            a.setArac_yil_id(y.idBul(Integer.parseInt(cmb_yil.getSelectedItem().toString())));
            a.setArac_model_id(mm.idBul(cmb_model.getSelectedItem().toString()));
            aa.arac_kaydet(a);
            DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
            Object[] row = new Object[8];
            row[0] = cmb_marka.getSelectedItem().toString();
            row[1] = cmb_model.getSelectedItem().toString();
            row[2] = Integer.parseInt(cmb_yil.getSelectedItem().toString());
            row[3] = cmb_kategori.getSelectedItem().toString();
            row[4] = cmb_renk.getSelectedItem().toString();
            row[5] = cmb_vites.getSelectedItem().toString();
            row[6] = cmb_yakit.getSelectedItem().toString();
            row[7] = cmb_kasa.getSelectedItem().toString();
            model.addRow(row);
            tabloyu_temizle();
            aracGoster();
            formu_temizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Hiçbir Alan Boş Geçmediğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void tablo_aracMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_aracMouseClicked
        cmb_markaMouseClicked(evt);
        cmb_kategoriMouseClicked(evt);
        cmb_renkMouseClicked(evt);
        cmb_yilMouseClicked(evt);
        model_get();
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        cmb_marka.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 1).toString());
        cmb_model.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 2).toString());
        cmb_yil.setSelectedItem(Integer.parseInt(model.getValueAt(tablo_arac.getSelectedRow(), 3).toString()));
        cmb_kategori.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 4).toString());
        cmb_renk.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 5).toString());
        cmb_vites.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 6).toString());
        cmb_yakit.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 7).toString());
        cmb_kasa.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 8).toString());


    }//GEN-LAST:event_tablo_aracMouseClicked

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        try {

            yeniArac.setArac_kasa(cmb_kasa.getSelectedItem().toString());
            yeniArac.setArac_kategori_id(k.idBul(cmb_kategori.getSelectedItem().toString()));
            yeniArac.setArac_marka_id(m.idBul(cmb_marka.getSelectedItem().toString()));
            yeniArac.setArac_vites(cmb_vites.getSelectedItem().toString());
            yeniArac.setArac_yakit(cmb_yakit.getSelectedItem().toString());
            yeniArac.setArac_renk_id(r.idBul(cmb_renk.getSelectedItem().toString()));
            yeniArac.setArac_yil_id(y.idBul(Integer.parseInt(cmb_yil.getSelectedItem().toString())));
            yeniArac.setArac_model_id(mm.idBul(cmb_model.getSelectedItem().toString()));
            yeniArac.setArac_id(Integer.parseInt(model.getValueAt(tablo_arac.getSelectedRow(), 0).toString()));
            aa.arac_guncelle2(yeniArac);
            model.setValueAt(yeniArac.getArac_id(), tablo_arac.getSelectedRow(), 0);
            model.setValueAt(cmb_marka.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 1);
            model.setValueAt(cmb_model.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 2);
            model.setValueAt(cmb_yil.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 3);
            model.setValueAt(cmb_kategori.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 4);
            model.setValueAt(cmb_renk.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 5);
            model.setValueAt(cmb_vites.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 6);
            model.setValueAt(cmb_yakit.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 7);
            model.setValueAt(cmb_kasa.getSelectedItem().toString(), tablo_arac.getSelectedRow(), 8);

            formu_temizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Güncellenecek Aracı Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);

        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed

        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        try {

            yeniArac.setArac_id(Integer.parseInt(model.getValueAt(tablo_arac.getSelectedRow(), 8).toString()));
            aa.arac_sil(yeniArac);
            model.removeRow(tablo_arac.getSelectedRow());
            model.fireTableDataChanged();
            formu_temizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Silinecek Aracı Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_silActionPerformed

    private void txt_tttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_tttKeyReleased

        try {
            yil_crud yc = new yil_crud();
            DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
            if (txt_ttt.getText().equals("")) {
                tabloyu_temizle();
                aracGoster();
            } else if (!txt_ttt.getText().matches("[0-9]+")) {
                tabloyu_temizle();
            }
            int id = yc.idBul(Integer.parseInt(txt_ttt.getText()));
            if (id != 0) {
                tabloyu_temizle();
                aracGoster2(id);
            } else {
                tabloyu_temizle();
            }

        } catch (Exception e) {

        }


    }//GEN-LAST:event_txt_tttKeyReleased

    public void tabloyu_temizle() {
        tablo_arac.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Marka", "Model", "Yıl", "Kategori", "Renk", "Vites", "Yakıt", "Kasa"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        tablo_arac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablo_aracMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(tablo_arac);

        if (tablo_arac.getColumnModel().getColumnCount() > 0) {
            tablo_arac.getColumnModel().getColumn(0).setResizable(false);
            tablo_arac.getColumnModel().getColumn(1).setResizable(false);
            tablo_arac.getColumnModel().getColumn(2).setResizable(false);
            tablo_arac.getColumnModel().getColumn(3).setResizable(false);
            tablo_arac.getColumnModel().getColumn(4).setResizable(false);
            tablo_arac.getColumnModel().getColumn(5).setResizable(false);
            tablo_arac.getColumnModel().getColumn(6).setResizable(false);
            tablo_arac.getColumnModel().getColumn(7).setResizable(false);
            tablo_arac.getColumnModel().getColumn(8).setResizable(false);
        }
    }

    public void formu_temizle() {
        cmb_marka.setSelectedIndex(-1);
        cmb_model.setSelectedIndex(-1);
        cmb_kategori.setSelectedIndex(-1);
        cmb_kasa.setSelectedIndex(-1);
        cmb_renk.setSelectedIndex(-1);
        cmb_vites.setSelectedIndex(-1);
        cmb_yakit.setSelectedIndex(-1);
        cmb_yil.setSelectedIndex(-1);

    }

    public void aracGoster() {
        arac_crud a = new arac_crud();
        List<db_arac> ar = a.getList();
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        tablo_arac.setFillsViewportHeight(true);
        Object[] row = new Object[9];
        for (int i = 0; i < ar.size(); i++) {
            row[0] = ar.get(i).getArac_id();
            row[1] = m.marka_bul(ar.get(i).getArac_marka_id());
            row[2] = mm.model_bul(ar.get(i).getArac_model_id());
            row[3] = y.yil_bul(ar.get(i).getArac_yil_id());
            row[4] = k.kategori_bul(ar.get(i).getArac_kategori_id());
            row[5] = r.renk_bul(ar.get(i).getArac_renk_id());
            row[6] = ar.get(i).getArac_vites();
            row[7] = ar.get(i).getArac_yakit();
            row[8] = ar.get(i).getArac_kasa();

            model.addRow(row);
        }
    }

    public void aracGoster2(int id) {
        KriterTarih kt = new KriterTarih();
        List<db_arac> ar = kt.getList(id);
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        tablo_arac.setFillsViewportHeight(true);
        Object[] row = new Object[9];
        for (int i = 0; i < ar.size(); i++) {
            row[0] = ar.get(i).getArac_id();
            row[1] = m.marka_bul(ar.get(i).getArac_marka_id());
            row[2] = mm.model_bul(ar.get(i).getArac_model_id());
            row[3] = y.yil_bul(ar.get(i).getArac_yil_id());
            row[4] = k.kategori_bul(ar.get(i).getArac_kategori_id());
            row[5] = r.renk_bul(ar.get(i).getArac_renk_id());
            row[6] = ar.get(i).getArac_vites();
            row[7] = ar.get(i).getArac_yakit();
            row[8] = ar.get(i).getArac_kasa();

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
            java.util.logging.Logger.getLogger(arac_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arac_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arac_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arac_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arac_formu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_temizle;
    private javax.swing.JComboBox cmb_kasa;
    private javax.swing.JComboBox cmb_kategori;
    private javax.swing.JComboBox cmb_marka;
    private javax.swing.JComboBox cmb_model;
    private javax.swing.JComboBox cmb_renk;
    private javax.swing.JComboBox cmb_vites;
    private javax.swing.JComboBox cmb_yakit;
    private javax.swing.JComboBox cmb_yil;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo_arac;
    private javax.swing.JTextField txt_ttt;
    // End of variables declaration//GEN-END:variables
}
