package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleCircular<E> extends ListaSimple<E>{
	
	
	public void imprimirElemetos() {
	    Nodo<E> temporal = header;
	    int count = 0;
	    while (temporal != null && count < longitud) {
	        System.out.println(temporal.getData());
	        temporal = temporal.getNext();
	        count++;
	        if (temporal == header) {
	            break;
	        }
	    }
	}
	public boolean transfomacionCircular() {
		if (header.equals(null))
			return false;
		else {
			cola.setNext(header);
			return true;
		}
	}
}