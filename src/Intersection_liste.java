import java.util.ArrayList;

public class Intersection_liste {
    public  static void intersection(ArrayList<Integer > entier, ArrayList<Integer > entier2)
    {
        ArrayList<Integer > total  = new ArrayList<>(entier) ; // total sera un clonn de list entier
        // fusion des elements
        total.retainAll(entier2); // total sera remplacer par les commenu entre entier(qui est lui) et entier 2
        System.out.println("elements commun ");
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
        entier.add(22);
        entier.add(12);
        entier.add(23);

        ArrayList<Integer > entier2  = new ArrayList<>() ;
        entier2.add(21);
        entier2.add(22);
        entier2.add(1);
        entier2.add(2);
        entier2.add(23);
        intersection(entier,entier2);

    }
}
