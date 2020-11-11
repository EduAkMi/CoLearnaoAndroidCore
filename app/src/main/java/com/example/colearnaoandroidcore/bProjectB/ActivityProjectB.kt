package com.example.colearnaoandroidcore.bProjectB

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.colearnaoandroidcore.R

class ActivityProjectB : AppCompatActivity() {
    companion object{
        lateinit var fm : FragmentManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_b)

        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainerB, FragmentBHome(), null).commit()
    }
}