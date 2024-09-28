package org.example;

import java.util.Random;

public class Service {
    public String healthStatusBasedOnBMI(float weight, float height) {
        if (weight <= 0 || height <= 0) {
            throw new IllegalArgumentException("Weight and height must be greater than 0.");
        }
        if (weight > 635 || height > 2.51) {
            throw new IllegalArgumentException("Weight must be less than 635 or height must be less than 2.51.");
        }
        float BMI = weight / (height * height);

        if (BMI < 18.5) {
            return "Thin";
        } else if (BMI >= 18.5 && BMI < 25) {
            return "Normal";
        } else if (BMI >= 25 && BMI < 30) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
