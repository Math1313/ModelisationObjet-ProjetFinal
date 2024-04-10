public class Main
{
    public static void main(String[] args)
    {
        //Centre testCentre = new Centre();
//        for(Chambre chambre: testCentre.getListeChambre())
//        {
//            chambre.afficherInfo();
//        }
        Organisme organisme = new Organisme();
        organisme.listeCentres.get(0).getListeChambre().get(14).afficherInfo();
        //System.out.println(testCentre.getListeChambre().size());
    }
}