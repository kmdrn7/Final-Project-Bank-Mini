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
public class OnlineController extends BaseTransaksi implements ShouldAuthenticated {

    public OnlineController(Database db){
        super(db);
    }
    
    @Override
    public boolean login(String username, String password) {
        for(Nasabah nasabah : db.getList()){
            try{
                String dataUsername = nasabah.getTabungan().getUsername();
                String dataPassword = nasabah.getTabungan().getPassword();
                setNama(nasabah.getNama());
                if (dataUsername.equals(username) && dataPassword.equals(password)) {
                    setTabungan(nasabah.getTabungan());
                    return true;
                }
            }catch(Exception e){
                System.out.println("Error : " + e);
            }
        }
        return false;
    }
    
}
