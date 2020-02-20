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
public class HitungNilai {
    int nilai1, nilai2;
    
    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);
        
        System.out.print("Jumlah Mahasiswa: ");
        HitungNilai[] ht = new HitungNilai[nursukma.nextInt()];
        int c = ht.length;
        
        for(int i=0;i<c;i++){
            System.out.println("Mhs "+(i+1));
            System.out.print("Nilai 1: ");
            ht[i] = new HitungNilai(nursukma.nextInt(), 0);
            
            System.out.print("Nilai 2: ");
            ht[i] = new HitungNilai(ht[i].nilai1, nursukma.nextInt());
        }
     
        for(int i=0;i<c;i++){
            System.out.println("Nilai terbaik Mhs "+
                    (i+1)+": "+ht[i].cariNilai(ht[i].nilai1, ht[i].nilai2));
        }
    }
    
    public HitungNilai(int nilai1, int nilai2) {
        this.nilai1 = nilai1;
        this.nilai2 = nilai2;
    }
    
    int cariNilai(int a,int b){
        return Math.max(a, b);
    }
}
