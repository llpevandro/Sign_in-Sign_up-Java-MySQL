package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.Usuario;

public class UsuarioDAO {
	
	private final Connection conexao;

	public UsuarioDAO(Connection conexao) {
		
		this.conexao = conexao;
	}
	
	public void insert(Usuario usuario) throws SQLException  {
		
		
			
			
			String sql = "insert into usuario(usuario, senha, email) values ('"+ usuario.getUsuario() +"', '"+ usuario.getSenha() +"', '"+ usuario.getEmail()+"')";
			
			PreparedStatement statement = conexao.prepareStatement(sql);
			statement.execute();
			
		
			
	
	}

	public Boolean existeNoBancoPorUsuarioESenha(Usuario usuario) throws SQLException {
		
		String sql = "select * from usuario where usuario = '" + usuario.getUsuario() + "' and senha = '" + usuario.getSenha() + "'";
		PreparedStatement statement = conexao.prepareStatement(sql);
		statement.execute();
		
		ResultSet resultSet = statement.getResultSet();
		
		
		return resultSet.next();
		
		
		
	}


	
	
}
