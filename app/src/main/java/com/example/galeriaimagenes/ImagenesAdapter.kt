package com.example.galeriaimagenes

import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.galeriaimagenes.databinding.ItemImagenBinding

class ImagenesAdapter (
    private val imagenes: List<Imagen>,
    private val imgPulsadaListener: ImgPulsadaListener

    ):RecyclerView.Adapter<ImagenesAdapter.ViewHolder>() {

        class ViewHolder (private val binding: ItemImagenBinding):
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
    }
}


