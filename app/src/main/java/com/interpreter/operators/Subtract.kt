package com.interpreter.operators

class Subtract : Expression {

    private var leftValue: Double
    private var rightValue: Double

    constructor(left: Double, right: Double) {
        this.leftValue = left
        this.rightValue = right
    }

    override fun interpret(): Double {
        return this.rightValue - this.leftValue
    }

}