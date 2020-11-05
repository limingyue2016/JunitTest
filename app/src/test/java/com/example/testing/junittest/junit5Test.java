package com.example.testing.junittest;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

/**
 * 1 测试环境done
 * 2 lambda表达式 done
 */
public class junit5Test {
    private MainActivity mainActivity = new MainActivity();

    @BeforeAll
    static void setUp() {
        System.out.println("beforAll");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("afterAll");
    }

    @Test
    void testAdd() {
        assertAll("testAdd",
                () -> assertEquals(mainActivity.add(1, 1), 2),
                () -> assertEquals(mainActivity.add(1, 1), 2),
                () -> assertEquals(mainActivity.add(1, 1), 2));
    }

}