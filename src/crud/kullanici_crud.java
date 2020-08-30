/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_kullanici;
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
public class kullanici_crud {
    Connection con=DatabaseConnection.getInstance().getConnection();
    
    public List <db_kullanici> getList(){
        List <db_kullanici> kL=new ArrayList();
        
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_kullanici");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                db_kullanici k=new db_kullanici();
                k.setKullanici_id(rs.getInt("kullanici_id"));
                k.setKullanici_adi(rs.getString("kullanici_adi"));
                k.setKullanici_sifre(rs.getString("kullanici_sifre"));
                kL.add(k);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return kL;
    }
    
    public boolean dogrulama(String ad,String sifre){
        boolean a=false;
        
        try {
            PreparedStatement pst = con.prepareStatement("select * from db_kullanici where kullanici_adi=? and kullanici_sifre=?");
            pst.setString(1, ad);
            pst.setString(2, sifre);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                a = true;
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return a;
    }
    
}
