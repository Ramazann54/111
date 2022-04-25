package org.example;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class QuadraticTrinominalTest {
    QuadraticTrinominal first = new QuadraticTrinominal(1, 2, 1);
    QuadraticTrinominal fourth = new QuadraticTrinominal(2, -7, 3);

    @Test
    public void FirstTest(){
        assertEquals("[-1.0]", Arrays.toString(first.decision()));
    }

    @Test (expected = IllegalArgumentException.class)
    public void SecondTest(){
        QuadraticTrinominal second = new QuadraticTrinominal(0, -2, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ThirdTest(){
        QuadraticTrinominal third = new QuadraticTrinominal(2, 2, 2);
        double[] answer = {0};
        assertEquals(third.decision(), answer);
    }

    @Test
    public void FourthTest(){
        double[] answer = {3.0, 0.5};
        assertEquals("[3.0, 0.5]", Arrays.toString(fourth.decision()));
    }
}