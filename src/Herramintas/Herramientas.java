package Herramintas;

import java.util.Random;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleCircular;

public class Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimpleCircular<Character> lista1=new ListaSimpleCircular<Character>();
		//ListaSimple<Integer> lista2=new ListaSimple<>();
		String name="Smash";
		for (int i=0; i<name.length(); i++) {
			lista1.agregarEnCola(name.charAt(i));
		}
		lista1.imprimirElemetos();
		
		System.out.println("--------------------------");
		System.out.println(lista1.transfomacionCircular());
		System.out.println("--------------------------\n \n \n \n \n");
		
		lista1.imprimirElemetos();
		
		//lista2.imprimirElemetos();
	}
}
