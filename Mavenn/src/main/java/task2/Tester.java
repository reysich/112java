package task2;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname) {
        this(name, surname, 0);
    }

    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Неизвестно");
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = 0.0;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }//

    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }//

    public void setSalary(double salary, double bonus, double tax) {
        this.salary = salary + bonus - tax;
    }//

    // Статический метод
    public static void displayTesterInfo(Tester tester) {
        System.out.println("Имя: " + tester.name + " " + tester.surname);
        System.out.println("Опыт: " + tester.experienceInYears + " лет");
        System.out.println("Уровень английского: " + tester.englishLevel);
        System.out.println("Зарплата: " + tester.salary);
    }
}
