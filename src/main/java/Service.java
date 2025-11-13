import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class Service {
    private final String FILE_NAME = "db.txt";
    public void addStudent(Student student) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(FILE_NAME, true);
            fw.write(student.getImie() + ";" +
                     student.getNazwisko() + ";" +
                     student.getWiek() + ";" +
                     student.getKierunek() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fw != null) try { fw.close(); } catch (IOException ignored) {}
        }
    }
    public List<Student> getAllStudents() {
        List<Student> list = new ArrayList<Student>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(FILE_NAME));
            String line;
            while ((line = br.readLine()) != null) {
                String[] p = line.split(";");
                if (p.length == 4) {
                    String imie = p[0];
                    String nazwisko = p[1];
                    int wiek = Integer.parseInt(p[2]);
                    String kierunek = p[3];
                    list.add(new Student(imie, nazwisko, wiek, kierunek));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) try { br.close(); } catch (IOException ignored) {}
        }
        return list;
    }
}