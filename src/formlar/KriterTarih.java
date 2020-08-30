/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import entity.db_arac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import veritabani.DatabaseConnection;

/**
 *
 * @author s_a-i
 */
public class KriterTarih implements Kriter {

    Connection con = DatabaseConnection.getInstance().getConnection();

    @Override
    public List<db_arac> getList(int tarih) {
        List<db_arac> al = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_arac where arac_yil_id=" +tarih);
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
                al.add(ar);
            }
        } catch (Exception e) {
        }
        return al;
    }

}
