package com.example.sisterslabakademikotlinodevleri.hafta2.odev1

class Dikdortgen(private val uzunluk: Double, private val genislik: Double) : GeometrikSekil() {
    // Dikdörtgenin alanını hesaplayan işlevi override ediyoruz
    override fun alan(): Double {
        return uzunluk * genislik
    }

    // Dikdörtgenin çevresini hesaplayan işlevi override ediyoruz
    override fun cevre(): Double {
        return 2 * (uzunluk + genislik)
    }
}