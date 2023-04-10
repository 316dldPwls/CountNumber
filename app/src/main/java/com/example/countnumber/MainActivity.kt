package com.example.countnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.countnumber.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var fragment = BlankFragment()
    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            mBinding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

        var count = 0
        var output_text = binding.textView

        var sum = 0


        // fragment
        var nextButton = binding.buttonNext2

        nextButton.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .add(R.id.main, BlankFragment())
                .commit()
        }



        binding.button.setOnClickListener() {
            count++
            output_text.setText(count.toString())
        }
        binding.button2.setOnClickListener() {
            count --
            output_text.setText (count.toString())
        }

        var next = binding.buttonNext

        next.setOnClickListener() {
            val intent = Intent(this, SubActivity::class.java)

            startActivity(intent)
            
        }

        var next2 = binding.buttonNext2





       val switch = binding.switch1

        switch.setOnCheckedChangeListener { compoundButton, b ->
            if(switch.isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }


        }










    }
}