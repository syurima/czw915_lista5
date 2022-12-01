abstract public class PracownikUczelni extends Osoba{
    private String stanowisko;
    private int staz;
    private int pensja;

    public PracownikUczelni() {
        super();
        this.stanowisko = "stanowisko";
        this.staz = 0;
        this.pensja = 0;
    }
    public PracownikUczelni(String imie, String nazwisko, String pesel, int wiek, char plec, String stanowisko, int staz, int pensja) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.stanowisko = stanowisko;
        this.staz = staz;
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }
    public int getStaz() {
        return staz;
    }
    public void setStaz(int staz) {
        this.staz = staz;
    }
    public int getPensja() {
        return pensja;
    }
    public void setPensja(int pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return super.toString() +  stanowisko  + ", staz: " + staz + ", pensja: " + pensja;
    }
}
