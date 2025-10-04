/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen;

/**
 *
 * @author Lenovo
 */
//Class induk Pegawai dengan atribute private
public class Pegawai {
    private String namaPegawai;
    private int gaji;
    
    //COnstructor Pegawai
    public Pegawai (String namaPegawai, int gaji) {
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;
     
    }
    //Method yang digunakan untuk melakukan aksi 
    public void tampilkanInfo() {
        System.out.println("Nama Pegawai: " + namaPegawai);
        System.out.println("Gaji: " + gaji);
    }
    
    //Method Getter dan Setter
    public String getNamaPegawai() {
        return namaPegawai;
    }
    
    public void setNamaPegawai (String namaPegawai) {
        this.namaPegawai = namaPegawai;
    }
    
    public int getGaji() {
        return gaji;
    }
    
    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
}
