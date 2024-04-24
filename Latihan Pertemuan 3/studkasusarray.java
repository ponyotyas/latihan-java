/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package belajarku;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Tyas
 */
public class studkasusarray {
    public static void main(String[] args) throws IOException {
        
        Scanner input=new Scanner(System.in);
        int i,j;
        String nampen, tanggal;
        double total=0;
        String [] kodebarang = new String [10];
        String [] namabarang = new String [10];
        int [] jumlah = new int [10];
        double [] harga = new double [10];
        double [] total_harga = new double [10];
        
        System.out.println("                 PT. PERMATA PRATAMA                 ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Masukkan Nama Petugas   : "); nampen=input.nextLine();
        System.out.println("Tanggal                 : "); tanggal=input.nextLine();
         System.out.print(" Jumlah Data yang akan di masukan :"); j=input.nextInt();
        System.out.println("-----------------------------------------------");
        
        for (i=1;i<=j; i++){
            
            System.out.println("        Data ke- +i");
            System.out.println("        kode barang :");kodebarang[i]=input.next();
            System.out.println("        jumlah      :");jumlah[i]=input.nextInt();
            
            if(kodebarang[i].equalsIgnoreCase("P001")){
                namabarang[i]= "printer";
                harga[i]= 70000;
            }
            else if(kodebarang[i].equalsIgnoreCase("V001")){
                namabarang[i]= "VGA Card";
                harga[i]= 75000;
            }
            else if(kodebarang[i].equalsIgnoreCase("M001")){
                namabarang[i]= "Mother Board";
                harga[i]=950000;
            }
            else{
                namabarang[i]="Tidak Terdaftar";
                harga[i]=0;
            }
        }
        
       System.out.println("                               PT. PERMATA PRATAMA                                   ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.print("Nama Petugas               :" + nampen); System.out.println("                     Tanggal :" + tanggal);
        System.out.println("Jumlah Data Yang Dimasukkan :" + j);
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Data Ke-   Kode Barang     Nama Barang   Harga Barang   Jumlah Barang   Total Harga");
        System.out.println("--------------------------------------------------------------------------------------");
        
        for(i=1;i<=j;i++){
            total_harga[i]=harga[i]*jumlah[i];
            System.out.println(i+"           "+kodebarang[i]+"           "+namabarang[i]+"   "+harga[i]+"             "+jumlah[i] +"           "+total_harga[i]);
            total=total+total_harga[i];
        }
        
        System.out.println("Total Pendapatan pada tanggal" + " " + tanggal + " " + "adalah sebesar Rp." + total );
    }
}