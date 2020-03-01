package lesson6.animals;

public class Cow extends Animal {

    public Cow(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println(name + " Му Му!!!");
    }
}
