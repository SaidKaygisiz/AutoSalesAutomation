/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import entity.db_musteri;
import java.util.List;

/**
 *
 * @author s_a-i
 */
public abstract class abstract_Crud {

    public abstract void ekle(db_musteri m);

    public abstract void sil(db_musteri m);

    public abstract void guncelle(db_musteri m);

    public abstract List<db_musteri> listele();
}
