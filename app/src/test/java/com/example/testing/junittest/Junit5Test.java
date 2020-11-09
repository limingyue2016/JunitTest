package com.example.testing.junittest;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

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

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@IncludeTags("calculator")
public class Junit5Test extends BaseCase {
    private Calculator calculator = new Calculator();

    @Test
    @Disabled
    void testCalculator() {
        assertAll("testCalculator",
                () -> assertEquals(calculator.add(1, 1), 2),
                () -> assertEquals(calculator.subtract(1, 1), 0),
                () -> assertEquals(calculator.multiply(1, 1), 1),
                () -> assertEquals(calculator.divide(1, 1), 1),
                () -> assertEquals(calculator.count, 4));

    }

    @Test
    @Order(4)
    @Tag("calculator")
    void testAdd() {
        assertEquals(calculator.add(1, 1), 2);
    }

    @Test
    @Order(3)
    @Tag("calculator")
    void testSubtract() {
        assertEquals(calculator.subtract(1, 1), 0);
    }

    @Test
    @Order(2)
    @RepeatedTest(3)
    void testMultiply() {
        assertEquals(calculator.multiply(1, 1), 1);
    }

    @Test
    @Order(1)
    void testDivide() {
        assertEquals(calculator.divide(1, 1), 1);
    }


}