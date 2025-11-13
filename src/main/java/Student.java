public class Student {
    private String imie;
    private int wiek;
    public Student(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
    public String getImie() {
        return imie;
    }
    public int getWiek() {
        return wiek;
    }
    @Override
    public String toString() {
        return imie + " (" + wiek + " lat)";
    }
}