/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Lenovo
 */
class Perpustakaan {
    private String namaPerpustakaan;
    private Buku[] daftarBuku;
    private int jumlahBuku = 0;

    public Perpustakaan(String namaPerpustakaan, int kapasitas) {
        this.namaPerpustakaan = namaPerpustakaan;
        this.daftarBuku = new Buku[kapasitas];  // Komposisi: Buku dimiliki Perpustakaan
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
        } else {
            System.out.println("Kapasitas perpustakaan penuh!");
        }
    }
    
    public void infoPerpustakaan(){
        
        System.out.println("Nama Perpustakaan: " + namaPerpustakaan);
        System.out.println("Daftar Buku:");
        
         for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
        }
    
    }
}
    
   
