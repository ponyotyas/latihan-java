/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarku;

/**
 *
 * @author tyas
 */
    class hewan {
    public void suara () {
        System.out.println("Hewan bersuara : ");
    }
}
class kuda extends hewan {
    public void suara () {
        System.out.println("Kuda mengikik...");
    }
}
class kucing extends hewan {
    public void suara () {
        System.out.println("Kucing mengeong...");
    }
}
class ayam extends hewan {
    public void suara () {
        System.out.println("Ayam berkokok...");
    }
}
public class polimorfisme {
    public static void main(String[] args) {
        hewan HEWAN = new hewan();
        kuda KUDA = new kuda();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        
        HEWAN.suara();
        
        HEWAN = KUDA;
        HEWAN.suara();
        
        HEWAN = KUCING;
        HEWAN.suara();
        
        HEWAN = AYAM;
        HEWAN.suara();
    }
}
