package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dao.PassagemDAO;
import modelo.Passagem;

public class PassagemCrud {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		
		PassagemDAO pessoaDAO = new PassagemDAO();
		
		Scanner input = new Scanner(System.in);
		
	
		int opcao = 0;
		int posicao = 0;
		
		int id = 0;
		String nome = "";
		
		
		List<Passagem> pessoas = new ArrayList<Passagem>();
		
		//MENU
		do {
			System.out.println("--- CRUD Passagem ---");
			System.out.println("1 - Cadastrar passageiro");
			System.out.println("2 - Consulta passageiro");
			System.out.println("3 - Deletar passageiro");
			System.out.println("4 - Atualizar passageiro");
			System.out.println("0 - Sair");
			
			opcao = input.nextInt();
			
			
			switch (opcao) { 
			case 1: 
				//CREATE
				System.out.println("**Cadastrar Passageiro**");
				System.out.println("Digite o nome: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Passagem pessoa = new Passagem();
				
				pessoa.setNome_passagem(nome);
				
				pessoaDAO.save(pessoa);
				
				System.out.println("\n***Cadastrado**\n");
				break;
			case 2:
				//READ
				
				for (Passagem a : pessoaDAO.getPassagem()) { 
					System.out.println("Id: " + a.getId_passagem() + "Nome: " 
				+ a.getNome_passagem());
				}
				
				System.out.println("*Consulta Finalizada*");
				break;
			case 3:
				//DELETE
				System.out.println("Passe o ID para exclusÃ£o: ");
				posicao = input.nextInt();
				
				
				pessoaDAO.deleteById(posicao);
				System.out.println("*Usuário excluído*");
				break;
			case 4: 
				//UPDATE
				System.out.println("Digite o id do usuário: ");
				id = input.nextInt();
				System.out.println("Digite o novo nome do usuário: ");
				nome = input.nextLine();
				nome = input.nextLine();
				
				Passagem autor1 = new Passagem(id, nome, null);
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
