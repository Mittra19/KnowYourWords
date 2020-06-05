package com.quinexiaa.knowyourwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.quinexiaa.knowyourwords.databinding.FragmentWordViewerBinding

/**
 * A simple [Fragment] subclass.
 */
class WordViewerFragment : Fragment() {

    private lateinit var fragmentBinding : FragmentWordViewerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_word_viewer, container, false)

        var wordlist : MutableList<Word> = mutableListOf(
            Word("toil", "work hard", "He toiled in the sweat of his brow, tilling the stubborn ground, taking out stones, building fences. \n \t-Adler, Felix"),
            Word("venerate", "regard with feelings of respect and reverence", "He venerated me like a being descended from an upper world.\n \t-Blasco Ib??ez, Vicente"),
            Word("sublime", "of high moral or intellectual value", "He was uneven, disproportioned, saying ordinary things on great occasions, and now and then, without the slightest provocation, uttering the sublimest and most beautiful thoughts.\n \t-Ingersoll, Robert Green"),
            Word("exertion", "use of physical or mental energy; hard work","One day overcome by exertion, she fainted in the street.\n \t-Ingersoll, Robert Green"),
            Word("endow", "furnish with a capital fund", "The grammar school here, founded in 1533, is liberally endowed, with scholarships and exhibitions.\n \t-Various")

        )

        fragmentBinding.setLifecycleOwner(this)

        fragmentBinding.button.setOnClickListener{
            var i: Int = (0..4).random()
            fragmentBinding.titleTextview.text = wordlist.elementAt(i).name
            fragmentBinding.meaningTextview.text = wordlist.elementAt(i).meaning
            fragmentBinding.exampleTextview.text = wordlist.elementAt(i).example
            fragmentBinding.invalidateAll()
        }

        fragmentBinding.apply {
            titleTextview.text = wordlist.elementAt(0).name
            meaningTextview.text = wordlist.elementAt(0).meaning
            exampleTextview.text = wordlist.elementAt(0).example

            invalidateAll()
        }



        return fragmentBinding.root
    }

}
