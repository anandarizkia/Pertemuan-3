/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author LENOVO
 */
public class ContohProsedur {
    int alas = 12;
    int tinggi = 8;
    
    void hitungLuasJajarGenjang(){
        int luas = alas * tinggi;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas Jajar Genjang = " + luas);
    }
    
    public static void main(String[] args) {
        ContohProsedur P = new ContohProsedur();
        P.hitungLuasJajarGenjang();
    }
}
