/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum11;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Perpustakaan {
    private List<Buku> bukuList; // Komposisi: daftar buku

    public Perpustakaan() {
        this.bukuList = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        bukuList.add(buku);
    }

    public void infoPerpustakaan() {
        System.out.println("Informasi Perpustakaan:");
        for (Buku buku : bukuList) {
            buku.infoBuku();
        }
    }
}
