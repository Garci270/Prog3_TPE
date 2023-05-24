package TPE1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ServicioCaminos {

	private GrafoDirigido<?> grafo;
	private int origen;
	private int destino;
	private int lim;
	
	public ServicioCaminos(GrafoDirigido<?> grafo, int origen, int destino, int lim) {
		this.grafo = grafo;
		this.origen = origen;
		this.destino = destino;
		this.lim = lim;
	}
	
	/*La complejidad seria O(N * E * P), donde N es el número de vértices, E es el número de aristas y P es la cantidad de caminos encontrados.*/
	public List<List<Integer>> caminos() {
        List<List<Integer>> caminos = new ArrayList<>();
        List<Integer> caminoActual = new ArrayList<>();
        caminoActual.add(origen);
        encontrarCaminosRecursivo(origen, caminoActual, caminos);
        return caminos;
    }

	/*Esta función es recursiva y se llama para cada vértice adyacente no visitado desde el vértice actual. 
	 * La complejidad sería O(N!), donde N es el número de vértices */
    private void encontrarCaminosRecursivo(int vertice, List<Integer> caminoActual, List<List<Integer>> caminos) {
        if (vertice == destino) {
            caminos.add(new ArrayList<>(caminoActual));
            return;
        }

        if (caminoActual.size() >= this.lim) {
            return;
        }

        Set<Integer> adyacentes = obtenerAdyacentesNoVisitados(vertice, caminoActual);
        for (int adyacente : adyacentes) {
            caminoActual.add(adyacente);
            encontrarCaminosRecursivo(adyacente, caminoActual, caminos);
            caminoActual.remove(caminoActual.size() - 1);
        }
    }
    
    /*Esta función itera sobre los vértices adyacentes al vértice dado y verifica si ya están presentes en el camino actual.
     *  La complejidad seria O(E), donde E es el número de aristas en el grafo*/
    private Set<Integer> obtenerAdyacentesNoVisitados(int vertice, List<Integer> caminoActual) {
        Set<Integer> adyacentes = new HashSet<>();
        Iterator<Integer> it = grafo.getAdyacentes(vertice);
        while (it.hasNext()) {
            int adyacente = it.next();
            if (!caminoActual.contains(adyacente)) {
                adyacentes.add(adyacente);
            }
        }
        return adyacentes;
    }
}