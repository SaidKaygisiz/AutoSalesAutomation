/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formlar;

import entity.db_arac;
import java.util.List;

/**
 *
 * @author s_a-i
 */
public interface Kriter {
    
    public List<db_arac>getList(int tarih);
    
}
