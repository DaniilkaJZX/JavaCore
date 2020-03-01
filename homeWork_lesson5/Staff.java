package homeWork_lesson5;

public class Staff {
    private String name;
    private String position;
    private String email;
    private long phone;
    private int salary;
    private int age;



    public Staff() {
    }

    public Staff(String name, String position, String email, long phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void info() {
        System.out.println(name + " \n" + position + " \n" + email + " \n" + "Контакт: " + phone + "\nЗарплата: " + salary + "\nВозраст: " + age);
    }

    public int getAge() {
        return age;
    }
}
