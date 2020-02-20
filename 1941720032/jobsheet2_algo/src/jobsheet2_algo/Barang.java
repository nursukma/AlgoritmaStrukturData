/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet2_algo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Barang {
    String nama;
    int hargaSatuan,jumlah;
    
    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);
        nursukma.useDelimiter("\n");
        
        Barang obj = new Barang();
        
        System.out.print("Masukkan nama barang: ");
        obj.nama = nursukma.next();
        System.out.print("Masukkan harga barang: ");
        obj.hargaSatuan = nursukma.nextInt();
        System.out.print("Masukkan jumlah barang: ");
        obj.jumlah = nursukma.nextInt();
        
        for(int i=0; i<24; i++){
            System.out.print("-");
        }
        System.out.println("");
        
//        System.out.println("Nama Barang: "+obj.nama);
//        System.out.println("Jumlah Barang: "+obj.jumlah);
//        System.out.println("Harga Barang: "+obj.hargaSatuan);
//        
//        System.out.println("");
        
        System.out.println("Sub Total: "+
                obj.hitungHargaTotal(obj.hargaSatuan, obj.jumlah));
        System.out.println("Total Diskon: "+
                obj.hitungDiskon(obj.hargaSatuan, obj.jumlah));
        System.out.println("Total Bayar: "+
                obj.hitungHargaBayar(obj.hargaSatuan, obj.jumlah));
    }

    public Barang() {
    }

    public Barang(String nama, int hargaSatuan, int jumlah) {
        this.nama = nama;
        this.hargaSatuan = hargaSatuan;
        this.jumlah = jumlah;
    }
    
    int hitungHargaTotal(int a, int b){
        return a * b;
    }
    
    int hitungDiskon(int a, int b){
        int c;
        
        if(hitungHargaTotal(a, b) < 50000){
            c = 0;
        }else if(hitungHargaTotal(a, b) >= 50000 && hitungHargaTotal(a, b) <= 100000){
            c = 5;
        }else{
            c = 10;
        }
        return  (hitungHargaTotal(a, b)*c)/100;
    }
    
    int hitungHargaBayar(int a, int b){
        return hitungHargaTotal(a, b) - hitungDiskon(a, b);
    }
}
