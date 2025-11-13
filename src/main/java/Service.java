import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private final String FILE_NAME = "db.txt";

    public void addStudent(Student student) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(student.getImie() + ";" + student.getWiek() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String imie = parts[0];
                int wiek = Integer.parseInt(parts[1]);
                list.add(new Student(imie, wiek));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }
}
