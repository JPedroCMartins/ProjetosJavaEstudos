package cadastros;

import java.util.ArrayList;

public class Clinica {
	private int cnpj;
	private String nome;
	private String email;
    private ArrayList<Cliente> clientes = new ArrayList<>();
	
	public Clinica(int cnpj, String nome, String email) {
		super();
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
	}
	
	public void cadastra(Cliente cl) {
		this.clientes.add(cl);
	}
		
	public void printclientes() {
		for (int i = 0; i < this.clientes.size(); i++ ) {
			Cliente pt = this.clientes.get(i);
			
			System.out.println(pt.getNome());
		}
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
