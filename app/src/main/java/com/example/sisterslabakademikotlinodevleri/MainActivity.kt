package com.example.sisterslabakademikotlinodevleri

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabakademikotlinodevleri.databinding.ActivityMainBinding
import com.example.sisterslabakademikotlinodevleri.hafta3.odev1.UrunActivity
import com.example.sisterslabakademikotlinodevleri.hafta3.odev2.HavaDurumuActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.urunTasariminaGitButton.setOnClickListener {
            val intent = Intent(this@MainActivity, UrunActivity::class.java)
            startActivity(intent)
        }

        binding.havaDurumuTasariminaGitButton.setOnClickListener {
            val intent2 = Intent(this@MainActivity, HavaDurumuActivity::class.java)
            startActivity(intent2)
        }


    }
}