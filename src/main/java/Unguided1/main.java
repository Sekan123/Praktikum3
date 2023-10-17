package Unguided1;
import java.util.Scanner;
import java.io.*;
public class main {
        public static void main(String[] args) {
            Karyawan tua, muda;
            tua = new Karyawan();
            muda = new Karyawan();
            Scanner input = new Scanner(System.in);
            System.out.println("Input pegawai");
            System.out.print("Nama: ");
            tua.setNama(input.nextLine());
            System.out.print("NIP: ");
            tua.setNip(input.nextLine());
            System.out.print("Alamat: ");
            tua.setAlamat(input.nextLine());
            tua.setTotalGaji(14, 15000000);
            tua.cetak();
            System.out.println();
            System.out.print("Nama: ");
            muda.setNama(input.nextLine());
            System.out.print("NIP: ");
            muda.setNip(input.nextLine());
            System.out.print("Alamat: ");
            muda.setAlamat(input.nextLine());
            muda.setTotalGaji(12);
            muda.cetak();
        }
    }
