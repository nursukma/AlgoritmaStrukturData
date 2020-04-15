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
public class nasabahMain {
    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);
        nursukma.useDelimiter("\n");
        int pilih;

        System.out.print("Masukkan jumlah maksimal antrian: ");
        int n = nursukma.nextInt();

        nasabahProses qq = new nasabahProses(n);

        do {
            menu();
            pilih = nursukma.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan No Rekening baru\t: ");
                    String noBaru = nursukma.next();
                    System.out.print("Masukkan Nama baru\t\t: ");
                    String namaBaru = nursukma.next();
                    qq.enqueue(noBaru,namaBaru);
                    break;
                case 2:
                    nasabah nb = new nasabah();
                    
                    nb = qq.dequeue();
                    
                    if (nb != null) {
                        System.out.println("No Rekening yang dikeluarkan\t: " + nb.noRekening);
                        System.out.println("Nama yang dikeluarkan\t\t: " + nb.nama);
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
                    System.out.print("Masukkan No Rekening\t: ");
                    String noCari = nursukma.next();
                    System.out.print("Masukkan Nama\t\t: ");
                    String namaCari = nursukma.next();
                    
                    nasabah nb1 = new nasabah(noCari,namaCari);
                    
                    qq.peekPosition(nb1);
                    break;    
                case 7:
                    System.out.print("Masukkan index: ");
                    int b = nursukma.nextInt();
                    qq.printNasabah(b);
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
