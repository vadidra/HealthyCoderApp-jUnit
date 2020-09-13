package com.healthycoderapp;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {
/*
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
*/
    @Test
    void returnTrue_When_DietRecommended() {

        //given
        double weight = 89.0;
        double height = 1.72;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertTrue(recommended);
    }

    @Test
    void returnFalse_When_DietNotRecommended() {

        //given
        double weight = 50.0;
        double height = 1.92;

        //when
        boolean recommended = BMICalculator.isDietRecommended(weight,height);

        //then
        assertFalse(recommended);
    }

    @Test
    void throwArithmeticException_When_HeightZero() {

        //given
        double weight = 50.0;
        double height = 0.0;

        //when
        //lambda expression
        Executable executable = () -> BMICalculator.isDietRecommended(weight,height);

        //then
        assertThrows(ArithmeticException.class, executable);
    }

/*
    @Test
    void findCoderWithWorstBMI() {
    }

    @Test
    void getBMIScores() {
    }
*/
}