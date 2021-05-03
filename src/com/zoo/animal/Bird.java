package com.zoo.animal;
import java.util.ArrayList;
public class Bird extends Animal implements Feeding, Movable,Eating,Predator{
    private String typeBeak;
    public Bird(String name, String color, double weight, int age, int countPaw,String cover,String typeBeak,Size size) {
        super(name, color, weight, age, countPaw,cover,size);
        this.typeBeak = typeBeak;
    }
    @Override
    public void voice() {
        System.out.println("Pi");
    }
    @Override
    public void move() {
        this.getMoveFunction().put(Move.FLY, "I can fly");
        this.getMoveFunction().put(Move.SWIM, "I also can swim");
    }
    @Override
    public String Feed() {
        return "Meat/Plants Feeding";
    }
    @Override
    public void eat() {
        System.out.println("I eat meat or plants");
    }
    @Override
    public boolean hunt() {
        return true;
    }
}
