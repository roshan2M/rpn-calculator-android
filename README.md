# rpn-calculator-android
An RPN (Reverse-Polish-Notation) calculator app created using Android Studio.

## Reverse Polish Notation (RPN)
In regular math, we write expressions such as `3 + 4`. This type of notation is known as **in-fix** notation. Often, when typing on a calculator, it is cumbersome to write large mathematical expressions of this form since they require several pre- and post- expression brackets.

Instead, we can use RPN, also known as **post-fix** notation. The key idea is that *operands* **precede** *operators*. They follow the structure `<expression>` `<expression>` `<operator>`. Here are some examples of this notation.
- `3 4 +` in RPN notation means `3 + 4`
- `7 20 2 5 * / +` in RPN notation means `7 + (20 / (2 * 5))`

As you can see, the need for brackets is quickly removed. There are no rules for **order-of-operations**, since the order of expressions determines what needs to be evaluated first.

## Visual Representation
On an Android screen, it would be very inconvenient to type an expression like `7 20 2 5 * / +`. Thus, we use a stack-like structure to show the order of expressions that are evaluated.

### Stack Structure
