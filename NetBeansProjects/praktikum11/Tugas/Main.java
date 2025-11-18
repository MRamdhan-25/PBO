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

        Pengarang p1 = new Pengarang("Pramoedya Ananta Toer");
        Pengarang p2 = new Pengarang("Andrea Hirata");
        Pengarang p3 = new Pengarang("Dewi Lestari (Dee)");

        Perpustakaan perpustakaan = new Perpustakaan("Lancar Baca", 8);

        Buku b1 = new Buku("Bumi Manusia", p1);
        Buku b2 = new Buku("Laskar Pelangi", p2);
        Buku b3 = new Buku("Supernova", p3);
       
        perpustakaan.tambahBuku(b1);
        perpustakaan.tambahBuku(b2);
        perpustakaan.tambahBuku(b3);
     
        perpustakaan.infoPerpustakaan();
    }
}

