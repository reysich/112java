package task2;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester("Кирилл", "Орловский", 5, "High");
        tester.setSalary(1000, 200, 100);
        Tester.displayTesterInfo(tester);
    }
}

