public class HomeWork5 {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Kharitonova Ksenia Alekseevna", "teacher", "kharitonova@yandex.ru", "+79012223344", 30000, 28),
        new Employee("Barova Elena Alexandrovna", "speech therapist", "barova@yandex.ru", "+79022223344", 40000, 41),
        new Employee("Startceva Olga Alexandrovna", "manager", "startceva@yandex.ru", "+79034445566", 50000, 48),
        new Employee("Tudvaseva Anastasia Nikolaevna", "secretary", "tudvaseva@yandex.ru", "+79045556677", 25000, 35),
        new Employee("Novoselova Anna Viktorovna", "psihologist", "novoselova@yandex.ru", "+79056667788", 40000, 31)
    };
        int minAge = 40;
        for (Employee employee : employees)
        {
            if (employee.age > minAge)
            {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}

