package com.example.ud06_hangman

import android.graphics.Paint.Cap
import androidx.lifecycle.ViewModel

class HangmanViewModel : ViewModel(){
    val lista = listOf("calamar")
    var palabra = lista.random().uppercase()
    var palabraHidden = palabra.map { '_' }.joinToString(" ")
    val lives = 7

     val listaLetras = mutableListOf<Char>()

    fun showTargetWordHidden(charAttempt : Char) =
        palabra.map {

                if (it == charAttempt) it
                else '_'


        }.joinToString(" ")

    fun guess(charAttempt: Char) {
        listaLetras.add(charAttempt)

        listaLetras.map {
            palabraHidden = showTargetWordHidden(it)
        }

    }

}