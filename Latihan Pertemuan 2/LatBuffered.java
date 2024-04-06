/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3;

import java.io.*;
/**
 *
 * @author User
 */
public class LatBuffered {
    public static void main(String args[]) throws IOException {  
    
    
    //membuat objek baru
    InputStreamReader keyreader = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader (keyreader);
    //deklarasi variabel
    
    String kata1, kata2;
    
    System.out.print ("Masukan kata pertama :");
    kata1 = input.readLine();
    System.out.print ("Masukan kata kedua :");
    kata2 = input.readLine();
    System.out.println ("\nHasil input String " + kata1 + " " + kata2);
    
}
}