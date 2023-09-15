package Herramintas;

//import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleCircular;

public class Herramientas {

	public static void main(String[] args) {
		//se asigna el nombre
	    String name = "Mash";
		// TODO Auto-generated method stub
		ListaSimpleCircular<Character> lista1=new ListaSimpleCircular<Character>();
		//se rellena La lista 
		for (int i=0; i<name.length(); i++) {
			lista1.agregarEnCola(name.charAt(i));
		}
		if (lista1.transfomacionCircular()) {
			System.out.println("Se pudo hacer la trabnformacion circular con exito:");
			System.out.println("(づ ◕‿◕ )づ(づ ◕‿◕ )づ(づ ◕‿◕ )づ(づ ◕‿◕ )づ");
			for (int i =0;i <name.length();i++) {
				lista1.imprimirElemetos(i);
				System.out.println();
			}
		}else
			System.out.println("No se pido hacer la ls lista cicular con exito. (☉_☉)");
	}
}
