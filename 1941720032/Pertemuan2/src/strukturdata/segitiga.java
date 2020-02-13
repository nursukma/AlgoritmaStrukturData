/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata;

/**
 *
 * @author USER
 */
public class segitiga {

    public int alas, tinggi;

    public static void main(String[] args) {
        segitiga[] sgArray = new segitiga[4];
        
        sgArray[0] = new segitiga(4, 10);
        sgArray[1] = new segitiga(20, 10);
        sgArray[2] = new segitiga(15, 6);
        sgArray[3] = new segitiga(25, 10);
        
        for(int i=0;i<4;i++){
            System.out.println("Luas: "+hitungLuas(sgArray[i].alas, sgArray[i].tinggi));
            System.out.println("Keliling: "+hitungKeliling(sgArray[i].alas, sgArray[i].tinggi));
        }
    }

    segitiga(int a, int t) {
        this.alas = a;
        this.tinggi = t;
    }

    static int hitungLuas(int a, int t) {
        return a * t / 2;
    }

    static double hitungKeliling(int a, int t) {
        double c = new Double((a * a) + (t * t));
        return (Math.sqrt(c) * 2) + a;
    }
}
