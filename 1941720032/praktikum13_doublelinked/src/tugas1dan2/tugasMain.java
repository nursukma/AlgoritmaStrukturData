/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1dan2;

import doublelinkedlists.DoubleLinkedLists;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class tugasMain {

    public static void main(String[] args) throws Exception {
        Scanner nursukma = new Scanner(System.in);
        DoubleLinkedLists dl = new DoubleLinkedLists();
        int pilihan;

        do {
            menu();
            System.out.print("Masukkan Pilihan: ");
            pilihan = nursukma.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data: ");
                    int dt = nursukma.nextInt();
                    dl.addFirst(dt);
                    break;
                case 2:
                    System.out.print("Masukkan data: ");
                    dt = nursukma.nextInt();
                    dl.addLast(dt);
                    break;
                case 3:
                    System.out.print("Masukkan data: ");
                    dt = nursukma.nextInt();
                    System.out.print("Masukkan posisi index: ");
                    int ind = nursukma.nextInt();
                    dl.add(dt, ind);
                    break;
                case 4:
                    dl.removeFirst();
                    break;
                case 5:
                    dl.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan posisi index: ");
                    ind = nursukma.nextInt();
                    dl.remove(ind);
                    break;
                case 7:
                    dl.print();
                    break;
                case 8:
                    System.out.print("Masukkan data yang dicari: ");
                    dt = nursukma.nextInt();
                    dl.getPcc(dt);
                    break;
                case 9:
                    int array[] = new int[dl.size()];
                    array = dl.addArr();
                    dl.bubbleSort(array);
                    dl.printArray(array);
                    break;
                case 10:
                    int data[] = new int[dl.size()];
                    data = dl.addArr();
                    dl.insertionSort(data);
                    dl.printArray(data);
                    break;
                case 11:
                    int link[] = new int[dl.size()];
                    link = dl.addArr();
                    dl.mergeSort(link, 0, link.length - 1);
                    dl.printArray(link);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Maaf inputan tidak sesuai");
            }
        } while (pilihan >= 1 || pilihan <= 8);
    }

    public static void menu() {
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Index Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Index Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Bubble Sort");
        System.out.println("10. Insertion Sort");
        System.out.println("11. Merge Sort");
        System.out.println("0. Keluar");
    }
}
