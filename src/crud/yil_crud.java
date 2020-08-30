/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_arac_yil;
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
public class yil_crud {

    Connection con=DatabaseConnection.getInstance().getConnection();

    public List<db_arac_yil> getList() {
        List<db_arac_yil> a = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac_yil");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_yil md = new db_arac_yil();
                md.setYil_id(rs.getInt("yil_id"));
                md.setYil_tarih(rs.getInt("yil_tarih"));
                a.add(md);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public int idBul(int b) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select yil_id from db_arac_yil where yil_tarih=?");
            pst.setInt(1, b);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("yil_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }

    public String yil_bul(int id) {
        String yil = null;
        try {
            PreparedStatement pst = con.prepareStatement("select yil_tarih from db_arac_yil where yil_id=" + id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            yil = rs.getString("yil_tarih");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return yil;
    }
}
