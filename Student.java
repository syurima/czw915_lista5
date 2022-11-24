import java.util.ArrayList;
import java.util.List;

public class Student extends Osoba{
    private int nrIndeksu;
    private int rokStudiow;
    private List<Kurs> kursy;
    private boolean erasmus;
    private boolean stopien1; //stopien2 - false
    private boolean stacjonarny;

    public Student() {
        this.nrIndeksu = nrIndeksu;
        this.rokStudiow = rokStudiow;
        this.kursy = new ArrayList<Kurs>();
        this.erasmus = false;
        this.stopien1 = true;
        this.stacjonarny = true;
    }

    public Student(String imie, String nazwisko, String pesel, int wiek, char plec, int nrIndeksu, int rokStudiow, List<Kurs> kursy, boolean erasmus, boolean stopien1, boolean stacjonarny) {
        super(imie, nazwisko, pesel, wiek, plec);
        this.nrIndeksu = nrIndeksu;
        this.rokStudiow = rokStudiow;
        this.kursy = kursy;
        this.erasmus = erasmus;
        this.stopien1 = stopien1;
        this.stacjonarny = stacjonarny;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }
    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }
    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public List<Kurs> getKursy() {
        return kursy;
    }
    public void setKursy(List<Kurs> kursy) {
        this.kursy = kursy;
    }

    public boolean isErasmus() {
        return erasmus;
    }
    public void setErasmus(boolean erasmus) {
        this.erasmus = erasmus;
    }

    public boolean isStopien1() {
        return stopien1;
    }
    public void setStopien1(boolean stopien1) {
        this.stopien1 = stopien1;
    }

    public boolean isStacjonarny() {
        return stacjonarny;
    }
    public void setStacjonarny(boolean stacjonarny) {
        this.stacjonarny = stacjonarny;
    }
}
