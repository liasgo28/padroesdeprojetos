package br.com.diego.padroesdeprojetos.flyweight;

import java.util.Arrays;
import java.util.List;
/*
 * Sempre que temos uma quantidade grande de objetos similares a serem instanciados, 
 * uma boa solução é fazer cache dessas instâncias e reutilizá-la. Para isso, a implementação é geralmenta fazer 
 * uso de uma fábrica, que controla as instâncias. Esse padrão é conhecido por flyweight.
 * 
 * */
public class Programa {
	public static void main(String[] args) {
		NotasMusicais notas = new NotasMusicais();

	    List<Nota> doReMiFa = Arrays.asList(
	    	notas.pega("do_m"),	
	    	notas.pega("re_m"),
	    	notas.pega("do_m"),	
	    	notas.pega("re_m"),
	    	
	    	notas.pega("do_m"),	
	    	notas.pega("re_m"),
	    	
	    	notas.pega("do_m"),	
	    	notas.pega("re_m"),
	        notas.pega("do"),    
	        notas.pega("re"),    
	        notas.pega("mi"),    
	        notas.pega("fa"),    
	        notas.pega("fa"),    
	        notas.pega("fa"),    

	        notas.pega("do"),    
	        notas.pega("re"),    
	        notas.pega("do"),    
	        notas.pega("re"),    
	        notas.pega("re"),    
	        notas.pega("re"),

	        notas.pega("do"),    
	        notas.pega("sol"),    
	        notas.pega("fa"),    
	        notas.pega("mi"),    
	        notas.pega("mi"),    
	        notas.pega("mi"),

	        notas.pega("do"),    
	        notas.pega("re"),    
	        notas.pega("mi"),    
	        notas.pega("fa"),    
	        notas.pega("fa"),    
	        notas.pega("fa")
	        );
	    
	    Piano piano = new Piano();
	    piano.toca(doReMiFa);
	}
	
	
}
