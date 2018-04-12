package com.missingartifacts.behaviorparameterization.predicates;

import com.missingartifacts.behaviorparameterization.Apple;
import com.missingartifacts.behaviorparameterization.Color;

public class AppleRedAndHeavyPredicate {
    public boolean test(Apple apple){
        return Color.RED.equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
