package com.interpreter.operators

class Divide : Expression {

    private var leftValue: Double
    private var rightValue: Double

    constructor(left: Double, right: Double) {
        this.leftValue = left
        this.rightValue = right
    }

    override fun interpret(): Double {
        val denominator: Double = this.leftValue
        if (denominator == 0.0) {
            throw Exception("Invalid division. Cannot divide by 0.")
        }
        return this.rightValue / denominator
    }

}