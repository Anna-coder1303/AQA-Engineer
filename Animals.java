import java.util.Scanner;
class Animal {
    static int countAnimal = 0;
    Animal(){
        countAnimal++;
    }

    static void run (int range) {
        System.out.println("Животное пробежало " + range + " м");
    }

    static void swim (int range){
        System.out.println("Животное проплыло " + range + " м");
    }

    static int getCountAnimal() {
        return countAnimal;
    }
}
class Plate {
    int food;
    Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    public void increaseFood(int x) {
        food += x;
    }
    public void info() {
        System.out.println("Всего еды: " + food);
    }
    public void addFood(int y) {
        if (y > 0) {
            food += y;
            System.out.println("В миску добавлено " + y + " еды");
        }
    }

}

class Cat extends Animal{
    static String name;
    int appetite;
    boolean fullness;
    static int countCat = 0;

    Cat (String name, int appetite, boolean fullness) {
        super();
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
        countCat += 1;
    }

    static void run(int range) {
        if (range > 200) {
            System.out.println(name + " не может пробежать больше 200 м");
        } else {
            System.out.println(name + " пробежал " + range + " м");
        }
    }
    void eat(Plate plate) {
        plate.decreaseFood(appetite);
        fullness = true;

    }

    static void swim(int range) {
        System.out.println("Кот не умеет плавать");
    }

    static int getCountCat(){
        return countCat;
    }
}

class Dog extends Animal{
    static String name;
    static int countDod = 0;

    Dog(String name){
        super();
        countDod += 1;
        Dog.name = name;
    }


    static void run(int range) {
        if (range > 500) {
            System.out.println(name+ " не может пробежать больше 500 м");
        } else {
            System.out.println(name+ " пробежал " + range + " м");
        }

    }


    static void swim(int range) {
        if (range > 10) {
            System.out.println("Собака не может проплыть больше " +range+ " м");
        } else {
            System.out.println(name + " проплыл " + range + " m");
        }
    }

    static int getCountDod (){
        return countDod;
    }
}

public class Animals {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Dog tuzik = new Dog("Тузик");
        Cat barsic = new Cat("Барсик", 5, false);
        Cat.run(150);
        Cat.swim(50);
        Dog.run(500);
        Dog.swim(501);

        System.out.println("Всего животных участвовало: " + Animal.getCountAnimal());
        System.out.println("Всего котов: " + Cat.getCountCat());
        System.out.println("Всего собак: " + Dog.getCountDod());

        int action;
        Cat[] allCats = new Cat[4];
        allCats[0] = new Cat("Барсик", 5, false);
        allCats[1] = new Cat("Мурзик", 30, false);
        allCats[2] = new Cat("Манька", 10, false);
        allCats[3] = new Cat("Беляк", 45, false);

        Plate plate = new Plate(50);
        plate.info();

        for (int i = 0; i < allCats.length; i++) {
            if (!allCats[i].fullness && allCats[i].appetite <= plate.food) {
                allCats[i].eat(plate);
                allCats[i].fullness = true;
                System.out.println("Кот " + allCats[i].name + " покушал!");
            } else {
                System.out.println("Кот " + allCats[i].name + " остался голоден!");
            }
        }

        plate.addFood(20);
        System.out.println("Нужно еще добавить вискаса в миску?");
        action = sc.nextInt();
        plate.increaseFood(action);
        plate.info();
    }

}