package com.example.awesomenotes


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_sign_up.*


/**
 * A simple [Fragment] subclass.
 *
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        googlebutton.setOnClickListener {
            //todo add firebase code for authenticating user using google account
        }
        fbbutton.setOnClickListener {
            //todo add code for firebase authentication for authenticating user with facebook
        }
        signupbutton.setOnClickListener {
            //todo add code for firebase authentication and possibly add for naviagation chnage.
        }
    }
}
