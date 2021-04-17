package com.sevgiaykir.bottomnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_add_result.*
import kotlinx.android.synthetic.main.fragment_add_result.view.*

class AddResultFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val design=inflater.inflate(R.layout.fragment_add_result, container, false)

        val bundle:AddResultFragmentArgs by navArgs()
        val comingAddResult=bundle.addingResult.toString()

        design.textViewAddResult.text=comingAddResult
        return design
    }
}