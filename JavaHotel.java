/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.pbo2.javahotel;

import java.util.Scanner;



/**
 *
 * @author Win 10
 */
public class JavaHotel {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        // Input nama lengkap, tipe kamar, dan lama inap
        
        System.out.print("Nama Lengkap: ");
        String nama = input.nextLine();
        System.out.print("Tipe Kamar (bunga/melati/mawar/tulip): ");
        String tipeKamar = input.nextLine();
        System.out.print("Lama Inap: ");
        int lamaInap = input.nextInt();
        
        // Deklarasi harga kamar
        
        int hargaKamar = 0;
        if (tipeKamar.equalsIgnoreCase("bunga")) {
            hargaKamar = 750000;
        } else if (tipeKamar.equalsIgnoreCase("melati")) {
            hargaKamar = 530000;
        } else if (tipeKamar.equalsIgnoreCase("mawar")) {
            hargaKamar = 850000;
        } else if (tipeKamar.equalsIgnoreCase("tulip")) {
            hargaKamar = 1320000;
        }
        
        
         // Hitung diskon jika lama inap > 5 hari
         
        double diskon = 0;
        if (lamaInap > 5) {
            if (tipeKamar.equalsIgnoreCase("bunga")) {
                diskon = 0.08;
            } else if (tipeKamar.equalsIgnoreCase("melati")) {
                diskon = 0.03;
            } else if (tipeKamar.equalsIgnoreCase("mawar")) {
                diskon = 0.1;
            } else if (tipeKamar.equalsIgnoreCase("tulip")) {
                diskon = 0.12;
            }
        }
        
        // Hitung total harga inap
        
        double totalHarga = hargaKamar * lamaInap * (1 - diskon);
        
        // Output hasil
        System.out.println("=========");
        System.out.println("Nama Lengkap: " + nama);
        System.out.println("Tipe Kamar: " + tipeKamar);
        System.out.println("Lama Inap: " + lamaInap + " hari");
        System.out.println("Rincian Harga Inap: Rp. " + hargaKamar + " x " + lamaInap + " hari = Rp. " + (hargaKamar * lamaInap));
        System.out.println("Diskon: " + (int)(diskon * 100) + "%");
        System.out.println("Total yang harus dibayarkan: Rp. " + totalHarga);
    
        
    }
}
