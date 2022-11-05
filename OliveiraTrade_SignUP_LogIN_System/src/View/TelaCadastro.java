package View;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

import Controller.CadastroController;
import DAO.Conexao;
import DAO.UsuarioDAO;
import models.Usuario;

import javax.swing.JButton;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textField_usuario;
	private JTextField textField_email;
	private JPasswordField passwordField;
	private CadastroController controller;
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastro frame = new TelaCadastro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastro() {
		
		controller = new CadastroController(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_email = new JTextField();
		textField_email.setBounds(10, 108, 200, 20);
		contentPane.add(textField_email);
		textField_email.setColumns(10);
		
		textField_usuario = new JTextField();
		textField_usuario.setBounds(10, 36, 200, 20);
		contentPane.add(textField_usuario);
		textField_usuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("E-mail");
		lblNewLabel_1.setBounds(10, 83, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setBounds(10, 147, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 172, 200, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				controller.salvaUsuario();				
			
			}
		});
		btnNewButton.setBounds(10, 203, 89, 23);
		contentPane.add(btnNewButton);
	}

	public JTextField getTextField_usuario() {
		return textField_usuario;
	}

	public void setTextField_usuario(JTextField textField_usuario) {
		this.textField_usuario = textField_usuario;
	}

	public JTextField getTextField_email() {
		return textField_email;
	}

	public void setTextField_email(JTextField textField_email) {
		this.textField_email = textField_email;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}
	
	
}
