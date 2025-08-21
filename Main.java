package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/**
	 	1) Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros 
		e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
		 * 
		 */
		
		/*
		int n = 0; 
		
		System.out.println("Digite a quantidade de números (max 10):");
		n = sc.nextInt();
		
		int[] numeros = new int[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS NEGATIVOS: ");
		
		for(int i =0;i<numeros.length;i++) {
			
			if(numeros[i] < 0) {
				
				System.out.printf("%d",numeros[i]);
			}
		}
		*/
		
		/**
		2) Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
		Imprimir todos os elementos do vetor 
		Mostrar na tela a soma e a média dos elementos do vetor 
		 */
		
		/*
		int n = 0; 
		
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		double[] numeros = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
		}
		
		String valores = "";
		double soma = 0;
		double media = 0;
		
		for(int i=0; i<n; i++) {
			valores += numeros[i]+" ";
			soma += numeros[i];
		}
		
		media = soma / n;
		
		System.out.println("VALORES: "+valores);
		System.out.println("SOMA: "+soma);
		System.out.println("MEDIA: "+media);
		*/
		
		/**
		3) Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo.
		Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de
		pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
		 */
		
		/*
		int n = 0; 
		
		System.out.println("Quantas pessoas serao digitadas?");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Dados da "+(i+1)+"a pessoa: ");
			System.out.println("Nome: ");
			
			sc.nextLine();
			nome[i] = sc.nextLine();
			
			System.out.println("Idada: ");
			idade[i] = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("Altura: ");
			altura[i] = sc.nextDouble();
		}
		
		String menos_16_nomes = "";
		double menos_16_percent = 0;
		int menos_16_qtd = 0;
		double media = 0;
		
		for(int i=0;i<n;i++) {
			
			media += altura[i];
			
			if(idade[i] < 16) {
				menos_16_qtd++;
				menos_16_nomes += nome[i]+"\n";
			}
		}
		
		media = media / n;
		menos_16_percent = 100 * menos_16_qtd / n;
		
		System.out.println("Altura média: " + media);
		System.out.println("Pessoas com menos de 16 anos: " + menos_16_percent + "%");
		System.out.println(menos_16_nomes);
		*/
		
		/**
		4) Faça um programa que leia N números inteiros e armazene-os em um vetor. 
		Em seguida, mostre na tela todos os números pares, e também a quantidade de números pares. 
		 */
		
		/*
		int n = 0; 
		int pares = 0;
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		int[] numeros = new int[5]; 
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		for(int i=0;i<n;i++) {
			
			if(numeros[i] % 2 == 0) {
				pares++;
				System.out.print(numeros[i]+" ");
			}
		}
		
		System.out.println("\n\nQUANTIDADE DE PARES: "+pares);
		*/
		
		/**
		5) Faça um programa que leia N números reais e armazene-os em um vetor.
		Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		Mostrar também a posição do maior elemento, considerando a primeira posição como 0 (zero).  
		 */
		
		/*
		int n = 0; 
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		
		double[] numeros = new double[n]; 
		double maior = 0;
		int pos_maior = 0;
		
		for(int i=0;i<n;i++) {
			
			System.out.println("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			
			if(numeros[i] >= maior) {
				maior = numeros[i];
				pos_maior = i;
			}
		}
		
		System.out.println("MAIOR VALOR: "+ maior);
		System.out.println("POSICAO DO MAIOR VALOR: "+ pos_maior);
		*/
		
		/**
		6) Faça um programa para ler dois vetores A e B, contendo N elementos cada.
		Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos
		correspondentes de A e B. Imprima o vetor C gerado.  
		 */
		
		/*
		int n = 0; 
		System.out.println("Quantos valores vai ter cada vetor?");
		n = sc.nextInt();
		
		int[] array_a = new int[n]; 
		int[] array_b = new int[n]; 
		int[] array_c = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		
		for(int i=0;i<n;i++) {
			array_a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		
		for(int i=0;i<n;i++) {
			array_b[i] = sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			array_c[i] = array_a[i] + array_b[i];
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(array_c[i]);
		}
		*/
		
		/**
		7) Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. 
		Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais.
		Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
		 */
		
		/*
		int n = 0; 
		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();
		
		double[] vetor = new double[n]; 
		double media = 0;
				
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextDouble();
			media += vetor[i];
		}
		
		media = media / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f\n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(int i=0;i<n;i++) {

			if(vetor[i] < media) {
				System.out.printf("%.1f\n", vetor[i]);
			}
		}
		*/
		
		/**
		8) Fazer um programa para ler um vetor de N números inteiros.
		Em seguida, mostrar na tela a média aritmética somente dos números pares lidos,
		com uma casa decimal.
		Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"  
		 */
		
		/*
		int n = 0; 
		double media = 0;
		boolean tem_par = false;
		int qtd_par = 0;
		
		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();
		
		int[] vetor = new int[n]; 
				
		for(int i=0;i<n;i++) {
			System.out.println("Digite um numero: ");
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 == 0) {
				tem_par = true;
				qtd_par++;
				media += vetor[i];
			}
		}
		
		if(tem_par) {
			media = media / qtd_par;
			System.out.printf("%.1f\n", media);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
		*/
		
		/**
		9) Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
		Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. 
		Depois, mostrar na tela o nome da pessoa mais velha. 
		 */
		
		int n = 0; 

		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();
		
		String[] nome = new String[n];
		int[] idade = new int[n];
		int index = 0;
				
		for(int i=0;i<n;i++) {
			
			System.out.println("Dados da "+i+"a pessoa: ");
			
			System.out.println("Nome"
					+ ";");
			
			vetor[i] = sc.nextInt();
			
			if(vetor[i] % 2 == 0) {
				tem_par = true;
				qtd_par++;
				media += vetor[i];
			}
		}
		
		
		
		sc.close();
	}

}
