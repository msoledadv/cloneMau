package coleccionesejercicio005;

import coleccionesejercicio005.entidades.Pais;
import coleccionesejercicio005.servicios.ServicioPais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ColeccionesEjercicio005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        Set<Pais> hashPais = new HashSet<>();
        ServicioPais sp = new ServicioPais();

        String respuesta;
        do {
            sp.cargarPais(hashPais);
            System.out.println("Quiere ingresar otro pais? S/N");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));

        System.out.println("PAISES INGRESADOS:");
        sp.mostrarPais(hashPais);

        List<Pais> listaPais = new ArrayList<>(hashPais);
        Collections.sort(listaPais, ServicioPais.ordenarAlfabetico);
        System.out.println("------------");
        System.out.println("Paises ordenados alfabeticamente:");
        sp.mostrarPaisLista(listaPais);

        System.out.println("------------");
        do {
            sp.buscarYEliminarPaisLista(listaPais);
            System.out.println("------------");
            System.out.println("Lista actual:");
            sp.mostrarPaisLista(listaPais);
            System.out.println("Quieres remover otro pais? S/N");
            respuesta = sc.next();
        } while (respuesta.equalsIgnoreCase("s"));
            System.out.println("------------");
            System.out.println("Lista actual:");
            sp.mostrarPaisLista(listaPais);
    }

}
