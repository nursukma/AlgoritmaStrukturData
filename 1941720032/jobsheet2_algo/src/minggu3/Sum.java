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
public class Sum {

    int elemen;
    double keuntungan[];
    double total;

    public static void main(String[] args) {
        int ele = 0;

        Scanner nursukma = new Scanner(System.in);
        System.out.println("===================================");
        System.out.println("Program Menghitung keuntungan total (Satuan Juta"
                + " Misal 5.9)");

        System.out.print("masukkan jumlah perusahaan: ");
        Sum sm[] = new Sum[nursukma.nextInt()];

        for (int x = 0; x < sm.length; x++) {
            System.out.println("Perusahaan ke-" + (x + 1));

            System.out.print("Masukkan jumlah bulan: ");
            ele = nursukma.nextInt();

            sm[x] = new Sum(ele);

            System.out.println("===================================");
            for (int i = 0; i < sm[x].elemen; i++) {
                System.out.print("Masukkan untung bulan ke-" + (i + 1) + " = ");
                sm[x].keuntungan[i] = nursukma.nextDouble();
            }
        }

        for (int j = 0; j < sm.length; j++) {
            System.out.println("===================================");
            System.out.println("Perusahaan ke-" + (j + 1));
            System.out.println("===================================");
            System.out.println("Algoritma Brute Force");
            System.out.println("Total Keuntungan selama " + sm[j].elemen
                    + " bulan adalah = " + sm[j].totalBF(sm[j].keuntungan));
        }

        for (int j = 0; j < sm.length; j++) {
            System.out.println("===================================");
            System.out.println("Perusahaan ke-" + (j + 1));
            System.out.println("===================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total Keuntungan selama " + sm[j].elemen
                    + " bulan adalah = " + sm[j].totalDC(sm[j].keuntungan, 0, sm[j].elemen - 1));
        }
    }

    Sum(int elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]) {
        for (int i = 0; i < elemen; i++) {
            total = total + arr[i];
        }
        return total;
    }

    double totalDC(double arr[], int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
