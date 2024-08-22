import java.util.ArrayList;
import java.util.Arrays;

public class tableau_to_list {

        public static void conversion(int[] tab) {
            // Convertir le tableau en ArrayList
            //ArrayList<Integer> convertie le tab en ArrayList d'objets
            ArrayList<Integer> list = new ArrayList<>(
                    Arrays.asList(Arrays.stream(tab).boxed().toArray(Integer[]::new))
            );

            // Afficher les éléments de la liste
            System.out.println("Éléments de la liste :");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

        public static void main(String[] args) {
            // Déclaration du tableau
            int[] tab = {1, 2, 3, 4, 5};
            conversion(tab);
        }
    }
