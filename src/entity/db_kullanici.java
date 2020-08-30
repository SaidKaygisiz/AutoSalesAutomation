/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author s_a-i
 */
public class db_kullanici {
    
    private int kullanici_id;
    private String kullanici_adi;
    private String kullanici_sifre;

    public db_kullanici() {
    }

    public db_kullanici(int kullanici_id, String kullanici_adi, String kullanici_sifre) {
        this.kullanici_id = kullanici_id;
        this.kullanici_adi = kullanici_adi;
        this.kullanici_sifre = kullanici_sifre;
    }
    
    

    public int getKullanici_id() {
        return kullanici_id;
    }

    public void setKullanici_id(int kullanici_id) {
        this.kullanici_id = kullanici_id;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getKullanici_sifre() {
        return kullanici_sifre;
    }

    public void setKullanici_sifre(String kullanici_sifre) {
        this.kullanici_sifre = kullanici_sifre;
    }
    
    
    
}
