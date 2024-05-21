
import java.util.*;

/**
 * Clase que representa un nodo en un grafo.
 */
class Nodo implements Comparable<Nodo> {
    // Identificador único del nodo
    public int id;

    // Distancia más corta conocida desde el nodo inicial hasta este nodo
    public int distancia = Integer.MAX_VALUE;

    // Indica si este nodo ha sido visitado durante el algoritmo de Dijkstra
    public boolean visitado = false;

    // Referencia al nodo previo en el camino más corto desde el nodo inicial
    public Nodo previo = null;

    // Lista de aristas que conectan este nodo con otros nodos
    public List<Arista> vecinos = new ArrayList<>();

    /**
     * Constructor para inicializar un nodo con un identificador único.
     * @param id Identificador único del nodo
     */
    public Nodo(int id) {
        this.id = id;
    }

    /**
     * Método para comparar este nodo con otro nodo basado en sus distancias.
     * Este método es necesario para ordenar los nodos en la cola de prioridad.
     * @param otro El otro nodo con el que comparar
     * @return Un entero negativo, cero o un entero positivo si la distancia de este nodo
     *         es menor, igual o mayor que la distancia del otro nodo, respectivamente.
     */
    @Override
    public int compareTo(Nodo otro) {
        return Integer.compare(this.distancia, otro.distancia);
    }
}
