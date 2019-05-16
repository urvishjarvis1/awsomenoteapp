package com.example.awesomenotes

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment() {
    lateinit var navController:NavController;
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController=findNavController()
        fbbutton.setOnClickListener {
            //todo add firebase code for login with facebook
            Log.d("APP","Facebook")
        }
        googlebutton.setOnClickListener {
            //todo add firebase code for login with google account
            Log.d("APP","google")
        }
        loginbutton.setOnClickListener {
            Log.d("APP","login")
            /*
            todo add firebase code for authenticate user based on the input
            todo add navigation controller code to control the navigation
          */
            navController.navigate(R.id.action_loginFragment_to_mainFragment)
        }
        signup.setOnClickListener {
            //todo add code for navigation controller.
            findNavController().navigate(R.id.action_loginFragment_to_signUpFragment)

        }
    }


}
