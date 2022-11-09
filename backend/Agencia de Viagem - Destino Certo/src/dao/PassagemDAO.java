package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Passagem;

public class PassagemDAO {
	
	//CREATE
	public void save(Passagem pessoa) { 
		
		
		String sql = "INSERT INTO passagem (nome_passagem) VALUES (?)";
		
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, pessoa.getNome_passagem());
			
			pstm.execute();
			
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
	
	//READ
	public List<Passagem> getPassagem() { 
		
		
		String sql = "SELECT * FROM Passagem";
		
		
		List<Passagem> pessoas = new ArrayList<Passagem>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		
		ResultSet rset = null;
		
		try {
			
			conn = ConnectionMySQL.createConnectionMySQL();
			
			
			pstm = conn.prepareStatement(sql);
			
			
			rset = pstm.executeQuery();
			
			while (rset.next()) { 
				Passagem pessoa = new Passagem();
				
				pessoa.setId_passagem(rset.getInt("id_passagem"));
				pessoa.setNome_passagem(rset.getString("nome_passagem"));
				
				pessoas.add(pessoa);
			}
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
			try { 
				if (rset != null) { 
					rset.close();
				}
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
		
		return pessoas;
	}

	//UPDATE
	public void update(Passagem pessoa) { 
		
		String sql = "UPDATE Passagem SET nome_passagem = ? WHERE id_passagem = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			
			pstm.setString(1, pessoa.getNome_passagem());
			pstm.setInt(2, pessoa.getId_passagem());
			
			pstm.execute();
			
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
	
	//DELETE
	public void deleteById(int id) { 
		
		String sql = "DELETE FROM Passagem WHERE id_passagem = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
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
}
