package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTest {

    @Test
    void testBasicAssertions() {
        // Basic equality / boolean checks
        assertEquals(5, 2 + 3, "2 + 3 should equal 5");                // :contentReference[oaicite:3]{index=3}
        assertTrue(5 > 3, "5 should be greater than 3");               // :contentReference[oaicite:4]{index=4}
        assertFalse(5 < 3, "5 should not be less than 3");             // :contentReference[oaicite:5]{index=5}

        // Nullity assertions
        assertNull(null, "This object should be null");                // :contentReference[oaicite:6]{index=6}
        assertNotNull(new Object(), "This object should not be null"); // :contentReference[oaicite:7]{index=7}
    }

    @Test
    void testValueAndArrayAssertions() {
        // Negative equality check
        assertNotEquals(11, 5 + 5, "5 + 5 should not be 11");          // :contentReference[oaicite:8]{index=8}

        // Floating-point comparison with delta
        assertEquals(3.14159, Math.PI, 1e-6, "Pi approximation");     // :contentReference[oaicite:9]{index=9}

        // Array comparison
        int[] expected = {1, 2, 3};
        assertArrayEquals(expected, new int[]{1, 2, 3}, "Arrays must match"); // :contentReference[oaicite:10]{index=10}
    }

    @Test
    void testIdentityAssertions() {
        Object obj = new Object();
        Object same = obj;
        Object different = new Object();

        // Reference checks
        assertSame(obj, same, "References should be identical");        // :contentReference[oaicite:11]{index=11}
        assertNotSame(obj, different, "References should not be identical"); // :contentReference[oaicite:12]{index=12}
    }

    @Test
    void testGroupedAssertions() {
        String str = "JUnit5";
        Integer num = 42;

        // Group related assertions so all run, reporting all failures at once
        assertAll("String and Number properties",                      // :contentReference[oaicite:13]{index=13}
            () -> assertNotNull(str, "String must not be null"),
            () -> assertTrue(str.startsWith("JUnit"), "String should start with 'JUnit'"),
            () -> assertEquals(6, str.length(), "Length should be 6"),
            () -> assertNotNull(num, "Number must not be null"),
            () -> assertEquals(42, num, "Number should be 42")
        );
    }
}
