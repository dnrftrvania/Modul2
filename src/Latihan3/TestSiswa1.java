/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Dinar F V M
 */
public class TestSiswa1 {

    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Vania");
        siswa.setAbsen("20");
        siswa.setAddress("Sidoarjo");

        System.out.println("Name : " + siswa.getName());
        System.out.println("Absen : " + siswa.getAbsen());
        System.out.println("Addres : " + siswa.getAddress());

    }
}
