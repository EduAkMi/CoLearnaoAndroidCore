package com.example.colearnaoandroidcore.aProjectA

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.example.colearnaoandroidcore.R

class ActivityProjectA : AppCompatActivity() {
    private val textView : TextView by lazy { findViewById(R.id.txtProjectA) }
    private val editText : EditText by lazy { findViewById(R.id.edtProjectA) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project_a)

        findViewById<AppCompatButton>(R.id.btnProjectAUpdate).setOnClickListener(updateText())
        findViewById<AppCompatButton>(R.id.btnProjectAReset).setOnClickListener(resetText())
        findViewById<AppCompatButton>(R.id.btnProjectAVisible).setOnClickListener(makeTextVisible())
        findViewById<AppCompatButton>(R.id.btnProjectAInvisible).setOnClickListener(makeTextInvisible())
        findViewById<AppCompatButton>(R.id.btnProjectAGone).setOnClickListener(makeTextGone())
    }

    private fun updateText(): View.OnClickListener? = View.OnClickListener {
        textView.text = editText.text.toString()
    }

    private fun resetText(): View.OnClickListener? = View.OnClickListener {
        textView.text = ""
    }

    private fun makeTextVisible(): View.OnClickListener? = View.OnClickListener {
        textView.visibility = View.VISIBLE
    }

    private fun makeTextInvisible(): View.OnClickListener? = View.OnClickListener {
        textView.visibility = View.INVISIBLE
    }

    private fun makeTextGone(): View.OnClickListener? = View.OnClickListener {
        textView.visibility = View.GONE
    }
}