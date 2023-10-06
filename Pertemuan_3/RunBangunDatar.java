/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author LENOVO
 */
public class RunBangunDatar {
    public static void main(String[] args) {
        
        MasterBangunDatar M = new MasterBangunDatar();
        System.out.println("Hasil Method Prosedur");
        M.hitungLuasJajarGenjang(12,8);
        
        System.out.println("\nHasil Method Fungsi");
        System.out.println("Luas Jajar Genjang = " + M.LuasJajarGenjang(12,8));
        
        System.out.println("\nHasil Method Static Prosedur");
        MasterBangunDatar.menghitungLuasJajarGenjang(12,8);
        
        System.out.println("\nHasil Method Static Fungsi");
        System.out.println("Luas Jajar Genjang = " + MasterBangunDatar.HitungJajarGenjang(12,8));
    }
}
