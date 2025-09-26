/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Tutorial Cepat Kaya", 70000));
        keranjang.tambahProduk(new Elektronik("Hp", 5500000));
        keranjang.tambahProduk(new Pakaian("Kaos", 50000));

        keranjang.tampilkanIsiKeranjang();
        System.out.println("Total belanja: Rp" + keranjang.hitungTotal());
    }
}


