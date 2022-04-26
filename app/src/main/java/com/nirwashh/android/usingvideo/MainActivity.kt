package com.nirwashh.android.usingvideo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import com.nirwashh.android.usingvideo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var b: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)
        val mediaController = MediaController(this)

        mediaController.setAnchorView(b.vv)
        b.vv.apply {
            setVideoPath("android.resource://${packageName}/${R.raw.video}")
            setMediaController(mediaController)
            start()
        }



    }

}