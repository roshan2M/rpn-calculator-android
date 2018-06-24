package com.interpreter.evaluation

import com.interpreter.operators.Expression
import com.interpreter.operators.ExpressionFactory

public class Evaluator {

    private lateinit var syntaxTree: Expression

    constructor(expressionText: String) {
        syntaxTree = buildSyntaxTree(expressionText)
    }

    fun buildSyntaxTree(expressionText: String): Expression {
        return ExpressionFactory.createExpression(expressionText)
    }

    fun evaluate(expression: Expression): Double {
        return 0.0
    }

}