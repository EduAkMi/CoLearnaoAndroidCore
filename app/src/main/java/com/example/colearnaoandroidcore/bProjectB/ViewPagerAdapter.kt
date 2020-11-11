package com.example.colearnaoandroidcore.bProjectB

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(
    private val listTabsName: List<String>,
    private val listTabsFragments: List<Fragment>,
    manager: FragmentManager
) : FragmentPagerAdapter(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = listTabsFragments.size

    override fun getPageTitle(position: Int): CharSequence? = listTabsName[position]

    override fun getItem(position: Int): Fragment = listTabsFragments[position]

}