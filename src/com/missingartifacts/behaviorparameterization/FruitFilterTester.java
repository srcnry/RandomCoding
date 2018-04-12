package com.missingartifacts.behaviorparameterization;

import com.missingartifacts.behaviorparameterization.contract.AppleFormatter;
import com.missingartifacts.behaviorparameterization.predicates.AppleFancyFormatter;
import com.missingartifacts.behaviorparameterization.predicates.AppleGreenColorPredicate;

import java.util.ArrayList;
import java.util.List;

import static com.missingartifacts.behaviorparameterization.Color.GREEN;
import static com.missingartifacts.behaviorparameterization.Color.RED;

public class FruitFilterTester {

    public static void main(String args[]){
        List<Apple> allApples = bootStrapApples();
        System.out.println("All Apples size = " + allApples.size());
        for (Apple a: allApples) {
            System.out.println(a.toString());
        }

        List<Apple> filteredApples = FruitFilter.filterApples(allApples, new AppleGreenColorPredicate());
        prettyPrintApple(filteredApples, new AppleFancyFormatter());

        /*List<Apple> filteredByWeight = FruitFilter.filterApplesByWeight(allApples, 150);
        System.out.println("Heavy Apples size =" + filteredByWeight.size());
        for (Apple a: filteredByWeight) {
            System.out.println(a.toString());
        }*/


/*        List<Apple> filteredRedApples = FruitFilter.filterApplesByColor(allApples, RED);
        System.out.println("Heavy Apples size =" + filteredRedApples.size());
        for (Apple a: filteredRedApples) {
            System.out.println(a.toString());
        }

        List<Apple> filteredGreenApples = FruitFilter.filterApplesByColor(allApples, GREEN);
        System.out.println("Green apples size =" + filteredGreenApples.size());
        for (Apple a: filteredGreenApples) {
            System.out.println(a.toString());
        }*/
        /*
        List<Apple> filteredApples = FruitFilter.filterGreenApples(allApples);
        System.out.println("Green apples size =" + filteredApples.size());
        for (Apple a: filteredApples) {
            System.out.println(a.toString());
        }*/


    }

    public static void prettyPrintApple(List<Apple> inventory,
                                        AppleFormatter formatter) {
        for(Apple apple: inventory) {
            String output = formatter.accept(apple);
            System.out.println(output);
        }
    }

    public static List<Apple>  bootStrapApples(){
        int counter = 0;
        List<Apple> apples = new ArrayList<>();
        while(counter< 10) {
            int randColor =(int)(Math.round(Math.random()  + 1 ));
            int weight =(int)(Math.round((Math.random()*200)  + 50 ));

            if(randColor == 1) {
                apples.add(new Apple(RED, weight));
            } else {
                apples.add(new Apple(GREEN, weight));
            }
            counter++;
        }
        return apples;
    }
}
