package coleccionesejercicio005.servicios;

import coleccionesejercicio005.entidades.Pais;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ServicioPais {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void cargarPais(Set<Pais> hashPais) {
        Pais p = new Pais();
        System.out.println("Nombre del pais a agregar");
        p.setNombre(sc.next().toUpperCase());
        hashPais.add(p);
    }

    public void mostrarPais(Set<Pais> hashPais) {
        for (Pais pais : hashPais) {
            System.out.println(pais);
        }
    }

    public void mostrarPaisLista(List<Pais> lp){
        for (int i = 0; i < lp.size(); i++) {
            System.out.println(lp.get(i).toString());
        }
    }
    
    public static Comparator<Pais> ordenarAlfabetico = new Comparator<Pais>() {
        @Override
        public int compare(Pais p1, Pais p2) {
            return p2.getNombre().compareTo(p1.getNombre());
        }
    };
}
