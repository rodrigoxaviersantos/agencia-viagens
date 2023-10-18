package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelos.Passagens.Passagem;


public class PassagemDAO {

	// Create
		public void create(Passagem passagem) {

			String sql = "INSERT INTO passagem (email_passagem, senha_passagem, dataCadastro_passagem) VALUES (?, ?, ?)";

			Connection connection = null;
			PreparedStatement preparedStatement = null;

			try {
				connection = ConnectionMySQL.createConnectionToMySQL();

				preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, Passagem.getidPassagem());
				preparedStatement.setString(2, Passagem.getQtdePassagem());
				

				preparedStatement.executeUpdate();
			} catch (Exception e){
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
		public List<Passagem> read() {
			List<Passagem> Passagem = new ArrayList<Passagem>();
			String sql = "select * from passagem";

			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rset = null;
			
			try {
				conn = ConnectionMySQL.createConnectionToMySQL();
				pstm = conn.prepareStatement(sql);
				rset = pstm.executeQuery();
				
				while (rset.next()) {
					Passagem passagem = new Passagem());
					
					passagem.setInt(rset.getInt("id_passagem"));
					passagem.setInt(rset.getInt("Qtde_passagem"));
//					passagem.setFormaPagamento(rset.getString("formaPag_passagem"));
//					passagem.setDate(rset.getString("data_passagem"));
//					
					Passagem.add(passagem);
					
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
			return Passagem;

		}
			

		


		// Update
		public void update(Passagem Passagem) {
			
			String sql = "UPDATE passagem\r\n"
					+ "SET email_passagem = ?, senha_passagem = ? \r\n"
					+ "WHERE id_passagem = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rset = null;
			
			try {
				
				conn = ConnectionMySQL.createConnectionToMySQL();

				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, Passagem.getIdPassagem());
				pstm.setInt(2, Passagem.getQuantidade());
			

		
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
			
			String sql = "DELETE FROM passagem, Passagem\r\n"
					+ "USING passagem\r\n"
					+ "JOIN Passagem ON passagem.num_passagem = Passagem.num_passagem\r\n"
					+ "WHERE passagem.num_passagem = \"SeuNumeroDepassagem\";";
			
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
		public Passagem readById(int id) {
			Passagem passagem = new Passagem());
			String sql = "SELECT * FROM passagem\r\n"
					+ "WHERE id_passagem = ?;\r\n";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			ResultSet rset = null;
			
			try {
				
				conn = ConnectionMySQL.createConnectionToMySQL();

				pstm = conn.prepareStatement(sql);
				
				pstm.setInt(1, id);
				
				rset = pstm.executeQuery();
				
				rset.next();
				
				passagem.setInt(rset.getInt("id_passagem"));
				passagem.setInt(rset.getInt("Qtde_passagem"));
				
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
					
					
			return new Passagem();
		}

	}


