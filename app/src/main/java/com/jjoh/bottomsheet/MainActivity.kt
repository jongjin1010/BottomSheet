package com.jjoh.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.jjoh.bottomsheet.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun init() {
        binding.activity = this

        setSheet()
    }

    private fun setSheet() {
        val sheet = binding.sheet

        BottomSheetBehavior.from(sheet).apply {
            this.state = BottomSheetBehavior.STATE_DRAGGING
        }
    }
}