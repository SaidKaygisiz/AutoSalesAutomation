/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_ilce;
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
public class ilce_crud {

    Connection con = DatabaseConnection.getInstance().getConnection();

    public List<db_ilce> getSelectedList(int id) {
        List<db_ilce> mL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_ilce where sehir_id=" + id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_ilce i = new db_ilce();
                i.setIlce_adi(rs.getString("ilce_adi"));
                i.setIlce_id(rs.getInt("ilce_id"));
                i.setSehir_id(rs.getInt("sehir_id"));
                mL.add(i);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mL;
    }

    public List<db_ilce> getList() {
        List<db_ilce> mL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_ilce ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_ilce i = new db_ilce();
                i.setIlce_adi(rs.getString("ilce_adi"));
                i.setIlce_id(rs.getInt("ilce_id"));
                i.setSehir_id(rs.getInt("sehir_id"));
                mL.add(i);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mL;
    }

    public int idBul(String ilce) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select ilce_id from db_ilce where ilce_adi=?");
            pst.setString(1, ilce);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("ilce_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }

    public String ilceBul(int id) {
        String a = null;
        try {
            PreparedStatement pst = con.prepareStatement("select ilce_adi from db_ilce where ilce_id=" + id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getString("ilce_adi");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return a;
    }

}
