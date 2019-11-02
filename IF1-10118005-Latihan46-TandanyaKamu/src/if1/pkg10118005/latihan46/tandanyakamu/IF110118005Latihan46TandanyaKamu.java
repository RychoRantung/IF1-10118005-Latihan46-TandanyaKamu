/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan umur user beserta keterangan dari usianya
 */
public class IF110118005Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Age age = new Age(2019);
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Tahun Kelahiran Anda: ");
        age.setYearBirth(sc.nextInt());
        System.out.println("\n=====Hasil Perhitungan Umur=====");
        System.out.println("Tahun lahir anda : "+age.getYearBirth());
        System.out.println("Hari ini tahun : "+age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" Tahun");
        System.out.println("Tandanya Kamu " + age.tandanyaKamu(age.hitungUmur()));
    }
    
}
