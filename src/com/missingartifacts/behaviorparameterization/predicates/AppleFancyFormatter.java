package com.missingartifacts.behaviorparameterization.predicates;

import com.missingartifacts.behaviorparameterization.Apple;
import com.missingartifacts.behaviorparameterization.contract.AppleFormatter;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        String characteristic = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristic +
                " " + apple.getColor() +" apple";
    }
}
