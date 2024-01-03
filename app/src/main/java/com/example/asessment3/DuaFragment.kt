package com.example.asessment3

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog


class DuaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.duafragment, container, false)
        val btnShow = view.findViewById<Button>(R.id.btnShow)
        btnShow.setOnClickListener {
            showButtonSheet()
        }

        return view
    }

    @SuppressLint("MissingInflatedId")
    private fun showButtonSheet() {
        val bottomSheetDialog = BottomSheetDialog(requireContext())
        val bottomSheetView = layoutInflater.inflate(R.layout.
        buttonsheet, null)
        val btnClose = bottomSheetView.findViewById<Button>(R.id.IDButton)

        2
        btnClose.setOnClickListener {
            bottomSheetDialog.dismiss()
        }

        bottomSheetDialog.setContentView(bottomSheetView)
        bottomSheetDialog.show()
    }
}

