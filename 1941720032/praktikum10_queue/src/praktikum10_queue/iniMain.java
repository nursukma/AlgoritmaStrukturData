/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_queue;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class iniMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = nursukma.nextInt();

        queue qq = new queue(n);

        do {
            menu();
            pilih = nursukma.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = nursukma.nextInt();
                    qq.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = qq.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                        break;
                    }
                case 3:
                    qq.print();
                    break;
                case 4:
                    qq.peek();
                    break;
                case 5:
                    qq.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan data: ");
                    int a = nursukma.nextInt();
                    qq.peekPosition(a);
                    break;    
                case 7:
                    System.out.print("Masukkan posisi: ");
                    int b = nursukma.nextInt();
                    qq.peekAt(b);
                    break;    
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf input salah");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }

    public static void menu() {
        System.out.println("Masukkan pilihan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("0. Keluar");
        System.out.println("-----------------------------------------");
    }
}
