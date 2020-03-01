package homeWork_lesson6.animals;

public class Dog extends Animal {
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int l) {
        if (l >= 501 || l < 0) {
            System.out.println(name + " не может пробежать такое расстояние");
        } else {
            super.run(l);
        }
    }

    @Override
    public void jump(int h) {
        System.out.println(name + " не может прыгнуть так высоко");
    }

    @Override
    public void jump(double h) {
        if (h >= 0.6) {
            System.out.println(name + " не может прыгнуть так высоко");
        }
        if (h < 0) {
            System.out.println(name + " не хочет прыгать");
        } else {
            super.jump(h);
        }
    }

    @Override
    public void swim(int l) {
        if (l >= 11 || l < 0) {
            System.out.println(name + " не может проплыть такое расстояние");
        } else {
            super.swim(l);
        }


    }
}
