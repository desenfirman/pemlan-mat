/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smstr.pkg2;

import java.util.Scanner;

/**
 *
 * @author desenfirman
 */
public class SIAM {
    public String nama, nim;
    private double tugas,quiz, uts, uas;
    public double na;
    
    void setKomponenNilai(int urut){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Nama Mahasiswa " + urut + " : ");
        nama = in.nextLine();
        System.out.print("Masukkan NIM  Mahasiswa " + urut + " : ");
        nim = in.nextLine();
        System.out.print("Masukkan Nilai Tugas Mahasiswa " + urut + " : ");
        tugas = in.nextDouble();
        System.out.print("Masukkan Nilai Quiz  Mahasiswa " + urut + " : ");
        quiz = in.nextDouble();
        System.out.print("Masukkan Nilai UTS   Mahasiswa " + urut + " : ");
        uts = in.nextDouble();
        System.out.print("Masukkan Nilai UAS   Mahasiswa " + urut + " : ");
        uas = in.nextDouble();
        System.out.println("");
    }
    
    double getNilaiAkhir(){
        na = (float) tugas * 0.15 + quiz * 0.15 + uts * 0.3 + uas*0.4; 
        return na;

    }
    
    void getData(int i){
        System.out.println("Nama mahasiswa " + (i) +" : " + nama);
        System.out.println("NIM mahasiswa " + (i) +" : " + nim);
        System.out.println("Nilai akhir mahasiswa " + (i) +" : " + na);
        System.out.println("");
    }
    
}
