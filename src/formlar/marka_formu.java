/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import crud.marka_crud;
import entity.db_arac_marka;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author s_a-i
 */
public class marka_formu extends javax.swing.JFrame {

    /**
     * Creates new form marka_formu
     */
    marka_crud mc = new marka_crud();
    private int page = 1;
    private int ListİtemCount = 20;
    List<db_arac_marka> mL = null;
    ImageIcon i = new ImageIcon("src/ikonlar/polis2.png");

    public boolean hasNext() {
        return this.page <= (mc.markaSayisi() / ListİtemCount);
    }

    public boolean hasPrev() {
        return this.page > 1;
    }

    public void previous() {
        this.page--;
    }

    public void next() {
        this.page++;
    }

    public void first() {
        this.page = 1;
    }

    public void last() {
        this.page = 1 + (mc.markaSayisi() / ListİtemCount);

    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getListİtemCount() {
        return ListİtemCount;
    }

    public void setListİtemCount(int ListİtemCount) {
        this.ListİtemCount = ListİtemCount;
    }
    
    public void sayfaYaz(){
        lbl_sayfa.setText("Toplam "+(1+mc.markaSayisi()/ListİtemCount)+" Sayfa İçerisinden "+this.page+". Sayfadasınız!");
    }

    public marka_formu() {
        initComponents();
        marka_goster();
        kontrol();
        sayfaYaz();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_marka_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_marka_adi = new javax.swing.JTextField();
        btn_kaydet = new javax.swing.JButton();
        btn_guncelle = new javax.swing.JButton();
        btn_sil = new javax.swing.JButton();
        btn_temizle = new javax.swing.JButton();
        btn_geri = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        marka_tablo = new javax.swing.JTable();
        lbl_first = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();
        lbl_next = new javax.swing.JLabel();
        lbl_last = new javax.swing.JLabel();
        lbl_sayfa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Araç Satış Otomasyonu / Marka");
        setResizable(false);

        jPanel1.setBackground(java.awt.SystemColor.textHighlight);

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("ID:");

        txt_marka_id.setEditable(false);
        txt_marka_id.setText("Read Only !");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("MARKA:");

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

        btn_sil.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_sil.setText("Sil");
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_temizle.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_temizle.setText("Temizle");
        btn_temizle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_temizleActionPerformed(evt);
            }
        });

        btn_geri.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        btn_geri.setText("Geri Dön");
        btn_geri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_geriActionPerformed(evt);
            }
        });

        marka_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marka ID", "Marka Adı"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        marka_tablo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marka_tabloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(marka_tablo);
        if (marka_tablo.getColumnModel().getColumnCount() > 0) {
            marka_tablo.getColumnModel().getColumn(0).setResizable(false);
            marka_tablo.getColumnModel().getColumn(1).setResizable(false);
        }

        lbl_first.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/first.png"))); // NOI18N
        lbl_first.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_firstMouseClicked(evt);
            }
        });

        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/prev.png"))); // NOI18N
        lbl_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_backMouseClicked(evt);
            }
        });

        lbl_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/nextt.png"))); // NOI18N
        lbl_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_nextMouseClicked(evt);
            }
        });

        lbl_last.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/lastt.png"))); // NOI18N
        lbl_last.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_lastMouseClicked(evt);
            }
        });

        lbl_sayfa.setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        lbl_sayfa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Courier New", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_marka_id, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_marka_adi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_temizle))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guncelle)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 570, Short.MAX_VALUE)
                        .addComponent(btn_geri))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_sayfa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbl_first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_back)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_next)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_last)))
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_marka_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_marka_adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_geri)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_kaydet)
                            .addComponent(btn_guncelle))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_sil)
                            .addComponent(btn_temizle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_sayfa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_last)
                            .addComponent(lbl_first))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_next)
                            .addComponent(lbl_back))
                        .addContainerGap())))
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
        db_arac_marka m = new db_arac_marka();
        marka_crud mc = new marka_crud();
        m.setMarka_adi(txt_marka_adi.getText().trim());
        if (!m.getMarka_adi().equals("")) {
            mc.markaEkle(m);
            DefaultTableModel model = (DefaultTableModel) marka_tablo.getModel();
            Object[] row = new Object[2];
            row[1] = m.getMarka_adi();
            model.addRow(row);
            tabloTemizle();
            marka_goster();
            formuTemizle();
            kontrol();
        } else {
            JOptionPane.showMessageDialog(this, "Marka Adı Alanını Boş Bırakma!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }

    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void marka_tabloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marka_tabloMouseClicked
        DefaultTableModel model = (DefaultTableModel) marka_tablo.getModel();
        txt_marka_id.setText(model.getValueAt(marka_tablo.getSelectedRow(), 0).toString());
        txt_marka_adi.setText(model.getValueAt(marka_tablo.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_marka_tabloMouseClicked

    private void btn_temizleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_temizleActionPerformed
        formuTemizle();
    }//GEN-LAST:event_btn_temizleActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        DefaultTableModel model = (DefaultTableModel) marka_tablo.getModel();
        db_arac_marka a = new db_arac_marka();
        marka_crud mc = new marka_crud();
        try {

            a.setMarka_id(Integer.parseInt(model.getValueAt(marka_tablo.getSelectedRow(), 0).toString()));
            mc.markaSil(a);
            model.removeRow(marka_tablo.getSelectedRow());
            model.fireTableDataChanged();
            formuTemizle();
            kontrol();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Silinecek Markayı Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_guncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guncelleActionPerformed
        DefaultTableModel model = (DefaultTableModel) marka_tablo.getModel();
        db_arac_marka a = new db_arac_marka();
        marka_crud mc = new marka_crud();
        try {

            a.setMarka_id((int) (model.getValueAt(marka_tablo.getSelectedRow(), 0)));
            a.setMarka_adi(txt_marka_adi.getText());
            mc.markaGuncelle(a);
            model.setValueAt(txt_marka_adi.getText().trim(), marka_tablo.getSelectedRow(), 1);
            formuTemizle();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tablodan Günccellenecek Kategoriyi Seçtiğinizden Emin Olun!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }
    }//GEN-LAST:event_btn_guncelleActionPerformed

    public void kontrol() {
        if (this.page == 1) {
            lbl_first.setEnabled(false);
            lbl_back.setEnabled(false);
            lbl_next.setEnabled(true);
            lbl_last.setEnabled(true);
        } else if (this.page == 1 + (mc.markaSayisi() / ListİtemCount)) {
            lbl_first.setEnabled(true);
            lbl_back.setEnabled(true);
            lbl_next.setEnabled(false);
            lbl_last.setEnabled(false);

        } else if (this.page > 1 && this.page < 1 + (mc.markaSayisi() / ListİtemCount)) {
            lbl_first.setEnabled(true);
            lbl_back.setEnabled(true);
            lbl_next.setEnabled(true);
            lbl_last.setEnabled(true);
        } else if ((mc.markaSayisi() % ListİtemCount) == 0) {
            lbl_first.setEnabled(true);
            lbl_back.setEnabled(true);
            lbl_next.setEnabled(false);
            lbl_last.setEnabled(false);
        }

    }
    private void lbl_firstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_firstMouseClicked
        if (lbl_first.isEnabled()) {
            this.first();
            tabloTemizle();
            kontrol();
            marka_goster();
            sayfaYaz();
        }

    }//GEN-LAST:event_lbl_firstMouseClicked

    private void lbl_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_backMouseClicked
        if (lbl_back.isEnabled()) {
            this.previous();
            tabloTemizle();
            marka_goster();
            kontrol();
            sayfaYaz();
        }

    }//GEN-LAST:event_lbl_backMouseClicked

    private void lbl_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_nextMouseClicked
        if (lbl_next.isEnabled()) {
            this.next();
            tabloTemizle();
            marka_goster();
            kontrol();
            sayfaYaz();
        }

    }//GEN-LAST:event_lbl_nextMouseClicked

    private void lbl_lastMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_lastMouseClicked
        if (lbl_last.isEnabled()) {
            this.last();
            tabloTemizle();
            kontrol();
            marka_goster();
            sayfaYaz();
        }

    }//GEN-LAST:event_lbl_lastMouseClicked

    public void formuTemizle() {
        txt_marka_adi.setText(null);
        txt_marka_id.setText("Read Only !");
    }

    public void tabloTemizle() {
        marka_tablo.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Marka ID", "Marka Adı"
                }
        ) {
            boolean[] canEdit = new boolean[]{
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jScrollPane1.setViewportView(marka_tablo);

        if (marka_tablo.getColumnModel().getColumnCount() > 0) {
            marka_tablo.getColumnModel().getColumn(0).setResizable(false);
            marka_tablo.getColumnModel().getColumn(1).setResizable(false);
        }
    }

    public void marka_goster() {
        marka_crud mc = new marka_crud();
        List<db_arac_marka> mL = mc.getList2(this.page, this.ListİtemCount);
        DefaultTableModel model = (DefaultTableModel) marka_tablo.getModel();
        marka_tablo.setFillsViewportHeight(true);
        Object[] row = new Object[2];
        mL.stream().map((mL1) -> {
            row[0] = mL1.getMarka_id();
            return mL1;
        }).map((mL1) -> {
            row[1] = mL1.getMarka_adi();
            return mL1;
        }).forEach((_item) -> {
            model.addRow(row);
        });
    }

    public void marka_goster2(int a, int b) {
        marka_crud mc = new marka_crud();
        List<db_arac_marka> mL = mc.getList2(a, b);
        DefaultTableModel model = (DefaultTableModel) marka_tablo.getModel();
        marka_tablo.setFillsViewportHeight(true);
        Object[] row = new Object[2];
        mL.stream().map((mL1) -> {
            row[0] = mL1.getMarka_id();
            return mL1;
        }).map((mL1) -> {
            row[1] = mL1.getMarka_adi();
            return mL1;
        }).forEach((_item) -> {
            model.addRow(row);
        });
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
            java.util.logging.Logger.getLogger(marka_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(marka_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(marka_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(marka_formu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new marka_formu().setVisible(true);
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
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_first;
    private javax.swing.JLabel lbl_last;
    private javax.swing.JLabel lbl_next;
    private javax.swing.JLabel lbl_sayfa;
    private javax.swing.JTable marka_tablo;
    private javax.swing.JTextField txt_marka_adi;
    private javax.swing.JTextField txt_marka_id;
    // End of variables declaration//GEN-END:variables
}