package com.jjoh.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jjoh.bottomsheet.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        binding.activity = this
    }

}