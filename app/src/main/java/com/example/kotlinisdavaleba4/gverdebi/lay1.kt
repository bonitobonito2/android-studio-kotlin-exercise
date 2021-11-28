package com.example.kotlinisdavaleba4.gverdebi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kotlinisdavaleba4.R

class lay1: Fragment(R.layout.lay1) {
    lateinit var edit:EditText
    lateinit var btn:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        edit=view.findViewById(R.id.editText)
        btn=view.findViewById(R.id.btn)

        val navcontroller=Navigation.findNavController(view)

        btn.setOnClickListener {
         val textt=edit.text.toString()

            if (textt.isEmpty()){
                return@setOnClickListener
            }

            var action =  lay1Directions.actionLay1ToLay2(textt)
            navcontroller.navigate(action)
        }

    }
}