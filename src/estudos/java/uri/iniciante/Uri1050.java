package estudos.java.uri.iniciante;

import java.io.IOException;
import java.io.IOException;
import java.util.Scanner; 

/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solu��o execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su soluci�n ejecutar
 */

//	URI Online Judge | 1050
//	DDD
//	Adaptado por Neilor Tonin, URI  Brasil
//	Timelimit: 1
//	
//	Leia um n�mero inteiro que representa um c�digo de DDD para discagem interurbana. Em seguida, informe � qual 
//	cidade o DDD pertence, considerando a tabela abaixo:
//	
//	DDD					Destination
//	
//	61					Brasilia
//	71					Salvador
//	11					Sao Paulo
//	21					Rio de Janeiro
//	32					juiz de Fora
//	19					Campinas
//	27					Vitoria
//	31					Belo Horizonte
//	
//	Se a entrada for qualquer outro DDD que n�o esteja presente na tabela acima, o programa dever� informar:
//	DDD nao cadastrado
//	
//	Entrada
//	
//	A entrada consiste de um �nico valor inteiro.
//	
//	Sa�da
//	
//	Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso n�o e
//	xistir DDD correspondente ao n�mero digitado.
//	
//	Exemplo de Entrada			Exemplo de Sa�da
//	
//	11							Sao Paulo

/**
 * @author Carlos Roger
 * 
 *  URI Online Judge | 1050
 *	RESPOSTA: Accepted
 *	TEMPO: 0.048s
 *	SUBMISS�O: 22/07/15 18:00:08
 */

public class Uri1050 {
 
    public static void main(String[] args) throws IOException {
 
		Scanner s = new Scanner(System.in);
		int ddd;

		ddd = s.nextInt();

		switch (ddd) {

		case 61:
			System.out.println("Brasilia");
			break;

		case 71:
			System.out.println("Salvador");
			break;

		case 11:
			System.out.println("Sao Paulo");
			break;

		case 21:
			System.out.println("Rio de Janeiro");
			break;

		case 32:
			System.out.println("Juiz de Fora");
			break;

		case 19:
			System.out.println("Campinas");
			break;

		case 27:
			System.out.println("Vitoria");
			break;

		case 31:
			System.out.println("Belo Horizonte");
			break;

		default:
			System.out.println("DDD nao cadastrado");
			break;

		}
 
    }
 
}