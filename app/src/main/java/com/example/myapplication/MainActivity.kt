package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    var tabs= arrayOf("MESSAGES","STATUS","CALLS")
    lateinit var pager:ViewPager2
    lateinit var t1: TabLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pager=findViewById(R.id.viewpager2)
        t1=findViewById(R.id.tabLayout)
        pager.adapter=Myadapter(supportFragmentManager,lifecycle)
        TabLayoutMediator(t1,pager)
        {
            t,position->
                t.text=tabs[position]
        }.attach()

    }
}