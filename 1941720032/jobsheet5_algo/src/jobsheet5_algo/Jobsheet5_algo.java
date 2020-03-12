/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet5_algo;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Jobsheet5_algo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jmlMhs = 5;
        Scanner nursukma = new Scanner(System.in);
        nursukma.useDelimiter("\n");
        MhsBerprestasi data = new MhsBerprestasi();
        
        for(int i=0;i<jmlMhs;i++){
            System.out.print("Nama: ");
            String nama = nursukma.next();
            System.out.print("Tahun Masuk: ");
            int th = nursukma.nextInt();
            System.out.print("Umur: ");
            int umur = nursukma.nextInt();
            System.out.print("IPK: ");
            double ipk = nursukma.nextDouble();
            
            Mahasiswa m = new Mahasiswa(nama,th,umur,ipk);
            data.tambah(m);
        }
        
        System.out.println("Data sebelum sorting : ");
        data.tampil();
        
        System.out.println("Data sorted dari terbesar berdasar ipk : ");
        data.bubbleSort();
        data.tampil();
        
        System.out.println("Data sorted dari terkecil berdasar ipk : ");
        data.selectionSort();
        data.tampil();

        System.out.println("Data sorted dari Insertion sort : ");
        data.insertionSort(false);
        data.tampil();
    }
    
}
