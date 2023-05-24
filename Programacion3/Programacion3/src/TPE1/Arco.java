package TPE1;

public class Arco<T> {
	private int verticeOrigen;
	private int verticeDestino;
	private T etiqueta;
	
	public Arco(int verticeOrigen,int verticeDestino, T etiqueta) {
		this.verticeOrigen = verticeOrigen;
		this.verticeDestino = verticeDestino;
		this.etiqueta = etiqueta;
	}
	
	public Arco(T etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	/* la complejidad de tiempo total de la función getVerticeOrigen es O(1), ya que implica una simple operación de acceso al valor de una variable.*/
	public int getVerticeOrigen() {
		return verticeOrigen;
	}
	
	/*la complejidad de tiempo total de la función getVerticeDestino es O(1), ya que implica una simple operación de acceso al valor de una variable.*/
	public int getVerticeDestino() {
		return verticeDestino;
	}
	
	/*la complejidad de tiempo total de la función getEtiqueta es O(1), ya que implica una simple operación de acceso al valor de una variable.*/
	public T getEtiqueta() {
		return etiqueta;
	}
	
	public String toString() {
		return verticeDestino + " "+ etiqueta;
	}
}
