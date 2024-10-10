package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestBasedOnDecisionTable {
    Service service = new Service();

    float weight, height;

    //    Decision table testing
    @Test
    void testCase1() {
        weight = -50.0f;
        height = 1.7f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase2() {
        weight = 70.0f;
        height = -1.8f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase3() {
        weight = 62.5f;
        height = 1.65f;

        assertEquals("Normal", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase4() {
        weight = 635.01f;
        height = 1.89f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase5() {
        weight = 70f;
        height = 30.11f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }
}