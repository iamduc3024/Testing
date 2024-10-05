package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTestBasedOnCFGTest {
    Service service = new Service();

    float weight, height;

//    CFG testing
    @Test
    void testCase1() {
        weight = 0f;
        height = 38f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase2() {
        weight = 635f;
        height = 3f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase3() {
        weight = 20f;
        height = 1.5f;

        assertEquals("Thin", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase4() {
        weight = 62f;
        height = 1.65f;

        assertEquals("Normal", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase5() {
        weight = 30f;
        height = 1.04f;

        assertEquals("Overweight", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase6() {
        weight = 58f;
        height = 1.35f;

        assertEquals("Obesity", service.healthStatusBasedOnBMI(weight, height));
    }
}