package com.missingartifacts.behaviorparameterization;

import com.missingartifacts.behaviorparameterization.contract.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

import static com.missingartifacts.behaviorparameterization.Color.GREEN;

public class FruitFilter {

    // 1. filter by color of GREEN
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if( GREEN.equals(apple.getColor() ) ) {
                result.add(apple);
            }
        }
        return result;
    }

    // 2. filter by color
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory){
            if( color.equals(apple.getColor() ) ) {
                result.add(apple);
            }
        }
        return result;
    }

    // 3. filter by weight
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory){
            if ( apple.getWeight() > weight ) {
                result.add(apple);
            }
        }
        return result;
    }

    // 4. filter by using flags
    public static List<Apple> filterApples(List<Apple> inventory, Color color,
                                           int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple: inventory) {
            if ( (flag && apple.getColor().equals(color)) ||
                    (!flag && apple.getWeight() > weight) ){
                result.add(apple);
            }
        }
        return result;
    }

    /* 5. Behavior parameterization - capability of telling a method to take multiple behaviors as parameters and use them internally to
     * accomplish different behaviors
    * */
    public static List<Apple> filterApples(List<Apple> inventory,
                                           ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple: inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}


