package coleccionesejercicio005.servicios;

import coleccionesejercicio005.entidades.Pais;
import java.util.Comparator;
import java.util.Iterator;
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
            return p1.getNombre().compareTo(p2.getNombre());
        }
    };
    
    public void buscarYEliminarPaisLista(List<Pais> lp){
        System.out.println("Ingrese el pais a remover");
        String buscarPais = sc.next();
        Integer contador = 0;
        Iterator it = lp.iterator();
        while (it.hasNext()) {
            Pais pais = (Pais) it.next();
            if (pais.getNombre().equalsIgnoreCase(buscarPais)) {
                it.remove();
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontro el pais a remover");
        } else {
            System.out.println("El pais " + buscarPais + " se encontro y fue removido de la lista");
            
        }
    }
}
