package com.mycompany.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static com.mycompany.app.FefiTest.*;

public class AppTest {
    final String[] animalTypes = new String[] { "Cat", "Dog", "Bat", "Frog" };
    final String[] animalTypesBlank = new String[] { "Cat", "", "Dog", "Bat", "Frog" };

    public AppTest() {
    }

    private int howManyNullAnimals(Animal[] animals) {
        int count = 0;
        for (Animal animal : animals) {
            if (animal == null) {
                count++;
            }
        }
        return count;
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
        final Animal[] animals = getAnimalsFromTypes_iterative(animalTypes);
        assertTrue(animals.length == 4);
    }

    @Test
    public void testArraySizeWithFunctional() {
        final Animal[] animals = FefiTest.getAnimalsFromTypes_functional(animalTypes);
        assertTrue(animals.length == 4);
    }

    @Test
    public void testArrayHasNullWithIterative() {
        final Animal[] animals = getAnimalsFromTypes_iterative(animalTypesBlank);
        assertTrue(howManyNullAnimals(animals) == 1);
    }

    @Test
    public void testArrayHasNullWithFunctional() {
        final Animal[] animals = FefiTest.getAnimalsFromTypes_functional(animalTypesBlank);
        assertTrue(howManyNullAnimals(animals) == 1);
    }
}
