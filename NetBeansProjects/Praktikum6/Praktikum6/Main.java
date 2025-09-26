/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum6;

/**
 *
 * @author Lenovo
 */
public class Main {
        public static void main(String[] args) {
            Hewan mocheng = new Kucing();
            mocheng.bersuara(); // Output: Meong
            
            System.out.println();
            Kucing kucing = new Kucing();
            kucing.makan("ikan");// memanggil method makan() dari class Hewan
            kucing.makan("ikan", 2);// memanggil method makan() dari class Hewan yang beroverloaded pada class Hewan
            
            System.out.println();
            Anjing anjing = new Anjing();
            anjing.bersuara();//Output: GukGuk!
            anjing.makan("daging", 3);// memanggil method makan() dari class Hewan yang beroverloaded pada class Hewan
        }
}
