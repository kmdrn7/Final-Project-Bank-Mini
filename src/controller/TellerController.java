/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Nasabah;
import repository.Database;

/**
 *
 * @author kmdr7
 */ 
public class TellerController extends ATMController {

    public TellerController(Database db){
        super(db);
    }
    
    @Override
    public boolean login(String norek, String password) {
        for (Nasabah nasabah : db.getList()) {
                try {
                    String dataNoRekening = nasabah.getTabungan().getNorek();
                    String dataPassword = nasabah.getTabungan().getPassword();
                    setNama(nasabah.getNama());
                    if (dataNoRekening.equals(norek) && dataPassword.equals(password)) {
                        setTabungan(nasabah.getTabungan());
                        return true;
                    }
                } catch (Exception e) {
                    System.out.println("Error : " + e);
                }
        }
        return false;
    }
    
    public boolean setorTunai(long nominal) {
        getTabungan().setSaldo(getTabungan().getSaldo() + nominal);
        return true;
    }
    
}
