package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestBasedOnBoundaryTest {
    Service service = new Service();

    float weight, height;

//    Boundary testing
    @Test
    void testCase1() {
        weight = 70.0f;
        height = 1.70f;

        assertEquals("Normal", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase2() {
        weight = 70.0f;
        height = 0.0f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase3() {
        weight = 70.0f;
        height = 0.01f;

        assertEquals("Obesity", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase4() {
        weight = 70.0f;
        height = 2.50f;

        assertEquals("Thin", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase5() {
        weight = 70.0f;
        height = 2.51f;

        assertEquals("Thin", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase6() {
        weight = 0.0f;
        height = 1.7f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase7() {
        weight = 0.01f;
        height = 1.7f;

        assertEquals("Thin", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase8() {
        weight = 634.99f;
        height = 1.7f;

        assertEquals("Obesity", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase9() {
        weight = 635.0f;
        height = 1.7f;

        assertEquals("Obesity", service.healthStatusBasedOnBMI(weight, height));
    }
}