/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kmdr7
 */
public class KartuATM {
 
    private int noATM;
    private String kategori;
    
    public KartuATM(int noATM, String kategori){
        this.noATM = noATM;
        this.kategori = kategori;
    }
    
    public void setNoATM(int noATM){
        this.noATM = noATM;
    }
    
    public int getNoATM(){
        return noATM;
    }
    
    public void setKategori(String kategori){
        this.kategori = kategori;
    }
    
    public String getKategori(){
        return kategori;
    }
    
}
