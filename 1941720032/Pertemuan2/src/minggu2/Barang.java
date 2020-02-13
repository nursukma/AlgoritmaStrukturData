/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

/**
 *
 * @author USER
 */
public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang(){
        
    }
    
    public Barang(String namaBarang, String jenisBarang, int stok, int hargaSatuan) {
        this.namaBarang = namaBarang;
        this.jenisBarang = jenisBarang;
        this.stok = stok;
        this.hargaSatuan = hargaSatuan;
    }
    
    void tampilBarang(){
        System.out.println("Nama : "+namaBarang);
        System.out.println("jenis : "+jenisBarang);
        System.out.println("Stok : "+stok);
        System.out.println("Harga Satuan : "+hargaSatuan);
    }
    
    void tambahStok(int n){
        stok += n;
    }
    void kurangiStok(int n){
        if(n > 0)
            stok -= n;
    }
    int hitungHargaTotal(int jml){
        return jml*hargaSatuan;
    }
}
