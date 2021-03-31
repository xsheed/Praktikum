
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xShido
 */
public class Main {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        String  nama, nim;
        int usia, uts, uas, pilih;
        boolean menu = true;
        System.out.print ("Nama Mahasiswa : ");
        nama = input.nextLine();
        System.out.print ("NIM Mahasiswa : ");
        nim = input.nextLine();
        System.out.print ("Usia : ");
        usia = input.nextInt();
        System.out.print ("Nilai UTS : ");
        uts = input.nextInt();
        System.out.print ("Nilai UAS : ");
        uas = input.nextInt();
        System.out.println("\n\n");
        
        Mahasiswa mhs = new Mahasiswa(nama, nim, usia, uts, uas);
        do{
        System.out.println("===============MENU===============");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Edit Data Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print ("Pilih : ");
        pilih = input.nextInt();
        System.out.println("");
        
        switch(pilih){
            case 1 : 
                mhs.tampil();
                break;
            case 2 :
                input = new Scanner(System.in);
                System.out.println("============Edit Data============");
                System.out.print ("Nama Mahasiswa : ");
                nama = input.nextLine();
                System.out.print ("NIM Mahasiswa : ");
                nim = input.nextLine();
                System.out.print ("Usia : ");
                usia = input.nextInt();
                System.out.print ("Nilai UTS : ");
                uts = input.nextInt();
                System.out.print ("Nilai UAS : ");
                uas = input.nextInt();
                mhs = new Mahasiswa(nama, nim, usia, uts, uas);
                break;
            case 3 :
                menu = false;
                break;
                   
        }
        }while(menu);
    } 
}

