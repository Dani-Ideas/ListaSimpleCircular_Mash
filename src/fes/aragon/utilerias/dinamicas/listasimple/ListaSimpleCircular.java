package fes.aragon.utilerias.dinamicas.listasimple;

public class ListaSimpleCircular<E> extends ListaSimple<Object>{
	public boolean transfomacionCircular() {
		if (header.equals(null))
			return false;
		else {
			cola.setNext(header);
			return true;
		}
	}
}