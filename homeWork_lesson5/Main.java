package homeWork_lesson5;

public class Main {
    public static void main(String[] args) {




        Staff[] staffArray = new Staff[]{
                new Staff("Ivanov Petr", "Manager", "ivanov@mail.ru", 89163423434l, 50000, 27),
                new Staff("Katov Petr", "Manager", "katov@mail.ru", 89143412781l, 50000, 31),
                new Staff("Kirov Oleg", "Seiner Manager", "kirov@mail.ru", 89253788998l, 90000, 41),
                new Staff("Ribin Mickhail", "Supervisor", "Ribin@mail.ru", 89267776655l, 150000, 45),
                new Staff("Orov Dmitriy", "Curator", "orov@mail.ru", 89197576632l, 200000, 49)
        };



        for (int i = 0; i < staffArray.length; i++) {

            if(staffArray[i].getAge()> 40){
                staffArray[i].info();
            }
        }


    }
}
