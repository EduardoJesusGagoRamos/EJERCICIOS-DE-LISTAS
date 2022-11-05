package EJERCICIO_02;
//@author GAGO RAMOS EDUARDO JESÚS

public class Principal {

    public static void main(String[] args) {
        Lista lista1 = new Lista();
        lista1.insertarInicio(26);
        lista1.insertarInicio(50);
        lista1.insertarInicio(34);
        lista1.insertarInicio(37);
        lista1.insertarInicio(21);
        lista1.insertarInicio(10);
        lista1.insertarFinal(100);
        System.out.println("Numeros Pares de la lista: " + lista1.Pares());
        System.out.println(lista1.Mostrar());
        System.out.println(lista1);
        lista1.eliminarInicio();
        System.out.println(lista1);
        lista1.eliminarUltimo();
        System.out.println(lista1);
        System.out.println(lista1.Mostrar());
    }

}
