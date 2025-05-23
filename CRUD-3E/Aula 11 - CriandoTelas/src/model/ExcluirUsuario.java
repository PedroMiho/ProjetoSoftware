package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluirUsuario {
	
	public boolean deletarUsuario (String login) throws SQLException {
		
		String sql = "DELETE FROM usuario WHERE login = ?";
		
		try (Connection conn = ConexaoDB.conectar()){
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, login);
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			return false;
		}              
	}
}
