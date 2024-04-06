package Pertemuan3;

import java.util.Scanner;

/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class LatScanner {
    public static void main(String[] args){
    
        //membuat objek baru
        Scanner input = new Scanner(System.in);
        
        //deklarasi variabel
        
        String nama;
        int n2;
        double n1, n3;
        
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.print("Masukkan nilai 1 : ");
        n1 = input.nextDouble();
        System.out.print("Masukkan nilai 2 :");
        n2 = input.nextInt();
        
        n3 = n1 + n2;
        System.out.println("\nNama anda :" + nama);
        
        System.out.println("Nilai anda :" + n3);
        
    }
    }
