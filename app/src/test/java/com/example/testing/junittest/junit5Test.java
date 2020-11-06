package com.example.testing.junittest;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

/**
 * 1 Junit5测试环境done
 * 2 lambda表达式 done
 */

public class junit5Test extends BaseCase {
    private Calculator calculator = new Calculator();

    @Test
    void testCalculator() {
        assertAll("testCalculator",
                () -> assertEquals(calculator.add(1, 1), 2),
                () -> assertEquals(calculator.subtract(1, 1), 0),
                () -> assertEquals(calculator.multiply(1, 1), 1),
                () -> assertEquals(calculator.divide(1, 1), 1),
                () -> assertEquals(calculator.count, 4));
    }

}