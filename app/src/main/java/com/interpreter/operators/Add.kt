package com.interpreter.operators

class Add : Expression {

    private lateinit var leftExpression: Expression
    private lateinit var rightExpression: Expression

    constructor(left: Expression, right: Expression) {
        leftExpression = left
        rightExpression = right
    }

    override fun interpret(): Double {
        return leftExpression.interpret() + rightExpression.interpret()
    }

    override fun numberOfArguments(): Int {
        return 2
    }

}