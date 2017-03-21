/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Afandi-Nat
 */
public class VarInstance1 {
    public String nama;
    private double gaji;
    
    public VarInstance1 (String namaKar){
        nama = namaKar;
    }
    public void aturGaji(double gajiKar){
        gaji = gajiKar;
    }
    public void tampilKar(){
        System.out.println("Nama :" +nama);
        System.out.println("Gaji :" +gaji);
    }
    public static void main (String arg[]){
        VarInstance1 karyawan = new VarInstance1("Afandi");
        karyawan.aturGaji(1000);
        karyawan.tampilKar();
    }
}
