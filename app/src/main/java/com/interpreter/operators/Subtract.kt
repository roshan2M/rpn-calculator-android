package com.interpreter.operators

class Subtract : Expression {

    private lateinit var leftExpression: Expression
    private lateinit var rightExpression: Expression

    constructor(left: Expression, right: Expression) {
        leftExpression = left
        rightExpression = right
    }

    override fun interpret(): Double {
        return leftExpression.interpret() - rightExpression.interpret()
    }

}