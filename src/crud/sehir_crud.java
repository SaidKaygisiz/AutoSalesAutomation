/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_sehir;
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
public class sehir_crud {

    Connection con=DatabaseConnection.getInstance().getConnection();

    public List<db_sehir> getList() {
        List<db_sehir> a = new ArrayList();

        try {
            PreparedStatement pst = con.prepareStatement("select * from db_sehir order by sehir_id asc");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_sehir ar = new db_sehir();
                ar.setSehir_id(rs.getInt("sehir_id"));
                ar.setSehir_adi(rs.getString("sehir_adi"));
                a.add(ar);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return a;
    }

    public int idBul(String sehir) {
        int a = 0;
        try {
            PreparedStatement pst = con.prepareStatement("select sehir_id from db_sehir where sehir_adi=?");
            pst.setString(1, sehir);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                a = rs.getInt("sehir_id");
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return a;

    }
    
    public String sehirBul(int id){
        String a=null;
        try {
            PreparedStatement pst=con.prepareStatement("select sehir_adi from db_sehir where sehir_id="+id);
            ResultSet rs=pst.executeQuery();
            while(rs.next()){
                a=rs.getString("sehir_adi");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()); 
       }
        return a;
    }

}
