package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.CadastroDAO;
import modelo.Cadastro;

public class CadastroCrud {

		public static void main(String[] args) {
		
		
		CadastroDAO pessoaDAO = new CadastroDAO();
		
		Scanner input = new Scanner(System.in);
		
	
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String nome = "";
		
		
		@SuppressWarnings("unused")
		List<Cadastro> pessoas = new ArrayList<Cadastro>();
		
		//MENU
		do {
			System.out.println("--- CRUD Cadastro ---");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar");
			System.out.println("3 - Deletar");
			System.out.println("4 - Atualizar");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			
			switch (opcao) { 
			case 1: 
				//CREATE
				System.out.println("**Cadastrar Pessoa**");
				System.out.println("Digite o nome: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Cadastro pessoa = new Cadastro();
				
				pessoa.setNome(nome);
				
				pessoaDAO.save(pessoa);
				
				System.out.println("\n***Cadastrado**\n");
				break;
			case 2:
				//READ
				
				for (Cadastro a : pessoaDAO.getCadastro()) { 
					System.out.println("Id: " + a.getId_cadastro() + "Nome: " 
				+ a.getNome());
				}
				
				System.out.println("*Consulta Finalizada*");
				break;
			case 3:
				//DELETE
				System.out.println("Passe o ID para exclusÃ£o: ");
				posicao = input.nextInt();
				
				
				pessoaDAO.deleteById(posicao);
				System.out.println("*Pessoa excluída*");
				break;
			case 4: 
				//UPDATE
				System.out.println("Digite o id do cadastro: ");
				id = input.nextInt();
				System.out.println("Digite o  nome: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Cadastro autor1 = new Cadastro(id, nome, nome, null, nome, nome, nome, nome, nome);
				pessoaDAO.update(autor1);
				break;
			default:
				System.out.println(opcao != 0 ? "\n OpÃ§Ã£o Ã© invÃ¡lida, " + "tente novamente.\n" : "");
				break;
			}
		} while (opcao != 0);
		input.close();
		System.out.println("*Finalizado*");
		
	}
}
