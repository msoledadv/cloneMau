package coleccionesejercicio005;

import coleccionesejercicio005.entidades.Pais;
import coleccionesejercicio005.servicios.ServicioPais;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class ColeccionesEjercicio005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Set<Pais> hashPais = new HashSet<>();
        ServicioPais sp = new ServicioPais();
        
        String crearPais;
        do {
            sp.cargarPais(hashPais);
            System.out.println("Quiere ingresar otro pais? S/N");
            crearPais = sc.next();
        } while (crearPais.equalsIgnoreCase("s"));
        
        System.out.println("PAISES INGRESADOS:");
        
        sp.mostrarPais(hashPais);
    }

}
