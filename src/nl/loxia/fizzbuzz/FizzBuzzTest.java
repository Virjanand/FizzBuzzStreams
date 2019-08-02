package nl.loxia.fizzbuzz;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void rij_van_15_getallen() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15), fizzBuzz.generateNumbers(15));
    }

    @Test
    public void rij_van_4_getallen_geeft_8_getallen_met_elk_getal_gedupliceerd() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(asList(1,1,2,2,3,3,4,4), fizzBuzz.duplicate(4));
    }
}
