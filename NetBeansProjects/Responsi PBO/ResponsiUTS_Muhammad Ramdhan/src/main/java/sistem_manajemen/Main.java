/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String [] args) {
        Produk produk1 = new Elektronik("Laptop", 15000000,2);
        Produk produk2 = new Makanan("Snack", 15000, "2023-12-30");
        
        //
        Pegawai tetap = new PegawaiTetap("Rama", 5000000, 1000000);
        Pegawai kontrak = new PegawaiKontrak("Andi", 3000000, 12);
        
        System.out.println();
        produk1.tampilkanInfo();
        System.out.println();
        tetap.tampilkanInfo();
        
        //
        System.out.println();
        produk2.tampilkanInfo();
        System.out.println();
        kontrak.tampilkanInfo();
    }
}
