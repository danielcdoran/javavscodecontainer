package com.mycompany.app;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.mycompany.app.FefiTest.*;

public class AppTest {
    final String[] animalTypes = new String[] {"Cat", "Dog", "Bat", "Frog"}; 
    public AppTest() {
      
    }

    @Test
    public void testFactoryNull() {
        Animal result = makeAnimal(null);
        assertTrue(result == null);
    }

    @Test
    public void testFactoryNoCharactersInName() {
        Animal result = makeAnimal("");
        assertTrue(result == null);
    }
    @Test
    public void testFactoryBlankCharactersInName() {
        Animal result = makeAnimal(" ");
        assertTrue(result == null);
    }
    @Test
    public void testArraySizeWithIterative() {
        // final String[] animalTypes = new String[] {"Cat", "Dog", "Bat", "Frog"};
        final Animal[] animals = getAnimalsFromTypes_iterative(animalTypes);
        assertTrue(animals.length == 4);
    }

    @Test
        public void testArraySizeWithFunctional() {
            // final String[] animalTypes = new String[] {"Cat", "Dog", "Bat", "Frog"};
            final Animal[] animals = FefiTest.getAnimalsFromTypes_functional(animalTypes);
            assertTrue(animals.length == 4);
    }
}
