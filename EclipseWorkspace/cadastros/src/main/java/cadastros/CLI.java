package cadastros;

import java.util.Scanner;

public class CLI {
	
	public static void clearLines() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");
		}
	}
	
	public static void home() {
		Clinica cl = new Clinica(123123123,"clinica um", "cl@cl");
		Scanner input = new Scanner(System.in);
		String i;
		System.out.println("Seja vem vindo ao sistema de cadastro!");
		System.out.println("--------------------------------------");
		System.out.println("[1] - Cadastrar cliente");
		System.out.println("[2] - Ver clientes");
		i = input.nextLine();
		switch (i) {
		case "1":
			CLI cads = new CLI();
			cads.cadastrar();
			break;
		case "2":
			break;
		}
		
	}
	
	public static void cadastrar() {
		Scanner input = new Scanner(System.in);
		String i;
		
		clearLines();
		
		System.out.println("Iniciando cadastro...");
		System.out.println("[1] - inserir");
		System.out.println("[2] - fechar e voltar");
		
		i = input.nextLine();
		
		switch (i) {
		case "1":
			cadastroCliente();
			break;
		case "2":
			break;
		}
		System.out.println();
		System.out.println();
	}
	
	public static void cadastroCliente() {
		String i;
		boolean j = true;
		String k;
		
		
		while (j) {
			
			Scanner input = new Scanner(System.in);
			clearLines();
			System.out.println("CPF: ");
			String cpf = input.nextLine();
			System.out.println("Nome: ");
			String nome = input.nextLine();
			System.out.println("Email: ");
			String email = input.nextLine();
			System.out.println("Telefone: ");
			String telefone = input.nextLine();
			
			Cliente cliente = new Cliente(cpf, nome, email, telefone);
			cl.cadastra(cliente);
			
			System.out.println("[ture]|[false] - CONTINUA");
			j = input.nextBoolean();
		}
		
	}

}
