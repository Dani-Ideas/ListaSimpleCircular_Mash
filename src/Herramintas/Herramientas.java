package Herramintas;

import java.util.Random;

//import fes.aragon.utilerias.dinamicas.listasimple.ListaSimple;
import fes.aragon.utilerias.dinamicas.listasimple.ListaSimpleCircular;

public class Herramientas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaSimpleCircular<Integer> lista1=new ListaSimpleCircular<Integer>();
		//ListaSimple<Integer> lista2=new ListaSimple<>();
		Random numeberRandomGenerate= new Random();
		int contador=0;
		for (int i=0; i<3; i++) {
			int numberRandom= numeberRandomGenerate.nextInt(50,121);
			//lista2.agregarEnCabeza(numberRandom);
			lista1.agregarEnCola(numberRandom);
		}
		lista1.imprimirElemetos();
		
		System.out.println("--------------------------");
		System.out.println(lista1.transfomacionCircular());
		System.out.println("--------------------------\n \n \n \n \n");
		
		///esto es por que tiene un loop infinito
		while (lista1.transfomacionCircular()&&contador <=3) {
			System.out.println("Se viene en "+(3-contador)+":\n(づ｡◕‿‿◕｡)づ(づ｡◕‿‿◕｡)づ(づ｡◕‿‿◕｡)づ(づ｡◕‿‿◕｡)づ(づ｡◕‿‿◕｡)づ\n( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)( ͡° ͜ʖ ͡°)");
            try {
            	Thread.sleep(1000); 
            } catch (InterruptedException e) {              
                e.printStackTrace();
            }
            
            contador++;
        }
		lista1.imprimirElemetos();
		
		//lista2.imprimirElemetos();
	}
}
