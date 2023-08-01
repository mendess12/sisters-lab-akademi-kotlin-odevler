package com.example.sisterslabakademikotlinodevleri.hafta3.odev5

class ThreadOne : Thread() {

    private val arrayList: ArrayList<Int> = arrayListOf()

    override fun run() {

        for (i in 1..20) {
            arrayList.add(i)
            println("Thread One Diziye eklenen değer: $i")
            sleep(5000)
        }
    }
}