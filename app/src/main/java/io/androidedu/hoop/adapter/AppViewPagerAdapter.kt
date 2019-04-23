package io.androidedu.hoop.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import io.androidedu.hoop.ui.CallsFragment
import io.androidedu.hoop.ui.CameraFragment
import io.androidedu.hoop.ui.ChatFragment
import io.androidedu.hoop.ui.StatusFragment

//
class AppViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val callFragment by lazy { CallsFragment.newInstance() }
    private val chatsFragment by lazy { ChatFragment.newInstance() }

    private val fragmentList = ArrayList<Fragment>().apply {
        add(cameraFragment)
        add(chatsFragment)
        add(statusFragment)
        add(callFragment)
    }

    private val fragmentTitleList = ArrayList<String>().apply {
        add("Camera")
        add("Chats")
        add("Status")
        add("Calls")
    }


    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getCount(): Int = fragmentList.size

    override fun getPageTitle(position: Int): CharSequence? = fragmentTitleList[position]
}