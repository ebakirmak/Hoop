package io.androidedu.hoop

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),
    CameraFragment.OnFragmentInteractionListener,
    CallsFragment.OnFragmentInteractionListener,
    View.OnClickListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        initFragment(true, FragmentTypes.Camera.toString())
    }

    fun init() {
        btnCalls.setOnClickListener(this)
        //btnChats.setOnClickListener(this)
        btnCamera.setOnClickListener(this)
    }

    fun initFragment(isFirst: Boolean, fragmentType: String): Unit {

        if (isFirst) {
            val cameraFragment = CameraFragment.newInstance("Lover", 100)
            supportFragmentManager.beginTransaction().apply {
                add(R.id.fragmentAll, cameraFragment)
            }.commit()
        } else {
            val fragmentObject = when (fragmentType) {
                FragmentTypes.Camera.toString() -> CameraFragment.newInstance("Lover", 100)
                FragmentTypes.Calls.toString() -> CallsFragment.newInstance("1", "1")
                else -> null
            }
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentAll, fragmentObject!!)
            }.commit()
        }
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

    override fun onFragmentInteraction(data: String) {
        Toast.makeText(this, data, Toast.LENGTH_LONG).show()
    }
}
