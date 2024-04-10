import java.util.ArrayList;

public class Organisme {
    public ArrayList<Centre> listeCentres = new ArrayList<>();
    private ArrayList<Campus> listeCampus = new ArrayList<>();

    Organisme()
    {
        Centre centre = new Centre();
        listeCentres.add(centre);
    }
}
