/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5_algo;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    public Mahasiswa(String nama, int thnMasuk, int umur, double ipk) {
        this.nama = nama;
        this.thnMasuk = thnMasuk;
        this.umur = umur;
        this.ipk = ipk;
    }
    
    void tampil(){
        System.out.println("Nama: "+nama);
        System.out.println("Tahun Masuk: "+thnMasuk);
        System.out.println("Umur: "+umur);
        System.out.println("IPK: "+ipk);
    }

    public Mahasiswa() {
    }
    
}
