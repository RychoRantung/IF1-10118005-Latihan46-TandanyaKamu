/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan46.tandanyakamu;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program : Berisi program yang menampilkan umur user beserta keterangan dari usianya
 */
public class Age {
    private int yearBirth;
    private final int yearNow;
    private final String red = "\u001B[31m";

    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getYearNow() {
        return yearNow;
    }
    
    public int hitungUmur(){
        return yearNow - yearBirth;
    }
    
    public String tandanyaKamu(int umur) {
        String ket;
        switch (umur) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                ket = "LAGI LUCU-LUCUNYA";
                break;

            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                ket = "MASIH ANAK-ANAK";
                break;

            case 11:
            case 12:
            case 13:
                ket = "MASIH REMADJA";
                break;

            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                ket = "ALAY";
                break;

            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                ket = "LAGI GALAU NYARI JODOH";
                break;

            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
                ket = "LAGI SIBUK NYARI UANG";
                break;

            default:
                ket = "TIDAK TERDETEKSI KEHIDUPAN";

                if ((umur > 35) && (umur <= 150)) {
                    ket = "SUDAH TUA";
                }

        }
        return red + ket;
}
}
