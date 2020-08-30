/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_arac_marka;
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
public class marka_crud {

    Connection con = DatabaseConnection.getInstance().getConnection();

    
    public int markaSayisi(){
        int a=0;
        try {
            PreparedStatement pst=con.prepareStatement("select * from db_arac_marka");
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                a++;
            }
        } catch (Exception e) {
        }
        return a;
    }
    
    public String marka_bul(int id) {
        String marka = null;
        try {
            PreparedStatement pst = con.prepareStatement("select marka_adi from db_arac_marka where marka_id=" + id);
            ResultSet rs = pst.executeQuery();
            rs.next();
            marka = rs.getString("marka_adi");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return marka;
    }

    public List<db_arac_marka> getList() {
        List<db_arac_marka> m = new ArrayList();
        try {
            PreparedStatement pst = con.prepareStatement("select *from db_arac_marka order by marka_id Asc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_marka a = new db_arac_marka();
                a.setMarka_id(rs.getInt("marka_id"));
                a.setMarka_adi(rs.getString("marka_adi"));
                m.add(a);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return m;
    }
     public List<db_arac_marka> getList2(int page,int lic) {
        List<db_arac_marka> m = new ArrayList();
        int start = 0;
        start = (page - 1) * lic;
        try {
            PreparedStatement pst = con.prepareStatement("select *from db_arac_marka order by marka_id Asc limit "+lic+" offset "+start);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_arac_marka a = new db_arac_marka();
                a.setMarka_id(rs.getInt("marka_id"));
                a.setMarka_adi(rs.getString("marka_adi"));
                m.add(a);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return m;
    }

    public int idBul(String marka) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select marka_id from db_arac_marka where marka_adi=?");
            pst.setString(1, marka);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("marka_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }

    public void markaEkle(db_arac_marka m) {
        try {
            PreparedStatement pst = con.prepareStatement("insert into db_arac_marka (marka_adi) values (?)");
            pst.setString(1, m.getMarka_adi());
            pst.executeUpdate();
        } catch (SQLException e) {
        }
    }

    public void markaSil(db_arac_marka m) {
        try {
            PreparedStatement pst = con.prepareStatement("delete from db_arac_marka where marka_id=" + m.getMarka_id());
            pst.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void markaGuncelle(db_arac_marka m) {
        try {
            PreparedStatement pst = con.prepareStatement("update db_arac_marka set marka_adi=? where marka_id=?");
            pst.setString(1, m.getMarka_adi());
            pst.setInt(2, m.getMarka_id());
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

}
