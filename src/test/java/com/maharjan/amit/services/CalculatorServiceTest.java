package com.maharjan.amit.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTest {

    @BeforeAll
    public static void init() {
        System.out.println("Running CalculatorServiceTest");
    }

    @AfterAll
    public static void end() {
        System.out.println("Ending CalculatorServiceTest");
    }

    @BeforeEach
    public void beforeEachTestCase() {
        System.out.println("Before Each TestCase");
    }

    @AfterEach
    public void afterEachTestCase() {
        System.out.println("After Each TestCase");
    }

    @Test
    @Disabled
    public void addTwoNumberTest() {
        System.out.println("Running CalculatorServiceTest.addTwoNumberTest");
        int result = CalculatorService.add(2,3);
        Assertions.assertEquals(5, result);
    }

    @Test
    @Timeout(5) // 5 sec
    @DisplayName("This test case add all the number with no limit in the count")
    public void addAnyNumberTest() throws InterruptedException {
        System.out.println("Running CalculatorServiceTest.addAnyNumberTest");
//        Thread.sleep(6000);
        int result = CalculatorService.add(1,2,3,4,5);
        Assertions.assertEquals(15, result, "Test failed!");
    }
}
