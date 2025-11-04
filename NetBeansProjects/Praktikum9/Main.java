/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum9;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan Mobil = new Mobil();
        Kendaraan Motor = new Motor();
        
        Mobil.berjalan();
        Mobil.info();
        
        Motor.berjalan();
        Motor.info();
        
    }
    
}
