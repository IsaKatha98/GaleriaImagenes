package com.example.galeriaimagenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isGone
import com.bumptech.glide.Glide
import com.example.galeriaimagenes.databinding.ImagenesBinding

import com.example.galeriaimagenes.databinding.ItemImagenBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val imagenBinding = ImagenesBinding.inflate(layoutInflater)

        setContentView(imagenBinding.root)

        var lista = mutableListOf<Imagen>()
        val numImg = 100

        for (i in 0 until numImg) {
            val random = (0..100).random()
            val urlFoto = "https://loremflickr.com/320/240/horse?random=$random"
            val img = Imagen(urlFoto)
            lista.add(img)


            imagenBinding.vistaImagenes.adapter = ImagenesAdapter(

                lista,


                object : ImgPulsadaListener {
                    override fun imgPulsada(imagen: Imagen) {

                        if (imagenBinding.fotoGrande.isGone) {
                            Glide.with(imagenBinding.root.context)
                                .load(imagen.urlFoto)
                                .into(imagenBinding.fotoGrande)

                            imagenBinding.fotoGrande.visibility = View.VISIBLE
                            imagenBinding.linearLayout.visibility = View.GONE
                        }


                    }

                }
            )

            imagenBinding.fotoGrande.setOnClickListener {
                imagenBinding.fotoGrande.visibility = View.GONE
                imagenBinding.linearLayout.visibility = View.VISIBLE
            }

        }
    }
}

/*//bucle for que pone imagenes aleatorias
for (i in 0 until numImg) {
    val random=(0..100).random()
    val urlFoto= "https://loremflickr.com/320/240/horse?random=$random"
    val img =Imagen(urlFoto)
    listaImg.add(img)

     val numImg= 100
        val listaImg= mutableListOf<Imagen>()

        for (i in 0 until numImg) {
            val random=(0 until 100).random()
            var urlFoto="https://loremflickr.com/320/240/horse?random=$random"
            val imagen=Imagen(urlFoto)
        }
*/