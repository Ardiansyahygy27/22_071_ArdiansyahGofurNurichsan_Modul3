
package modul3;

import java.util.Scanner;


public class Perpustakaan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak jumlah buku yang di tambah? ");
        int n = input.nextInt();
        input.nextLine();

        Buku[] buku = new Buku[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Buku " + (i + 1));
            System.out.print("Judul\t\t\t: ");
            String judul = input.nextLine();
            System.out.print("Penulis\t\t\t: ");
            String penulis = input.nextLine();
            System.out.print("Publisher\t\t: ");
            String publisher = input.nextLine();
            System.out.print("Kategori (SU/D/R/A)\t: ");
            String kategori = input.nextLine();
            System.out.print("Stock\t\t\t: ");
            int stock = input.nextInt();
            System.out.print("Tahun\t\t\t: ");
            int tahun = input.nextInt();
            input.nextLine();

            switch (kategori.toUpperCase()) {
                case "D":
                    buku[i] = new BukuDewasa(judul, penulis, publisher, stock, tahun);
                    break;
                case "R":
                    buku[i] = new BukuRemaja(judul, penulis, publisher, stock, tahun);
                    break;
                case "A":
                    buku[i] = new BukuAnak(judul, penulis, publisher, stock, tahun);
                    break;
                case "SU":
                    buku[i] = new BukuSemuaUmur(judul, penulis, publisher, stock, tahun);
                    break;
                default:
                    buku[i] = new Buku(judul, penulis, publisher,"EROR" ,stock, tahun);
                    break;
            }
        }

        System.out.println("\nDaftar Buku:");
        for (int i = 0; i < n; i++) {
            buku[i].display();
        }
    }
}
