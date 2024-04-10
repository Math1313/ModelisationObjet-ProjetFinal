import java.time.LocalDate;
import java.util.*;

public class Centre {
    private ArrayList<Chambre> listeChambres = new ArrayList<>();

    public Centre()
    {
        for(int i = 0; i < 21; i++)
        {
            Chambre nouvelleChambre = new Chambre(4, i);
            nouvelleChambre.ajouterDisponibilite(LocalDate.now(), LocalDate.now(), 25);
            nouvelleChambre.ajouterDisponibilite(LocalDate.now(), LocalDate.now(), 30);
            nouvelleChambre.ajouterDisponibilite(LocalDate.now(), LocalDate.now(), 40);

            this.listeChambres.add(nouvelleChambre);
        }
    }

    public ArrayList<Chambre> getListeChambre()
    {
        return this.listeChambres;
    }

}
