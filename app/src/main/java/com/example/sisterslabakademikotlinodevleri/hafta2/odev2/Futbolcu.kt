package com.example.sisterslabakademikotlinodevleri.hafta2.odev2

class Futbolcu(isim: String, yas: Int, boy: Int, var mevki: String) : Oyuncu(isim, yas, boy) {

    override fun oyna() {
        println("$isim  futbolcu $mevki oynuyor.")
    }

    override fun bilgileriYazdir() {
        println("Ad: $isim Yas: $yas Boy: $boy cm'dir ve mevkisi $mevki")
    }
}