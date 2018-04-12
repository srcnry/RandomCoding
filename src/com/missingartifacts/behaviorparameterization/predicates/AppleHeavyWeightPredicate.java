package com.missingartifacts.behaviorparameterization.predicates;

import com.missingartifacts.behaviorparameterization.Apple;
import com.missingartifacts.behaviorparameterization.contract.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {


    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
