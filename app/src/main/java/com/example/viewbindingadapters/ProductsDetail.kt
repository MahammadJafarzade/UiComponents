package com.example.viewbindingadapters

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController
import com.example.viewbindingadapters.databinding.FragmentMenuBinding
import com.example.viewbindingadapters.databinding.FragmentProductsDetailBinding


class ProductsDetail : Fragment() {

    lateinit var binding: FragmentProductsDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProductsDetailBinding.inflate(inflater)
        binding.btn.setOnClickListener{
             val bundle = bundleOf("prm1" to 10,"prm2" to "Mahammad", "prm3" to 10.2)
            setFragmentResult(resultKey, bundle)
            findNavController().popBackStack()
        }
        // Inflate the layout for this fragment
        return binding.root
    }
    companion object{
        val resultKey = "RESSULT"
    }
}