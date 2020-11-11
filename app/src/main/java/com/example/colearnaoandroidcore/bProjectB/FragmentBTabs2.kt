package com.example.colearnaoandroidcore.bProjectB

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.colearnaoandroidcore.R

class FragmentBTabs2 : Fragment() {
    private lateinit var viewModel: ReligionViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b_tabs2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val textView = view.findViewById<TextView>(R.id.txtBTabs2)
        val imgView = view.findViewById<ImageView>(R.id.imgBTabs2)

        viewModel = ViewModelProvider(requireActivity()).get(ReligionViewModel::class.java)
        viewModel.religionVM.observe(this, {
            if (it) {
                textView.text="Você está no caminho certo!"
//                imgView.setImageResource(R.drawable.ic_baseline_architecture_24)
                imgView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.ic_baseline_architecture_24))
            } else {
                textView.text = "Pare sua build e volte para o código"
                imgView.setImageResource(R.drawable.ic_baseline_local_fire_department_24)
//                imgView.setImageDrawable(ContextCompat.getDrawable(view.context, R.drawable.ic_baseline_local_fire_department_24))
            }
        })
    }
}