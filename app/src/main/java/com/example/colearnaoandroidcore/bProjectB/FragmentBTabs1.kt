package com.example.colearnaoandroidcore.bProjectB

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.colearnaoandroidcore.R

class FragmentBTabs1 : Fragment() {
    private lateinit var viewModel: ReligionViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_b_tabs1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.txtBTabs1).text = FragmentBTabs.religionSelected
        viewModel = ViewModelProvider(requireActivity()).get(ReligionViewModel::class.java)

        view.findViewById<AppCompatButton>(R.id.btnTabs1Yes).setOnClickListener(confirmReligion(true))
        view.findViewById<AppCompatButton>(R.id.btnTabs1No).setOnClickListener(confirmReligion(false))
    }

    private fun confirmReligion(confirm: Boolean): View.OnClickListener? {
        return View.OnClickListener {
            viewModel.changeReligionVM(confirm)
            viewModel.setChangeTab(true)
        }
    }
}