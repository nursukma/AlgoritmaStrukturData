/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Pangkat {

    int nilai, pangkat;

    public static void main(String[] args) {
        int a, b,pilih;
        Scanner nursukma = new Scanner(System.in);
        System.out.println("============================");
        
        System.out.print("Masukkan elemen yang akan dihitung: ");
                    int elemen = nursukma.nextInt();

                    Pangkat[] pngkt = new Pangkat[elemen];
                    for (int i = 0; i < elemen; i++) {
                        pngkt[i] = new Pangkat();

//            System.out.print("Masukkan bilangan yang akan di pangkat ke-"+(i+1)+": ");
//            pngkt[i].nilai = nursukma.nextInt();
//            
//            System.out.print("Masukkan bilangan pemangkat ke-"+(i+1)+": ");
//            pngkt[i].pangkat = nursukma.nextInt();
//            
                        System.out.print("Masukkan bilangan yang akan di pangkat ke-" + (i + 1) + ": ");
                        a = nursukma.nextInt();

                        System.out.print("Masukkan bilangan pemangkat ke-" + (i + 1) + ": ");
                        b = nursukma.nextInt();

                        pngkt[i] = new Pangkat(a, b);
                    }

        do {
            System.out.println("1. Dengan Brute Force");
            System.out.println("2. Dengan Divine Conquer");

            System.out.print("Masukkan Pilihan: ");
            pilih = nursukma.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("===============================");
                    System.out.println("Hasil Pangkat dengan Brute Force");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Pangkat dari Nilai " + pngkt[i].nilai + "pangkat "
                                + pngkt[i].pangkat + " adalah: "
                                + pngkt[i].pangkatBF(pngkt[i].nilai, pngkt[i].pangkat));
                    }
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("===============================");
                    System.out.println("Hasil Pangkat dengan Divide and Conquer");
                    for (int i = 0; i < elemen; i++) {
                        System.out.println("Pangkat dari Nilai " + pngkt[i].nilai + "pangkat "
                                + pngkt[i].pangkat + " adalah: "
                                + pngkt[i].pangkatDC(pngkt[i].nilai, pngkt[i].pangkat));
                    }
                    System.exit(0);
                    break;
                default :
                    System.out.println("Maaf!");
            }
        }while(pilih != 0);
        
    }

    public Pangkat() {
    }

    public Pangkat(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil = hasil * a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2) * a);
            } else {
                return (pangkatDC(a, n / 2) * pangkatDC(a, n / 2));
            }
        }
    }
}
