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
public class db_adres {
    private int adres_id;
    private String adres_mah;
    private String adres_sok;
    private int adres_no;
    private int adres_ilce_id;
    private int adres_sehir_id;
    private int musteri_id;

    public int getAdres_id() {
        return adres_id;
    }

    public void setAdres_id(int adres_id) {
        this.adres_id = adres_id;
    }

    public String getAdres_mah() {
        return adres_mah;
    }

    public void setAdres_mah(String adres_mah) {
        this.adres_mah = adres_mah;
    }

    public String getAdres_sok() {
        return adres_sok;
    }

    public void setAdres_sok(String adres_sok) {
        this.adres_sok = adres_sok;
    }

    public int getAdres_no() {
        return adres_no;
    }

    public void setAdres_no(int adres_no) {
        this.adres_no = adres_no;
    }

    public int getAdres_ilce_id() {
        return adres_ilce_id;
    }

    public void setAdres_ilce_id(int adres_ilce_id) {
        this.adres_ilce_id = adres_ilce_id;
    }

    public int getAdres_sehir_id() {
        return adres_sehir_id;
    }

    public void setAdres_sehir_id(int adres_sehir_id) {
        this.adres_sehir_id = adres_sehir_id;
    }

    public int getMusteri_id() {
        return musteri_id;
    }

    public void setMusteri_id(int musteri_id) {
        this.musteri_id = musteri_id;
    }
    
}
