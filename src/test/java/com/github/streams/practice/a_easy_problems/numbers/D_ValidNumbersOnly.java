package com.github.streams.practice.a_easy_problems.numbers;

import java.util.List;
import java.util.function.Predicate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

/**
 * Extracts integers from a list of strings. <br>
 * <br>
 * Example:<br>
 * Input: ["as", "123",* "32", "2as"]<br>
 * Output: [123, 32]<br>
 * Explanation: Parses strings as integers and returns a list of valid integers.
 */
class D_ValidNumbersOnly {
  @Test
  void testCheckAllIntegersWithoutAlphabets() {
    final var input = List.of("1", "12", "12a", "a12");
    var yourSolution = input.stream().filter(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        try{
          Integer.parseInt(s);
        }catch (NumberFormatException e){
          return false;
        }
        return true;
      }
    }).toList();
    var mySolution = EasyNumbersProblemSolution.getNumberOnly(input);

    Assertions.assertEquals(mySolution, yourSolution);
  }
}
