package homeWork_lesson6;


import homeWork_lesson6.animals.Cat;
import homeWork_lesson6.animals.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "black", 4);

        Dog dog = new Dog("Bobik", "brown", 5);

        cat.run(400);
        cat.swim(10);

        dog.run(200);
        dog.swim(9);

        cat.jump(4);

        dog.jump(2);


    }
}
