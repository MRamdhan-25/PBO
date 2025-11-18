/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Lenovo
 */


public class Main {
    public static void main(String [] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        
        Buku buku1 = new Buku ("10 Cara menjadi Sukses", "ISBN001");
        Buku buku2 = new Buku ("Apa itu Sejahtera", "ISBN002");
        
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        
        System.out.println("Daftar buku di Perpustakaan");
        perpustakaan.infoPerpustakaan();
    }
    
    
}
