/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen;

/**
 *
 * @author Lenovo
 */
//class turunan dari class Pegawai
public class PegawaiTetap extends Pegawai{
    private int tunjangan;
    
    
     //constructor turunan yang memanggil construcotr induk
    public PegawaiTetap(String namaPegawai, int gaji, int tunjangan) {
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }
    
    //method Getter dan Setter yang digunakan pada atribute khusus privatee
    public int getTunjangan() {
        return tunjangan;
    }
    
    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    } 
    
    //method yang digunakan untuk memanggil method induk dalam pewarisan  
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tunjangan: " + tunjangan);
    }

}
