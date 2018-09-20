/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Dinar F V M
 */
public class UjiBus1 {

    public double penumpang;
    public double maxpenumpang;
    public double average;

    public UjiBus1(double maxpenumpang) {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }

    //Method Mutator
    public void addpenumpang(double penumpang) {
        double temp;
        temp = (this.penumpang + penumpang);
        if (temp > maxpenumpang) {
            System.out.println("Penumpang melebihi kuota");
        } else {
            this.penumpang = temp;
        }
    }

    public void getpenumpang(int password) {
        if (password == 24) {
            System.out.println("Password Benar");
        } else {
            System.out.println("Password Salah");
        }
    }

    public void cetakpenumpang() {
        System.out.println("penumpang Bus Sekarang = " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah = " + maxpenumpang);
    }

    public void average() {
        average = (5 + 6 + 3 + 6) / 4;
        System.out.println("Rata-rata penumpang ditambahkan adalah : " + average);
    }
}
