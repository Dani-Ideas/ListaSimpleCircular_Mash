package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleCircular<E> extends ListaSimple<E>{
	
	
	public void imprimirElemetos() {
	    Nodo<E> temporal = cabeza;
	    int count = 0;
	    while (temporal != null && count < longitud) {
	        System.out.println(temporal.getDato());
	        temporal = temporal.getSiguiente();
	        count++;
	        if (temporal == cabeza) {
	            break;
	        }
	    }
	}
	public boolean transfomacionCircular() {
		if (cabeza.equals(null))
			return false;
		else {
			cola.setSiguiente(cabeza);
			return true;
		}
	}
}