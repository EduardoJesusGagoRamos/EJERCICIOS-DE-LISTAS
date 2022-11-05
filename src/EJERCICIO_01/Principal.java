package EJERCICIO_01;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GAGO RAMOS EDUARDO JESÚS
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Persona> lis_persona = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Persona per = new Persona();
            per.setCodigo(i);
            per.setNombre("Walter " + i);
            per.setApellido("Apellido " + i);
            per.setEdad(25 + i);
            lis_persona.add(per);
        }

        System.out.println("Tamano de Lista: " + lis_persona.size());

        for (Persona p : lis_persona) {
            System.out.println("Codigo: " + p.getCodigo());
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Edad: " + p.getEdad());
            System.out.println("----------------------------------------");
        }
    }

}
