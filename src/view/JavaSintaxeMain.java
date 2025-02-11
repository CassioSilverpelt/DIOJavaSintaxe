package view;

import java.util.Date;

public class JavaSintaxeMain {

	public static void main(String[] args) {
		byte num = 123; //Short e Byte comumente são convertidos em inteiros pela VM, então se evita usar, especialmente em casos em que os valores passam de seus limites.
		short num2 = 12; //Int comporta short e byte, mas não o contrário, dependendo do valor. Mesma coisa com Long e Int.
		int num3 = 4320495;
		final long CPF = 42042811840L; //costuma-se colocar "L" na frente de valores long para que a VM não confunda com int.
		final int PESSOAS = 1213333; //por convenção, variáveis "final" são escritas em maiúsculo.
		float salario = 1500.50f; //costuma-se colocar "f/F" à frente de valores float para que a VM não tente converter em double.
		//static int portas = 12; //variáveis static permanecem no mesmo espaço de memória, portanto são acessadas sempre no mesmo local. Isso faz com que sempre que ela é chamada, o valor dela é a ultima modificação. Ela não é inicializada para cada instância de acesso.
		String nome = "Cassio"; //String não é um tipo primitivo, mas uma classe que representa texto e é composta de um conjunto de "chars".
		char letra = 1; //Char é um tipo primitivo que representa um caractere a partir de um número da tabela ASCII.
		char letra2 = 'b'; //Também funciona com aspas simples e um único caractere.
		Date nascimento = new Date();
	}

}
