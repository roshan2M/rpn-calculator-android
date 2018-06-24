package com.interpreter.operators

interface Expression {

    fun interpret(): Double

    fun numberOfArguments(): Int

}