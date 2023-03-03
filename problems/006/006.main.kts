#!/usr/bin/env kotlin

import org.jetbrains.kotlin.com.google.common.math.IntMath.pow

/**
 * The sum of the squares of the first ten natural numbers is,
 *  1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is,
 *  (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and
 * the square of the sum is
 *  3025 - 385 = 2640
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers
 * and the square of the sum.
 */
fun eval(): Int {
  val range: IntRange = 1..100
  val sumOfSquares: Int = range.sumOf { pow(it, 2) }
  val squareSum: Int = pow(range.sum(), 2)
  return squareSum - sumOfSquares
}

println("Sum square difference:")
println(eval()) // 25164150
