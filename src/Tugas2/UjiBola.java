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
public class UjiBola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola ball = new Bola();
        ball.setJari(21);
        ball.showDiameter();
        ball.showLuasPermukaan();
        ball.showVolume();
        ball.cetak();
    }

}
