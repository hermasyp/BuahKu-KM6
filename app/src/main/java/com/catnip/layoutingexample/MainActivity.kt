package com.catnip.layoutingexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.system.Os.bind
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.catnip.layoutingexample.databinding.ActivityMainBinding

/* LayoutInflater system / findViewById Approach

class MainActivity : AppCompatActivity() {

    private val ivProfile: ImageView by lazy {
        findViewById(R.id.iv_profile)
    }
    private val tvName : TextView by lazy {
        findViewById(R.id.tv_name)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setAction()
        changeProfileIcon()
    }

    private fun changeProfileIcon() {
        ivProfile.setImageResource(R.drawable.img_cat)
    }

    private fun setAction() {
        ivProfile.setOnClickListener {
            Toast.makeText(this@MainActivity, "Asnafi ganteng", Toast.LENGTH_SHORT).show()
        }
        tvName.text = "Hai, Cella !"
    }
}*/


class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setAction()
    }

    private fun setAction() {
        binding.layoutHeader.ivProfile.setOnClickListener {
            Toast.makeText(this@MainActivity, "Asnafi ganteng", Toast.LENGTH_SHORT).show()
        }
        binding.layoutHeader.tvName.text = "Hai, Cella !"
    }
}
