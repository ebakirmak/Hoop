package io.androidedu.hoop.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import io.androidedu.hoop.R
import io.androidedu.hoop.enums.FragmentTypes
import kotlinx.android.synthetic.main.tab_layout.*


class MainActivity : AppCompatActivity(),
    View.OnClickListener {

    //lazy-lateinit blog yaz.
    private val cameraFragment by lazy { CameraFragment.newInstance() }
    private val statusFragment by lazy { StatusFragment.newInstance() }
    private val callFragment by lazy { CallsFragment.newInstance() }
    private val chatsFragment by lazy { ChatFragment.newInstance() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        initFragment(true, FragmentTypes.Camera.toString())
    }

    fun init() {
        btnCalls.setOnClickListener(this)
        btnChats.setOnClickListener(this)
        btnCamera.setOnClickListener(this)
        btnStatus.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnCamera -> initFragment(false, FragmentTypes.Camera.toString())
            R.id.btnCalls -> initFragment(false, FragmentTypes.Calls.toString())
            R.id.btnChats -> initFragment(false, FragmentTypes.Chats.toString())
            R.id.btnStatus -> initFragment(false, FragmentTypes.Status.toString())
            else -> initFragment(false, FragmentTypes.Camera.toString())
        }
    }

    fun initFragment(isAdd: Boolean, fragmentType: String) {

        val fragmentObject = when (fragmentType) {
            FragmentTypes.Camera.toString() -> cameraFragment
            FragmentTypes.Calls.toString() -> callFragment
            FragmentTypes.Chats.toString() -> chatsFragment
            FragmentTypes.Status.toString() -> statusFragment
            else -> null
        }

        supportFragmentManager.beginTransaction().apply {
            if (isAdd)
                add(R.id.fragmentAll, fragmentObject!!)
            else
                replace(R.id.fragmentAll, fragmentObject!!)
        }.commit()
    }


    inline fun FragmentManager.inTransaction(func: FragmentTransaction.() -> FragmentTransaction) {
        beginTransaction().func().commit()
    }

    fun AppCompatActivity.useFragment(isAdd: Boolean, containerId: Int, fragment: Fragment) {

        supportFragmentManager.inTransaction {
            if (isAdd) {
                add(containerId, fragment)
            } else {
                replace(containerId, fragment)
            }
        }
    }
}
