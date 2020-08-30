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
public class db_ilce {
    private int ilce_id;
    private String ilce_adi;
    private int sehir_id;

    public int getIlce_id() {
        return ilce_id;
    }

    public void setIlce_id(int ilce_id) {
        this.ilce_id = ilce_id;
    }

    public String getIlce_adi() {
        return ilce_adi;
    }

    public void setIlce_adi(String ilce_adi) {
        this.ilce_adi = ilce_adi;
    }

    public int getSehir_id() {
        return sehir_id;
    }

    public void setSehir_id(int sehir_id) {
        this.sehir_id = sehir_id;
    }
    
}
