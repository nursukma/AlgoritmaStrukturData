/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class mhsMain {

    public static void main(String[] args) {
        LinkedList<Mahasiswa> data = new LinkedList<Mahasiswa>();
        int pilihan;
        char pilih;
        Scanner nursukma = new Scanner(System.in);
        nursukma.useDelimiter("\n");

        try {
            data.addFirst(new Mahasiswa(101, "Nur", "Jl. Bakau"));
            data.add(new Mahasiswa(102, "Sukma", "Jl. Mawar"), 1);
            data.add(new Mahasiswa(103, "Pandawa", "Jl. Melati"), 2);
            data.add(new Mahasiswa(104, "Nur Sukma", "Jl. Kunkun"), 3);
            data.add(new Mahasiswa(105, "Nur Sukma P", "Jl. Namnam"), 4);
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
                                System.out.println("Data yang akan ditambah ");
                                System.out.print("NIM\t: ");
                                int nim = nursukma.nextInt();
                                System.out.print("Nama\t: ");
                                String nama = nursukma.next();
                                System.out.print("Alamat\t: ");
                                String alamat = nursukma.next();
                                data.addFirst(new Mahasiswa(nim, nama, alamat));
                                data.print();
                                break;
                            case 'b':
                                System.out.println("Data yang akan ditambah: ");
                                System.out.print("NIM\t: ");
                                nim = nursukma.nextInt();
                                System.out.print("Nama\t: ");
                                nama = nursukma.next();
                                System.out.print("Alamat\t: ");
                                alamat = nursukma.next();
                                data.addLast(new Mahasiswa(nim, nama, alamat));
                                data.print();
                                break;
                            case 'c':
                                System.out.println("Data yang akan ditambah: ");
                                System.out.print("NIM\t: ");
                                nim = nursukma.nextInt();
                                System.out.print("Nama\t: ");
                                nama = nursukma.next();
                                System.out.print("Alamat\t: ");
                                alamat = nursukma.next();
                                System.out.print("Letak index data: ");
                                int ind = nursukma.nextInt();
                                data.add(new Mahasiswa(nim, nama, alamat), ind);
                                data.print();
                                break;
                            case 'd':
                                System.out.println("Data yang akan ditambah: ");
                                System.out.print("NIM\t: ");
                                nim = nursukma.nextInt();
                                System.out.print("Nama\t: ");
                                nama = nursukma.next();
                                System.out.print("Alamat\t: ");
                                alamat = nursukma.next();
                                System.out.print("Letak data sebelum [NIM]: ");
                                int cari = nursukma.nextInt();
                                data.addByValue(new Mahasiswa(nim,nama,alamat), cari);
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
                                System.out.print("Masukkan NIM: ");
                                int remove = nursukma.nextInt();
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
                                System.out.println("Hasil pencarian: " + data.get(ind));
                                break;
                            case 'b':
                                System.out.print("Masukkan NIM: ");
                                int remove = nursukma.nextInt();
                                System.out.println("Data di index " + data.getValue(remove));
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
