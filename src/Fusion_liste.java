import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Fusion_liste {
    public  static void fusion(ArrayList<Integer > entier,ArrayList<Integer > entier2)
    {
        ArrayList<Integer > total  = new ArrayList<>() ;
        // fusion des elements
        total.addAll(entier);
        total.addAll(entier2);
        System.out.println("affichage de la liste fusionées ");
        for(int i=0; i<total.size();i++)
        {
            System.out.println(total.get(i));
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer > entier  = new ArrayList<>() ;
        entier.add(1);
        entier.add(2);
        entier.add(3);
        ArrayList<Integer > entier2  = new ArrayList<>() ;
        entier2.add(21);
        entier2.add(22);
        entier2.add(23);
        fusion(entier,entier2);
    }
}
