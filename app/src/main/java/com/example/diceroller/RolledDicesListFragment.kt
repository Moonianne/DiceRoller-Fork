package com.example.diceroller

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.diceroller.databinding.RolledDicesListFragmentBinding

class RolledDicesListFragment : Fragment() {

    private lateinit var viewModel: RolledDiceViewModel
    private lateinit var binding: RolledDicesListFragmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(requireActivity()).get(RolledDiceViewModel::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = RolledDicesListFragmentBinding.inflate(inflater, container, false)
        binding.recyclerView.adapter = DiceViewAdapter(viewModel.getHistoryOfDices())
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // TODO: Use the ViewModel

    }

}