package com.dicoding.InsightCart.ui.Cashier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dicoding.InsightCart.R
import com.dicoding.InsightCart.databinding.FragmentReceiptBinding



class ReceiptFragment : Fragment() {

    private var _binding: FragmentReceiptBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReceiptBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Access parent fragment (CashierFragment)
        val parentFragment = requireParentFragment()
        if (parentFragment is CashierFragment) {

        // OnClickListener for ProfileIcon
            parentFragment.binding.includedMenuLayout3.ProfileIcon.setOnClickListener {
            // Navigate to ProfileFragment
            findNavController().navigate(
                R.id.action_cashierFragment_to_profileFragment,
                null
            )
        }
    }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
