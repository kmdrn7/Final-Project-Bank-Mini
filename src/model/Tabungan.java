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
public class Tabungan {
    
    private String norek;
    private KartuATM atm;
    private long saldo;
    private String username;
    private String password;

    public Tabungan(String username, String password, String norek, long saldo, KartuATM atm) {
        this.username = username;
        this.password = password;
        this.norek = norek;
        this.atm = atm;
        this.saldo = saldo;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }

    public void setNorek(String norek) {
        this.norek = norek;
    }

    public String getNorek() {
        return norek;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public long getSaldo() {
        return this.saldo;
    }

    public void setKartuATM(KartuATM atm) {
        this.atm = atm;
    }

    public KartuATM getKartuATM() {
        return atm;
    }

}
