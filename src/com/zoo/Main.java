package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.animal.Mammals;
import com.zoo.exceptions.MoveException;

public class Main {
    public static String getMove(Animal animal, Animal.Move move) throws MoveException{
        if(!animal.getMoveFunction().containsKey(move)){
            throw new MoveException("This move denied");
        }
        return animal.getMoveFunction().get(move);
    }
    public static void main(String args[]){
        Mammals animal = new Mammals();
        animal.setAge(2);
        animal.setColor("black");
        animal.setName("Barsik");
        animal.setSize(Animal.Size.SMALL);
        animal.setWeight(7);
        animal.setCountPaw(4);
        animal.move();
        try{
            System.out.println(getMove(animal,Animal.Move.SWIM));
        }
        catch (MoveException mv){
              System.out.println("Error: " + mv.getMessage());
        }

    }
}
