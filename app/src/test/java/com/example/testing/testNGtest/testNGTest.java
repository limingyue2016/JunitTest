package com.example.testing.testNGtest;

import com.example.testing.junittest.Calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1 testNG测试环境done
 */

public class testNGTest extends BaseCase {
    private Calculator calculator = new Calculator();

    @Test(groups = {"group1"})
    public void testAdd() {
        Assert.assertEquals(calculator.add(1, 1), 2);
    }

    @Test(groups = {"group1"})
    public void testSubtract() {
        Assert.assertEquals(calculator.subtract(1, 1), 0);
    }

    @Test(groups = {"group2"})
    public void testMultiply() {
        Assert.assertEquals(calculator.multiply(1, 1), 1);
    }

    @Test(groups = {"group2"})
    public void testDivide() {
        Assert.assertEquals(calculator.divide(1, 1), 1);
    }

    @Test(groups = {"group1"})
    public void testCount() {
        Assert.assertEquals(calculator.count, 2);
    }
}
