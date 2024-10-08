package com.mycompany.app;

// import org.junit.Test;
import org.junit.jupiter.api.Test;

import com.mycompany.app.FefiTest.Animal;
import static com.mycompany.app.FefiTest.*;

// import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AppTest {
    public AppTest() {
        
    }

    @Test
    public void testArraySizeWithIterative() {
        final String[] animalTypes = new String[] {"Cat", "Dog", "Bat", "Frog"};
        final Animal[] animals = getAnimalsFromTypes_iterative(animalTypes);
        assertTrue(animals.length == 4);
    }

    @Test
        public void testArraySizeWithFunctional() {
            final String[] animalTypes = new String[] {"Cat", "Dog", "Bat", "Frog"};
            final Animal[] animals = FefiTest.getAnimalsFromTypes_functional(animalTypes);
            assertTrue(animals.length == 4);
    }
}
