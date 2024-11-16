/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

/**
 *
 * @author ACER
 */
public class Main {
    public static void main(String[] args) {
        // Membuat pengarang
        Pengarang pengarang1 = new Pengarang("J.K. Rowling");
        Pengarang pengarang2 = new Pengarang("George R.R. Martin");

        // Membuat buku
        Buku buku1 = new Buku("Harry Potter", pengarang1);
        Buku buku2 = new Buku("Game of Thrones", pengarang2);
        Buku buku3 = new Buku("Learning Java", null); // Buku tanpa pengarang

        // Membuat perpustakaan
        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);
        perpustakaan.tambahBuku(buku3);

        // Menampilkan informasi perpustakaan
        System.out.println("Sebelum Perpustakaan dihapus:");
        perpustakaan.infoPerpustakaan();

        // Menghapus perpustakaan
        System.out.println("\nMenghapus Perpustakaan...");
        perpustakaan = null;

        // Simulasi manual pemanggilan garbage collector
        System.gc();

        // Setelah penghapusan, referensi tidak ada lagi, tidak ada akses ke Buku
        System.out.println("\nPerpustakaan telah dihapus.");
    }
}



