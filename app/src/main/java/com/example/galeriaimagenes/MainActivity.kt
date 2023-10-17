package com.example.galeriaimagenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.galeriaimagenes.databinding.ImagenesBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val imagen= ImagenesBinding.inflate(layoutInflater)

        setContentView(imagen.root)

        imagen.vistaImagenes.adapter=ImagenesAdapter (


            listOf(
                Imagen("https://loremflickr.com/320/240?random=1"),
                Imagen("https://loremflickr.com/320/240?random=2"),
                Imagen("https://loremflickr.com/320/240?random=3"),
                Imagen("https://loremflickr.com/320/240?random=4"),
                Imagen("https://loremflickr.com/320/240?random=5"),
                Imagen("https://loremflickr.com/320/240?random=6"),
                Imagen("https://loremflickr.com/320/240?random=7"),
                Imagen( "https://loremflickr.com/320/240?random=8"),
                Imagen("https://loremflickr.com/320/240?random=9"),
                Imagen( "https://loremflickr.com/320/240?random=11"),
                Imagen( "https://loremflickr.com/320/240?random=12"),
                Imagen( "https://loremflickr.com/320/240?random=13"),
                Imagen( "https://loremflickr.com/320/240?random=14"),
                Imagen( "https://loremflickr.com/320/240?random=15"),
                Imagen( "https://loremflickr.com/320/240?random=16"),
                Imagen( "https://loremflickr.com/320/240?random=17"),
                Imagen( "https://loremflickr.com/320/240?random=18"),
                Imagen( "https://loremflickr.com/320/240?random=19"),
                Imagen( "https://loremflickr.com/320/240?random=20"),
                Imagen( "https://loremflickr.com/320/240?random=21")


            ),

            object : ImgPulsadaListener {
                override fun imgPulsada(imagen: Imagen) {

                }

            }
        )
    }
}