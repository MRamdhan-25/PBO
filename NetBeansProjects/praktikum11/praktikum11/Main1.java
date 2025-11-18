/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Lenovo
 */
public class Main1 {
    public static void main(String[] args) {
        Klub klub = new Klub("Sahabat Rebana");
        
        Anggota a1 = new Anggota("Sahrull");
        Anggota a2 = new Anggota("Adam");
        Anggota a3 = new Anggota("Gunawan");
        Anggota a4 = new Anggota("Marcus");
        Anggota a5 = new Anggota("Setyo");
        Anggota a6 = new Anggota("Parjo");
        Anggota a7 = new Anggota("Mukhlis");
        
        
        klub.tambahAnggota(a1);
        klub.tambahAnggota(a2);
        klub.tambahAnggota(a3);
        klub.tambahAnggota(a4);
        klub.tambahAnggota(a5);
        klub.tambahAnggota(a6);
        klub.tambahAnggota(a7);
        
        klub.infoKlub();
    }
}
