/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buku_nursukma;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Buku_NurSukma {

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner nursukma = new Scanner(System.in);
        nursukma.useDelimiter("\n");
        int pilihan = 0;
        
        do{
            menu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = nursukma.nextInt();
            switch(pilihan){
                case 1:
                    System.out.print("Masukkan Kode Buku: ");
                    int kdBuku = nursukma.nextInt();
                    System.out.print("Masukkan Judul Buku: ");
                    String judul = nursukma.next();
                    System.out.print("Masukkan Stok: ");
                    int stok = nursukma.nextInt();
                    String keadaan = "Baik";
                    BukuObject data = new BukuObject(kdBuku, judul, stok, keadaan);
                    
                    dll.upStok(kdBuku, judul, stok, data);
//                    dll.addFirst(data);
//                    dll.removeDuplicates(current);
                    break;
                case 2:
                    System.out.print("Masukkan index: ");
                    int idx = nursukma.nextInt();
                    dll.remove(idx);
                    break;
                case 3:
                    System.out.print("Masukkan index: ");
                    idx = nursukma.nextInt();
                    dll.addRusak(idx);
                    break;
                case 4:
                    dll.sortList();
                    dll.print();
                    break;
                case 5:
                    System.out.print("Masukkan Kode Buku atau Judul: ");
                    Object key = nursukma.next();
                    System.out.println(""+dll.getFind(key));
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }while(pilihan >0 && pilihan < 7);
    }

    public static void menu(){
        System.out.println("1. Buku Masuk");
        System.out.println("2. Buku Keluar");
        System.out.println("3. Buku Rusak");
        System.out.println("4. Tampil data");
        System.out.println("5. Pencarian");
        System.out.println("6. Keluar");
    }
}
