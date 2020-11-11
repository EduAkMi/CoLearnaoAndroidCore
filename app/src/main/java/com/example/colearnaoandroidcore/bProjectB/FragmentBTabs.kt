package com.example.colearnaoandroidcore.bProjectB

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.colearnaoandroidcore.R
import com.google.android.material.tabs.TabLayout

class FragmentBTabs : Fragment() {
    private lateinit var viewModel: ReligionViewModel

    companion object {
        lateinit var religionSelected: String
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b_tabs, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        religionSelected = arguments?.getString("religionSelected").toString()
        viewModel = ViewModelProvider(requireActivity()).get(ReligionViewModel::class.java)

        val viewPager = view.findViewById<ViewPager>(R.id.viewPagerFragmentB)
        val tabLayout = view.findViewById<TabLayout>(R.id.tabLayoutFragmentB)

        viewPager.adapter = ViewPagerAdapter(listOf("Tab1", "Tab2"), listOf(FragmentBTabs1(), FragmentBTabs2()), childFragmentManager)
        tabLayout.setupWithViewPager(viewPager)

        viewModel.changeTab.observe(this, {
            if (it) {
                tabLayout.getTabAt(1)?.select()
            }
        })
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.setChangeTab(false)
    }
}