package TPE1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ServicioDFS {

	private GrafoDirigido<?> grafo;

	public ServicioDFS(GrafoDirigido<?> grafo) {
		this.grafo = grafo;
	}
	
	
	/* la función dfsForest() y la función DFSRecursivo() tienen una complejidad computacional de O(V + E). Ya que en el peor caso, se visitan todos los vértices del grafo (V veces) y se exploran todas las aristas (E veces).*/
    public List<Integer> dfsForest() {
        HashSet<Integer> visitados = new HashSet<>();
        List<Integer> resultado = new ArrayList<>();

        Iterator<Integer> vertices = grafo.getVertices();
        while (vertices.hasNext()) {
            int vertice = vertices.next();
            if (!visitados.contains(vertice)) {
                dfsRecursivo(vertice, visitados, resultado);
            }
        }

        return resultado;
    }

    private void dfsRecursivo(int verticeId, HashSet<Integer> visitados, List<Integer> resultado) {
        visitados.add(verticeId);
        resultado.add(verticeId);

        Iterator<Integer> adyacentes = grafo.getAdyacentes(verticeId);
        while (adyacentes.hasNext()) {
            int adyacente = adyacentes.next();
            if (!visitados.contains(adyacente)) {
                dfsRecursivo(adyacente, visitados, resultado);
            }
        }
    }

}
