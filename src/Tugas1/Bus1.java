/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import Latihan4.UjiBus3;

/**
 *
 * @author Dinar F V M
 */
public class Bus1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UjiBus1 Bus = new UjiBus1(5);
        Bus.getpenumpang(17);
        Bus.getpenumpang(24);
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(1); //tambah 1 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        //penambahan penumpang
        Bus.addpenumpang(2); //tambah 2 penumpang
        Bus.cetakpenumpang();
        //output averege penambahan penumpang
        Bus.average();
    }

}
