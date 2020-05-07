package com.example.collapsingdemo

import android.os.Bundle
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.collapsingdemo.ui.main.SectionsPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.viewPager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabLayout)
        val cardParent = findViewById<RelativeLayout>(R.id.cardParent)
        tabs.setupWithViewPager(viewPager)
//        val appBar = findViewById<AppBarLayout>(R.id.appbar)
//        appBar.addOnOffsetChangedListener(OnOffsetChangedListener { appBarLayout, verticalOffset ->
//            Log.d("MainActivity","abs(verticalOffset) " + (abs(verticalOffset)).toString())
//            if (abs(verticalOffset) == appBarLayout.totalScrollRange) {
//                //  Collapsed
//                cardParent.visibility = View.GONE
//            } else {
//                //Expanded
//                cardParent.visibility = View.VISIBLE
//            }
//        })
    }
}