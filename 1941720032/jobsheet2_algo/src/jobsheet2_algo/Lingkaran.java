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
public class Lingkaran {
    double phi = 3.14 ,r;
    public static void main(String[] args) {
        Scanner nursukma = new Scanner(System.in);
        
        Lingkaran obj = new Lingkaran();
        System.out.print("Masukkan jari: ");
        obj.r = nursukma.nextDouble();
        
        System.out.println("Luas Lingkaran: "+obj.hitungLuas(obj.r));
        System.out.println("Keliling Lingkaran: "+obj.hitungKeliling(obj.r));
    }

    public Lingkaran() {
    }

    
    public Lingkaran(double r) {
        this.r = r;
    }
    
    double hitungLuas(double a){
        return phi*a*a;
    }
    
    double hitungKeliling(double a){
        return 2*phi*a;
    }
}
