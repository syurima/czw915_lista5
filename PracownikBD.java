public class PracownikBD extends PracownikUczelni {
    //{ Asystent, Adiunkt, Profesor Nadzwyczajny, Profesor Zwyczajny, Wykładowca }
    private int liczbaPublikacji;

    public PracownikBD() {
        super();
        this.liczbaPublikacji = liczbaPublikacji;
    }
    public PracownikBD(String imie, String nazwisko, String pesel, int wiek, char plec, String stanowisko, int staz, int pensja, int liczbaPublikacji) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, staz, pensja);
        this.liczbaPublikacji = liczbaPublikacji;
    }

    public int getLiczbaPublikacji() {
        return liczbaPublikacji;
    }
    public void setLiczbaPublikacji(int liczbaPublikacji) {
        this.liczbaPublikacji = liczbaPublikacji;
    }

    public String toString() {
        return ("pracownik badawczo-dydaktyczny | " + super.toString() + ", liczba publikacji: " + liczbaPublikacji);
    }
}
