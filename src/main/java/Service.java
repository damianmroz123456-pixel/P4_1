import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Service {

    private final String FILE_NAME = "db.txt";

    public void addStudent(Student student) {
        FileWriter fw = null;

        try {
            fw = new FileWriter(FILE_NAME, true);
            fw.write(student.getImie() + ";" + student.getWiek() + "\n");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (fw != null) {
                try { fw.close(); } catch (IOException ignored) {}
            }
        }
    }

    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<Student>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            String line;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");

                if (parts.length == 2) {

                    String imie = parts[0];
                    int wiek = Integer.parseInt(parts[1]);

                    list.add(new Student(imie, wiek));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            if (br != null) {
                try { br.close(); } catch (IOException ignored) {}
            }
        }

        return list;
    }
}
