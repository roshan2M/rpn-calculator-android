package com.interpreter.operators

import java.util.Stack

object ExpressionFactory {

    private var EXPRESSION_DELIMITER: String = " "
    private var ADD_TOKEN: String = "+"
    private var SUBTRACT_TOKEN: String = "-"
    private var MULTIPLY_TOKEN: String = "*"
    private var DIVIDE_TOKEN: String = "/"

    fun createExpression(expressionText: String): Expression {
        val expressionStack = Stack<Expression>()
        for (token in expressionText.split(EXPRESSION_DELIMITER)) {
            expressionStack.push(createSubExpression(token, expressionStack))
        }
        return expressionStack.pop()
    }

    fun createSubExpression(token: String, expressionStack: Stack<Expression>): Expression {
        lateinit var subExpression: Expression
        when {
            token.equals(ADD_TOKEN) -> subExpression = Add(expressionStack.pop(), expressionStack.pop())
            token.equals(SUBTRACT_TOKEN) -> subExpression = Subtract(expressionStack.pop(), expressionStack.pop())
            token.equals(MULTIPLY_TOKEN) -> subExpression = Multiply(expressionStack.pop(), expressionStack.pop())
            token.equals(DIVIDE_TOKEN) -> subExpression = Divide(expressionStack.pop(), expressionStack.pop())
        }
        return subExpression
    }

}