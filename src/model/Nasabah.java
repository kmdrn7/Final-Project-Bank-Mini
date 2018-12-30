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
public class Nasabah {
    
    private int idNasabah;
    private String nama;
    private Tabungan tabungan;

    public Nasabah(int idNasabah, String nama, Tabungan tabungan){
        this.idNasabah = idNasabah;
        this.nama = nama;
        this.tabungan = tabungan;
    }
    
    public int getIdNasabah() {
        return idNasabah;
    }

    public void setIdNasabah(int idNasabah) {
        this.idNasabah = idNasabah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Tabungan getTabungan() {
        return tabungan;
    }

    public void setTabungan(Tabungan tabungan) {
        this.tabungan = tabungan;
    }
    
    
    
}
