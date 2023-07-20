package com.example.sisterslabakademikotlinodevleri.hafta1.odev1

import java.util.Scanner

fun main() {

    /*
    * Dışardan kullanıcı adı ve şifre girişi alınacak, girilen bu kullanıcı adı ve şifre önceden belirlenen kullanıcı adı ve şifreyle  eşleştirilecek.
    * Kullanıcı adında büyük-küçük harf farkı göz ardı edilecek, ancak şifrede büyük-küçük harf farkı olması gerekmektedir.
    * kullanıcı adı ve şifre daha önce belirlenen kullanıcı adı ve şifreyle uyuşuyorsa "hoş geldiniz" diyecek
    * eşleşmiyorsa "kullanıcı adı veya şifre hatalı" uyarı verecek
    * */

    val userName1 = "admin"
    val password1 = "Admin123"

    println("kullanıcı adını gir")
    val input = Scanner(System.`in`)
    val userName2 = input.next()

    println("Şifreni gir")
    val input2 = Scanner(System.`in`)
    val password2 = input2.next()

    if (userName2.equals(userName1, ignoreCase = true) && password2.equals(
            password1,
            ignoreCase = false
        )
    ) {
        println("Hoş geldiniz")
    } else {
        println("Kulanıcı adın veya şifren hatalı kontrol et")
    }
}