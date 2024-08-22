import java.util.ArrayList;

public class Retirer_elements {
    public static void suppression(ArrayList<Integer> entier ,int n)
    {
        if(entier.contains(n))
        {
            entier.remove(Integer.valueOf(n));
            System.out.println("voici les elements de la liste à prés suppression ");
            for(int i=0; i<entier.size();i++)
            {
                System.out.println(entier.get(i));
            }
        }
        else
        {
            System.out.println("Cet Eléments ne se trouve pas dans la Liste");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer >entier  = new ArrayList<>() ;
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
       suppression(entier,2);
       suppression(entier,200);
    }
}
