package pratica1;
import java.util.Scanner;
public class Questao2 {

	public static void main(String[] args) {		
		String placa;
		String NovaPlaca;
		short ano;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a placa");
		placa = scan.nextLine();
		System.out.println("Digite o ano");
		ano = scan.nextShort();
		
		if (ano < 2010)
		System.out.println("Carro velho");
		else if (ano <= 2021)
		System.out.println("Carro semi novo");
		else if (ano == 2022)
		System.out.println("Carro novo");
		else 
		System.out.println("Ano invalido");
		
		placa = placa.toUpperCase();
		NovaPlaca = placa
					.replace("A", "*")
					.replace("E", "*")
					.replace("I", "*")
					.replace("O", "*")
					.replace("U", "*");
		System.out.println(NovaPlaca);
					
							

	}

}
