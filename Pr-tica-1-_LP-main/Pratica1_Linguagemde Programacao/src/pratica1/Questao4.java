package pratica1;
import java.util.Scanner;
import java.util.Random;
public class Questao4 {
	
	Scanner scan = new Scanner(System.in);
	String Nome, CPF, dataVoo, horario;
	int Random;
	int numeroVoo;
	int opcao;
	int escolha = 0;
	do {	
		System.out.println("Escolha");
		System.out.println("1 - Cadastrar Passageiro");
		System.out.println("2 - Check in");
		System.out.println("3 - Cancelar Voo");
		System.out.println("4 - Sair");
		
		Scanner scan = new Scanner (System.in);
		opcao = scan.nextint();
		
		switch(opcao) {
		case 1:
			System.out.println("Digite seu nome");
			Nome = scan.next();
			System.out.println("Digite seu CPF");
		    CPF = scan.next();
			System.out.println(" Digite a data do Voo");
			dataVoo = scan.next();
			System.out.println(" Digite o horario");
			horario = scan.next();
			System.out.println("Cadastro efetuado com sucesso");
			
			Random gerador = new Random();
			System.out.println(gerador.nextInt(999));
					
			break;
			case 2:
		    System.out.println("Digite seu CPF");	
		    CPF = scan.next();
		   System.out.println("Digite o numero do Voo");
		   numeroVoo = scan.nexInt();
		System.out.println("Check in realizado");
		break;
		
		case 3: 
		System.out.println("Digite seu CPF");
		CPF = scan.next();		
		System.out.println("Digite o numero do Voo");
		numeroVoo = scan.nextInt();
		System.out.println("Voo cancelado com sucesso");
				  
	} while(opcao != -1);
							
			
			
	

}

}


