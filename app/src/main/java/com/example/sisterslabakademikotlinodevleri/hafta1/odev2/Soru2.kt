package com.example.sisterslabakademikotlinodevleri.hafta1.odev2

import java.lang.Exception
import java.util.Scanner

fun main() {

    /*
    * Kullanıcıdan yaşını girmesini isteyecek Girilen yaşa göre, 18 veya daha büyükse "Oy kullanabilirsiniz!" mesajını,
    * küçükse "Oy kullanamazsınız." mesajını ekrana yazdırır. Eğer geçerli bir sayı girilmezse,
    * "Geçerli bir yaş girmediniz." mesajını ekrana yazdırsın ve sayı dışında text girdiğinde uygulama hata vermesin sayı giriniz uyarısı versin
    * Not: try-cacth bloğu kullanılmalı
    * */

    println("Yaşını gir")
    val input = Scanner(System.`in`)

    try {
        val age = input.nextInt()
        if (age < 0) {
            println("Yaşın sıfırdan küçük olamaz.Geçerli bir sayı gir.")
        } else if (age >= 18) {
            println("Oy kullanabilirsin")
        } else {
            println("Oy kullanamazsın")
        }

    } catch (e: Exception) {
        println("String bir değer girdiniz.Lütfen sayı giriniz.")
        println(e.printStackTrace())
    }
}