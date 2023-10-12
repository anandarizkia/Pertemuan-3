/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_3;

/**
 *
 * @author LENOVO
 */
public class MasterNilai {
    //Method Prosedur
    void entrinilai(String nama, int nilai, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai > 90 ){
            System.out.println("Grade = A");}
        else if ( nilai > 80 ){
            System.out.println("Grade = B+");}
        else if ( nilai > 70 ){
            System.out.println("Grade = B");}
        else if ( nilai > 60 ){
            System.out.println("Grade = C+");}
        else if ( nilai > 55 ){
            System.out.println("Grade = C");}
        else if ( nilai >= 40 ){
            System.out.println("Grade = D");}
        else {
            System.out.println("Grade = E");}
        
        if ( nilai > 70 ){
            keterangan = "Lulus\n";
            System.out.println("Selamat Anda " + keterangan);}
        else {
            keterangan = "Tidak Lulus\n";
            System.out.println("Maaf Anda " + keterangan);}
    }
    //Method Fungsi
        String entrinilaikuliah(String nama, int nilai, String keterangan) {
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai > 90 ){
            System.out.println("Grade = A");}
        else if ( nilai > 80 ){
            System.out.println("Grade = B+");}
        else if ( nilai > 70 ){
            System.out.println("Grade = B");}
        else if ( nilai > 60 ){
            System.out.println("Grade = C+");}
        else if ( nilai > 55 ){
            System.out.println("Grade = C");}
        else if ( nilai >= 40 ){
            System.out.println("Grade = D");}
        else {
            System.out.println("Grade = E");}
        
        if ( nilai > 70 ){
            keterangan = "Selamat Anda Lulus\n";}
        else {
            keterangan = "Maaf Anda Tidak Lulus\n";}
        return keterangan;
    }
    
    //Method Static Prosedur
    static void nilaikuliah(String nama, int nilai, String keterangan){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai > 90 ){
            System.out.println("Grade = A");}
        else if ( nilai > 80 ){
            System.out.println("Grade = B+");}
        else if ( nilai > 70 ){
            System.out.println("Grade = B");}
        else if ( nilai > 60 ){
            System.out.println("Grade = C+");}
        else if ( nilai > 55 ){
            System.out.println("Grade = C");}
        else if ( nilai >= 40 ){
            System.out.println("Grade = D");}
        else {
            System.out.println("Grade = E");}
        
        if ( nilai > 70 ){
            keterangan = "Lulus\n";
            System.out.println("Selamat Anda " + keterangan);}
        else {
            keterangan = "Tidak Lulus\n";
            System.out.println("Maaf Anda " + keterangan);}
    }
    
    //Method Static Fungsi
    static String penilaiankuliah(String nama, int nilai, String keterangan) {
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if ( nilai > 90 ){
            System.out.println("Grade = A");}
        else if ( nilai > 80 ){
            System.out.println("Grade = B+");}
        else if ( nilai > 70 ){
            System.out.println("Grade = B");}
        else if ( nilai > 60 ){
            System.out.println("Grade = C+");}
        else if ( nilai > 55 ){
            System.out.println("Grade = C");}
        else if ( nilai >= 40 ){
            System.out.println("Grade = D");}
        else {
            System.out.println("Grade = E");}
        
        if ( nilai > 70 ){
            keterangan = "Selamat Anda Lulus\n";}
        else {
            keterangan = "Maaf Anda Tidak Lulus\n";}
        return keterangan;
    }
}
