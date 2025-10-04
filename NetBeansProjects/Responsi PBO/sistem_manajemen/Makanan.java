/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistem_manajemen;

/**
 *
 * @author Lenovo
 */
//Class turunan dari class Produk
public class Makanan extends Produk{    
    private String tanggalKadaluarsa;
    
    //Constructor turunan yang memangggil constructor induk 
    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) {
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    //Getter dan Setter 
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }
    
    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa =   tanggalKadaluarsa;
    }
    
    //method yang digunakan untuk memanggil method induk dalam pewarisan  
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }

}
