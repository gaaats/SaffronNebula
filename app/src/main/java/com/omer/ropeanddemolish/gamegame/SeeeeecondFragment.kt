package com.omer.ropeanddemolish.gamegame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.omer.ropeanddemolish.databinding.FragmentSeeeeecondBinding
import kotlin.random.Random

class SeeeeecondFragment : Fragment() {
    private var rredefrfrrf: FragmentSeeeeecondBinding? = null
    private val lklklo get() = rredefrfrrf ?: throw RuntimeException("FragmentStartBinding = null")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        rredefrfrrf = FragmentSeeeeecondBinding.inflate(inflater, container, false)
        return lklklo.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {
            val ressssfrrfr = "You winn\n${Random.nextInt(from = 100, until = 5000)} points"
            lklklo.btnExitfgtghydrfr.setOnClickListener {
                monkey()
            }
            lklklo.btnTryAgainfrtghyfrr.setOnClickListener {
                requireActivity().onBackPressed()
            }
            lklklo.tvTextVinerrrr.text = ressssfrrfr

        } catch (e: Exception) {
            grhtgthyjkukukou()
        }


        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroy() {
        rredefrfrrf = null
        super.onDestroy()
    }

    private fun grhtgthyjkukukou() {
        Snackbar.make(
            lklklo.root,
            "There is Error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private fun monkey() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Friend, the current data don`t saved, EXIT?")
            .setPositiveButton("Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }
}