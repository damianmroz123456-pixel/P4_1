import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Service service = new Service();
        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Wyświetl wszystkich studentów");
            System.out.println("0. Wyjście");
            System.out.print("Wybór: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                System.out.print("Imię: ");
                String imie = scanner.nextLine();
                System.out.print("Nazwisko: ");
                String nazwisko = scanner.nextLine();
                System.out.print("Wiek: ");
                int wiek = Integer.parseInt(scanner.nextLine());
                System.out.print("Kierunek studiów: ");
                String kierunek = scanner.nextLine();
                service.addStudent(new Student(imie, nazwisko, wiek, kierunek));
                System.out.println("Student zapisany!");
            } else if (choice.equals("2")) {
                List<Student> students = service.getAllStudents();
                System.out.println("\n--- Lista studentów ---");
                if (students.isEmpty()) {
                    System.out.println("Brak studentów w bazie.");
                } else {
                    for (Student s : students) {
                        System.out.println(s);
                    }
                }
            } else if (choice.equals("0")) {
                System.out.println("Koniec programu.");
                break;
            } else {
                System.out.println("Niepoprawny wybór!");
            }
        }
        scanner.close();
    }
}