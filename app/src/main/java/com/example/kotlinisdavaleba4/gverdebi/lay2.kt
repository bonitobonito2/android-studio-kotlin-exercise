package com.example.kotlinisdavaleba4.gverdebi

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.kotlinisdavaleba4.R
import org.w3c.dom.Text


class lay2: Fragment(R.layout.lay2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args=this.arguments
        val inputdate=args?.get("name")
        view.findViewById<TextView>(R.id.textView).text="hello ${inputdate.toString()}"
   //     Toast.makeText(getActivity(), "${args}", Toast.LENGTH_SHORT).show()

//        val args2=this.arguments
//        val na=args2?.get("Username")
//        Toast.makeText(getActivity(), "${na}", Toast.LENGTH_SHORT).show()
    }

}