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
public class PegawaiKontrak extends Pegawai{ 
    //atribute 
    private int lamaKontrak;
    
    //construcotr turunan yang memanggil construcotr induk
    public PegawaiKontrak(String namaPegawai, int gaji, int lamaKontrak) {
        super (namaPegawai, gaji );
        this.lamaKontrak = lamaKontrak;
        
    }
    
    //method Getter dan Setter yang digunakan pada atribute khusus privatee
    public int getLamaKontrak() {
        return lamaKontrak;
    }
    
    public void setLamaKontrak(int lamaKontrak) {
        this.lamaKontrak = lamaKontrak;
    }
    
    //method yang digunakan untuk memanggil method induk dalam pewarisan  
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Lama kontrak: " + lamaKontrak + " bulan");
    }
}
