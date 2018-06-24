package com.interpreter.operators

class Divide : Expression {

    private lateinit var leftExpression: Expression
    private lateinit var rightExpression: Expression

    constructor(left: Expression, right: Expression) {
        leftExpression = left
        rightExpression = right
    }

    override fun interpret(): Double {
        var denominator: Double = rightExpression.interpret()
        if (denominator == 0.0) {
            throw Exception("Invalid division expression. Denominator must be non-zero.")
        }
        return leftExpression.interpret() / denominator
    }

    override fun numberOfArguments(): Int {
        return 2
    }

}