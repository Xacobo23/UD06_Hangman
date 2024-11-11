package com.example.ud06_hangman

import androidx.lifecycle.ViewModel

class HangmanViewModel : ViewModel(){
    val lista = listOf("calamar","penguino", "caballa", "error")
    var palabra = lista.random().uppercase()
    var palabraHidden = ""
    val lives = 7

    fun showTargetWordHidden() =
        palabra.map {
            '_'
        }.joinToString(" ")

}