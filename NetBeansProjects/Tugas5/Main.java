/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String [] args) {
        Kucing kucing = new Kucing();
        kucing.nama = "Khalid Kasmiri";
        kucing.jenis = "Mujaer";
        kucing.suaraKucing = "meowing";
        kucing.habitat = "Darat";
        kucing.tampilkanInfo();
        System.out.println();
        Anjing anjing = new Anjing();
        anjing.nama = "Maiki Salamun";
        anjing.jenis = "Husky";
        anjing.suaraAnjing = "Gonggongong";
        anjing.habitat = "Darat";
        anjing.tampilkanInfo();
    }
}
