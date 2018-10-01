/*1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117095.latihan21.rata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama      : Alvin Lukman Nulhakim 
 * Kelas     : IF3 
 * NIM       : 10117095 
 * Deskripsi : 
 */
public class PBO310117095Latihan21RataRataNilai {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n, nilai[];
        float rata, jumlah = 0;

        //Input banyaknya mahasiswa
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();

        //Inisialisasi array
        nilai = new int[n];

        //Input nilai
        for (int i = 0; i <= n - 1; i++) {
            System.out.print("Nilai Mahasiswa ke-" + (i + 1) + " : ");
            nilai[i] = input.nextInt();
        }

        //Hitung Jumlah
        for (int j = 0; j <= n - 1; j++) {
            jumlah = jumlah + nilai[j];
        }

        //Hitung Rata-rata
        rata = jumlah / n;

        //Output
        System.out.println("Maka, Rata-rata Nilainya adalah " + rata);
        System.out.println("Developed by : Muhammad Yunus");
    }
    
}
