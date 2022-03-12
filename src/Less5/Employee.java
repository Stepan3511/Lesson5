package Less5;

public class Employee {

    String FIO;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public Employee() {
        FIO = "";
        position = "";
        email = "";
        phoneNumber = "";
        salary = 0;
        age = 0;
    }

    public Employee(String FIO, String position, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + FIO + "Профессия: " + position + "Емейл: " + email + "Номер телефона: " + phoneNumber + "Зарплата: " + salary + "Возраст: " + age);
    }

    public int getAge() {
        return age;
    }

    public void printInfo(boolean string) {
        if (string)
            System.out.println("ФИО: " + FIO + "Профессия: " + position + "Емейл: " + email + "Номер телефона: " + phoneNumber + "Зарплата: " + salary + "Возраст: " + age);
    }

}


