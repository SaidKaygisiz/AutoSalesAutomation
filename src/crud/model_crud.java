/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_arac_model;
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
public class model_crud {

    Connection con=DatabaseConnection.getInstance().getConnection();

    public List<db_arac_model> getList() {
        List<db_arac_model> mL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac_model");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_model md = new db_arac_model();
                md.setModel_id(rs.getInt("model_id"));
                md.setMarka_id(rs.getInt("marka_id"));
                md.setModel_adi(rs.getString("model_adi"));
                mL.add(md);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mL;
    }

    public List<db_arac_model> getSelectedList(int id) {
        List<db_arac_model> mL = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac_model where marka_id=" + id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_model md = new db_arac_model();
                md.setModel_id(rs.getInt("model_id"));
                md.setMarka_id(rs.getInt("marka_id"));
                md.setModel_adi(rs.getString("model_adi"));
                mL.add(md);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return mL;
    }

    public int idBul(String b) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select model_id from db_arac_model where model_adi=?");
            pst.setString(1, b);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("model_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }
    
    public String model_bul(int id) {
        String model = null;
        try {
            PreparedStatement pst = con.prepareStatement("select model_adi from db_arac_model where model_id=" + id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            model = rs.getString("model_adi");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return model;
    }

}
