package TPE1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ServicioBFS {

	private GrafoDirigido<?> grafo;
	
	public ServicioBFS(GrafoDirigido<?> grafo) {
		this.grafo = grafo;
	}
	
	/*La complejidad seria O(V + E) Donde "V" es el número de vértices y "E" es el número de aristas en el grafo.
	 * Ya que en el peor caso, se visitan todos los vértices del grafo (V veces) y se exploran todas las aristas (E veces)*/
    public List<Integer> bfsForest() {
        List<Integer> resultado = new ArrayList<>();
        HashSet<Integer> visitados = new HashSet<>();
        Queue<Integer> cola = new LinkedList<>();

        Iterator<Integer> vertices = grafo.getVertices();
        if (vertices.hasNext()) {
            int verticeInicial = vertices.next();
            visitados.add(verticeInicial);
            cola.offer(verticeInicial);
        }

        while (!cola.isEmpty()) {
            int vertice = cola.poll();
            resultado.add(vertice);

            Iterator<Integer> adyacentes = grafo.getAdyacentes(vertice);
            while (adyacentes.hasNext()) {
                int adyacente = adyacentes.next();
                if (!visitados.contains(adyacente)) {
                    visitados.add(adyacente);
                    cola.offer(adyacente);
                }
            }
        }

        return resultado;
    }
	
}
