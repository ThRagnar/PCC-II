package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.Professor;

public class CadastroProfessor extends JFrame {
	
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnCancelar = new JButton("Cancelar");
	
	private JLabel lblNome = new JLabel("Nome:");
	private JTextField txtNome = new JTextField();
	
	private JLabel lblEndereco = new JLabel("Endereço:");
	private JTextField txtEndereco = new JTextField();
	
	private JLabel lblCep = new JLabel("CEP: ");
	private JTextField txtCep = new JTextField();
	
	private JLabel lblBairro = new JLabel("Bairro:");
	private JTextField txtBairro = new JTextField();
	
	private JLabel lblCidade = new JLabel("Cidade:");
	private JTextField txtCidade = new JTextField();
	
	private JLabel lblTelefone = new JLabel("Telefone:");
	private JTextField txtTelefone = new JTextField();
	
	private JLabel lblCelular = new JLabel("Celular:");
	private JTextField txtCelular = new JTextField();
	
	private JLabel lblEmail = new JLabel("E-mail:");
	private JTextField txtEmail = new JTextField();
	
	private JLabel lblEstado = new JLabel("Estado:");
	private JComboBox cboEstado = new JComboBox();
	
	private JLabel lblPais = new JLabel("Pais:");
	private JComboBox cboPais = new JComboBox();
	
	public CadastroProfessor(){
		super(".:Cadastro Professor:.");
		Container janela = this.getContentPane();
		janela.setLayout(null);
		
		
		lblNome.setBounds(20, 20, 100, 30);
		janela.add(lblNome);
		
		txtNome.setBounds(80, 20, 250, 30);
		janela.add(txtNome);
		
		lblEndereco.setBounds(20, 60, 100,30);
		janela.add(lblEndereco);
		
		txtEndereco.setBounds(80,60,250,30);
		janela.add(txtEndereco);
		
		lblBairro.setBounds(20,100,100,30);
		janela.add(lblBairro);
		
		txtBairro.setBounds(80, 100, 250, 30);
		janela.add(txtBairro);
		
		lblCidade.setBounds(20, 140, 100, 30);
		janela.add(lblCidade);
		
		txtCidade.setBounds(80,140,250,30);
		janela.add(txtCidade);
		
		lblCep.setBounds(350, 20, 100, 30);
		janela.add(lblCep);
		
		txtCep.setBounds(420,20,100,30);
		janela.add(txtCep);
		
		lblCelular.setBounds(350, 60,100, 30);
		janela.add(lblCelular);
		
		txtCelular.setBounds(420, 60, 250, 30);
		janela.add(txtCelular);
		
		lblEmail.setBounds(350, 100, 100, 30);
		janela.add(lblEmail);
		
		txtEmail.setBounds(420, 100, 250, 30);
		janela.add(txtEmail);
		
		lblTelefone.setBounds(350, 140, 250, 30);
		janela.add(lblTelefone);
		
		txtTelefone.setBounds(420, 140, 250, 30);
		janela.add(txtTelefone);
		
		lblPais.setBounds(20, 180, 100, 50);
		janela.add(lblPais);
		
		lblEstado.setBounds(20,220, 100, 50);
		janela.add(lblEstado);
		
		cboPais.setBounds(70, 190, 100, 30);
		janela.add(cboPais);	
	
		cboEstado.setBounds(70,230,100,30);
		janela.add(cboEstado);
		
		btnCadastrar.setBounds(190, 270, 150, 50);
		janela.add(btnCadastrar);
		
		btnCancelar.setBounds(350,270,150,50);
		janela.add(btnCancelar);
		
		
		cboEstado.addItem("SP");
		cboEstado.addItem("MG");
		cboEstado.addItem("RJ");
		cboEstado.addItem("BH");
		cboEstado.addItem("RS");
		cboEstado.addItem("PR");
		cboEstado.addItem("PE");
		cboEstado.addItem("CA");
		cboEstado.addItem("PA");
		cboEstado.addItem("MR");
		cboEstado.addItem("SC");
		cboEstado.addItem("GO");
		cboEstado.addItem("PA");
		cboEstado.addItem("AM");
		cboEstado.addItem("ES");
		cboEstado.addItem("RN");
		cboEstado.addItem("AL");
		cboEstado.addItem("MT");
		cboEstado.addItem("SR");
		cboEstado.addItem("RO");
		cboEstado.addItem("TO");
		cboEstado.addItem("AC");
		cboEstado.addItem("AM");
		cboEstado.addItem("RM");
		cboEstado.addItem("DF");
		
		cboPais.addItem("Afeganistão");
		cboPais.addItem("Argentina");
		cboPais.addItem("Brasil");
		cboPais.addItem("Chile");
		cboPais.addItem("Cuba");
		cboPais.addItem("Canadá");
		cboPais.addItem("Dinamarca");
		cboPais.addItem("França");
		cboPais.addItem("Irlanda");
		cboPais.addItem("Marrocos");
		
	
		this.setVisible(true);
		this.setSize(700,370);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		btnCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					Principal pri = new Principal();
					dispose();
					
				
			}
			});
		
		btnCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			
				model.Professor pro = new model.Professor();
				
				pro.setNome(txtNome.getText());
				pro.setEndereco(txtEndereco.getText());
				pro.setCep(Integer.parseInt(txtCep.getText()));
				pro.setBairro(txtBairro.getText());
				pro.setCidade(txtCidade.getText());
				pro.setTelefone(txtTelefone.getText());
				pro.setCelular(txtCelular.getText());
				pro.setEmail(txtEmail.getText());
				pro.setEstado(cboEstado.getSelectedItem().toString());
				pro.setPais(cboPais.getSelectedItem().toString());
				
				
				Professor prof = new Professor();
				
				
				JOptionPane.showMessageDialog(null, "Professor cadastrado !");
				
			}
		});
		
		
	}
	
	public static void main(String args[]){
		CadastroProfessor cadprof = new CadastroProfessor();
		cadprof.gravarProfessor();
	}

	private void gravarProfessor() {
		// TODO Auto-generated method stub
		
	}
}
