package com.hillel.kucherenko.homework18;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayToolsTest {
    static int[] someArray = new int[]{1, 2, 3, 4, 5, 6, 7};

    @Test
    public void whenCheckIfArrayIsSorted() {
        Assertions.assertTrue(ArrayTools.checkIfArrayIsSorted(someArray));
    }

    @Test
    public void whenSearchSomeValueInArray() {
        Assertions.assertEquals(3, ArrayTools.searchForElement(someArray, 4));
    }
}
