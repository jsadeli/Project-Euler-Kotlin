#!/usr/bin/env kotlin

import java.math.BigInteger

/**
 * Power digit sum
 *
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 *
 * What is the sum of the digits of the number 2^1000?
 */
fun eval(): Int {
  val result: BigInteger = 2.toBigInteger().pow(1000)
  return result.toString().split("").filter { it.isNotBlank() }.sumOf { it.toInt() }
}

println("Power digit sum of 2^1000:")
println(eval()) // 1366
