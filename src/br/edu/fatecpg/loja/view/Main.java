package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.controller.ClienteController;
import br.edu.fatecpg.loja.controller.EnderecoController;
import br.edu.fatecpg.loja.model.Cliente;

public class Main {

	public static void main(String[] args) {
		
		EnderecoController ec = new EnderecoController();
		
		ClienteController cc = new ClienteController();
		
		ec.setEndereco("11703-222", "Rua X", "10A", "Boqueirão");
		
		cc.setCliente("Ale", 31, 777, 1900, ec.getEndereco(0));
		
		System.out.println(cc.getCliente(0));
		
	}

}
