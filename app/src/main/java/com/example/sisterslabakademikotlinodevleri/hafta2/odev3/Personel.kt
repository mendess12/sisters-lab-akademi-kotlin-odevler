package com.example.sisterslabakademikotlinodevleri.hafta2.odev3

class Personel(val ad: String, val soyad: String, val pozisyon: String, val maas: Int) {

    fun maasArttir() {
        println("$pozisyon pozisyonunda bulunan $ad $soyad'in maaşı 1000 TL arttırılarak yeni maaşı ${maas + 1000} TL oldu.")
    }
}