import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TabuleiroDama.calculo();
		
		int num1;

	Scanner sc = new Scanner(System.in);
		
	System.out.println("Informe um numero para mostrar os pares");
	num1 = sc.nextInt();
	
	for (int i = 1;i <= num1 ; i++) {
		if (i % 2 == 0) {
			System.out.println(i);
		}
	}
		
	}

}
