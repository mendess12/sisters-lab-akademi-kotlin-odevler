package com.example.sisterslabakademikotlinodevleri.hafta2.odev2

open class Oyuncu(val isim:String,val yas:Int,val boy:Int) {

    open fun oyna(){
        println("$isim oyun oynuyor.")
    }

    open fun bilgileriYazdir(){
        println("Ad: $isim\nYas: $yas\nBoy: $boy cm'dir ")
    }
}