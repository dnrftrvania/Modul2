/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Dinar F V M
 */
import java.lang.Math;

public class Bola {

    private double jarijari = 21;
    private double diameter;
    private double luaspermukaan;
    private double volume;

    public void setJari(double jarijari) {
        this.jarijari = jarijari;
    }

    public void showDiameter() {
        this.diameter = 2 * jarijari;
    }

    public void showLuasPermukaan() {
        this.luaspermukaan = 4 * Math.PI * jarijari * jarijari;
    }

    public void showVolume() {
        this.volume = 4 / 3 * Math.PI * jarijari * jarijari * jarijari;
    }

    public void cetak() {
        System.out.println("Jari-Jari : " + jarijari + " cm");

        System.out.println("--------------------------------------");
        System.out.println("Diameter : " + diameter + " cm");
        System.out.println("Luas Permukaan : " + luaspermukaan + " cm kuadrat");
        System.out.println("Volume : " + volume + " cm kubik");
    }
}
