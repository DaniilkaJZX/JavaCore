package homeWork_lesson6.animals;

public  class Animal {
    protected String name;
    protected String color;
    protected int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void run(int l) {
        System.out.println(name + " пробежал " + l + " метров");

    }

    public void swim(int l) {
        System.out.println(name + " проплыл " + l +" метров");
    }

    public  void jump(int h){
        System.out.println(name+" подпрыгнул на " + h + " метр(а) в высоту");
    }

    public  void jump(double h){
        System.out.println(name+" подпрыгнул на " + h + " метр(а) в высоту");
    }




}
