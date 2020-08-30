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
import crud.musteri_crud;
import crud.renk_crud;
import crud.yil_crud;
import entity.db_arac;
import entity.db_arac_kategori;
import entity.db_arac_marka;
import entity.db_arac_model;
import entity.db_arac_renk;
import entity.db_arac_yil;
import entity.db_musteri;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s_a-i
 */
public class arac_satis extends javax.swing.JFrame {

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
    public arac_satis() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cmb_musteri = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmb_yil = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmb_kategori = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmb_renk = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        cmb_vites = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmb_yakit = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cmb_kasa = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        cmb_marka = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        cmb_model = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        txt_fiyat = new javax.swing.JTextField();
        btn_guncelle = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablo_arac = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Satış Otomasyonu / Araç Satış");
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel9.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 255));
        jLabel9.setText("Müşteri:");

        cmb_musteri.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_musteriMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 255));
        jLabel6.setText("Yıl:");

        cmb_yil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_yilMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 255));
        jLabel5.setText("Kategori:");

        cmb_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_kategoriMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 255));
        jLabel4.setText("Renk:");

        cmb_renk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_renkMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 255));
        jLabel3.setText("Vites:");

        cmb_vites.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Manuel", "Otomatik", "Tiptronik" }));

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 255));
        jLabel2.setText("Yakıt:");

        cmb_yakit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Benzin", "Dizel", "Benzin-Lpg" }));

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 204, 255));
        jLabel1.setText("Kasa:");

        cmb_kasa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sedan", "Hatchback" }));

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 255));
        jLabel8.setText("Marka:");

        cmb_marka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_markaMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 255));
        jLabel7.setText("Model:");

        cmb_model.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmb_modelMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 204, 255));
        jLabel10.setText("Fiyat[tL]:");

        btn_guncelle.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_guncelle.setText("Sat Gitsin!");
        btn_guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guncelleActionPerformed(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_geri.setText("Geri Dön");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        tablo_arac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marka", "Model", "Yıl", "Kategori", "Renk", "Vites", "Yakıt", "Kasa", "Id", "Müşteri Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
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
            tablo_arac.getColumnModel().getColumn(9).setResizable(false);
        }

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/car6.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel9)
                                .addComponent(jLabel6)
                                .addComponent(cmb_yil, 0, 213, Short.MAX_VALUE)
                                .addComponent(cmb_kategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(cmb_musteri, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmb_yakit, 0, 213, Short.MAX_VALUE)
                            .addComponent(cmb_vites, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(cmb_renk, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(cmb_kasa, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                        .addComponent(btn_geri))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_fiyat)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(cmb_marka, 0, 213, Short.MAX_VALUE)
                            .addComponent(cmb_model, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_musteri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_yil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_renk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmb_vites, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmb_model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmb_yakit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmb_kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_geri))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmb_kasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void tablo_aracMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablo_aracMouseClicked
        cmb_markaMouseClicked(evt);
        cmb_kategoriMouseClicked(evt);
        cmb_renkMouseClicked(evt);
        cmb_yilMouseClicked(evt);
        model_get();
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        cmb_marka.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 0).toString());
        cmb_model.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 1).toString());
        cmb_yil.setSelectedItem(Integer.parseInt(model.getValueAt(tablo_arac.getSelectedRow(), 2).toString()));
        cmb_kategori.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 3).toString());
        cmb_renk.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 4).toString());
        cmb_vites.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 5).toString());
        cmb_yakit.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 6).toString());
        cmb_kasa.setSelectedItem(model.getValueAt(tablo_arac.getSelectedRow(), 7).toString());


    }//GEN-LAST:event_tablo_aracMouseClicked

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        try {
            
        
        String mst = cmb_musteri.getSelectedItem().toString();
        yeniArac.setArac_kasa(cmb_kasa.getSelectedItem().toString());
        yeniArac.setArac_kategori_id(k.idBul(cmb_kategori.getSelectedItem().toString()));
        yeniArac.setArac_marka_id(m.idBul(cmb_marka.getSelectedItem().toString()));
        yeniArac.setArac_vites(cmb_vites.getSelectedItem().toString());
        yeniArac.setArac_yakit(cmb_yakit.getSelectedItem().toString());
        yeniArac.setArac_renk_id(r.idBul(cmb_renk.getSelectedItem().toString()));
        yeniArac.setArac_yil_id(y.idBul(Integer.parseInt(cmb_yil.getSelectedItem().toString())));
        yeniArac.setArac_model_id(mm.idBul(cmb_model.getSelectedItem().toString()));
        yeniArac.setArac_id(Integer.parseInt(model.getValueAt(tablo_arac.getSelectedRow(), 8).toString()));
        yeniArac.setArac_fiyat(Integer.parseInt(txt_fiyat.getText().trim()));
        yeniArac.setMusteri_id(Integer.parseInt(mst.substring(0, mst.indexOf("."))));
        aa.arac_guncelle(yeniArac);
        formu_temizle();
        tabloyu_temizle();
        aracGoster();
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "1.Alanları Boş Bırakmadığınızdan Emin Olun!\n2.Satılan Müşteriyi Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);

        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

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

    public void tabloyu_temizle() {
        tablo_arac.setModel(new DefaultTableModel(null, new String[]{"Marka", "Model", "Yıl", "Kategori", "Renk", "Vites", "Yakıt", "Kasa", "Id", "Müşteri Id"}));
        tablo_arac.getColumnModel().getColumn(0).setResizable(false);
        tablo_arac.getColumnModel().getColumn(1).setResizable(false);
        tablo_arac.getColumnModel().getColumn(2).setResizable(false);
        tablo_arac.getColumnModel().getColumn(3).setResizable(false);
        tablo_arac.getColumnModel().getColumn(4).setResizable(false);
        tablo_arac.getColumnModel().getColumn(5).setResizable(false);
        tablo_arac.getColumnModel().getColumn(6).setResizable(false);
        tablo_arac.getColumnModel().getColumn(7).setResizable(false);
        tablo_arac.getColumnModel().getColumn(8).setResizable(false);
        tablo_arac.getColumnModel().getColumn(9).setResizable(false);

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
        List<db_arac> ar = a.satilmayanList();
        DefaultTableModel model = (DefaultTableModel) tablo_arac.getModel();
        tablo_arac.setFillsViewportHeight(true);
        Object[] row = new Object[10];
        for (int i = 0; i < ar.size(); i++) {
            row[0] = m.marka_bul(ar.get(i).getArac_marka_id());
            row[1] = mm.model_bul(ar.get(i).getArac_model_id());
            row[2] = y.yil_bul(ar.get(i).getArac_yil_id());
            row[3] = k.kategori_bul(ar.get(i).getArac_kategori_id());
            row[4] = r.renk_bul(ar.get(i).getArac_renk_id());
            row[5] = ar.get(i).getArac_vites();
            row[6] = ar.get(i).getArac_yakit();
            row[7] = ar.get(i).getArac_kasa();
            row[8] = ar.get(i).getArac_id();
            row[9] = ar.get(i).getMusteri_id();
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
            java.util.logging.Logger.getLogger(arac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arac_satis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arac_satis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_geri;
    private javax.swing.JButton btn_guncelle;
    private javax.swing.JComboBox cmb_kasa;
    private javax.swing.JComboBox cmb_kategori;
    private javax.swing.JComboBox cmb_marka;
    private javax.swing.JComboBox cmb_model;
    private javax.swing.JComboBox cmb_musteri;
    private javax.swing.JComboBox cmb_renk;
    private javax.swing.JComboBox cmb_vites;
    private javax.swing.JComboBox cmb_yakit;
    private javax.swing.JComboBox cmb_yil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablo_arac;
    private javax.swing.JTextField txt_fiyat;
    // End of variables declaration//GEN-END:variables
}
