/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Lenovo
 */
public class Kucing extends Habitat{
    String suaraKucing;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        System.out.println("Hewan ini bersuara: " + suaraKucing);
}

}
