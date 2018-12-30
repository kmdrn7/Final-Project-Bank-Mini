/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import middleware.ShouldAuthenticated;
import model.Nasabah;
import repository.Database;

/**
 *
 * @author kmdr7
 */
public class ATMController extends BaseTransaksi implements ShouldAuthenticated {
    
    public ATMController(Database db){
        super(db);
    }
    
    @Override
    public boolean login(String noATM, String password) {
        for(Nasabah nasabah : db.getList()){
            try{
                int dataNoATM = nasabah.getTabungan().getKartuATM().getNoATM();
                String dataPassword = nasabah.getTabungan().getPassword();
                setNama(nasabah.getNama());
                if (dataNoATM == Integer.parseInt(noATM) && dataPassword.equals(password)) {
                    System.out.println("Saldo "+nasabah.getTabungan().getSaldo());
                    super.tabungan = nasabah.getTabungan();
                    return true;
                }
            }catch(Exception e){
                System.out.println("Error : " + e);
            }
        }
        return false;
    }
    
    public boolean tarikTunai(long nominal){
        if (nominal < getTabungan().getSaldo()) {
            getTabungan().setSaldo(getTabungan().getSaldo() - nominal);
            return true;
        }
        return false;
    }
    
}
