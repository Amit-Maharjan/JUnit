package com.maharjan.amit.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AssertionsExample {
    @Test
    public void testAssertions1() {
        Assertions.assertTrue(true);
        Assertions.assertFalse(false);

        Assertions.assertEquals("Hello World", "Hello World");
        Assertions.assertEquals(1,1);
        Assertions.assertEquals(2,2f);

        Assertions.assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3});

        Assertions.assertNotEquals(1,2);

        String str1 = new String("Hello World");
        String str2 = new String("Hello World");
        Assertions.assertNotSame(str1, str2);
        Assertions.assertEquals(str1, str2);
        Assertions.assertSame(str1, str1);

        Assertions.assertNull(null);
    }

    @Test
    public void testAssertions2() {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(1,2,3);
        Assertions.assertIterableEquals(list1, list2);

        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("Error occurred");
        });
    }
}
