package com.maharjan.amit.services;

import org.junit.*;

public class CalculatorServiceTest {

    @BeforeClass
    public static void init() {
        System.out.println("Running CalculatorServiceTest");
    }

    @AfterClass
    public static void end() {
        System.out.println("Ending CalculatorServiceTest");
    }

    @Before
    public void beforeEachTestCase() {
        System.out.println("Before Each TestCase");
    }

    @After
    public void afterEachTestCase() {
        System.out.println("After Each TestCase");
    }

    @Test
    public void addTwoNumberTest() {
        System.out.println("Running CalculatorServiceTest.addTwoNumberTest");
        int result = CalculatorService.add(2,3);
        Assert.assertEquals(5, result);
    }

    @Test(timeout = 5000) // 5000 ms
    public void addAnyNumberTest() throws InterruptedException {
        System.out.println("Running CalculatorServiceTest.addAnyNumberTest");
//        Thread.sleep(6000);
        int result = CalculatorService.add(1,2,3,4,5);
        Assert.assertEquals(15, result);
    }
}
