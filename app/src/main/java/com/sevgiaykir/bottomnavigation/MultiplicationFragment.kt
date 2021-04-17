package com.sevgiaykir.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_addition.*
import kotlinx.android.synthetic.main.fragment_addition.view.*
import kotlinx.android.synthetic.main.fragment_multiplication.view.*

class MultiplicationFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val design= inflater.inflate(R.layout.fragment_multiplication, container, false)

        design.buttonMultiply.setOnClickListener {
            var result=0
            try{
                result=inputFirstNumber.text.toString().toInt()*inputSecondNumber.text.toString().toInt()
            }
            catch(e:NumberFormatException){
                result=0
            }

            val transition=MultiplicationFragmentDirections.transitionMultiplyResult(result)
            Navigation.findNavController(it).navigate(transition)
        }

        return design
    }
}