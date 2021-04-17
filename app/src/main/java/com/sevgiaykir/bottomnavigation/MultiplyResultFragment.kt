package com.sevgiaykir.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_add_result.view.*
import kotlinx.android.synthetic.main.fragment_multiply_result.view.*

class MultiplyResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val design=inflater.inflate(R.layout.fragment_multiply_result, container, false)

        val bundle:MultiplyResultFragmentArgs by navArgs()
        val comingMultiplyResult=bundle.multiplyingResult.toString()

        design.textViewMultiplyResult.text=comingMultiplyResult
        return design
    }
}