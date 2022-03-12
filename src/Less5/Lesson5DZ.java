package Less5;

public class Lesson5DZ {
    public static void main(String[] args) {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Богданова Мария Генадиевна", "Зам директора", "mary@mailbox.com", "89145051213", 15000, 25);
        employees[1] = new Employee("Борисов Константин Николаевич", "Водитель-курьер", "kostya@mailbox.com", "8245112312", 35000, 51);
        employees[2] = new Employee("Бушмакина Марина Аркадиевна", "Глав бух", "marina@mailbox.com", "89145000000", 60000, 45);
        employees[3] = new Employee("Шавейко Степан Владимирович", "Генеральный директор", "stepan@mailbox.com", "89145003511", 130000, 34);
        employees[4] = new Employee("Куйдина Наталья Матвеевна", "Повар", " aaliyah@mailbox.com", "89145503555", 45000, 49);
        for (Employee employee : employees)
            if (employee.getAge() >= 40) employee.printInfo(true);


    }
}
