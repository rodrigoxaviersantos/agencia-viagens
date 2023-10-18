package crud;

import java.util.Scanner;

import dao.UsuariosDAO;
import modelos.Usuarios;

public class UsuariosCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		UsuariosDAO usuariosDAO = new UsuariosDAO();
		
		int opcao = 0, id = 0;
		
		do {
			
			System.out.println("\n========================== USUARIOS ==============================\n");
			System.out.println("1.CRIAR   2.CONSULTAR   3.ATUALIZAR   4.DELETAR   5.CONSULTAR POR ID   0.SAIR");
			opcao = s.nextInt();
			
			String id_usuario;
			String email_usuario;
			String senha_usuario;
			String dataCadastro_usuario;
			switch (opcao) {
			case 1: 
				
				System.out.println("Digite o id:");
				id = s.nextInt();
				s.nextLine();
				System.out.println("Digite o email:");
				email_usuario = s.nextLine();
				System.out.println("Digite a senha:");
				senha_usuario = s.nextLine();
				System.out.println("Digite a data:");
				dataCadastro_usuario = s.nextLine();
				
				Usuarios usuarios1 = new Usuarios(email_usuario,senha_usuario, dataCadastro_usuario );
			
				usuariosDAO.create(usuarios1);
				break;
				
			case 2: 
				
				for (Usuarios u :usuariosDAO.read()) {
					System.out.println(u.toString());
				}
				break;
			
			case 3: 

				System.out.println("Digite o id:");
				id = s.nextInt();
				s.nextLine();
				System.out.println("Digite o email:");
				email_usuario = s.nextLine();
				System.out.println("Digite a senha:");
				senha_usuario = s.nextLine();
				System.out.println("Digite a data:");
				dataCadastro_usuario = s.nextLine();
				
				Usuarios usuarios2 = new Usuarios(email_usuario,senha_usuario, dataCadastro_usuario );
				
				usuariosDAO.update(usuarios2);
				break;
				
			case 4: 
				System.out.println("Digite um id:");
				id = s.nextInt();
				s.nextLine();
				
				usuariosDAO.delete(id);
				break;
				
			case 5: 
				System.out.println("Digite um id:");
				id = s.nextInt();
				s.nextLine();
				
				Usuarios usuario3 = usuariosDAO.readById(id);
				
				System.out.println(usuario3.toString());
				
				usuariosDAO.readById(id);
				break;
				default:
					
					break;
			
			}

			
		}while (opcao != 0);
		System.out.println("Ate mais!");

	}

}
