package PrecoIngresso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner(System.in);
    	double A = leitor.nextDouble();
    	double B = leitor.nextDouble();
    	
    	double porcentagem = (((B-A)*100)/A);
    	
    	System.out.printf("%.2f",porcentagem);
    	System.out.print("%");
	}

}
