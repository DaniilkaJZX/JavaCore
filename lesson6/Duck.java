package lesson6;

import lesson6.animals.Animal;

public class Duck extends Animal {

    public Duck(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " Кря Кря!!!");
    }
}
