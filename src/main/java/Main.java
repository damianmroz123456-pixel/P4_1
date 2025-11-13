import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Service service = new Service();

        System.out.println("Dodaj studenta:");
        System.out.print("Imię: ");
        String imie = scanner.nextLine();

        System.out.print("Wiek: ");
        int wiek = Integer.parseInt(scanner.nextLine());

        Student student = new Student(imie, wiek);
        service.addStudent(student);

        System.out.println("Student zapisany!");
        scanner.close();
    }
}
