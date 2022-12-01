import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> ludzie = new ArrayList<Osoba>();
        List<Kurs> kursy = new ArrayList<Kurs>();

        ludzie.add(new Student());
        ludzie.add(new PracownikBD());
        ludzie.add(new PracownikAdmin());
        Student JK = new Student("Jan", "Kowalski", "02038478938", 21, 'M', 273806, 1, new ArrayList<Kurs>(), false, true, true);
        ludzie.add(JK);
        Student AS = new Student("Anna", "Sp.zoo", "84993239020", 45, 'F', 380639, 2, new ArrayList<Kurs>(), true, false, false);
        ludzie.add(AS);
        ludzie.add(new Student("Anna", "2", "22223239020", 13, 'F', 280639, 2, new ArrayList<Kurs>(), true, true, false));

        ludzie.add(new PracownikAdmin("Wilhelm", "Admilinstrator", "76455287020", 60, 'K', "Referent", 5, 3000, 14));
        PracownikAdmin W2 = new PracownikAdmin("Klon", "Wilhelma", "76433287021", 60, 'K', "Specjalista", 5, 4000, 15);
        ludzie.add(W2);

        PracownikBD FP = new PracownikBD("Frank", "Podłoga", "54569200020", 54, 'M', "Wykładowca", 17, 6000, 45);
        ludzie.add(FP);
        PracownikBD KM = new PracownikBD("Krzysztof", "Materac", "14855229620", 38, 'M', "Asystent", 7, 4000, 2);
        ludzie.add(KM);

        kursy.add(new Kurs("psio", FP, 3));
        kursy.add(new Kurs("fizyak", FP, 4));
        kursy.add(new Kurs());
        JK.addKurs(kursy.get(0));

        //wypisz by typ
        {
            //wypiszStudentow(ludzie);
            //wypiszPracowników(ludzie);
            //wypiszKursy(kursy);
        }
        //szukajki
        {
            //wypiszStudentow(szukajStudentaID(ludzie, 380639));
            //wypiszStudentow(szukajStudentaID(ludzie, 5));
            //wypiszStudentow(szukajStudentaRok(ludzie, 2));

            //wypiszPracowników(szukajPracownikaNazwisko(ludzie, "Materac"));
            //wypiszPracowników(szukajPracownikaNazwisko(ludzie, "Kowalski"));

            //wypiszKursy(szukajKursuNazwa(kursy,"psio"));
            //wypiszKursy(szukajKursuNazwa(kursy,"osk"));
            //wypiszKursy(szukajKursuProwadzacy(kursy, FP));
        }
    }
    public static void wypiszStudentow(List<Osoba> ludzie){
        //System.out.println("studenci: ");
        for(Osoba o : ludzie){
            if(o instanceof Student) System.out.println(o.toString());;
        }
    }
    public static void wypiszPracowników(List<Osoba> ludzie){
        //System.out.println("pracownicy: ");
        for(Osoba o : ludzie){
            if(o instanceof PracownikUczelni) System.out.println(o.toString());;
        }
    }
    public static void wypiszKursy(List<Kurs> kursy){
        //System.out.println("kursy: ");
        for(Kurs k : kursy){
            System.out.println(k.toString());;
        }
    }

    public static List<Osoba> szukajStudentaID(List<Osoba> ludzie, int indeks){
        List<Osoba> output = new ArrayList<Osoba>();
        int found = 0;
        for(Osoba o : ludzie){
            if(o instanceof Student && ((Student) o).getNrIndeksu() == indeks) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajStudentaNazwisko(List<Osoba> ludzie, String nazwisko){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof Student && o.getNazwisko().equals(nazwisko)) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajStudentaImie(List<Osoba> ludzie, String imie){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof Student && o.getImie().equals(imie)) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajStudentaRok(List<Osoba> ludzie, int rok){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof Student && ((Student) o).getRokStudiow()==rok) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajStudentaKurs(List<Osoba> ludzie, String kurs){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof Student && ((Student) o).getKursy().contains(szukajKursuNazwa(((Student) o).getKursy(), kurs).get(0))) output.add(o);
        }
        return output;
    }

    public static List<Osoba> szukajPracownikaNazwisko(List<Osoba> ludzie, String nazwisko){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof PracownikUczelni && o.getNazwisko().equals(nazwisko)) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajPracownikaImie(List<Osoba> ludzie, String imie){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof PracownikUczelni && o.getImie().equals(imie)) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajPracownikaStanowisko(List<Osoba> ludzie, String stanowisko){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof PracownikUczelni && ((PracownikUczelni) o).getStanowisko().equals(stanowisko)) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajPracownikaStaz(List<Osoba> ludzie, int staz){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof PracownikUczelni && ((PracownikUczelni) o).getStaz()==staz) output.add(o);
        }
        return output;
    }
    public static List<Osoba> szukajPracownikaPensja(List<Osoba> ludzie, int pensja){
        List<Osoba> output = new ArrayList<Osoba>();
        for(Osoba o : ludzie){
            if(o instanceof PracownikUczelni && ((PracownikUczelni) o).getPensja()==pensja) output.add(o);
        }
        return output;
    }

    public static List<Kurs> szukajKursuNazwa(List<Kurs> kursy, String nazwa){
        List<Kurs> output = new ArrayList<Kurs>();
        for(Kurs k : kursy){
            if(k.getNazwa().equals(nazwa)) output.add(k);
        }
        return output;
    }
    public static List<Kurs> szukajKursuProwadzacy(List<Kurs> kursy, PracownikBD o){
        List<Kurs> output = new ArrayList<Kurs>();
        for(Kurs k : kursy){
            if(k.getProwadzacy().equals(o)) output.add(k);
        }
        return output;
    }
    public static List<Kurs> szukajKursuECTS(List<Kurs> kursy, int ECTS){
        List<Kurs> output = new ArrayList<Kurs>();
        for(Kurs k : kursy){
            if(k.getPunktyECTS() == ECTS) output.add(k);
        }
        return output;
    }
}