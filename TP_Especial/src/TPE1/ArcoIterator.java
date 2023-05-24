package TPE1;

import java.util.Iterator;

public class ArcoIterator<T> implements Iterator<Integer>{
	
    private Iterator<Arco> it;

    public ArcoIterator(Iterator<Arco> IteradorArco){
        this.it= IteradorArco;
    }
    
    @Override
    public boolean hasNext() {
        return it.hasNext();
    }

    @Override
    public Integer next() {
        return it.next().getVerticeDestino();
    }
    
    public String toString() {
    	return ""+it.next();
    }

}
