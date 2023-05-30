package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigation.databinding.FragmentHistoryBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HistoryFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HistoryFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentHistoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(inflater, container, false)
        val list = ArrayList<Model>()

        list.addAll(
            arrayOf(
                Model("Rp.500,000","081123321"),
                Model("Rp.250,000","081325161"),
                Model("Rp.10,000","08123451"),
                Model("Rp.2,000,000","08532211"),
                Model("Rp.1,200,000","081115156"),
                Model("Rp.300,000","08645543"),
                Model("Rp.50,000","08972261"),
                Model("Rp.50,000","08863457"),
                Model("Rp.50,000","08765678"),
                Model("Rp.150,000","08888888"),
                Model("Rp.250,000","08146543"),
                Model("Rp.250,000","08986754"),
                Model("Rp.50,000","08755437"),
                Model("Rp.20,000","08888765"),
                Model("Rp.20,000","08567890"),
                Model("Rp.20,000","08989098"),
            )
        )

        val myAdapter = Adapter(list)

        binding.Rview.layoutManager = LinearLayoutManager(requireContext())
        binding.Rview.setHasFixedSize(true)
        binding.Rview.adapter = myAdapter

        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HistoryFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HistoryFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}