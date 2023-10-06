/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author LENOVO
 */
public class MasterBangunDatar {
    //Method Prosedur
    void hitungLuasJajarGenjang(int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas Jajar Genjang = " + luas);
    }
    
    //Method Fungsi
    int LuasJajarGenjang (int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        return luas;
    }
    
    //Method Static Prosedur
    static void menghitungLuasJajarGenjang(int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas Jajar Genjang = " + luas);
    }
    
    //Method Static Fungsi
    static int HitungJajarGenjang (int alas, int tinggi){
        int luas = alas * tinggi;
        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        return luas;
    }
}

