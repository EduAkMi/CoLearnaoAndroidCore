package com.example.colearnaoandroidcore.bProjectB

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import com.example.colearnaoandroidcore.R

class FragmentBHome : Fragment() {
    private lateinit var religionSelected: String

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Spinner>(R.id.spinnerFragmentB).apply {
            val religions = resources.getStringArray(R.array.religions)
            this.adapter = ArrayAdapter(view.context, android.R.layout.simple_spinner_dropdown_item, religions)
            this.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    religionSelected = religions[position]
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }
        view.findViewById<AppCompatButton>(R.id.btnFragmentB).setOnClickListener(openProjectBTabs())
    }

    private fun openProjectBTabs(): View.OnClickListener? = View.OnClickListener {
//        val fm = fragmentManager
//        fm?.beginTransaction()?.replace(R.id.fragmentContainerB, fragBTabs, null)
//            ?.addToBackStack(null)?.commit()

        val bundle = Bundle()
        bundle.putString("religionSelected", religionSelected)
        val fragBTabs = FragmentBTabs()
        fragBTabs.arguments = bundle
        ActivityProjectB.fm.beginTransaction().replace(R.id.fragmentContainerB, fragBTabs, null)
                .addToBackStack(null).commit()
    }
}