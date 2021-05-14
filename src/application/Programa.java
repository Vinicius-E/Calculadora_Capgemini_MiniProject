package application;

import java.util.Scanner;

import entities.Anuncio;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CALCULADORA DE ALCANCE DE ANÚNCIO ONLINE");
		System.out.println();
		System.out.print("Valor investido: R$");
		double valorInvestido = sc.nextDouble();
		Anuncio anuncio = new Anuncio(valorInvestido);
		System.out.println("Projeção aproximada de pessoas que vizualizarão o anúncio: " + anuncio.qtdMaxAproxVizu());

		sc.close();
	}

}
