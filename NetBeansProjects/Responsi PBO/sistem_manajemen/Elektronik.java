/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen;

/**
 *
 * @author Lenovo
 */
public class Elektronik extends Produk {
    private int garansi;
    
    public Elektronik(String namaProduk, int harga, int garansi) {
        super(namaProduk,harga);
        this.garansi = garansi;
    }
    
    //Getter dan Setter
    public int getGaransi() {
        return garansi;
    }
    
    public void setGaransi(int garansi) {
        this.garansi = garansi;
    }
    
    //method yang digunakan untuk memanggil method induk dalam pewarisan  
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " Tahun");
    }
    
}
