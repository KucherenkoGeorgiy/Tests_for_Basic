package com.hillel.kucherenko.homework17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayUtilsTests {
    static int[][] myArray = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    @Test
    public void checkAverage() {
        Assertions.assertEquals(5, ArrayUtils.findAverage(myArray));
    }

    @Test
    public void checkIfMatrixIsSquare() {
        Assertions.assertTrue(ArrayUtils.checkIfArrayIsSquare(myArray));
    }
}
