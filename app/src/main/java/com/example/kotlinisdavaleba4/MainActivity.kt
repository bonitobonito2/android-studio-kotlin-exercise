package com.example.kotlinisdavaleba4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
      val nav=  findViewById<BottomNavigationView>(R.id.bottomnav)
        val controller=findNavController(R.id.fragmentnav)

       val app = AppBarConfiguration(
            setOf(
                R.id.lay1,
                R.id.lay2,
                R.id.lay3,
                R.id.lay4
            )
        )

        setupActionBarWithNavController(controller,app)
        nav.setupWithNavController(controller)


    }
}