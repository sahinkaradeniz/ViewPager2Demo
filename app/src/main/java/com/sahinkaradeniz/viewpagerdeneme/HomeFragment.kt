package com.sahinkaradeniz.viewpagerdeneme

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator
import com.muhammetkdr.viewpagerdeneme.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: VisitDetailFragmentAdapter
        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View{
            binding= FragmentHomeBinding.inflate(layoutInflater)
            return binding.root
        }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViewPagerAdapter()
    }

    private val fragmentList = arrayListOf(
        TabAFragment(), TabBFragment(), TabCFragment()
    )

    private val tabTitles = arrayListOf(
        "Tab A","Tab B","Tab C"
    )

    private fun initViewPagerAdapter(){
        val viewPager = binding.vpHome
        adapter = VisitDetailFragmentAdapter(childFragmentManager, viewLifecycleOwner.lifecycle,fragmentList)
        viewPager.adapter = adapter
        TabLayoutMediator(binding.tabLayoutVisitDetail, viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()
    }
}