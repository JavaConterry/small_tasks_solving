package com.conterry.sorting.test;

import com.conterry.sorting.solution.StringSorter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SorterTests {

    StringSorter stringSorter;

    @BeforeEach
    void setUp(){
        stringSorter = new StringSorter();
    }

    @Test
    void test_1(){
        StringSorter sorter = new StringSorter();
        String sortedStr = "ABCabfhk1234";
        String unsortedStr = "kb4f2AC3h1Ba";
        assertEquals(sortedStr, StringSorter.sort(unsortedStr));
    }

    @Test
    void testNotCharactersRemoving(){
        StringSorter sorter = new StringSorter();
        String sortedStr = "abcdef";
        String unsortedStr = "abc@de#f";
        assertEquals(sortedStr, StringSorter.sort(unsortedStr));
    }
}
