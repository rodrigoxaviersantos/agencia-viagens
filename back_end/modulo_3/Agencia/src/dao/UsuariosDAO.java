package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Usuarios;

public class UsuariosDAO {

	// Create
	public void create(Usuarios usuario) {

		String sql = "INSERT INTO Usuario (email_usuario, senha_usuario, dataCadastro_usuario) VALUES (?, ?, ?)";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionMySQL.createConnectionToMySQL();

			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, usuario.getEmailUsuario());
			preparedStatement.setString(2, usuario.getSenhaUsuario());
			preparedStatement.setTimestamp(3, new java.sql.Timestamp(usuario.getDataCadastroUsuario().getTime()));

			preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

	// Read
	public List<Usuarios> read() {
		List<Usuarios> usuarios = new ArrayList<Usuarios>();
		String sql = "select * from Usuario";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Usuarios usuario = new Usuarios();
				
				usuario.setInt(rset.getInt("id_usuario"));
				usuario.setEmail(rset.getString("email_usuario"));
				usuario.setSenha(rset.getString("senha_usuario"));
				usuario.setDate(rset.getString("dataCadastro_usuario"));
				
				usuarios.add(usuario);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return usuarios;

	}
		

	


	// Update
	public void update(Usuarios usuarios) {
		
		String sql = "UPDATE Usuario\r\n"
				+ "SET email_usuario = ?, senha_usuario = ? \r\n"
				+ "WHERE id_usuario = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, usuarios.getEmailUsuario());
			pstm.setString(2, usuarios.getSenhaUsuario());
			pstm.setInt(3, usuarios.getId());
//			pstm.setDate(4, usuarios.getDataCadastroUsuario());
			
	
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	}

	// Delete
	public void delete(int id) {
		
		String sql = "DELETE FROM Pedido, Passagem\r\n"
				+ "USING Pedido\r\n"
				+ "JOIN Passagem ON Pedido.num_pedido = Passagem.num_pedido\r\n"
				+ "WHERE Pedido.num_pedido = \"SeuNumeroDePedido\";";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, 0);
		
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	}


	// ReadById
	public Usuarios readById(int id) {
		Usuarios usuario = new Usuarios();
		String sql = "SELECT * FROM Usuario\r\n"
				+ "WHERE id_usuario = ?;\r\n";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			rset = pstm.executeQuery();
			
			rset.next();
			
			usuario.setInt(rset.getInt("id_usuario"));
			usuario.setEmail(rset.getString("email_usuario"));
			usuario.setSenha(rset.getString("senha_usuario"));
			usuario.setSenha(rset.getString("dataCadastro_usuario"));
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
				
				
		return new Usuarios();
	}

}
