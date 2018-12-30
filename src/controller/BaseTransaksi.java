/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Nasabah;
import model.Tabungan;
import repository.Database;

/**
 *
 * @author kmdr7
 */
public class BaseTransaksi {
    
    protected Database db;
    protected Tabungan tabungan;
    private String nama;
    private long limit;
    
    public BaseTransaksi(Database db){
        this.db = db;
    }
    
    public long getLimit(){
        switch(tabungan.getKartuATM().getKategori()){
            case "Gold":
                limit = 10000000;
                break;
            case "Silver":
                limit = 2500000;
                break;
            default : 
                limit = 2500000;
                break;
        }
        return limit;
    }
    
    public long showSaldo(){
        return tabungan.getSaldo();
    }
    
    public boolean transfer(String rekPenerima, long nominal){
        // Looping semua nasabah
        for(Nasabah nasabah : db.getList()){
            try{
                String norek = nasabah.getTabungan().getNorek();
                if(norek.equals(rekPenerima) && tabungan.getSaldo() > nominal){
                    tabungan.setSaldo(tabungan.getSaldo() - nominal);
                    nasabah.getTabungan().setSaldo(nasabah.getTabungan().getSaldo() + nominal);
                    return true;
                }        
            }catch(Exception e){
                System.out.println("Error : " + e);
            }
        }
        return false;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public Tabungan getTabungan(){
        return tabungan;
    }
    
    public void setTabungan(Tabungan tabungan){
        this.tabungan = tabungan;
    }
    
}
