package Controller;

import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import DAO.Conexao;
import DAO.UsuarioDAO;
import View.TelaLogin;
import View.TelaSucessoLogin;
import models.Usuario;

public class LoginController {	
	private TelaLogin view;

	public LoginController(TelaLogin view) {		
		this.view = view;
	}

	public void autenticar() throws SQLException {
		
		
		//Buscando usuario 
		
		String usuario = view.getTextField_usuariologin().getText();
		String senha = view.getPasswordField_login().getText();
		
		Usuario usuarioAutenticar = new Usuario(usuario, null, senha);
		
		//Verificando se existe no banco de dados
		
		Connection conexao = new Conexao().conectaDB();
		UsuarioDAO usuarioDao = new UsuarioDAO(conexao);
		
		boolean existe = usuarioDao.existeNoBancoPorUsuarioESenha(usuarioAutenticar);
	
		
		
		//Se existir usuário, direciona para tela de Sucesso!
		
		if (existe) {
			TelaSucessoLogin telaSucesso = new TelaSucessoLogin();
			telaSucesso.setVisible(true);
		}
		
		else {
			JOptionPane.showMessageDialog(view, "Usuário ou senha inválido.");
		}
		
		
		
	}
	
}
