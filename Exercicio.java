package exercicio;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			double a,b,c,x;
			
			System.out.println("Digite dois valores: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			System.out.println("Voc� quer somar [1], subtrair [2], multiplicar[3], dividir[4] ?");
			
			c = sc.nextDouble();
			
			if (c == 1) {
					x = a + b;
					System.out.println("A soma dos valores �: " + x);
			}
			
			else if (c == 2) {
					x = a - b;
					System.out.println("A subtra��o dos valores �: " + x);
					
			}
		
			else if (c == 3) {
				x = a * b;
				System.out.println("A multiplica��o dos valores �: " + x);
				
			}			
			else if (c == 4) {
				x = a / b;
				System.out.println("A divis�o dos valores �: " + x);
				
			}	
				
			else {
				System.out.println("Opera��o inv�lida");
			sc.close();
		}

	}

	}


