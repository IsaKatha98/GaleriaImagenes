package com.example.galeriaimagenes

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.ScaleAnimation
import android.widget.ImageView
import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.galeriaimagenes.databinding.ImagenesBinding

import com.example.galeriaimagenes.databinding.ItemImagenBinding
//import kotlin.coroutines.jvm.internal.CompletedContinuation.context

class ImagenesAdapter (
    private val imagenes: List<Imagen>,
    private val imgPulsadaListener: ImgPulsadaListener,
    //private val context:Context

    ):RecyclerView.Adapter<ImagenesAdapter.ViewHolder>() {

        class ViewHolder (val binding: ItemImagenBinding):
                RecyclerView.ViewHolder(binding.root) {

            fun bind (imagen:Imagen) {

                Glide
                    .with(binding.root.context)
                    .load(imagen.urlFoto)
                    .into(binding.img)

            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding= ItemImagenBinding.inflate(LayoutInflater.from(parent.context),parent,false )
        val imagenesBinding=ImagenesBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return imagenes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.bind(imagenes[position])

        holder.itemView.setOnClickListener{
            imgPulsadaListener.imgPulsada(imagenes[position])
        }


        holder.binding.img.setOnClickListener{

            imgPulsadaListener.imgPulsada(imagenes[position])
        }



        //Esto es para adaptar la imagen a los parámetros del parent

        /*
        holder.binding.img.setOnClickListener {
            imagen.expandida=!imagen.expandida
            notifyDataSetChanged()
        }

        val layoutParams=holder.binding.img.layoutParams

        layoutParams.height=if(imagen.expandida) {
            ViewGroup.LayoutParams.MATCH_PARENT
        }else {
          ViewGroup.LayoutParams.WRAP_CONTENT
        }

        layoutParams.width=if(imagen.expandida) {
            ViewGroup.LayoutParams.MATCH_PARENT
        }else {
            ViewGroup.LayoutParams.WRAP_CONTENT
        }

        holder.binding.img.layoutParams=layoutParams
*/

        }



}


