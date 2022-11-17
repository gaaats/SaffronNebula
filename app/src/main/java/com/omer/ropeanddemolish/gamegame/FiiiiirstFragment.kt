package com.omer.ropeanddemolish.gamegame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.omer.ropeanddemolish.R
import com.omer.ropeanddemolish.databinding.FragmentFiiiiirstBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class FiiiiirstFragment : Fragment() {
    var cococonterAlpkdf = 0.8f
    var asasdiffAlphaaaaa = 0.05f

    private var bobok: FragmentFiiiiirstBinding? = null
    private val boakaka
        get() = bobok ?: throw RuntimeException("FragmentStartBinding = null")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bobok = FragmentFiiiiirstBinding.inflate(inflater, container, false)
        return boakaka.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            boakaka.btnImgLoveeeeee.setOnClickListener {
                Snackbar.make(boakaka.root, "I really love you too ♥♥♥", Snackbar.LENGTH_LONG).show()
            }
            boakaka.btnImgExittttttttt.setOnClickListener {
                aleksandrrr()

            }
            fokos(boakaka.btnElem1)
            fokos(boakaka.btnElem2)
            fokos(boakaka.btnElem3)
            fokos(boakaka.btnElem4)
            fokos(boakaka.btnElem5)
            fokos(boakaka.btnElem6)
            fokos(boakaka.btnElem7)
            fokos(boakaka.btnElem8)
            fokos(boakaka.btnElem9)
            fokos(boakaka.btnElem10)
            fokos(boakaka.btnElem11)


            boakaka.btnElem1.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem2.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem3.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem4.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem5.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem6.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem7.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem8.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }

            boakaka.btnElem9.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }

            boakaka.btnElem10.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }
            boakaka.btnElem11.setOnClickListener {
                it.visibility = View.GONE
                chohok()
            }



        } catch (e: Exception) {
            erik()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    fun fokos(element: ImageView) {
        lifecycleScope.launch {
            var insideCounter = cococonterAlpkdf
            var isideDiff = asasdiffAlphaaaaa
            while (true) {

                element.alpha = insideCounter
                if (insideCounter >= 1f) {
                    isideDiff = -0.05f
                }
                if (insideCounter <= 0.1f) {
                    isideDiff = 0.05f
                }
                delay(30)
                insideCounter += isideDiff
            }
        }

    }

    private fun chohok() {
        if (visik(boakaka.btnElem1) && visik(boakaka.btnElem2) && visik(
                boakaka.btnElem3
            ) && visik(boakaka.btnElem4) && visik(boakaka.btnElem5) && visik(
                boakaka.btnElem6
            ) && visik(boakaka.btnElem7) && visik(boakaka.btnElem8) && visik(
                boakaka.btnElem9
            ) && visik(boakaka.btnElem10) && visik(boakaka.btnElem11)
        ) {
            findNavController().navigate(R.id.action_fiiiiirstFragment_to_seeeeecondFragment)
        }
    }

    override fun onDestroy() {
        bobok = null
        super.onDestroy()
    }

    private fun erik() {
        Snackbar.make(
            boakaka.root,
            "There is some error, try again",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }


    private fun alphahaha(imageView: ImageView) {
        lifecycleScope.launch {
            while (true) {
                var insfrgt = cococonterAlpkdf
                var isideDifffgff = asasdiffAlphaaaaa
                imageView.alpha = insfrgt
                if (insfrgt >= 1f) {
                    isideDifffgff = -0.05f
                }
                if (insfrgt <= 0.1f) {
                    isideDifffgff = 0.05f
                }
                delay(30)
                insfrgt += isideDifffgff
            }
        }
    }

    private fun visik(imageView: ImageView): Boolean {
        if (imageView.visibility == View.GONE) {
            return true
        }
        return false
    }

    private fun aleksandrrr() {
        AlertDialog.Builder(requireContext())
            .setTitle("Exit")
            .setMessage("Do you want to exit, the current data don`t saved?")
            .setPositiveButton("Yes, Exit") { _, _ ->
                requireActivity().finish()
            }
            .setNegativeButton("Deny") { _, _ ->
            }
            .setCancelable(true)
            .create()
            .show()
    }

}