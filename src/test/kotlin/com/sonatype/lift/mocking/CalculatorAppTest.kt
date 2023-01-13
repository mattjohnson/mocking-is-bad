package com.sonatype.lift.mocking

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.mockito.kotlin.doReturn
import org.mockito.kotlin.mock

class CalculatorAppTest {
  @Test
  fun addOneMock() {
    val calcService = mock<CalculatorService> {
      on { addNumbers(1, 1) } doReturn 2
    }
    val calcApp = CalculatorApp(calcService)
    assertEquals(2, calcApp.addOne(1))
  }

  @Test
  fun addMock() {
    val calcService = mock<CalculatorService> {
      on { addNumbers(1, 1) } doReturn 2
    }
    val calcApp = CalculatorApp(calcService)
    assertEquals(2, calcApp.add(1, 1))
  }

  @Test
  fun testAddMock() {
    val calcService = mock<CalculatorService> {
      on { addNumbers(1, 1, 1) } doReturn 3
    }
    val calcApp = CalculatorApp(calcService)
    assertEquals(3, calcApp.add(1, 1, 1))
  }

  @Test
  fun testAdd1Mock() {
    val calcService = mock<CalculatorService> {
      on { addNumbers(1, 1, 1, 1) } doReturn 4
    }
    val calcApp = CalculatorApp(calcService)
    assertEquals(4, calcApp.add(1, 1, 1, 1))
  }

  @Test
  fun testAdd2Mock() {
    val calcService = mock<CalculatorService> {
      on { addNumbers(1, 1, 1, 1, 1) } doReturn 5
    }
    val calcApp = CalculatorApp(calcService)
    assertEquals(5, calcApp.add(1, 1, 1, 1, 1))
  }

  // no mocking!
  @Test
  fun addOne() {
    val calcApp = CalculatorApp(CalculatorService())
    assertEquals(2, calcApp.addOne(1))
  }

  @Test
  fun add() {
    val calcApp = CalculatorApp(CalculatorService())
    assertEquals(2, calcApp.add(1, 1))
  }

  @Test
  fun testAdd() {
    val calcApp = CalculatorApp(CalculatorService())
    assertEquals(3, calcApp.add(1, 1, 1))
  }

  @Test
  fun testAdd1() {
    val calcApp = CalculatorApp(CalculatorService())
    assertEquals(4, calcApp.add(1, 1, 1, 1))
  }

  @Test
  fun testAdd2() {
    val calcApp = CalculatorApp(CalculatorService())
    assertEquals(5, calcApp.add(1, 1, 1, 1, 1))
  }

}
