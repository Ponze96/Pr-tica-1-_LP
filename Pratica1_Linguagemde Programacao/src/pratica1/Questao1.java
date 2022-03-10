package pratica1;
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) {
	 float NumHoras, VelocidadeMedia, KmLitro, Distancia; 
	 Scanner scan = new Scanner(System.in);
	 
	 
	 System.out.println("Digite o numero de horas");
	 NumHoras = scan.nextFloat();
	 System.out.println("Digite a velocidade media");
	 VelocidadeMedia = scan.nextFloat();
	 System.out.println("Digite os km por litro");
	 KmLitro = scan.nextFloat();
	 
	 
	 Distancia = VelocidadeMedia * NumHoras;
	 
	 System.out.println("Consumo final = " + (Distancia / KmLitro));
 
	}

}
