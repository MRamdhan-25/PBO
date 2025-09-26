/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;


/**
 *
 * @author Lenovo
 */

import java.util.ArrayList;
import java.util.List;

class KeranjangBelanja {
    private List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk p) {
        daftarProduk.add(p);
    }

    public void tampilkanIsiKeranjang() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getInfo());
        }
    }
    
    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHarga();
        }
        return total;
    }
}
