package com.example.kotlinisdavaleba4.gverdebi

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kotlinisdavaleba4.R

class lay4:Fragment(R.layout.lay4) {
    lateinit var search:EditText
    lateinit var searchbtn:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        search=view.findViewById(R.id.searc)
        searchbtn=view.findViewById(R.id.saearchbutton)
        val navcontroller= Navigation.findNavController(view)
        searchbtn.setOnClickListener{
            if(search.text.toString()=="home"||search.text.toString()=="Home"){

                var action =  lay4Directions.actionLay4ToLay1()
                navcontroller.navigate(action)

            }else if(search.text.toString()=="dashboard"||search.text.toString()=="Dashboard"){
                val str="home"
                var action =  lay4Directions.actionLay4ToLay2(str)
                navcontroller.navigate(action)
            }else if(search.text.toString()=="notifications"||search.text.toString()=="Notifications"){
                var action =  lay4Directions.actionLay4ToLay3()
                navcontroller.navigate(action)
            }
        }

    }

}