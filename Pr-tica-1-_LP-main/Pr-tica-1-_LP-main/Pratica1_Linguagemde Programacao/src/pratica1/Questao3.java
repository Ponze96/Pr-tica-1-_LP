package pratica1;
import java.util.Scanner;
public class Questao3 {

	public static void main(String[] args) {
		int count = 0;
		String sentence = "My name is Pedro, Hello World!! XD";
		char [] vogais = {'a', 'e', 'i', 'o', 'u'};
		for (char vogal : vogais)
			for (char letras : sentence.toLowerCase().toCharArray())
				if  (letras == vogal) count++;
		System.out.println("Numero de vogais na setenca e " + count);
			

	}

}
