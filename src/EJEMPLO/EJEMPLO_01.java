package EJEMPLO;

import java.util.ArrayList;

/**
 *
 * @author EDUARDO
 */
public class EJEMPLO_01 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();

        lista.add("hola");
        lista.add("que");
        lista.add("tal");
        lista.add("estas");
        lista.add("hoy");

        for (int i = 0; i < lista.size(); i++) {

            System.out.println(lista.get(i));

        }

    }
}
