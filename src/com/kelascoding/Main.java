package com.kelascoding;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;
        ArrayList<String> nama = new ArrayList<>();
        ArrayList<String> nim = new ArrayList<>();
        ArrayList<Integer> nilai = new ArrayList<>();
        Scanner scnama = new Scanner(System.in);
        Scanner scnim = new Scanner(System.in);
        Scanner scnilai = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa \t : ");
        input = sc.nextInt();

        for (int n = 1; n <= input; n++) {
            System.out.println("\nMahasiswa Ke " + (n));

            System.out.print("Nama Mahasiswa \t: ");
            nama.add(scnama.next());

            System.out.print("Masukkan NIM Mahasiswa \t: ");
            nim.add(scnim.next());

            System.out.print("Masukkan Nilai Mahasiswa \t: ");
            nilai.add(scnilai.nextInt());

            System.out.println("\n      DAFTAR MAHASISWA        ");
            System.out.println("-------------------------------");
            System.out.println("NAMA MAHASISWA \t   NIM     \t      NILAI");
            for (int a = 0; a < nim.size(); a++) {
                System.out.println(nama.get(a) + " \t \t  " + "\t " + nim.get(a) + " \t \t " + nilai.get(a));
            }
        }
    }
}
