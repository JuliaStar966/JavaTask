package com.zoo.animal;

import java.util.ArrayList;
import java.util.HashMap;

public abstract class Animal {
    public enum Size{
        BIG,
        SMALL,
        MIDDLE
    };
    public enum Move{
        RUN,
        SWIM,
        JUMP,
        FLY
    };
    public HashMap<Move,String> getMoveFunction() {
        return moveFunction;
    }

    private HashMap<Move,String> moveFunction = new HashMap<>();
    private String name;
    private String color;
    private double weight;
    private int age;
    private int countPaw;
    private String cover;
    private Size size;
    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public void setCountPaw(int countPaw) {
        this.countPaw = countPaw;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public int getCountPaw() {
        return countPaw;
    }
    public String getCover() {
        return cover;
    }
    public Animal(String name, String color , double weight, int age, int countPaw, String cover,Size size){
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.countPaw = countPaw;
        this.cover = cover;
        this.size = size;
    }
    public abstract void voice();
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return this.color + this.name;
    }
}
