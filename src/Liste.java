import java.util.ArrayList;

public class Liste {
    public static void main(String[] args) {

        ArrayList<String> food  = new ArrayList<>() ; // ma liste sera nommé par food

        // pour ajouter des éléments un par un
        food.add("Couscous");
        food.add("Tagine");
        food.add("Harira");

        // pour affcher les élements de la liste
        System.out.println("les élements de la liste sont :");
        for (int i=0; i<food.size();i++)
        {
            System.out.println(food.get(i));
        }

    }
}
