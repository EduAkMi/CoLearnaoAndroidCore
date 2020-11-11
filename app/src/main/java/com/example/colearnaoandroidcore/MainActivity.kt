package com.example.colearnaoandroidcore

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.bumptech.glide.Glide
import com.example.colearnaoandroidcore.aProjectA.ActivityProjectA
import com.example.colearnaoandroidcore.bProjectB.ActivityProjectB
import com.example.colearnaoandroidcore.cProjectC.ActivityProjectC

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<AppCompatButton>(R.id.btnMainOpenProjectA).setOnClickListener(openActivity(ActivityProjectA::class.java))
        findViewById<AppCompatButton>(R.id.btnMainOpenProjectB).setOnClickListener(openActivity(ActivityProjectB::class.java))
        findViewById<AppCompatButton>(R.id.btnMainOpenProjectC).setOnClickListener(openActivity(ActivityProjectC::class.java))

        val img = findViewById<ImageView>(R.id.img)
        Glide.with(this).load("https://www.swedishnomad.com/wp-content/images/2019/08/Mount-Everest-Facts.jpg").into(img)
    }

    private fun openActivity(activity: Class<out Activity>): View.OnClickListener? = View.OnClickListener {
        startActivity(Intent(this, activity))
    }
}