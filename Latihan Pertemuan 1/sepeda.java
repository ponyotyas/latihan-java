/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarku;

/**
 *
 * @author tyas Pertemuan 2
 * 
 */
class sepeda {
    int kecepatan = 0;
    int gir = 0;

    void ubahGir(int pertambahanGir) {
        gir = gir + pertambahanGir;
        System.out.println("Gir:" + gir);
    }

    void tambahkecepatan(int pertambahanKecepatan) {
        kecepatan = kecepatan + pertambahanKecepatan;
        System.out.println("Kecepatan:" + kecepatan);
    }
}

