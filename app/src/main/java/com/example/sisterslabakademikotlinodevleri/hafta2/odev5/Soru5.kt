package com.example.sisterslabakademikotlinodevleri.hafta2.odev5

fun main() {

    /*
    * Bir "Kullanici" adlı sınıf oluşturun ve
    * ad ve soyad gibi özellikleri içeren nullable özellikler tanımlayın.
    * Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak bu özelliklere nasıl erişebilirsiniz?
    * */

    val kullanici = Kullanici()
    kullanici.yas = 20
    kullanici.ad = "Yusuf"

    if (kullanici.ad != null && kullanici.yas != null && kullanici.soyad != null) {
        kullanici.bilgileriYazdir()
    } else {
        println("Kullanıcı ad, soyad veya yaş null olamaz")
    }
}