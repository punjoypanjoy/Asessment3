package com.example.asessment3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ncorti.slidetoact.SlideToActView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val splashScreen: SlideToActView = findViewById<SlideToActView>(R.id.slideToAct)

        splashScreen.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener{
            override fun onSlideComplete(view: SlideToActView) {
                val intent = Intent(this@MainActivity,layouttab::class.java)
                startActivity(intent)
                finish()
            }

        }
}
}