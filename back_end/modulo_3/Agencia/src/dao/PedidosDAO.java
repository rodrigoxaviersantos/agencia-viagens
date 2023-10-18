package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Pedidos;

public class PedidosDAO {
	// Create
	public void create(Pedidos pedidos) {

		String sql = "INSERT INTO pedido (email_pedido, senha_pedido, dataCadastro_pedido) VALUES (?, ?, ?)";

		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = ConnectionMySQL.createConnectionToMySQL();

			preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, pedidos.getNumPedido());
			preparedStatement.setString(2, pedidos.getFormaPagamento());
			preparedStatement.setTimestamp(3, new java.sql.Timestamp(pedidos.getDataPedido().getTime()));

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
	public List<Pedidos> read() {
		List<Pedidos> Pedidos = new ArrayList<Pedidos>();
		String sql = "select * from pedido";

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			conn = ConnectionMySQL.createConnectionToMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Pedidos pedido = new Pedidos();
				
				pedido.setInt(rset.getInt("num_pedido"));
				pedido.setPrecoTotal(rset.getFloat("PrecoTotal_pedido"));
				pedido.setFormaPagamento(rset.getString("formaPag_pedido"));
				pedido.setDate(rset.getString("data_pedido"));
				
				Pedidos.add(pedido);
				
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
		return Pedidos;

	}
		

	


	// Update
	public void update(Pedidos Pedidos) {
		
		String sql = "UPDATE pedido\r\n"
				+ "SET email_pedido = ?, senha_pedido = ? \r\n"
				+ "WHERE id_pedido = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, Pedidos.getNumPedido());
			pstm.setString(2, Pedidos.getFormaPagamento());
			pstm.setFloat(3, Pedidos.getPrecoTotal());
			pstm.setDate(4, Pedidos.getDataPedido());
			
	
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
	public Pedidos readById(int id) {
		Pedidos pedido = new Pedidos();
		String sql = "SELECT * FROM pedido\r\n"
				+ "WHERE id_pedido = ?;\r\n";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionToMySQL();

			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			rset = pstm.executeQuery();
			
			rset.next();
			
			pedido.setInt(rset.getInt("num_pedido"));
			pedido.setPrecoTotal(rset.getFloat("PrecoTotal_pedido"));
			pedido.setFormaPagamento(rset.getString("formaPag_pedido"));
			pedido.setDate(rset.getString("data_pedido"));
			
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
				
				
		return new Pedidos();
	}

}
