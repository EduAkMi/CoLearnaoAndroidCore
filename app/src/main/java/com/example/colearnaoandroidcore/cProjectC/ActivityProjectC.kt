package com.example.colearnaoandroidcore.cProjectC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.colearnaoandroidcore.R
import com.example.colearnaoandroidcore.bProjectB.ActivityProjectB
import com.example.colearnaoandroidcore.bProjectB.FragmentBHome

class ActivityProjectC : AppCompatActivity() {
    companion object{
        lateinit var fm : FragmentManager
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_c)

        fm = supportFragmentManager
        fm.beginTransaction().add(R.id.fragmentContainerC, FragmentCHome(), null).commit()
    }
}