package exercicio;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			
			double a,b,c,x;
			
			System.out.println("Digite dois valores: ");
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			System.out.println("Você quer somar [1], subtrair [2], multiplicar[3], dividir[4] ?");
			
			c = sc.nextDouble();
			
			if (c == 1) {
					x = a + b;
					System.out.println("A soma dos valores é: " + x);
			}
			
			else if (c == 2) {
					x = a - b;
					System.out.println("A subtração dos valores é: " + x);
					
			}
		
			else if (c == 3) {
				x = a * b;
				System.out.println("A multiplicação dos valores é: " + x);
				
			}			
			else if (c == 4) {
				x = a / b;
				System.out.println("A divisão dos valores é: " + x);
				
			}	
				
			else {
				System.out.println("Operação inválida");
			sc.close();
		}

	}

	}


