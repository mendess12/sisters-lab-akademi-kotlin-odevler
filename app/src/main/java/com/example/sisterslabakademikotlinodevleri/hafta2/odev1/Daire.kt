package com.example.sisterslabakademikotlinodevleri.hafta2.odev1

import kotlin.math.PI

class Daire(private val yaricap: Double) : GeometrikSekil() {
    // Dairenin alanını hesaplayan işlevi override ediyoruz
    override fun alan(): Double {
        return PI * yaricap * yaricap
    }

    // Dairenin çevresini hesaplayan işlevi override ediyoruz
    override fun cevre(): Double {
        return 2 * PI * yaricap
    }
}