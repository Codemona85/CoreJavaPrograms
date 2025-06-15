package learnCoreJava;

import java.sql.SQLOutput;

public class Animal {

    Animal() {
        System.out.println("Types of Animals");
    }
     public void Type()
    {
        System.out.println("Animals can be Herbivorous or Carnivorous");
    }
    public static void main(String[] args) {
        Animal a=new Animal();
        a.Type();
    }
}
