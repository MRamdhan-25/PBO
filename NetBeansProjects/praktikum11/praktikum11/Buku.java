/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author Lenovo
 */
public class Buku {
    private String judul;
    private String ISBN;
    
    public Buku (String judul, String ISBN) {
        this.judul = judul;
        this.ISBN = ISBN;
    }
    
    public void infoBuku(){
        System.out.println("Judul Buku: " + judul + ",Dengan No: " + ISBN);
    }
    
}
