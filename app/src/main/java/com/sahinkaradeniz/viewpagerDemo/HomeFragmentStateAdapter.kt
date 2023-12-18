package com.sahinkaradeniz.viewpagerDemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class HomeFragmentStateAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, private val fragmentList: List<Fragment>) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return fragmentList.size
    }


    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}