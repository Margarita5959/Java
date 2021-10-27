public class Employee {
    String name;
    String position;
    String email;
    String phone;
    int salary;
    int age;


    Employee(String name,
             String position,
             String email,
             String phone,
             int salary,
             int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void printInfo() {
        System.out.println("ФИО: " + name);
        System.out.println("Должность: " + position);
        System.out.println("e-mail: " + email);
        System.out.println("Тел.: " + phone);
        System.out.println("ЗП: " + salary);
        System.out.println("Возраст: " + age);
    }
}

