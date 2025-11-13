/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas10;

/**
 *
 * @author Lenovo
 */
public class Elektronik implements SistemPembayaran {
    String nama;
    public Elektronik(String nama) {
        this.nama = nama;
    }
    
    @Override
    public double hitungPajak (double harga) {
        return harga * 0.10;
    }
    
}
