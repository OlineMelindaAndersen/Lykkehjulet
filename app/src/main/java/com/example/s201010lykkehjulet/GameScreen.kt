package com.example.s201010lykkehjulet

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class GameScreen : Fragment() {


    private lateinit var spinTheWheel : Button
    private lateinit var usedLetters: TextView
    private lateinit var points: TextView
    private lateinit var category: TextView
    private lateinit var spinResult: TextView
    private lateinit var wordToBeGuessed: TextView
    private lateinit var lives: TextView
    private lateinit var keyboardView: ConstraintLayout


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.game_screen_fragment, container, false)
    }


}