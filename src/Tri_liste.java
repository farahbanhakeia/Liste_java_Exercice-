import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Tri_liste
{
    public static void main(String[] args) {
        ArrayList<Integer > entier  = new ArrayList<>() ;
        entier.add(1);
        entier.add(2);
        entier.add(3);
        entier.add(23);
        entier.add(4);
        entier.add(6);
        entier.add(5);
        entier.add(43);
        entier.add(60);
        entier.add(25);
        entier.add(13);
      // tri des élements de la liste
        System.out.println("Elements de la liste trier ordre croissant ");
        Collections.sort(entier);
        for(int i=0; i<entier.size();i++)
        {
            System.out.println(entier.get(i));
        }

        System.out.println("Elements de la liste trier ordre décroissant ");
        Collections.sort(entier, Comparator.reverseOrder());
        for(int i=0; i<entier.size();i++)
        {
            System.out.println(entier.get(i));
        }
    }
}
