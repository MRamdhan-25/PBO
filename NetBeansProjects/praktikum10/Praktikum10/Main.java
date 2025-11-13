/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum10;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String [] args) {
        //Objek penjumlahan
        OperasiHitung Penjumlahan = new Penjumlahan();
        System.out.println("Penjumlahan: " + Penjumlahan.hitung(10, 5)); // Output: 15
        
        //Objek pengurangan
        OperasiHitung Pengurangan = new Pengurangan();
        System.out.print("Pengurangan: " + Pengurangan.hitung(10, 5)); // Output: 5
    }
    
}
