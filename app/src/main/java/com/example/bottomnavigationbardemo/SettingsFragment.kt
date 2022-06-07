package com.example.bottomnavigationbardemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigationbardemo.databinding.FragmentHomeBinding
import com.example.bottomnavigationbardemo.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {
    private lateinit var mBining:FragmentSettingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBining = FragmentSettingsBinding.inflate(inflater,container,false)
        return mBining.root
    }
}
