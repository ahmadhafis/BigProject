/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bigproject;

import static bigproject.konversiTanggal.input;
import java.util.Scanner;
/**
 *
 * @author Ahmad Hafis
 */
public class BigProject {
    static String awal;
    static String akhir;
    
   
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String ulang="y";
        System.out.println("========================================");
        System.out.println("|           MOTRET  KAMERA              |");
        System.out.println("----------*****************-------------");
        System.out.println("|          peminjaman kamera            |");
        System.out.println("========================================");
        String[][] dataPelanggan=new String[1][3];
        for(int i=0;i<1;i++){
             System.out.print("Nama : ");
                dataPelanggan[i][0]=sc.nextLine();
            for(int j=0;j<3;j++){
                System.out.print("Alamat : ");
                dataPelanggan[i][j]=sc.nextLine();
                j++;
                System.out.print("No HP : ");
                dataPelanggan[i][j]=sc.nextLine();
                j++;
                
            }
            
            
        }
       
        
       
        while(ulang.equalsIgnoreCase("y")){
        System.out.println("=======================================");
        System.out.println("                MENU                   ");
        System.out.println("1.Peminjaman");
        System.out.println("2.Pengembalian");
        System.out.println("=======================================");
        System.out.print("Silahkan Pilih : ");
        int pilih=sc.nextInt();
        switch(pilih){
            case 1:
                pilihan();
            break;
                
            case 2:
                pengembalian();
            break;
                
           
        }
            System.out.print("Apakah anda ingin mengulang ? :");
            ulang = input.next();
            
        if (ulang.equalsIgnoreCase("t")){
            System.out.println("=============================");
            System.out.println("------**Terima Kasih**------");
            System.out.println("=============================");
        }
 }
      
        
        
       
   
    }
    static void data(){
        String namaKamera[]={"NIKON","CANON","SONY"};
        String hargaPinjaman[] = {"250000","350000","400000"};
        System.out.println("Harga Pinjaman");
        for (int i=0;i<namaKamera.length;i++){
            for (String hargaPinjaman1 : hargaPinjaman) {
                System.out.println((i+1) + "." + namaKamera[i] + "\t" + hargaPinjaman[i]);
                break;
            }
        }
    }
    
    static void pilihan(){
        Scanner sc=new Scanner(System.in);
        data();
        System.out.println("=====**KAMERA**=====");
        System.out.println("1.Nikon");
        System.out.println("2.Canon");
        System.out.println("3.Sony");
        System.out.println("===================");
        System.out.print("Silahkan pilih\t\t: ");
        int pilih1=sc.nextInt();
        switch(pilih1){
            case 1:
                nikon();
            break;
                
            case 2:
                canon();
            break;
                
            case 3:
                sony();
            break;
        }
    }
    
    
    
    static void nikon(){
        Scanner sc=new Scanner(System.in);
        int nikon1=250000;
       
        inputAwal(awal); 
         inputAkhir(akhir);  
    
        int tahunK = Integer.parseInt(awal.substring(6, 10));
        int bulanK = Integer.parseInt(awal.substring(3, 5));
        int hariK = Integer.parseInt(awal.substring(0, 2));

        int tahunH = Integer.parseInt(akhir.substring(6, 10));
        int bulanH = Integer.parseInt(akhir.substring(3, 5));
        int hariH = Integer.parseInt(akhir.substring(0, 2));

        int hari = hariH - hariK;
        int bulan = (bulanH - bulanK) * 30;
        int tahun = (tahunH - tahunK) * 365;

        int selisih = hari + bulan + tahun;
        
        System.out.println("Lama Peminjaman : "+selisih+" Hari");
        System.out.println("--------------------------------------------");
         
        System.out.println("Selamat!! Anda mendapat discount sebesar 5%!");
        System.out.println("--------------------------------------------");
        int sblmDiskon=nikon1*selisih;
        System.out.println("Harga sebelum diskon : " +sblmDiskon);
        System.out.println("Diskon = 5%");
        int stlhDiskon=(sblmDiskon*5)/100;
        int total=sblmDiskon-stlhDiskon;
        System.out.println("Harga setelah diskon : " +total);
        System.out.println();
        

    }
    
    static void canon(){
        Scanner sc=new Scanner(System.in);
        int canon1=350000;
        
        inputAwal(awal);
        inputAkhir(akhir);
        
         int tahunK = Integer.parseInt(awal.substring(6, 10));
        int bulanK = Integer.parseInt(awal.substring(3, 5));
        int hariK = Integer.parseInt(awal.substring(0, 2));

        int tahunH = Integer.parseInt(akhir.substring(6, 10));
        int bulanH = Integer.parseInt(akhir.substring(3, 5));
        int hariH = Integer.parseInt(akhir.substring(0, 2));

        int hari = hariH - hariK;
        int bulan = (bulanH - bulanK) * 30;
        int tahun = (tahunH - tahunK) * 365;

        int selisih = hari + bulan + tahun;
        
        System.out.println("Lama Peminjaman : "+selisih+" Hari");
          System.out.println("--------------------------------------------");
         
        System.out.println("Selamat!! Anda mendapat discount sebesar 10%!");
        System.out.println("--------------------------------------------");
        int sblmDiskon=canon1*selisih;
        System.out.println("Harga sebelum diskon : " +sblmDiskon);
        System.out.println("Diskon = 10%");
        int stlhDiskon=(sblmDiskon*10)/100;
        int total=sblmDiskon-stlhDiskon;
        System.out.println("Harga setelah diskon : " +total);
        System.out.println();
        
    }
    
    static void sony(){
        Scanner sc=new Scanner(System.in);
        int sony1=400000;
        
        inputAwal(awal);
        inputAkhir(akhir);
        
          int tahunK = Integer.parseInt(awal.substring(6, 10));
        int bulanK = Integer.parseInt(awal.substring(3, 5));
        int hariK = Integer.parseInt(awal.substring(0, 2));

        int tahunH = Integer.parseInt(akhir.substring(6, 10));
        int bulanH = Integer.parseInt(akhir.substring(3, 5));
        int hariH = Integer.parseInt(akhir.substring(0, 2));

        int hari = hariH - hariK;
        int bulan = (bulanH - bulanK) * 30;
        int tahun = (tahunH - tahunK) * 365;

        int selisih = hari + bulan + tahun;
        
        System.out.println("Lama Peminjaman : "+selisih+" Hari");
          System.out.println("--------------------------------------------");
         
        System.out.println("Selamat!! Anda mendapat discount sebesar 15%!");
        System.out.println("--------------------------------------------");
        int sblmDiskon=sony1*selisih;
        System.out.println("Harga sebelum diskon : " +sblmDiskon);
        System.out.println("Diskon = 15%");
        int stlhDiskon=(sblmDiskon*15)/100;
        int total=sblmDiskon-stlhDiskon;
        System.out.println("Harga setelah diskon : " +total);
        System.out.println();
        
        
    }
    static void pengembalian(){
        int denda=50000;
        System.out.println("***Pengembalian Kamera***");
        
        System.out.println("=========================");
        System.out.println("Masukkan tanggal : ");
        String tanggalCoba=input.nextLine();
        System.out.println("=========================");
        
        System.out.println("\nSilahkan inputkan tanggal pengembalian Anda");
        akhir = input.nextLine();
        
        System.out.println("Tanggal pengembalian : " +akhir);
        
        System.out.print("Tanggal hari ini : ");
        String hariIni=input.nextLine();
        
        System.out.println("Tanggal hari ini : " +hariIni);
        
        if(hariIni.equalsIgnoreCase(akhir)){
            System.out.println("Anda tidak mendapat denda");
        }else{
            System.out.println("Anda terkena denda " +denda);
            System.out.println("Mohon membayar denda anda segera");   
        }
       
        
    }
    
     static void inputAwal (String tanggalAwal){
      System.out.println("Format tgl/bln/thn contoh xx/yy/zzzz");
      System.out.println("Silahkan inputkan tanggal peminjaman Anda");
   
     awal = input.nextLine();
    }
    
     static void inputAkhir (String tanggalAkhir){
     System.out.println("\nSilahkan inputkan tanggal pengembalian Anda");
     akhir = input.nextLine();
    }
     
   
    }

    
     
        

    
    
    

