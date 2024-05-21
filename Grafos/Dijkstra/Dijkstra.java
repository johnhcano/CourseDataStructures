import java.util.PriorityQueue;
import java.util.List;

/**
 * Clase que contiene la implementación del algoritmo de Dijkstra.
 */
public class Dijkstra {

    /**
     * Implementación del algoritmo de Dijkstra para encontrar el camino más corto en un grafo.
     * @param grafo Lista de nodos que componen el grafo.
     * @param nodoInicial Nodo desde el cual se calculan las distancias más cortas.
     */
    public static void dijkstra(List<Nodo> grafo, Nodo nodoInicial) {
        // Inicializa la distancia del nodo inicial a 0
        nodoInicial.distancia = 0;

        // Cola de prioridad para almacenar los nodos y extraer siempre el nodo con menor distancia
        PriorityQueue<Nodo> colaPrioridad = new PriorityQueue<>();

        // Añade el nodo inicial a la cola de prioridad
        colaPrioridad.add(nodoInicial);

        // Bucle principal del algoritmo de Dijkstra
        while (!colaPrioridad.isEmpty()) {
            // Extrae el nodo con menor distancia de la cola de prioridad
            Nodo nodoActual = colaPrioridad.poll();

            // Verifica si el nodo actual ya ha sido visitado
            if (!nodoActual.visitado) {
                // Marca el nodo como visitado
                nodoActual.visitado = true;

                // Itera sobre todos los vecinos del nodo actual
                for (Arista arista : nodoActual.vecinos) {
                    // Obtiene el nodo vecino a través de la arista
                    Nodo vecino = arista.destino;

                    // Calcula la distancia temporal desde el nodo actual hasta el vecino
                    int distanciaTemporal = nodoActual.distancia + arista.peso;

                    // Si la distancia temporal es menor que la distancia almacenada en el vecino
                    if (distanciaTemporal < vecino.distancia) {
                        // Actualiza la distancia del vecino
                        vecino.distancia = distanciaTemporal;

                        // Actualiza el nodo previo del vecino
                        vecino.previo = nodoActual;

                        // Añade el vecino a la cola de prioridad
                        colaPrioridad.add(vecino);
                    }
                }
            }
        }
    }
}