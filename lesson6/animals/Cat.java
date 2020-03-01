package lesson6.animals;

public class Cat extends Animal {
    int liveCount;

    public Cat(String name, String color, int age) {
        super(name, color, age);
//        System.out.println(" constructor Cat");
    }

    public Cat(String name, String color, int age, int liveCount) {
        super(name, color, age);
        this.liveCount = liveCount;
    }

    @Override
    public void voice() {
        System.out.println(name + " Мяу!!!");
    }

    public void findMouse(){
        System.out.println(name + " Ищет мышь");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "liveCount=" + liveCount +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
