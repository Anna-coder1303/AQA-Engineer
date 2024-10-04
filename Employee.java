public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone_number;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployeeInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Email: " + email);
        System.out.println("Телефон: " + phone_number);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Иван Иванович","Директор","123@mail.ru","+123231231212",5000,36);
        employee[1] = new Employee("Иванов Кирилл Иванович","Бухгалтер","1234@mail.ru","+123231231213",4000,40);
        employee[2] = new Employee("Иванов Олег Иванович","Менеджер","1235@mail.ru","+123231231214",3000,38);
        employee[3] = new Employee("Иванов Леонид Иванович","Юрист","1236@mail.ru","+123231231215",2000,26);
        employee[4] = new Employee("Иванов Тимофей Иванович","Экономист","1237@mail.ru","+123231231216",1500,35);
        for (int i = 0; i < employee.length; i++) {
            employee[i].printEmployeeInfo();
            System.out.print("\n");
        }
    }
}

