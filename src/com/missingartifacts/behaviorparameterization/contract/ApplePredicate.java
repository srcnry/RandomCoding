package com.missingartifacts.behaviorparameterization.contract;

import com.missingartifacts.behaviorparameterization.Apple;

/**
 * Predicate - a generic function that returns a boolean
 */
public interface ApplePredicate{
    boolean test (Apple apple);
}