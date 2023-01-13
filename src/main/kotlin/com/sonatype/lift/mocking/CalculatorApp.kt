package com.sonatype.lift.mocking

open class CalculatorApp(private val calculatorService: CalculatorService) {

  fun addOne(x: Int): Int = calculatorService.addNumbers(x, 1)
  fun add(x1: Int, x2: Int): Int = calculatorService.addNumbers(x1, x2)
  fun add(x1: Int, x2: Int, x3: Int): Int = calculatorService.addNumbers(x1, x2, x3)
  fun add(x1: Int, x2: Int, x3: Int, x4: Int): Int = calculatorService.addNumbers(x1, x2, x3, x4)
  fun add(x1: Int, x2: Int, x3: Int, x4: Int, x5: Int): Int = calculatorService.addNumbers(x1, x2, x3, x4, x5)
}

open class CalculatorService {
  open fun addNumbers(vararg x: Int): Int {
    return x.sum()
  }
}
