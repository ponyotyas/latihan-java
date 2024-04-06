/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

/**
 *
 * @author User
 */
public class AksiScanner {
    public static void main(String[] args){
    
    //membuat objek baru
    ClassScanner scan=new ClassScanner();
    
    scan.inputScanner();
    System.out.println("\nNama anda :" + scan.getnama());
    System.out.println("Nilai anda : " + scan.rata());
  
}
}