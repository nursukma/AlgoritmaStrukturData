/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum7_sorting;

/**
 *
 * @author USER
 */
public class Praktikum7_sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[] = {7,14,20,23,37,46,67,89};
        
        Searching pencarian =new Searching(data,8);
        System.out.println("isi Array : ");
        pencarian.TampilData();
        int cari = 37;
        
        System.out.println("menggunakan sequential search");
        int posisi = pencarian.findSeqSearch(cari);
        
        if(posisi != -1){
            System.out.println("data : "+ cari +" ditemukan pada indeks "+posisi);
        }
        else{
            System.out.println("data"+cari+"tidak ditemukan");
        }
        
        pencarian.tampilPosisi(cari, posisi);
        System.out.println("==================================================");
        System.out.println("Menggunakan Binary search ");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length-1);
        pencarian.tampilPosisi(cari,posisi);
    }
    
    
}
