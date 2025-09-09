/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Lenovo
 */
public class Main2 {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Nissan", "Skyline R30", 1981, "Hitam");
        mobil1.displayInfo();
        mobil1.startEngine();
        
        
        Mobil mobil2 = new Mobil("Dodge", "Charger", 1966, "Merah");
        mobil2.startEngine();
        mobil2.displayInfo();

        // Ubah warna mobil1
        mobil1.setinputWarna("Navy");
        System.out.println("Mobil telah dicat ulang ");
        mobil1.displayInfo();
    }
}
