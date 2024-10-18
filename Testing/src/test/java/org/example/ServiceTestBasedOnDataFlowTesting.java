package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestBasedOnDataFlowTesting {
    Service service = new Service();

    float weight, height;

    //    Data flow testing
    @Test
    void testCase1() {
        weight = 0f;
        height = 0f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase2() {
        weight = 1f;
        height = 0f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase3() {
        weight = 1000f;
        height = 1;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase4() {
        weight = 600f;
        height = 3;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase5() {
        weight = 20f;
        height = 1.2f;

        assertEquals("Thin", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase6() {
        weight = 62f;
        height = 1.65f;

        assertEquals("Normal", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase7() {
        weight = 67f;
        height = 1.53f;

        assertEquals("Overweight", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase8() {
        weight = 72f;
        height = 1.48f;

        assertEquals("Obesity", service.healthStatusBasedOnBMI(weight, height));
    }
}