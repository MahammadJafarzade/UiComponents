package com.example.viewbindingadapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.setFragmentResult
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.fragment.findNavController
import com.example.viewbindingadapters.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    lateinit var binding : FragmentMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun openProductPage(){

        setFragmentResultListener(ProductsDetail.resultKey){requestKey, bundle ->
            println(bundle)
        }
        val action = MenuFragmentDirections.actionMenuFragmentToProductDetail()
         findNavController().navigate(action)

        
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentMenuBinding.inflate(inflater)

        binding.productsButton.setOnClickListener{
            openProductPage()
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}