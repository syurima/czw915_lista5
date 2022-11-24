abstract public class Osoba {
    private String imie;
    private String nazwisko;
    private String pesel;
    private int wiek;
    private char plec;

    public Osoba() {
        this.imie = "imie";
        this.nazwisko = "nazwisko";
        this.pesel = "pesel";
        this.wiek = 0;
        this.plec = 'N';
    }
    public Osoba(String imie, String nazwisko, String pesel, int wiek, char plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.wiek = wiek;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }
    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }
    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }
    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public char getPlec() {
        return plec;
    }
    public void setPlec(char plec) {
        this.plec = plec;
    }


    public boolean equals(Osoba o) {
        return this.pesel.equals(o.getPesel());
    }
}
