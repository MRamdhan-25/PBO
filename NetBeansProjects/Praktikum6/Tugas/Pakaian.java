/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Lenovo
 */
public class Pakaian extends Produk{
    public Pakaian (String nama, int harga) {
    super(nama, harga);
   }
    
    @Override
    public double hitungDiskon() {
        return getHarga() * 0.30;
    }
    
    @Override
    public String getInfo() {
       return "Pakaian: " + getNama() + "\n" +
              "Harga" + getHarga() + "\n" +
              "Diskon: " + hitungDiskon() + "\n" +
              "Setelah Diskon: " + (getHarga() - hitungDiskon()) + "\n";
    }
}
