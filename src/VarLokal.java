/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Afandi-Nat
 */
public class VarLokal {
    public void umurAnj (){
        int umur = 7;
            umur = umur + 7;
            System.out.println("Umur Anjing adalah :" +umur);
    }
    public static void main(String args[]){
    VarLokal tes = new VarLokal();
    tes.umurAnj();
}
}
