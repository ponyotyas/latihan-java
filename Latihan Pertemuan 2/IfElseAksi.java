/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author User
 */
public class IfElseAksi {
    public static void main(String argss[]){
        IfElseClass ifclass = new IfElseClass();
        
        ifclass.setInputData();
        ifclass.getKeterangan();
             
        System.out.println("Hasil Akhir");
        System.out.println("===============================");
        System.out.println("Nama Siswa      : " + ifclass.nama);
        System.out.println("Nilai Akhir     : " + ifclass.nilaiakhir);
        System.out.println("Keterangann     : " + ifclass.getKeterangan());
        System.out.println("===============================");
        
    }
}

