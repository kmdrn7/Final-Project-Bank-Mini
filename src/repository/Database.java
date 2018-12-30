/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import model.Nasabah;

/**
 *
 * @author kmdr7
 */
public class Database {
    
    private ArrayList<Nasabah> listNasabah = new ArrayList<>();

    public ArrayList<Nasabah> getList() {
        return listNasabah;
    }

    public void setList(ArrayList<Nasabah> listNasabah) {
        this.listNasabah = listNasabah;
    }
    
    
    
}
