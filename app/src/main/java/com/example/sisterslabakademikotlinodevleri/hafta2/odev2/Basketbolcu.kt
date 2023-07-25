package com.example.sisterslabakademikotlinodevleri.hafta2.odev2

class Basketbolcu(isim: String, yas: Int, boy: Int, var pozisyon: String) : Oyuncu(isim, yas, boy) {

    override fun oyna() {
        println("$isim  basketbolcu $pozisyon pozisyonunda oynuyor.")
    }

    override fun bilgileriYazdir() {
        println("Ad: $isim Yas: $yas Boy: $boy cm'dir ve pozisyonu $pozisyon")
    }
}