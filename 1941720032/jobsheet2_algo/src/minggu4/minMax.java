/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class minMax {
    public int nilaiArray;
    
    public static void main(String[] args) {
        int arr[] = new int[5];
        
        Scanner nursukma = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Nilai array index ke-"+i);
            System.out.print("Masukkan nilai: ");
            arr[i] = nursukma.nextInt();
        }
        
        System.out.println("===================");
        System.out.println("Hasil Inputan user");
        System.out.println(""+Arrays.toString(arr));
        System.out.println("===================");
        
        maxMin hasil = new maxMin();
        maxMin.max_min(arr, 0, 4, hasil);
        
        hitungBF ht = new hitungBF();
        ht.nilai(arr);
        
        System.out.println("Dengan Brute Force");
        System.out.println("Nilai minimal: "+ht.hasil[0]);
        System.out.println("Nilai maximal: "+ht.hasil[1]);
        
        System.out.println("===================");
        System.out.println("Dengan Divide Conquer");
        System.out.println("Nilai minimal: "+hasil.minimum);
        System.out.println("Nilai maximal: "+hasil.maximum);

    }
}
