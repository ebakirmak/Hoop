package io.androidedu.hoop.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import io.androidedu.hoop.R
import io.androidedu.hoop.adapter.AppViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),
    TabLayout.BaseOnTabSelectedListener<TabLayout.Tab>,
    ViewPager.OnPageChangeListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wpContainer.adapter = AppViewPagerAdapter(supportFragmentManager)
        hoopTabLayout.setupWithViewPager(wpContainer)
        wpContainer.currentItem = 1
        hoopTabLayout.addOnTabSelectedListener(this)
        wpContainer.addOnPageChangeListener(this)


    }


    override fun onPageScrollStateChanged(state: Int) {
        Toast.makeText(this, "onPageScrollStateChanged", Toast.LENGTH_SHORT).show()
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        Toast.makeText(this, "onPageScrolled", Toast.LENGTH_SHORT).show()
    }

    override fun onPageSelected(position: Int) {
        Toast.makeText(this, "onPageSelected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabReselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabReselected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabUnselected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabUnselected", Toast.LENGTH_SHORT).show()
    }

    override fun onTabSelected(p0: TabLayout.Tab?) {
        Toast.makeText(this, "onTabSelected", Toast.LENGTH_SHORT).show()
    }

}
