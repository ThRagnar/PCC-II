package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	private JButton btnLog = new JButton("OK");
	
	private JLabel	lblUsuario = new JLabel("Usuario:");
	private JTextField txtUsuario = new JTextField("");

	private JLabel	lblSenha = new JLabel("Senha:");
	private JPasswordField txtsenha = new JPasswordField();
	
	private String usuario = new String ("admin");
	private String senha = new String ("123");
	
	public Login(){
		super (".:Login:.");
		Container janela = this.getContentPane();
		janela.setLayout(null);


		lblUsuario.setBounds(20, 20, 190, 30);
		janela.add(lblUsuario);
	
		txtUsuario.setBounds(80, 20, 190, 30);
		janela.add(txtUsuario);
	
		lblSenha.setBounds(20, 60, 190, 30);
		janela.add(lblSenha);
	
		txtsenha.setBounds(80, 60, 190, 30);
		janela.add(txtsenha);
		
		btnLog.setBounds(120,100,70,30);
		janela.add(btnLog);
		
	
		btnLog.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(txtUsuario.getText().equals(usuario) && txtsenha.getText().equals(senha)){
					Principal principal = new Principal();
					dispose();
					
				}else{
					JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos");
				}
			}
			});
		
		this.setVisible(true);
		this.setSize(320,170);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
     }
	
	public static void main(String args[]){
		Login log = new Login();
	}
	
	
	}
