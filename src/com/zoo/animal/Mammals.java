package com.zoo.animal;

public class Mammals extends  Animal implements Feeding, Movable,Eating,Predator {
    private double powerPaws;
    private double countSeizeAnimals;
    public double getPowerPaws() {
        return powerPaws;
    }
    public void setCountSeizeAnimals(double countSeizeAnimals) {
        this.countSeizeAnimals = countSeizeAnimals;
    }
    public double getCountSeizeAnimals() {
        return countSeizeAnimals;
    }
    public void setPowerPaws(double powerPaws) {
        this.powerPaws = powerPaws;
    }
    public Mammals(String name, String color, double weight, int age, int countPaw, String cover, Size size) {
        super(name, color, weight, age, countPaw, cover, size);
    }
    public Mammals() {
        super(" ", " ", 0, 0, 0, " ", Size.MIDDLE);

    }
    @Override
    public String Feed() {
        return "Milk feeding";
    }
    @Override
    public void move() {
        this.getMoveFunction().put(Move.RUN, "I can run");
        this.getMoveFunction().put(Move.JUMP, "I also can jump");
    }
    @Override
    public void voice() {
        System.out.println("Brr");
    }
    @Override
    public void eat() {
        System.out.println("I eat meat ");
    }
    @Override
    public boolean hunt() {
        return true;
    }
    public boolean Seize(Animal... animals) {
        if (animals.length > this.countSeizeAnimals) {
            return false;
        }
        else {
            if (this.getSize() == Size.BIG) {
                boolean isSeize = false;
                for (var animal : animals) {
                    if (animal.getSize() == Size.MIDDLE || animal.getSize() == Size.SMALL) {
                        isSeize = true;
                    } else {
                        isSeize = false;
                    }
                }
                if (isSeize) return true;
            } else if (this.getSize() == Size.MIDDLE) {
                boolean isSeize = false;
                for (var animal : animals) {
                    if (animal.getSize() == Size.SMALL) {
                        isSeize = true;
                    } else {
                        isSeize = false;
                    }
                }
                if (isSeize) return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
