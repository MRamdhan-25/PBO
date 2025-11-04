/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModul9;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Hewan Anjing = new Anjing();
        Hewan Kucing = new Kucing();
        
        Anjing.bersuara();//Memanggil method bersuara() dari kelas Hewan
        System.out.println("Dan");
        Kucing.bersuara();//Memanggil method bersuara() dari kelas Hewan
    }
    
}
