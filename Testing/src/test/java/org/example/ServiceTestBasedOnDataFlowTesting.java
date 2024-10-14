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
        weight = 1000f;
        height = 1000f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase3() {
        weight = 20f;
        height = 1.2f;

        assertEquals("Thin", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase4() {
        weight = 120.8f;
        height = 2.2f;

        assertEquals("Normal", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase5() {
        weight = 170.4f;
        height = 2.5f;

        assertEquals("Overweight", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase6() {
        weight = 225f;
        height = 1.7f;

        assertEquals("Obesity", service.healthStatusBasedOnBMI(weight, height));
    }
}