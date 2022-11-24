import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Osoba> ludzie = new ArrayList<Osoba>();
        ludzie.add(new Student());
        Student JK = new Student("Jan", "Kowalski", "02038478938", 21,'M', 273806,1,new ArrayList<Kurs>(),false,true,true);
        Student AS= new Student("Anna", "Sp.zoo", "84993239020", 45,'F', 380639,2,new ArrayList<Kurs>(),true,false,false);

        ludzie.add(JK);

        List<Kurs> kursy = new ArrayList<Kurs>();
    }
}