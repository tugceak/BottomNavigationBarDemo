package com.example.bottomnavigationbardemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigationbardemo.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var mBining:FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBining = FragmentHomeBinding.inflate(inflater,container,false)
        return mBining.root


    }



}