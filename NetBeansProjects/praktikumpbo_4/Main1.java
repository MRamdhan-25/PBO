/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo_4;

/**
 *
 * @author Lenovo
 */
public class Main1 {
    public static void main (String[] Args) {
        Pekerja agus = new Pekerja ("Agus", 20, "Buruh Pabrik", 500000);
        
        System.out.println(agus);
        
        agus.setNama("Budi");
        agus.setGaji(450000);
        System.out.println(agus);
    }
}
