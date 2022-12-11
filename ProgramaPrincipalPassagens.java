package exercicios;
import java.util.*;
public class ProgramaPrincipalPassagens {
	
	static VendaPassagem Clientes [] = new VendaPassagem[3];
	static CompraPassagem ListaPassagem [] = new CompraPassagem[3];

	
	public static void Passagem() {
		double maiorValor = 0;
		Scanner s = new Scanner(System.in);
		int posicaoMaiorValor = 0;
		for (int i = 0; i < ListaPassagem.length; i++) {
			CompraPassagem aCompraPassagem = new CompraPassagem();
			VendaPassagem aVendaPassagem = new VendaPassagem();
			System.out.println("DIGITAR AS PASSAGENS \n---------------------------");
			System.out.println("Digite o código da passagem: ");
			int codigo = Integer.parseInt(s.nextLine());
			aCompraPassagem.setCodigo(codigo);
			System.out.println("Digite o Destino da passagem: ");
			String destino = s.nextLine();
			aCompraPassagem.setDestino(destino);
			System.out.println("Digite a Data da passagem: ");
			String data = s.nextLine();
			aCompraPassagem.setData(data);
			System.out.println("Digite o Hora da passagem: ");
			String hora = s.nextLine();
			aCompraPassagem.setHora(hora);
			System.out.println("Digite o Valor da passagem: ");
			Double valor = Double.parseDouble(s.nextLine());
			aCompraPassagem.setValor(valor);
			
			//Verificar qual é a maior
			if (valor > maiorValor) {
				aCompraPassagem.setMaiorValor(valor);
				posicaoMaiorValor = i;
				maiorValor = valor;
			}
			
			ListaPassagem[i] = aCompraPassagem;
		}
		
		System.out.println("PASSAGENS DISPONÍVEIS:");
		for (int i = 0; i < ListaPassagem.length; i++) {
			System.out.println(i + ". " + ListaPassagem[i].toString());
			if (i == posicaoMaiorValor) {
				System.out.println("PASSAGEM MAIS CARA!");
			}
			System.out.println("----------------------");
		}
	}
		
		
	
	
	public static void Cliente() {
		Scanner s = new Scanner(System.in);
		double valorTotal = 0;
		String continua = "";
		int z = 0;
		int [] passagemComprada = new int [3];
		boolean verificaPassagemComprada = true;
				//COMPRAR PASSAGENS
			for (int j = 0; j < Clientes.length; j++) {
				CompraPassagem aCompraPassagem = new CompraPassagem();
				VendaPassagem aVendaPassagem = new VendaPassagem();
				System.out.println("Digite o código da passagem que se deseja comprar: ");
				aVendaPassagem.setCodigo(Integer.parseInt(s.nextLine()));
				while (verificaPassagemComprada == false) {
					//Verifica se passagem ja foi comprada
					for(int a = 0; a < passagemComprada.length; a++) {
						if (passagemComprada[a] == aVendaPassagem.getCodigo()); {
							verificaPassagemComprada = true;
							System.out.println("Passagem já comprada! Digite outra: ");
							aVendaPassagem.setCodigo(Integer.parseInt(s.nextLine()));
							break;
							
						}		
					}
					
					if(verificaPassagemComprada == true) {
						break;
					}
				
				}
				boolean verifica = true;
				int posicao = 0;
				//VERIFICAR SE A PASSAGEM EXISTE
				while (verifica == true) {
					for (int b = 0; b < Clientes.length; b++) { 
						if (aVendaPassagem.getCodigo() == ListaPassagem[b].getCodigo()) {
							System.out.println("Passagem encontrada!");
							verifica = false;
							posicao = b;
							valorTotal += ListaPassagem[b].getValor();
							passagemComprada[j] = aVendaPassagem.getCodigo();;
							break;
						}
					}
				if (verifica) {
					System.out.println("Código incorreto da passagem, digite novamente: ");
					aVendaPassagem.setCodigo(Integer.parseInt(s.nextLine()));
				}
				}
				
				System.out.println("Digite o nome do comprador: ");
				aVendaPassagem.setNome(s.nextLine());
				System.out.println("Digite a renda salarial: ");
				aVendaPassagem.setRenda(Double.parseDouble(s.nextLine()));			
				Clientes[j] = aVendaPassagem;

				System.out.println("-------------------");
				System.out.println("CLIENTE " + (j+1) + "\n" + Clientes[j].toString() + "\n-------------------\nPASSAGEM: \n" + ListaPassagem[posicao].toString());
				System.out.println("-------------------");
				System.out.println("Deseja continuar comprando? S/N");
				continua = s.nextLine();
				if (continua.equalsIgnoreCase("n")) {
					break;
				}
				
				verificaPassagemComprada = false;
			}
				
				System.out.println("VALOR TOTAL DE VENDAS: " + valorTotal);
	}	
		
	public static void main(String[] args) {
		Passagem();
		Cliente();
			
	}
}
