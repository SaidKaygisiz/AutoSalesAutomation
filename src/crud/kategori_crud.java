/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_arac_kategori;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import veritabani.DatabaseConnection;

/**
 *
 * @author s_a-i
 */
public class kategori_crud {

    Connection con = DatabaseConnection.getInstance().getConnection();

    public List<db_arac_kategori> getList() {
        List<db_arac_kategori> a = new ArrayList();

        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac_kategori");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_kategori k = new db_arac_kategori();
                k.setKategori_id(rs.getInt("kategori_id"));
                k.setKategori_adi(rs.getString("kategori_adi"));
                a.add(k);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;
    }

    public int idBul(String b) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select kategori_id from db_arac_kategori where kategori_adi=?");
            pst.setString(1, b);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("kategori_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }

    public String kategori_bul(int id) {
        String kat = null;
        try {
            PreparedStatement pst = con.prepareStatement("select kategori_adi from db_arac_kategori where kategori_id=" + id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            kat = rs.getString("kategori_adi");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return kat;
    }

    public void kat_kaydet(db_arac_kategori k) {

        try {

            PreparedStatement pst = con.prepareStatement("insert into db_arac_kategori (kategori_adi) values (?) ");
            pst.setString(1, k.getKategori_adi());
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void kat_sil(int id) {

        try {

            PreparedStatement pst = con.prepareStatement("delete from db_arac_kategori where kategori_id=" + id);
            pst.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void kat_guncelle(db_arac_kategori r) {

        try {

            PreparedStatement pst = con.prepareStatement("update  db_arac_kategori set kategori_adi=? where kategori_id=?");
            pst.setString(1, r.getKategori_adi());
            pst.setInt(2, r.getKategori_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
