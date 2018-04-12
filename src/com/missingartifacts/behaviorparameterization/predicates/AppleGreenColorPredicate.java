package com.missingartifacts.behaviorparameterization.predicates;

import com.missingartifacts.behaviorparameterization.Apple;
import com.missingartifacts.behaviorparameterization.contract.ApplePredicate;

import static com.missingartifacts.behaviorparameterization.Color.GREEN;

public class AppleGreenColorPredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
