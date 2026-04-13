package com.mycompany.Tugas01PBO;

import com.mycompany.akademis.MataKuliah;

public class Main {

    public static void main(String[] args) {

        Mahasiswa mhs = new Mahasiswa();
        mhs.npm = "2410020174";
        mhs.nama = "Amalia";
        mhs.ipk = 3.63;
        mhs.semester = 4;

        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("NPM: " + mhs.npm);
        System.out.println("Nama: " + mhs.nama);
        System.out.println("IPK: " + mhs.ipk);
        System.out.println("Semester: " + mhs.semester);

        MataKuliah mk = new MataKuliah();
        mk.kodeMk = "SIF1402";
        mk.namaMk = "Pemrograman Berbasis Objek";

        System.out.println("\n=== DATA MATA KULIAH ===");
        System.out.println("Kode MK: " + mk.kodeMk);
        System.out.println("Nama MK: " + mk.namaMk);
    }
}