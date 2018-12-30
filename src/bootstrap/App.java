/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bootstrap;

import model.KartuATM;
import model.Nasabah;
import model.Tabungan;
import repository.Database;
import view.frmMain;

/**
 *
 * @author kmdr7
 */
public class App {
    public static void main(String[] args) {
        Database db = new Database();
        
        db.getList().add(
                // idNasabah, nama
                new Nasabah(1, "Andika Ahmad Ramadhan",
                        // username, password, norek, jumlahTabungan
                        new Tabungan("kmdr7", "kmdr7", "14045", 500000000, 
                            // nomorATM, kategori
                            new KartuATM(1112, "Gold"))
                )
        );
        
        db.getList().add(
                // idNasabah, nama
                new Nasabah(2, "Ahmad Andi Fauzi",
                        // username, password, norek, jumlahTabungan
                        new Tabungan("andi", "andi", "14022", 20000, 
                            // nomorATM, kategori
                            new KartuATM(1113, "Gold"))
                )
        );
        
        frmMain mainLayout = new frmMain(db);
        mainLayout.setVisible(true);
    }
}
