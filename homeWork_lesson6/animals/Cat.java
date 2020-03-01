package homeWork_lesson6.animals;

public class Cat extends Animal {
    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void swim(int l) {
        System.out.println(name + " не умеет плавать! ");
    }

    @Override
    public void run(int l) {
        if (l >= 201 || l < 0) {
            System.out.println(name + " не может пробежать такое расстояние");
        } else {
            super.run(l);
        }
    }

    @Override
    public void jump(int h) {
        if (h > 2) {
            System.out.println(name + " не может прыгнуть так высоко");
        }
        if (h < 0) {
            System.out.println(name + " не хочет прыгать");
        } else {
            super.jump(h);
        }
    }

    @Override
    public void jump(double h) {
        if (h >= 2.1) {
            System.out.println(name + " не может прыгнуть так высоко");
        }
        if (h < 0) {
            System.out.println(name + " не хочет прыгать");
        } else {
            super.jump(h);
        }
    }
}
