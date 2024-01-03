package com.example.asessment3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.asessment3.databinding.ActivityLayouttabBinding
import com.google.android.material.tabs.TabLayout

class layouttab : AppCompatActivity() {
    private lateinit var binding: ActivityLayouttabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this ,R.layout.activity_layouttab)

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("FIRST"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("SECOND"))

        val adapter = FragmentAdapter(supportFragmentManager,lifecycle)
        binding.viewPager2.adapter = adapter
        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab !=null){
                    tab.position.also { binding.viewPager2.currentItem = it }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }

        })

        binding.viewPager2.registerOnPageChangeCallback(object :ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position))
            }
        })
    }
}