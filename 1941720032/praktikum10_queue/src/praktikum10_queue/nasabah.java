/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_queue;

/**
 *
 * @author USER
 */
public class nasabah {
    String noRekening,nama;

    public nasabah(String noRekening, String nama) {
        this.noRekening = noRekening;
        this.nama = nama;
    }

    public nasabah() {
    }
    
    void print(){
        System.out.println("No Rekening Nasabah\t: "+noRekening);
        System.out.println("Nama Nasabah\t: "+nama);
    }
}
