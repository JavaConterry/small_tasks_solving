package com.conterry.sorting.test;

import com.conterry.sorting.solution.StringSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SorterTests {

    @Test
    void test_1(){
        String sortedStr = "ABCabfhk1234";
        String unsortedStr = "kb4f2AC3h1Ba";
        assertEquals(sortedStr, StringSorter.sort(unsortedStr));
    }

    @Test
    void testNotCharactersRemoving(){
        String sortedStr = "abcdef";
        String unsortedStr = "abc@de#f";
        assertEquals(sortedStr, StringSorter.sort(unsortedStr));
    }
}
