import java.util.Scanner;
	public class trabimc2 {
		public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		//Prints para apresentar o objetivo do programa
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Calculadora de IMC para verifica��o da sa�de pelo peso das pessoas idosas");
		System.out.println("-------------------------------------------------------------------------");
		
		//Prints explicando como deve ser o funcionamento
		System.out.println("Siga a ordem de cadastro, c�lculo e verifica��o");
		System.out.println("");
		System.out.println("");
		//Print para pedir quantos idosos ser�o registrados na sess�o
		System.out.println("Digite o n�mero de idosos que ser�o registrados: ");
		//defini��o da variavel idosos, e leitura do que for escrito pelo usu�rio
		int idosos = leitor.nextInt();

		
		//Cria��o do array/vetor para armazenar imc
		double imc[] = new double[idosos];
		//Cria��o do array/vetor para armazenar peso
		double peso[] = new double[idosos];
		//Cria��o do array/vetor para armazenar altura
		double altura[] = new double[idosos];
		//Cria��o do array/vetor para armazenar nome
		String nome[] = new String[idosos];
		
		//Defini��o da variavel opcao e i para uso dentro do bloco de repeti��o
		int opcao = 0;
		int i = 0;
		
		//Cria��o do repetidor while enquanto for diferente de 4(opcao 4)
		while(opcao != 4){
		//Prints para apresentar o menu de op��es para o usu�rio
		System.out.println("Digite a op��o desejada: ");
		System.out.println("");
		System.out.println("1-Cadastro da pessoa idosa");
		System.out.println("2-C�lculo do IMC do idoso cadastrado");
		System.out.println("3-Verifica��o da sa�de com base no peso do idoso");
		System.out.println("4-Sair");

		//Variavel opcao recebe o valor digitado pelo usu�rio
		opcao = leitor.nextInt();
		
		//Estrutura de decis�o em caso de op��o 4 
		if(opcao == 4){
			//Print informando mensagem ap�s o usuario informar 4
			System.out.println("Programa finalizado");
			//uso do break para finalizar o programa
			break;

		//Estrutura de decis�o se n�o entao opcao for 1
		}else if(opcao == 1){
			//Print pedindo o nome completo
			System.out.println("Digite o nome completo do idoso: ");
			//Vetor nome recebe no local do valor i a informa��o informada pelo usu�rio
			nome[i] = leitor.next();
			//Print pedindo o peso
			System.out.println("Digite o peso em kg do idoso: (use virgula para separar)");
			//Vetor peso recebe no local do valor i a informa��o informada pelo usu�rio
			peso[i] = leitor.nextDouble();
			//Print pedindo altura
			System.out.println("Digite a altura em metros do idoso: (use virgula para separar)");
			//Vetor altura recebe no local do valor i a informa��o informada pelo usu�rio
			altura[i] = leitor.nextDouble();
			//Prints avisando usu�rio que cadastro foi efetuado com sucesso
			System.out.println("-------------------------------");
			System.out.println("Cadastro efetuado com sucesso!!");
			System.out.println("-------------------------------");
			//acumulador com o i para acrescnetar 1 cada vez que o usuario escolher a primeira opcao
			i++;
			
			//Estrutura de decis�o "se n�o" entao opcao for 2
			}else if(opcao == 2){
				//Prints para pedir o n�mero do codigo de quem na lista ira ser feito o calculo
				System.out.println("---------------------------------------------");
				System.out.println("Digite o n�mero de quem ser� feito o c�lculo: ");
				//Bloco de repeti��o for para mostrar todos os idosos cadastrados
				for(int j = 0; j < i; j++){
					//ira mostrar todos os cadastros pois com este la�o tem um acumulador que ira acrescentar 1 a cada volta da repeti��o
					System.out.println(j+"- "+nome[j]);
				}
				//Print para separar 
				System.out.println("---------------------------------------------");
				// defini��o da variavel opcao2 para entrada de valor do usuario
				int opcao2 = leitor.nextInt();
				//ser� armazenado dentro do vetor imc dentro do usuario escolhido, o calculo do vetor peso dividido pelo vetor altura ao quadrado que foi usado o math para est calculo
				imc[opcao2] = peso[opcao2]/Math.pow(altura[opcao2],2);
				//Prints para destacar e mostrar o valor do imc do usuario escolhido
				System.out.println("");
				System.out.println("-----------------------------------");
				System.out.println("O IMC desta pessoa �: "+imc[opcao2]);
				System.out.println("-----------------------------------");
				System.out.println("");

				//Estrutura de decis�o "se n�o" entao opcao for 3
				}else if(opcao == 3){
					//Prints para pedir o n�mero do codigo de quem na lista ira ser feito a avalia��o
					System.out.println("-----------------------------------------------");
					System.out.println("Digite o n�mero de quem ser� feito a avalia��o: ");
					//Bloco de repeti��o for para mostrar todos os idosos cadastrados
					for(int j = 0; j < i; j++){
						//ira mostrar todos os cadastros pois com este la�o tem um acumulador que ira acrescentar 1 a cada volta da repeti��o
						System.out.println(j+"- "+nome[j]);
					}
					//Print para separar
					System.out.println("-----------------------------------------------");
					// defini��o da variavel opcao3 para entrada de valor do usuario
					int opcao3 = leitor.nextInt();
					//estrutura de decis�o caso o imc da pessoa escolhida for menor que 22
					if(imc[opcao3] < 22){
						//print para mostrar mensagem do resultado da saude do idoso escolhido
						System.out.println("--------------");
						System.out.println("Abaixo do peso");
						System.out.println("--------------");
					//estrutura de decis�o caso o imc da pessoa escolhida for maior ou igual a 22 e menor ou igual a 27
					}else if(imc[opcao3] >= 22 && imc[opcao3] <= 27){
						//print para mostrar mensagem do resultado da saude do idoso escolhido
						System.out.println("--------");
						System.out.println("Saud�vel");
						System.out.println("--------");
						//estrutura de decis�o caso o imc da pessoa escolhida for diferente dos anteriores
						}else{
							//print para mostrar mensagem do resultado da saude do idoso escolhido
							System.out.println("---------");
							System.out.println("Sobrepeso");
							System.out.println("---------");
						}

		}

				}
		
		}
	}