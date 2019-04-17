# trabalho_1bimestre_poo
Será feito cálculo do IMC de idosos com:
>identificação do idoso
>cálculo do IMC
>Identificação se o idoso esta abaixo do peso, peso adequado ou sobrepeso
>Cálculos
>Organização dos registros

exemplo:
entrada do peso = 60
entrada altura = 1,60
IMC = 

--------------------------------------------------------------------------
```java
/*
Será feito cálculo do IMC de idosos

*/
import java.util.Scanner;
	public class trabimc2 {
		public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		//Prints para apresentar o objetivo do programa
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Calculadora de IMC para verificação da saúde pelo peso das pessoas idosas");
		System.out.println("-------------------------------------------------------------------------");
		
		//Prints explicando como deve ser o funcionamento
		System.out.println("Siga a ordem de cadastro, cálculo e verificação");
		System.out.println("");
		System.out.println("");
		//Print para pedir quantos idosos serão registrados na sessão
		System.out.println("Digite o número de idosos que serão registrados: ");
		//definição da variavel idosos, e leitura do que for escrito pelo usuário
		int idosos = leitor.nextInt();

		
		//Criação do array/vetor para armazenar imc
		double imc[] = new double[idosos];
		//Criação do array/vetor para armazenar peso
		double peso[] = new double[idosos];
		//Criação do array/vetor para armazenar altura
		double altura[] = new double[idosos];
		//Criação do array/vetor para armazenar nome
		String nome[] = new String[idosos];
		
		//Definição da variavel opcao e i para uso dentro do bloco de repetição
		int opcao = 0;
		int i = 0;
		
		//Criação do repetidor while enquanto for diferente de 4(opcao 4)
		while(opcao != 4){
		//Prints para apresentar o menu de opções para o usuário
		System.out.println("Digite a opção desejada: ");
		System.out.println("");
		System.out.println("1-Cadastro da pessoa idosa");
		System.out.println("2-Cálculo do IMC do idoso cadastrado");
		System.out.println("3-Verificação da saúde com base no peso do idoso");
		System.out.println("4-Sair");

		//Variavel opcao recebe o valor digitado pelo usuário
		opcao = leitor.nextInt();
		
		//Estrutura de decisão em caso de opção 4 
		if(opcao == 4){
			//Print informando mensagem após o usuario informar 4
			System.out.println("Programa finalizado");
			//uso do break para finalizar o programa
			break;

		//Estrutura de decisão se não entao opcao for 1
		}else if(opcao == 1){
			//Print pedindo o nome completo
			System.out.println("Digite o nome completo do idoso: ");
			//Vetor nome recebe no local do valor i a informação informada pelo usuário
			nome[i] = leitor.next();
			//Print pedindo o peso
			System.out.println("Digite o peso em kg do idoso: (use virgula para separar)");
			//Vetor peso recebe no local do valor i a informação informada pelo usuário
			peso[i] = leitor.nextDouble();
			//Print pedindo altura
			System.out.println("Digite a altura em metros do idoso: (use virgula para separar)");
			//Vetor altura recebe no local do valor i a informação informada pelo usuário
			altura[i] = leitor.nextDouble();
			//Prints avisando usuário que cadastro foi efetuado com sucesso
			System.out.println("-------------------------------");
			System.out.println("Cadastro efetuado com sucesso!!");
			System.out.println("-------------------------------");
			//acumulador com o i para acrescnetar 1 cada vez que o usuario escolher a primeira opcao
			i++;
			
			//Estrutura de decisão "se não" entao opcao for 2
			}else if(opcao == 2){
				//Prints para pedir o número do codigo de quem na lista ira ser feito o calculo
				System.out.println("---------------------------------------------");
				System.out.println("Digite o número de quem será feito o cálculo: ");
				//Bloco de repetição for para mostrar todos os idosos cadastrados
				for(int j = 0; j < i; j++){
					//ira mostrar todos os cadastros pois com este laço tem um acumulador que ira acrescentar 1 a cada volta da repetição
					System.out.println(j+"- "+nome[j]);
				}
				//Print para separar 
				System.out.println("---------------------------------------------");
				// definição da variavel opcao2 para entrada de valor do usuario
				int opcao2 = leitor.nextInt();
				//será armazenado dentro do vetor imc dentro do usuario escolhido, o calculo do vetor peso dividido pelo vetor altura ao quadrado que foi usado o math para est calculo
				imc[opcao2] = peso[opcao2]/Math.pow(altura[opcao2],2);
				//Prints para destacar e mostrar o valor do imc do usuario escolhido
				System.out.println("");
				System.out.println("-----------------------------------");
				System.out.println("O IMC desta pessoa é: "+imc[opcao2]);
				System.out.println("-----------------------------------");
				System.out.println("");

				//Estrutura de decisão "se não" entao opcao for 3
				}else if(opcao == 3){
					//Prints para pedir o número do codigo de quem na lista ira ser feito a avaliação
					System.out.println("-----------------------------------------------");
					System.out.println("Digite o número de quem será feito a avaliação: ");
					//Bloco de repetição for para mostrar todos os idosos cadastrados
					for(int j = 0; j < i; j++){
						//ira mostrar todos os cadastros pois com este laço tem um acumulador que ira acrescentar 1 a cada volta da repetição
						System.out.println(j+"- "+nome[j]);
					}
					//Print para separar
					System.out.println("-----------------------------------------------");
					// definição da variavel opcao3 para entrada de valor do usuario
					int opcao3 = leitor.nextInt();
					//estrutura de decisão caso o imc da pessoa escolhida for menor que 22
					if(imc[opcao3] < 22){
						//print para mostrar mensagem do resultado da saude do idoso escolhido
						System.out.println("--------------");
						System.out.println("Abaixo do peso");
						System.out.println("--------------");
					//estrutura de decisão caso o imc da pessoa escolhida for maior ou igual a 22 e menor ou igual a 27
					}else if(imc[opcao3] >= 22 && imc[opcao3] <= 27){
						//print para mostrar mensagem do resultado da saude do idoso escolhido
						System.out.println("--------");
						System.out.println("Saudável");
						System.out.println("--------");
						//estrutura de decisão caso o imc da pessoa escolhida for diferente dos anteriores
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
  
````
