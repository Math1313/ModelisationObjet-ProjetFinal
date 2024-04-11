import Observer.Observer;

import java.util.ArrayList;

public class Organisme implements Observer
{
    public ArrayList<Centre> listeCentres = new ArrayList<>();
    private ArrayList<Campus> listeCampus = new ArrayList<>();

    Organisme()
    {
//        Centre centre = new Centre();
//        listeCentres.add(centre);
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }
}
