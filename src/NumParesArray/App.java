package NumParesArray;

public class App {
    public static void main(String[] args){

// TODO: Crie um Array de n�meros inteiros:
     int[] numeros = {2, 3, 5, 7, 11, 13, 18, 34};
// TODO: Implemente um la�o de repeti��o que verifique APENAS seus n�meros Pares:
     for (int i=0; i<numeros.length; i++){
         if (numeros[i]%2 == 0 ){
                 System.out.println(numeros[i]);
                } 
            }
           
    }

}