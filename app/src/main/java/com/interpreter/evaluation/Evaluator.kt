package com.interpreter.evaluation

import com.interpreter.operators.*
import java.util.Stack

class Evaluator {

    private var ADD_TOKEN: String = "+"
    private var SUBTRACT_TOKEN: String = "-"
    private var MULTIPLY_TOKEN: String = "*"
    private var DIVIDE_TOKEN: String = "/"

    private var operandStack: Stack<Double>

    constructor() {
        this.operandStack = Stack()
    }

    fun pushValue(value: Double) {
        this.operandStack.push(value)
    }

    fun getOperandStack(): Stack<Double> {
        return this.operandStack
    }

    fun operate(token: String) {
        var expression: Expression
        when (token) {
            ADD_TOKEN ->
                if (operandStack.count() >= 2) {
                    expression = Add(operandStack.pop(), operandStack.pop())
                } else {
                    throw Exception("Addition takes two arguments.")
                }
            SUBTRACT_TOKEN ->
                if (operandStack.count() >= 2) {
                    expression = Subtract(operandStack.pop(), operandStack.pop())
                } else {
                    throw Exception("Subtraction takes two arguments.")
                }
            MULTIPLY_TOKEN ->
                if (operandStack.count() >= 2) {
                    expression = Multiply(operandStack.pop(), operandStack.pop())
                } else {
                    throw Exception("Multiplication takes two arguments.")
                }
            DIVIDE_TOKEN ->
                if (operandStack.count() >= 2) {
                    expression = Divide(operandStack.pop(), operandStack.pop())
                } else {
                    throw Exception("Division takes two arguments.")
                }
            else -> throw Exception("Invalid operator found.")
        }
        operandStack.push(expression.interpret())
    }

}