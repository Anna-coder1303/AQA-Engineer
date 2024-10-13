package lesson3.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> book;

    public PhoneBook(){
        this.book = new HashMap<>();
    }

    public void add(String surname, String number){
        if(book.containsKey(surname)){
            List<String> numbers = book.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
            } else {
                System.out.println(String.format("Номер %s уже существует для фамилии %s", number, surname));
            }
        } else {
            book.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер %s добавлен для фамилии %s", number, surname));
        }
    }

    public List<String> get(String surname){
        if(book.containsKey(surname)){
            return book.get(surname);
        } else {
            System.out.println(String.format("В справочнике нет записи для фамилии %s", surname));
            return new ArrayList<>();
        }
    }
}
class MainClass {
    public static void main(String[] args){
        System.out.println("Создаем телефонный справочник");
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Иванов", "22334455");
        phonebook.add("Иванов", "22334411");
        phonebook.add("Петров", "22334499");
        phonebook.add("Сидоров", "22334488");
        phonebook.add("Иванов", "22334422");
        System.out.println("-----------------");

        System.out.println("Ищем номера");
        System.out.println("Иванов");
        System.out.println(phonebook.get("Иванов"));
        System.out.println("Петров");
        System.out.println(phonebook.get("Петров"));
        System.out.println("Сидоров");
        System.out.println(phonebook.get("Сидоров"));
        System.out.println("-----------------");

        System.out.println("Запись в справочнике отсуствует:");
        System.out.println("Донцов");
        System.out.println(phonebook.get("Донцов"));
    }
}