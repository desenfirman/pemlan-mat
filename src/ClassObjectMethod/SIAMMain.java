/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smstr.pkg2;

/**
 *
 * @author desenfirman
 */
public class SIAMMain {
    public static void main(String[] args) {
        
        SIAM mhs1 = new SIAM();
        SIAM mhs2 = new SIAM();
        SIAM mhs3 = new SIAM();
        
        mhs1.setKomponenNilai(1);
        mhs1.getNilaiAkhir();
        mhs2.setKomponenNilai(2);
        mhs2.getNilaiAkhir();
        mhs3.setKomponenNilai(3);
        mhs3.getNilaiAkhir();
        
        mhs1.getData(1);
        mhs2.getData(1);
        mhs3.getData(1);
        double jumlah = 0;
        jumlah = mhs1.na +mhs2.na+mhs3.na;
        System.out.println("Nilai rata-rata seluruh mahasiswa: " + (jumlah/3));
        
        
    }
}
