package Classes20261007;

import Classes20261007.Exercises1Animal.Animal;
import Classes20261007.Exercises2Game.GameCharacter;

public class Wednesday {
      public static void main(String[] args){
        
        //Exercises 1 animal
        Animal dog = new Animal("Woff");
        System.out.println(dog.goSound());

        Animal cat = new Animal("Cat mjau");
        System.out.println(cat.goSound());

        // Exercises 2 Game character
        GameCharacter anna = new GameCharacter("Anna", 5);
        anna.Introduce();

        GameCharacter bamse = new GameCharacter("Bamse", 55);
        bamse.Introduce();

    }
}

