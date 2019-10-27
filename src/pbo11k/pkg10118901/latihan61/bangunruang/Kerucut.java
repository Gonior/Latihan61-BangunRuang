/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118901.latihan61.bangunruang;
/**
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menghitung bangun ruang dengan konsep abtraks
 * 
 */
public class Kerucut extends BangunRuang{

    @Override
    public float hitungVolume() {
        return ((PHI*getR()*getR())*getT())/3;    
    }
    
}
