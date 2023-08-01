package com.example.sisterslabakademikotlinodevleri.hafta3.odev5

class ThreadTwo : Runnable {

    override fun run() {
        for (i in 21..60) {
            println("Thread Two i değeri: $i")
            Thread.sleep(3000)
        }
    }
}