/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Penggu ;

import javax.swing.JOptionPane;

/**
 *
 * @author SBC4
 */
public class Penggu {

  // Deklarasi method main
   public static void main(String[] args) {
 
      // Deklarasi variabel dan memberi nilai awal
      int nilai1 = 0, nilai2 = 0, nilai3 = 0, hasil = 0;
 
      // Deklarasi variabel string
      String strNilai1, strNilai2, strNilai3;
 
      // Input nilai1 dan konversi ke tipe data integer
      strNilai1 = JOptionPane.showInputDialog(null, "Masukkan nilai integer pertama",
         "Perkalian Tiga Integer", JOptionPane.QUESTION_MESSAGE);
      nilai1 = Integer.parseInt(strNilai1);
 
      // Input nilai2 dan konversi ke tipe data integer
      strNilai2 = JOptionPane.showInputDialog(null, "Masukkan nilai integer kedua",
         "Perkalian Tiga Integer", JOptionPane.QUESTION_MESSAGE);
      nilai2 = Integer.parseInt(strNilai2);
 
      // Input nilai3 dan konversi ke tipe data integer
      strNilai3 = JOptionPane.showInputDialog(null, "Masukkan nilai integer ketiga",
         "Perkalian Tiga Integer", JOptionPane.QUESTION_MESSAGE);
      nilai3 = Integer.parseInt(strNilai3);
 
      // Mengalikan tiga nilai numerik integer
      hasil = nilai1 - nilai2 - nilai3;
 
      // Menampilkan hasil
      JOptionPane.showMessageDialog(null, "Nilai integer pertama : " + nilai1 +
         "\nNilai integer kedua : " + nilai2 + "\nNilai integer ketiga : " + nilai3 +
         "\nHasil perkalian tiga nilai integer : " + hasil, "Perkalian Tiga Integer",
         JOptionPane.INFORMATION_MESSAGE);
 
      // Mengakhiri program GUI
      System.exit(0);
   }
}