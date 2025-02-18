/**
 * Clase que representa una arista en un grafo.
 * Una arista conecta dos nodos y tiene un peso asociado.
 */
class Arista {
    // Nodo al que apunta la arista
    public Nodo destino;

    // Peso de la arista
    public int peso;

    /**
     * Constructor para inicializar una arista.
     * @param destino Nodo al que apunta la arista
     * @param peso Peso de la arista
     */
    public Arista(Nodo destino, int peso) {
        this.destino = destino;
        this.peso = peso;
    }
}