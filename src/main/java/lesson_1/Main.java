package lesson_1;

import lesson_1.animals.Animal;
import lesson_1.animals.Dog;
import lesson_1.animals.PetCat;
import lesson_1.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal dogBobik = new Dog("Bobik");
        Animal dogRobin = new Dog("Robin");

        Animal catBarsik = new PetCat("Barsik");
        Animal catBubalek = new PetCat("Bubalek");

        Animal tigerKisa = new Tiger("Kisa");
        Animal tigerLola = new Tiger("Lola");

        Animal[] animals = {dogBobik, catBubalek, tigerKisa, dogRobin, tigerLola, catBarsik};

        for (Animal animal : animals) {
            animal.run(300);
        }

        System.out.println("Всего животных: " + Animal.getCounter() + "\nИз них: " +
                "\nСобак: " + Dog.getCounter() +
                "\nДомашних котов: " + PetCat.getCounter() +
                "\nТигров: " + Tiger.getCounter());
    }
}
