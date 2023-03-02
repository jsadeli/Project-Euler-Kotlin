#!/usr/bin/env kotlin

import java.io.File

/**
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over
 * five-thousand first names, begin by sorting it into alphabetical order.
 * Then working out the alphabetical value for each name, multiply this value by its alphabetical
 * position in the list to obtain a name score.
 *
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth
 * 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of
 * 938 × 53 = 49714.
 *
 * What is the total of all the name scores in the file?
 */
fun eval(): Int {
  // read the file
  val file = File("names.txt")

  // clean up and sort the names
  val names = file.readText()
    .split(",")
    .map { it.trim('"') }
    .sorted()

  // calculate total name scores
  return names.mapIndexed { index, str -> (index + 1) * str.score() }.sum()
}

/**
 * Calculates the score of a string.
 */
fun String.score(): Int {
  val base: Int = 'A'.code - 1
  return this.chars().map { it - base }.sum()
}

println("Total of all name scores:")
println(eval()) // 871198282
