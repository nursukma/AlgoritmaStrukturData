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
public class Faktorial {

    int nilai;
    
    public static void main(String[] args) {
        int elemen;
        Scanner nursukma = new Scanner(System.in);
        
        long lStartTime = System.currentTimeMillis();
        
        System.out.print("Masukkan banyak elemen: ");
        elemen = nursukma.nextInt();

        Faktorial[] ft = new Faktorial[elemen];

        for (int i = 0; i < elemen; i++) {
            ft[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            ft[i].nilai = nursukma.nextInt();
        }
        
        System.out.println("===============================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari Nilai " + ft[i].nilai + " adalah: "
                    + ft[i].faktorialBF(ft[i].nilai));
        }

        System.out.println("===============================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari Nilai " + ft[i].nilai + " adalah: "
                    + ft[i].faktorialDC(ft[i].nilai));
        }
        
        long lEndTime = System.currentTimeMillis();

        long output = lEndTime - lStartTime;

        System.out.println("Waktu dalam milliseconds: " + String.valueOf(output));
    }

    public Faktorial() {
    }

    public Faktorial(int nilai) {
        this.nilai = nilai;
    }

    int faktorialBF(int n) {
        int fakto = 1, i = 1;
//        for(int i=1;i<=n;i++){
//            fakto = fakto *i;
//        }
//        return fakto;
        do {
            fakto = fakto * i;
            i++;
        } while (i < n);
       return fakto = fakto * i;
    }

    int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }
}
