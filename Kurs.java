public class Kurs {
    private String nazwa;
    private PracownikBD prowadzacy;
    private int punktyECTS;

    public Kurs(String nazwa, PracownikBD prowadzacy, int punktyECTS) {
        this.nazwa = nazwa;
        this.prowadzacy = prowadzacy;
        this.punktyECTS = punktyECTS;
    }
    public Kurs() {
        this.nazwa = "domyslny kurs";
        this.prowadzacy = new PracownikBD();
        this.punktyECTS = 0;
    }

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public PracownikBD getProwadzacy() {
        return prowadzacy;
    }
    public void setProwadzacy(PracownikBD prowadzacy) {
        this.prowadzacy = prowadzacy;
    }
    public int getPunktyECTS() {
        return punktyECTS;
    }
    public void setPunktyECTS(int punktyECTS) {
        this.punktyECTS = punktyECTS;
    }

    public String toString() {
        return (nazwa + " | prowadzący: " + prowadzacy.getImie() + " " + prowadzacy.getNazwisko() + " | ECTS: " + punktyECTS);
    }
}
