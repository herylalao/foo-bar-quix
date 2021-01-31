package com.kata.foobarquix.services

import org.springframework.stereotype.Component

@Component
class FooBarQuixService {

    fun convertNumber(inputNumber: Int): String {
        var retour:String
        retour = ""
        if (inputNumber % 3 == 0)
        {
            retour = retour + "Foo"
        }
        if (inputNumber % 5 == 0)
        {
            retour = retour + "Bar"
        }
        val chaine = (inputNumber).toString()
        for (i in 0 until chaine.length)
        {
            val c = chaine.get(i)
            when (c) {
                '3' -> retour = retour + "Foo"
                '5' -> retour = retour + "Bar"
                '7' -> retour = retour + "Quix"
                else -> {}
            }
        }
        return if (retour.isEmpty()) chaine else retour
    }

}