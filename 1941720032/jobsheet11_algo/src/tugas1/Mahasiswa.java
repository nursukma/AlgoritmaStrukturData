/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    int nim;
    String nama,alamat;

    public Mahasiswa(int nim, String nama, String alamat) {
        super();
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }
    
     public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Mahasiswa() {
    }
    
    @Override
    public String toString(){
        return nim + " "+ nama + " "+alamat;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
    
    
}
