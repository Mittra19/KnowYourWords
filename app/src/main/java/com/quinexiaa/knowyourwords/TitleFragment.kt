package com.quinexiaa.knowyourwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.quinexiaa.knowyourwords.databinding.FragmentTitleBinding

/**
 * A simple [Fragment] subclass.
 */
class TitleFragment : Fragment() {
    private  lateinit var titleBinding : FragmentTitleBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        titleBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_title, container, false)
        titleBinding.startButton.setOnClickListener {
            findNavController().navigate(R.id.action_titleFragment_to_wordViewerFragment)
        }

        return titleBinding.root
    }

}
