package VetorAleatorio;

//Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class App {
 
public static void main(String[] args){ 
 Scanner leitor = new Scanner(System.in); 
 int t = leitor.nextInt(); 
int[] vetorAleatorio = new int[1000];
//TODO: Implemente uma condição onde possamos preencher o vetor de N.
//Lembre-se a sequência de valores é de 0 até T-1:
	    int valor = 0;
	    for (int i = 0; i<1000;i++) {
	      if (valor == t)
	      	valor = 0;
	    	
	      vetorAleatorio[i] = valor;
	      System.out.println("N[" + i + "] = " + vetorAleatorio[i]);
	      valor = valor + 1;
	    }
}
}