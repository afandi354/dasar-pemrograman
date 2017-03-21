/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Afandi-Nat
 */
public class VarIntance {
    int umurAnjing; // variable umurAnjing tipe datanya Integer
    
    //konstruktor dengan satu parameter yaitu nama
    public VarIntance (String nama) {
        System.out.println("Nama yang diberikan : " +nama);
    }
    
    //method aturUmur
    public void aturUmur(int umur){
        umurAnjing = umur;
    }
    
    //method ambilUmur
    public int ambilUmur(){
        System.out.println("Umur Anjing adalah :" +umurAnjing);
        return umurAnjing;
    }
    
    //method main
    public static void main (String args []){
        //membuat objek
        VarIntance AnjingKu = new VarIntance("tommy");
        //memanggil method kelas untuk mengatur umur anjing
        AnjingKu.aturUmur(20);
        //memanggil method kelas untuk memasukan umur anjing
        AnjingKu.ambilUmur();
       // atau dapat juga mengakses variable Instance dengan cara berikut :
       System.out.println("Nilai Variable :" +AnjingKu.umurAnjing);
    }
}
