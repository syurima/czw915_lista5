public class PracownikAdmin extends PracownikUczelni{

    //{Referent, Specjalista, Starszy Specjalista, …}
    private int nadgodziny;

    public PracownikAdmin() {
        super();
        this.nadgodziny = 0;
    }
    public PracownikAdmin(String imie, String nazwisko, String pesel, int wiek, char plec, String stanowisko, int staz, int pensja, int nadgodziny) {
        super(imie, nazwisko, pesel, wiek, plec, stanowisko, staz, pensja);
        this.nadgodziny = nadgodziny;
    }
}
