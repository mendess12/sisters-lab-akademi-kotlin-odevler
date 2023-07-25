package com.example.sisterslabakademikotlinodevleri.hafta2.odev2

fun main() {

    /*
    * 2. Bir "Oyuncu" adlı üst sınıf oluşturun.
    * Ardından "Futbolcu" ve "Basketbolcu" adında iki alt sınıf oluşturun.
    * Her bir alt sınıfın kendine özgü özellikleri ve işlevleri olsun.
    * Oyuncuların "oyna" işlevi olmalı.
    * */

    println("****** Oyuncu ******")
    val oyuncu = Oyuncu("Yusuf", 22, 178)
    oyuncu.oyna()
    oyuncu.bilgileriYazdir()

    println("****** Futbolcu ******")
    val futbolcu = Futbolcu("Ali", 18, 182, "Forvet")
    futbolcu.oyna()
    futbolcu.bilgileriYazdir()

    println("****** Basketbolcu ******")
    val basketbolcu = Basketbolcu("Arda", 25, 200, "Guard")
    basketbolcu.oyna()
    basketbolcu.bilgileriYazdir()

}