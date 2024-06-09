package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class UserLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLogin frame = new UserLogin();
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
	public UserLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 276);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setFont(new Font("Microsoft Tai Le", Font.BOLD, 18));
		lblNewLabel.setBounds(160, 42, 137, 24);
		contentPane.add(lblNewLabel);
		
		JLabel txtUsername = new JLabel("Username:");
		txtUsername.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		txtUsername.setBounds(77, 95, 70, 14);
		contentPane.add(txtUsername);
		
		JLabel txtSenha = new JLabel("Senha:");
		txtSenha.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		txtSenha.setBounds(77, 137, 46, 14);
		contentPane.add(txtSenha);
		
		username = new JTextField();
		username.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		username.setBounds(138, 91, 137, 20);
		contentPane.add(username);
		username.setColumns(10);
		
		senha = new JPasswordField();
		senha.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 11));
		senha.setBounds(138, 134, 137, 20);
		senha.setEchoChar('•');;
		contentPane.add(senha);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		btnLogin.setBounds(77, 176, 89, 23);
		contentPane.add(btnLogin);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 12));
		btnRegistrar.setBounds(186, 176, 89, 23);
		contentPane.add(btnRegistrar);
	}
}
