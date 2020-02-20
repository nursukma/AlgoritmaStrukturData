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
public class JajarGenjang {
    double tinggi, panjang, sisiMiring;
    
    public static void main(String[] args) {
        int lg=5;
        Scanner nursukma = new Scanner(System.in);
        
        JajarGenjang[] jjr = new JajarGenjang[lg];
        
        for(int i=0;i<lg;i++){
            System.out.print("Masukkan Alas ke-"+(i+1)+": ");
            jjr[i]= new JajarGenjang(nursukma.nextDouble(),0,0);
            
            System.out.print("Masukkan Tinggi ke-"+(i+1)+": ");
            jjr[i]= new JajarGenjang(jjr[i].tinggi,nursukma.nextDouble(),0);
            
            System.out.print("Masukkan Sisi Miring ke-"+(i+1)+": ");
             jjr[i]= new JajarGenjang(jjr[i].tinggi,jjr[i].panjang,nursukma.nextDouble());
        }
        
        for(int i=0;i<lg;i++){
            System.out.println("Keliling index ke-"+(i+1)+": "+
                    jjr[i].hitungKeliling(jjr[i].panjang, jjr[i].sisiMiring));
            System.out.println("Luas index ke-"+(i+1)+": "+
                    jjr[i].hitungLuas(jjr[i].panjang, jjr[i].tinggi));
        }
    }

    public JajarGenjang() {
    }

    public JajarGenjang(double tinggi, double panjang, double sisiMiring) {
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.sisiMiring = sisiMiring;
    }
    
    double hitungLuas(double a, double b){
        return a*b;
    }
    
    double hitungKeliling(double a, double b){
        return 2 * (a + b);
    }
}
