package com.missingartifacts.behaviorparameterization;

public class Apple {
    private Color appleColor;
    private double weight;
    public Apple(Color color, double weight){
        this.appleColor = color;
        this.weight = weight;
    }

    public Color getColor() {
        return appleColor;
    }

    public double getWeight(){
        return weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "appleColor=" + appleColor +
                ", weight=" + weight +
                '}';
    }
}