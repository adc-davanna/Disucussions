package com.tenx.cre.lambda;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise1 {

    /**
     * Write function using andThen method to convert integer to string and
     * enclose within quotes.
     */
    @Test @Ignore
    public void functionAndThen() {

        Integer i = 1234;

        Function<Integer, String> quotedString = null; // TODO

        assertTrue("'1234'".equals(quotedString.apply(i)));

    }

    /**
     * Write function using compose method to convert integer to string and
     * enclose within quotes.
     */
    @Test @Ignore
    public void functionComposition() {

        Integer i = 1234;

        Function<Integer, String> quotedString = null; // TODO

        assertTrue("'1234'".equals(quotedString.apply(i)));

    }

    /**
     * Write a lambda function that returns the index of
     * the first occurrence of the second string within the first string,
     * or -1 if the second string doesn't occur within the first string.
     */
    @Test @Ignore
    public void functionBiFunction() {

        BiFunction<String, String, Integer> bifunc = null; // TODO

        assertEquals(5, bifunc.apply("tenx-cre", "cre").intValue());
        assertEquals(-1, bifunc.apply("tenx-cre", "homes").intValue());

    }


    /**
     * Write a function that tests if the word starts with T and has 5 words
     */
    @Test @Ignore
    public void functionPredicate() {

        Predicate<String> predicate = null; // TODO

        assertTrue(predicate.test("Ten-X"));
    }

    /**
     * Write a function that returns the squares
     */

    @Test @Ignore
    public void functionSquares() {
        UnaryOperator<Integer> unaryOperator = null; //TODO;

        List<Integer> list = Arrays.asList(1, 2, 3).stream().collect(Collectors.toList());

        List<Integer> squaresList = list.stream().
                map(i -> unaryOperator.apply(i)).collect(Collectors.toList());

        assertEquals(Arrays.asList(1, 4, 9), squaresList);

    }

    /**
     * Write a lambda function that generates first five fibonacci numbers.
     */
    @Test @Ignore
    public void functionGenerateFibonacci() {

        int[] fibs = {0, 1};

        Stream<Integer> fibonacci = null; // TODO

        assertTrue(Arrays.asList(0, 1, 1, 2, 3).containsAll(fibonacci.collect(Collectors.toList())));

    }

    /*
        Write a lambda function that "prints" all the elements whose length is
        greater than 8 and collects those elements in the outputList
     */
    @Test @Ignore
    public void functionConsumer() {

        List<String> list = Arrays.asList("residential", "commercial",
                "real estate", "psa", "comps");

        List<String> outputList = null; // TODO;

        assertEquals(Arrays.asList("residential", "commercial", "real estate"), outputList);

    }

    /**
     * Given a list of words, populate a map whose keys are the lengths of
     * each word, and whose values are list of words with that length.
     */
    @Test @Ignore
    public void functionMapOfListOfStringsByLength() {
        List<String> list = Arrays.asList(
                "residential", "commercial", "real estate",
                "cap rate", "contract", "seller agreement",
                "interest rate");
        Map<Integer, List<String>> result = new TreeMap<>();

        // TODO write code to populate result



        assertEquals(Arrays.asList(8, 10, 11, 13, 16), new ArrayList<>(result.keySet()));
        assertEquals(Arrays.asList("cap rate", "contract"), result.get(8));
        assertEquals(Arrays.asList("commercial"), result.get(10));
        assertEquals(Arrays.asList("residential", "real estate"), result.get(11));
        assertEquals(Arrays.asList("interest rate"), result.get(13));
        assertEquals(Arrays.asList("seller agreement"), result.get(16));
    }
}
