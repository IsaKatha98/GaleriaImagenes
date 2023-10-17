package com.example.galeriaimagenes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import androidx.core.view.isVisible
import com.example.galeriaimagenes.databinding.ImagenesBinding
import com.example.galeriaimagenes.databinding.ItemImagenBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val imagen= ImagenesBinding.inflate(layoutInflater)

        setContentView(imagen.root)

        imagen.vistaImagenes.adapter=ImagenesAdapter (


            listOf(
                Imagen("https://loremflickr.com/320/240?random=1",false),
                Imagen("https://loremflickr.com/320/240?random=2",false),
                Imagen("https://loremflickr.com/320/240?random=3",false),
                Imagen("https://loremflickr.com/320/240?random=4",false),
                Imagen("https://loremflickr.com/320/240?random=5",false),
                Imagen("https://loremflickr.com/320/240?random=6",false),
                Imagen("https://loremflickr.com/320/240?random=7",false),
                Imagen( "https://loremflickr.com/320/240?random=8",false),
                Imagen("https://loremflickr.com/320/240?random=9",false),
                Imagen( "https://loremflickr.com/320/240?random=11",false),
                Imagen( "https://loremflickr.com/320/240?random=12",false),
                Imagen( "https://loremflickr.com/320/240?random=13",false),
                Imagen( "https://loremflickr.com/320/240?random=14",false),
                Imagen( "https://loremflickr.com/320/240?random=15",false),
                Imagen( "https://loremflickr.com/320/240?random=16",false),
                Imagen( "https://loremflickr.com/320/240?random=17",false),
                Imagen( "https://loremflickr.com/320/240?random=18",false),
                Imagen( "https://loremflickr.com/320/240?random=19",false),
                Imagen( "https://loremflickr.com/320/240?random=20",false),
                Imagen( "https://loremflickr.com/320/240?random=21",false)


            ),

            object : ImgPulsadaListener {
                override fun imgPulsada(imagen: Imagen) {


                }



            }
        )
    }
}