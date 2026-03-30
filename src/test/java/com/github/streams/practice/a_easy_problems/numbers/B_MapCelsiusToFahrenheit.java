package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Exercise focusing on the Stream.map() function. The goal is to convert a list of temperatures
 * from Celsius (Integers) to Fahrenheit (Doubles) using the formula:
 * F = (C * 9/5) + 32.
 * This requires using the map function to transform each element and ensure the result is collected into
 * a List<Double>.
 */
class B_MapCelsiusToFahrenheit {

  @Test
  void convertCelsiusToFahrenheit() {
    final var input = List.of(0, 10, 25, 37, 100);

    final var mySolution = EasyNumbersProblemSolution.convertCelsiusToFahrenheit(input);
    final var yourSolution = input.stream().map(celsius -> ((celsius * 9.0)/5.0) + 32).collect(Collectors.toList()); // WRITE YOUR IMPLEMENTATION HERE//

    Assertions.assertEquals(
        mySolution,
        yourSolution,
        "Your solution is incorrect. Check the Celsius to Fahrenheit formula: F = (C * 9.0 / 5.0) + 32.");
  }
}
