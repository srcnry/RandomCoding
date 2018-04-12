package com.missingartifacts.behaviorparameterization.predicates;

import com.missingartifacts.behaviorparameterization.Apple;
import com.missingartifacts.behaviorparameterization.contract.AppleFormatter;

public class AppleSimpleFormatter implements AppleFormatter {
    @Override
    public String accept(Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
