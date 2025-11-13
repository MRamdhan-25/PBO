/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author Lenovo
 */

public class Main {
    public static void main(String[] args) {
       
        Elektronik laptop = new Elektronik("Laptop ROG");
        Makanan burger = new Makanan("Cheese Burger");

        double hargalaptop = 5000000; // inisialisasi harga laptop
        double hargaburger = 35000;   // inisialisasi harga burger  

     
        double pajaklaptop = laptop.hitungPajak(hargalaptop); // Method untuk menghitung pajak dari laptop yang berada di kelas Elektronik
        double pajakburger = burger.hitungPajak(hargaburger); // Method untuk menghitung pajak dari burger yang berada di kelas Makanan

     
        System.out.println("Nama Barang: " + ((Elektronik) laptop).nama);
        System.out.println("Harga Laptop : Rp" + hargalaptop);
        System.out.println("Pajak Laptop (10%) : Rp" + pajaklaptop);
        System.out.println("Total Bayar Laptop : Rp" + (hargalaptop + pajaklaptop));
        System.out.println();
        System.out.println("Nama Barang: " + ((Makanan) burger).nama);
        System.out.println("Harga Roti : Rp" + hargaburger);
        System.out.println("Pajak Roti (5%) : Rp" + pajakburger);
        System.out.println("Total Bayar Roti : Rp" + (hargaburger + pajakburger));
    }
}
