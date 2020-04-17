/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet11_algo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Jobsheet11_algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedLists data = new LinkedLists();
        int pilihan;
        char pilih;
        Scanner nursukma = new Scanner(System.in);

        try {
            data.addFirst(1);
            data.add(10, 1);
            data.add("Sukma", 2);
            data.add('Z', 3);
            data.add(true, 4);
            do {
                menu();
                pilihan = nursukma.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("a. Tambah di index pertama");
                        System.out.println("b. Tambah di index terakhir");
                        System.out.println("c. Tambah data [data,index]");
                        System.out.println("d. Tambah data by value");
                        System.out.print("Pilih [a-d]: ");
                        pilih = nursukma.next().charAt(0);

                        switch (pilih) {
                            case 'a':
                                System.out.print("Data yang akan ditambah: ");
                                Object add = nursukma.next();
                                data.addFirst(add);
                                data.print();
                                break;
                            case 'b':
                                System.out.print("Data yang akan ditambah: ");
                                add = nursukma.next();
                                data.addLast(add);
                                data.print();
                                break;
                            case 'c':
                                System.out.print("Data yang akan ditambah: ");
                                add = nursukma.next();
                                System.out.print("Letak index data: ");
                                int ind = nursukma.nextInt();
                                data.add(add, ind);
                                data.print();
                                break;
                            case 'd':
                                System.out.print("Data yang akan ditambah: ");
                                add = nursukma.next();
                                System.out.print("Letak data setelah: ");
                                Object cari = nursukma.next();
                                data.addByValue(cari, add);
                                data.print();
                                break;
                            default:
                                System.out.println("Maaf inputan tidak cocok");
                        }

                        break;
                    case 2:
                        System.out.println("a. Hapus berdasar index");
                        System.out.println("b. Hapus berdasar value");
                        System.out.println("c. clear");
                        System.out.print("Pilih [a-c]: ");
                        pilih = nursukma.next().charAt(0);

                        switch (pilih) {
                            case 'a':
                                System.out.print("Masukkan index: ");
                                int ind = nursukma.nextInt();
                                data.remove(ind);
                                data.print();
                                break;
                            case 'b':
                                System.out.print("Masukkan value: ");
                                Object remove = nursukma.next();
                                data.removeByValue(remove);
                                data.print();
                                break;
                            case 'c':
                                data.clear();
                                System.out.println("Data sukses di bersihkan");
                                data.print();
                                break;
                            default:
                                System.out.println("Maaf inputan tidak cocok");
                        }
                        break;
                    case 3:
                        System.out.println("a. Cari berdasar index");
                        System.out.println("b. Cari berdasar value");
                        System.out.print("Pilih [a-b]: ");
                        pilih = nursukma.next().charAt(0);
                        
                        switch (pilih) {
                            case 'a':
                                System.out.print("Masukkan index: ");
                                int ind = nursukma.nextInt();
                                System.out.println("Hasil pencarian: "+data.get(ind));
                                break;
                            case 'b':
                                System.out.print("Masukkan value: ");
                                Object remove = nursukma.next();
                                data.getValue(remove);
                                break;
                            default:
                                System.out.println("Maaf inputan tidak cocok");
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Maaf inputan tidak cocok");
                }
            } while (pilihan == 1 || pilihan == 2 || pilihan == 3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void menu() {
        System.out.println("Masukkan pilihan operasi yang diinginkan: ");
        System.out.println("1. Tambah");
        System.out.println("2. Hapus");
        System.out.println("3. Cari");
        System.out.println("0. Keluar");
        System.out.println("-----------------------------------------");
    }
}
