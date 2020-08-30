/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_arac;
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
public class arac_crud {

    
    Connection con=DatabaseConnection.getInstance().getConnection();

    public List<db_arac> getList() {
        List<db_arac> a = new ArrayList();

        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac order by arac_id asc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac ar = new db_arac();
                ar.setArac_id(rs.getInt("arac_id"));
                ar.setArac_kasa(rs.getString("arac_kasa"));
                ar.setArac_kategori_id(rs.getInt("arac_kategori_id"));
                ar.setArac_marka_id(rs.getInt("arac_marka_id"));
                ar.setArac_model_id(rs.getInt("arac_model_id"));
                ar.setArac_renk_id(rs.getInt("arac_renk_id"));
                ar.setArac_yakit(rs.getString("arac_yakit"));
                ar.setArac_yil_id(rs.getInt("arac_yil_id"));
                ar.setArac_vites(rs.getString("arac_vites"));
                a.add(ar);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public void arac_kaydet(db_arac a) {

        try {
            PreparedStatement pst = con.prepareStatement("insert into db_arac (arac_kasa,arac_kategori_id,arac_marka_id,arac_model_id,arac_renk_id,arac_yakit,arac_yil_id,arac_vites) values(?,?,?,?,?,?,?,?)");
            pst.setString(1, a.getArac_kasa());
            pst.setInt(2, a.getArac_kategori_id());
            pst.setInt(3, a.getArac_marka_id());
            pst.setInt(4, a.getArac_model_id());
            pst.setInt(5, a.getArac_renk_id());
            pst.setString(6, a.getArac_yakit());
            pst.setInt(7, a.getArac_yil_id());
            pst.setString(8, a.getArac_vites());
            pst.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void arac_guncelle(db_arac a) {

        try {
            PreparedStatement pst = con.prepareStatement("Update db_arac set arac_marka_id=?,arac_model_id=?,arac_yil_id=?,arac_renk_id=?,arac_kategori_id=?,arac_vites=?,arac_yakit=?,arac_kasa=?,arac_fiyat=?,musteri_id=? where arac_id=?");
            pst.setInt(1, a.getArac_marka_id());
            pst.setInt(2, a.getArac_model_id());
            pst.setInt(3, a.getArac_yil_id());
            pst.setInt(4, a.getArac_renk_id());
            pst.setInt(5, a.getArac_kategori_id());
            pst.setString(6, a.getArac_vites());
            pst.setString(7, a.getArac_yakit());
            pst.setString(8, a.getArac_kasa());
            pst.setInt(9, a.getArac_fiyat());
            pst.setInt(10, a.getMusteri_id());
            pst.setInt(11, a.getArac_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void arac_sil(db_arac a) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from db_arac where arac_id=" + a.getArac_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<db_arac> satilmayanList() {
        List<db_arac> a = new ArrayList();

        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac where musteri_id isnull order by arac_id asc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac ar = new db_arac();
                ar.setArac_id(rs.getInt("arac_id"));
                ar.setArac_kasa(rs.getString("arac_kasa"));
                ar.setArac_kategori_id(rs.getInt("arac_kategori_id"));
                ar.setArac_marka_id(rs.getInt("arac_marka_id"));
                ar.setArac_model_id(rs.getInt("arac_model_id"));
                ar.setArac_renk_id(rs.getInt("arac_renk_id"));
                ar.setArac_yakit(rs.getString("arac_yakit"));
                ar.setArac_yil_id(rs.getInt("arac_yil_id"));
                ar.setArac_vites(rs.getString("arac_vites"));
                ar.setArac_fiyat(rs.getInt("arac_fiyat"));
                ar.setMusteri_id(rs.getInt("musteri_id"));
                a.add(ar);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public void arac_guncelle2(db_arac a) {

        try {
            PreparedStatement pst = con.prepareStatement("Update db_arac set arac_marka_id=?,arac_model_id=?,arac_yil_id=?,arac_renk_id=?,arac_kategori_id=?,arac_vites=?,arac_yakit=?,arac_kasa=? where arac_id=?");
            pst.setInt(1, a.getArac_marka_id());
            pst.setInt(2, a.getArac_model_id());
            pst.setInt(3, a.getArac_yil_id());
            pst.setInt(4, a.getArac_renk_id());
            pst.setInt(5, a.getArac_kategori_id());
            pst.setString(6, a.getArac_vites());
            pst.setString(7, a.getArac_yakit());
            pst.setString(8, a.getArac_kasa());
            pst.setInt(9, a.getArac_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public List<db_arac> hangiMusterinin(int id) {
        List<db_arac> a = new ArrayList();
        try {

            PreparedStatement pst = con.prepareStatement("select * from db_arac where musteri_id=" + id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac ar = new db_arac();
                ar.setArac_id(rs.getInt("arac_id"));
                ar.setArac_kasa(rs.getString("arac_kasa"));
                ar.setArac_kategori_id(rs.getInt("arac_kategori_id"));
                ar.setArac_marka_id(rs.getInt("arac_marka_id"));
                ar.setArac_model_id(rs.getInt("arac_model_id"));
                ar.setArac_renk_id(rs.getInt("arac_renk_id"));
                ar.setArac_yakit(rs.getString("arac_yakit"));
                ar.setArac_yil_id(rs.getInt("arac_yil_id"));
                ar.setArac_vites(rs.getString("arac_vites"));
                ar.setArac_fiyat(rs.getInt("arac_fiyat"));
                ar.setMusteri_id(rs.getInt("musteri_id"));
                a.add(ar);
            }

        } catch (SQLException e) {
            e.getMessage();
        }
        return a;
    }

    public double satilan() {
        double sayi = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac where musteri_id !=0");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                sayi++;
            }
        } catch (SQLException e) {
        }
        return sayi;
    }

    public double satilmayan() {
        double sayi = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac where musteri_id isnull");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                sayi++;
            }
        } catch (SQLException e) {
        }
        return sayi;
    }

    public List<db_arac> getMark() {
        List<db_arac> aL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select distinct(arac_marka_id),count(arac_marka_id) as sayi from db_arac where musteri_id !=0 group by arac_marka_id ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac a = new db_arac();
                a.setArac_marka_id(rs.getInt("arac_marka_id"));
                a.setArac_renk_id(rs.getInt("sayi"));
                aL.add(a);

            }

        } catch (SQLException e) {
        }
        return aL;
    }
    public List<db_arac> getMarkRenk() {
        List<db_arac> aL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select distinct(arac_renk_id),count(arac_renk_id) as sayi from db_arac where musteri_id !=0 group by arac_renk_id ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac a = new db_arac();
                a.setArac_renk_id(rs.getInt("arac_renk_id"));
                a.setArac_yil_id(rs.getInt("sayi"));
                aL.add(a);

            }

        } catch (SQLException e) {
        }
        return aL;
    }
}
