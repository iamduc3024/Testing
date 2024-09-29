package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
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

//    Decision table testing
    @Test
    void testCase10() {
        weight = -50.0f;
        height = 1.7f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase11() {
        weight = 70.0f;
        height = -1.8f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase12() {
        weight = 62.5f;
        height = 1.65f;

        assertEquals("Normal", service.healthStatusBasedOnBMI(weight, height));
    }

    @Test
    void testCase13() {
        weight = 635.01f;
        height = 1.89f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }

    @Test
    void testCase14() {
        weight = 70f;
        height = 30.11f;

        assertThrows(IllegalArgumentException.class, () -> {
            service.healthStatusBasedOnBMI(weight, height);
        });
    }
}
