/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author LENOVO
 */
public class TampilanNilai {
    public static void main(String[] args) {
        //Hasil Method Prosedur
        MasterNilai N = new MasterNilai();
        System.out.println("Hasil Nilai Kuliah");
        N.entrinilai("Ananda Rizki",90,"");
        
        //Hasil Method Fungsi
        System.out.println("\nHasil Nilai Kuliah");
        System.out.println(N.entrinilaikuliah("Ananda Rizki",85,""));
        
        //Hasil Method Static Prosedur
        System.out.println("\nHasil Nilai Kuliah");
        MasterNilai.nilaikuliah("Ananda Rizki",75,"");
        
        //Hasil Method Static Fungsi
        System.out.println("\nHasil Nilai Kuliah");
        System.out.println(MasterNilai.penilaiankuliah("Ananda Rizki",60,""));
    }
    
}
