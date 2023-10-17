package com.example.galeriaimagenes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.galeriaimagenes.databinding.ActivityFullScreenBinding

class FullScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fullPic= ActivityFullScreenBinding.inflate(layoutInflater)

        val fullImageUrl = intent.getStringExtra("fullImageUrl")
        val fullImageView: ImageView = fullPic.fullImg

        Glide.with(this)
            .load(fullImageUrl)
            .into(fullImageView)


    }
}