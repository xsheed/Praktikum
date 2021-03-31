/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xShido
 */
public class Mahasiswa {
       String nama, nim;
    int usia, uts, uas;
    float rata;
    
    Mahasiswa(String nama, String nim, int usia, int uts, int uas){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
        this.rata = this.rataRata(uts, uas);
       
    }
    
    public float rataRata (int uts, int uas) {
        return (float)((uts+uas)/2.0);
    }
    
    public void tampil (){
        System.out.println("Data Mahasiswa==========");
        System.out.println ("Nama Mahasiswa : "+this.nama+", NIM : "+this.nim);
        System.out.println ("Usia Mahasiswa : "+this.usia);
        System.out.println ("Rata-rata Nilai : "+this.rata+"\n\n");
    }
}

