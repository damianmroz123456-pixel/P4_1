public class Student {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String kierunek;
    public Student(String imie, String nazwisko, int wiek, String kierunek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.kierunek = kierunek;
    }
    public String getImie() {
        return imie;
    }
    public String getNazwisko() {
        return nazwisko;
    }
    public int getWiek() {
        return wiek;
    }
    public String getKierunek() {
        return kierunek;
    }
    @Override
    public String toString() {
        return imie + " " + nazwisko + " (" + wiek + " lat), kierunek: " + kierunek;
    }
}