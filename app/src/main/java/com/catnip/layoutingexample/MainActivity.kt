package com.catnip.layoutingexample

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.catnip.layoutingexample.databinding.ActivityMainBinding
import com.catnip.layoutingexample.model.Category

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

    private val adapter = CategoryAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setAction()
        setListCategory()
    }

    private fun setListCategory() {
        val data = listOf(
            Category(image = R.drawable.img_cat, name = "Catto 1"),
            Category(image = R.drawable.img_cat, name = "Catto 2"),
            Category(image = R.drawable.img_cat, name = "Catto 3"),
            Category(image = R.drawable.img_cat, name = "Catto 4")
        )
        binding.rvCategory.apply {
            adapter = this@MainActivity.adapter
        }
        adapter.submitData(data)
    }

    private fun setAction() {
        binding.layoutHeader.ivProfile.setOnClickListener {
            Toast.makeText(this@MainActivity, "Asnafi ganteng", Toast.LENGTH_SHORT).show()
        }
        binding.layoutHeader.tvName.text = "Hai, Cella !"
    }
}
