package lesson6;


import lesson6.animals.*;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "White", 3,9);


//        cat.info();
//        cat.jump();
//        cat.sleep();

        Dog dog = new Dog("Tuzik", "black", 2);
//        dog.info();
//        dog.jump();
//        dog.sleep();

//        SuperCat superCat = new SuperCat("Barsik", "White", 4);
        Cow cow = new Cow("Zorka","black",5);

//        cat.voice();
//        dog.voice();
//        cow.voice();

//        Animal animal1 = new Cat("Barsik", "White", 3,9);
//        animal1.voice();
//        ((Cat)animal1).findMouse();
//        Animal animal2 = new Dog("Tuzik", "black", 2);

//        Animal animal3 = new Dog("Tuzik", "black", 2);

//        animal1.voice();
//        animal2.voice();
//        animal3.voice();

//        Animal[] animals= {
//                new Cat("Barsik", "White", 3,9),
//                new Dog("Tuzik", "black", 2),
//                new Cow("Zorka","black",5),
//                new Cat("Murzik", "red", 3,9)
//        };

//        for (int i = 0; i < animals.length ; i++) {
//            animals[i].voice();
//            if (animals[i] instanceof Cat) {
//                ((Cat)animals[i]).findMouse();
//            }

//        }
//        someMethod(new Cat("Barsik", "White", 3,9));

        SuperCat superCat = new SuperCat("Barsik", "White", 4);
        System.out.println(superCat);

        System.out.println(cat);
    }

    static void someMethod(Animal animal){
        animal.jump();
        animal.voice();
        animal.sleep();
    }
}
