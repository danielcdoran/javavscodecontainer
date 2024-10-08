/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

// public class App {

//     public static void main(String[] args) {
//         System.out.println("Hello Remote World!");
//     }
// }

import java.io.*;
import java.util.stream.*;
import java.util.Arrays;

class FefiTest {

    public static class Animal {
        private String type;

        public Animal(String type) {
            this.type = type;
        }

        /* ... */
        @Override
        public String toString() {
            return "Animal =" + type;
        }
    }

    /**
     * Create a list of Animal objects from the given animal types.
     * Implementation must be using an iterative approach.
     * @param animalTypes string array with the types of animals to create Animal objects for.
     * @return an array of Animal objects created from the animalTypes.
     */
    public static Animal[] getAnimalsFromTypes_iterative(String[] animalTypes) {
        // YOUR IMPLEMENTATION HERE
        int len = animalTypes.length;
        var animals = new Animal[len];
        for (int i = 0 ; i < len ; i++){
            animals[i] = makeAnimal(animalTypes[i]);
        }
        return animals;
    }

    /**
     * Create a list of Animal objects from the given animal types.
     * Implementation must be using a functional approach.
     * 
     * @param animalTypes string array with the types of animals to create Animal
     *                    objects for.
     * @return an array of Animal objects created from the animalTypes.
     */
    public static Animal[] getAnimalsFromTypes_functional(String[] animalTypes) {
        // // YOUR IMPLEMENTATION HERE
        Stream<String> animalStream = Arrays.stream(animalTypes);
        Animal[] animals = animalStream.map(x -> new Animal(x)).toArray(Animal[]::new);
        return animals;
    }

    public static Animal makeAnimal(String animal) {
        if (animal == null)
            return null;
        if (animal.isEmpty())
            return null;
        if (animal.isBlank())
            return null;
        return new Animal(animal);
    }

    public static void main(String[] args) {
        final String[] animalTypes = new String[] { "Cat", "Dog", "Bat", "Frog" };
        final Animal[] animalsIter = getAnimalsFromTypes_iterative(animalTypes);
        // final Animal[] animalsFunc = getAnimalsFromTypes_functional(animalTypes);
        /* ... */
        for (int i = 0; i < animalsIter.length; i++) {
            System.out.println(animalsIter[i].toString());
        }

        final Animal[] animalsFunc = getAnimalsFromTypes_functional(animalTypes);
        for (int i = 0; i < animalsFunc.length; i++) {
            System.out.println(animalsFunc[i].toString());
        }
    }
}
