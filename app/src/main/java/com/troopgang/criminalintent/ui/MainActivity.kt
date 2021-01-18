package com.troopgang.criminalintent.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.troopgang.criminalintent.R
import com.troopgang.criminalintent.ui.fragments.CrimeFragment
import com.troopgang.criminalintent.ui.fragments.CrimeListFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment =
            supportFragmentManager.findFragmentById(R.id.fragment_container)

        if(currentFragment == null) {
            val fragment = CrimeListFragment.newInstance()
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }
    }
}