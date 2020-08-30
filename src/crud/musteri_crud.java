/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_adres;
import entity.db_musteri;
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
public class musteri_crud extends abstract_Crud {

    Connection con = DatabaseConnection.getInstance().getConnection();

    public List<db_adres> getAdr() {
        List<db_adres> ml = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select distinct adres_sehir_id ,count(musteri_id)as sayi from db_adres group by adres_sehir_id");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_adres a = new db_adres();
                a.setAdres_sehir_id(rs.getInt("adres_sehir_id"));
                a.setAdres_no(rs.getInt("sayi"));
                ml.add(a);
            }
        } catch (SQLException e) {
        }
        return ml;
    }

    public db_musteri musteriBul(int id) {
        db_musteri m = new db_musteri();
        try {

            PreparedStatement pst = con.prepareStatement("select * from db_musteri where musteri_id=" + id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                m.setMusteri_ad(rs.getString("musteri_ad"));
                m.setMusteri_soyad(rs.getString("musteri_soyad"));
            }

        } catch (SQLException e) {
        }
        return m;
    }

    @Override
    public void ekle(db_musteri m) {
        try {
            PreparedStatement pst = con.prepareStatement("insert into db_musteri (musteri_ad,musteri_soyad,musteri_tc,musteri_tel,musteri_email) values(?,?,?,?,?)");
            pst.setString(1, m.getMusteri_ad());
            pst.setString(2, m.getMusteri_soyad());
            pst.setInt(3, m.getMusteri_tc());
            pst.setInt(4, m.getMusteri_tel());
            pst.setString(5, m.getMusteri_email());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void sil(db_musteri m) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from db_musteri where musteri_id=" + m.getMusteri_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void guncelle(db_musteri m) {
        try {
            PreparedStatement pst = con.prepareStatement("update db_musteri set musteri_ad=?,musteri_soyad=?,musteri_tc=?,musteri_tel=?,musteri_email=? where musteri_id=?");
            pst.setString(1, m.getMusteri_ad());
            pst.setString(2, m.getMusteri_soyad());
            pst.setInt(3, m.getMusteri_tc());
            pst.setInt(4, m.getMusteri_tel());
            pst.setString(5, m.getMusteri_email());
            pst.setInt(6, m.getMusteri_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<db_musteri> listele() {
        List<db_musteri> mL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_musteri order by musteri_id asc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_musteri m = new db_musteri() {
                };
                m.setMusteri_id(rs.getInt("musteri_id"));
                m.setMusteri_ad(rs.getString("musteri_ad"));
                m.setMusteri_soyad(rs.getString("musteri_soyad"));
                m.setMusteri_tc(rs.getInt("musteri_tc"));
                m.setMusteri_tel(rs.getInt("musteri_tel"));
                m.setMusteri_email(rs.getString("musteri_email"));
                mL.add(m);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mL;
    }

}
