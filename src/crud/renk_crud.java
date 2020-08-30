/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_arac_renk;
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
public class renk_crud {

    Connection con=DatabaseConnection.getInstance().getConnection();

    public List<db_arac_renk> getList() {
        List<db_arac_renk> a = new ArrayList();

        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac_renk order by renk_id ASC");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_renk r = new db_arac_renk();
                r.setRenk_id(rs.getInt("renk_id"));
                r.setRenk_adi(rs.getString("renk_adi"));
                a.add(r);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public int idBul(String b) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select renk_id from db_arac_renk where renk_adi=?");
            pst.setString(1, b);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("renk_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }

    public String renk_bul(int id) {
        String renk = null;
        try {
            PreparedStatement pst = con.prepareStatement("select renk_adi from db_arac_renk where renk_id=" + id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            renk = rs.getString("renk_adi");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return renk;
    }

    public void renk_kaydet(db_arac_renk r) {
        try {

            PreparedStatement pst = con.prepareStatement("insert into db_arac_renk (renk_adi) values(?)");
            pst.setString(1, r.getRenk_adi());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void renk_guncelle(db_arac_renk r) {

        try {

            PreparedStatement pst = con.prepareStatement("update  db_arac_renk set renk_adi=? where renk_id=?");
            pst.setString(1, r.getRenk_adi());
            pst.setInt(2, r.getRenk_id());
            pst.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void renk_sil(db_arac_renk r) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from db_arac_renk where renk_id=" + r.getRenk_id());
            pst.executeUpdate();

        } catch (SQLException e) {
            e.getMessage();
        }
    }

}
