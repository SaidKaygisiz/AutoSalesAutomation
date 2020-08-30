/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_adres;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import veritabani.DatabaseConnection;

/**
 *
 * @author s_a-i
 */
public class adres_crud {

    Connection con = DatabaseConnection.getInstance().getConnection();
        ImageIcon i = new ImageIcon("src/ikonlar/polis2.png");

    public void adres_kaydet(db_adres a) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into db_adres (adres_mah,adres_sok,adres_no,musteri_id,adres_ilce_id,adres_sehir_id) values(?,?,?,?,?,?)");
            pst.setString(1, a.getAdres_mah());
            pst.setString(2, a.getAdres_sok());
            pst.setInt(3, a.getAdres_no());
            pst.setInt(4, a.getMusteri_id());
            pst.setInt(5, a.getAdres_ilce_id());
            pst.setInt(6, a.getAdres_sehir_id());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Zaten Müşterinin Adresi Var!", "Uyarı Penceresi", JOptionPane.INFORMATION_MESSAGE, i);
        }

    }

    public List<db_adres> getList() {
        List<db_adres> aL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_adres order by adres_id asc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_adres a = new db_adres();
                a.setAdres_id(rs.getInt("adres_id"));
                a.setAdres_mah(rs.getString("adres_mah"));
                a.setAdres_sok(rs.getString("adres_sok"));
                a.setAdres_ilce_id(rs.getInt("adres_ilce_id"));
                a.setAdres_sehir_id(rs.getInt("adres_sehir_id"));
                a.setAdres_no(rs.getInt("adres_no"));
                a.setMusteri_id(rs.getInt("musteri_id"));
                aL.add(a);
            }
        } catch (Exception e) {
        }
        return aL;
    }

    public void adres_guncelle(db_adres a) {

        try {
            PreparedStatement pst = con.prepareStatement("update db_adres set adres_mah=?, adres_sok=?, adres_no=?, musteri_id=?, adres_ilce_id=?, adres_sehir_id=? where adres_id=?");
            pst.setString(1, a.getAdres_mah());
            pst.setString(2, a.getAdres_sok());
            pst.setInt(3, a.getAdres_no());
            pst.setInt(4, a.getMusteri_id());
            pst.setInt(5, a.getAdres_ilce_id());
            pst.setInt(6, a.getAdres_sehir_id());
            pst.setInt(7, a.getAdres_id());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void adres_sil(int a) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from db_adres where adres_id=" + a);
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

}
