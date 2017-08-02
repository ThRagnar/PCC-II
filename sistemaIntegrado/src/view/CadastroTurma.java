package view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroTurma extends JFrame{
	
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnVoltar = new JButton("Voltar");
	
	private JLabel lblNomeCurso = new JLabel("Turma:");
	private JTextField txtNomeCurso = new JTextField();

	private JLabel lblCoord = new JLabel("Coordenador: ");
	private JTextField txtCoord = new JTextField();
	
	private JLabel lblSala = new JLabel ("Sala: ");
	private JTextField txtSala = new JTextField();
	
	private JLabel lblTurno = new JLabel("Turno: ");
	private JComboBox cboTurno = new JComboBox();
	
	private JLabel lblInicio = new JLabel("Inicio: ");
	private JComboBox cboInicio = new JComboBox(); 
	
	private JLabel lblTermino = new JLabel("Término: ");
	private JComboBox cboTermino = new JComboBox();
	
	public CadastroTurma(){
		super(".::Cadastro Turma::.");
		Container janela = this.getContentPane();
		janela.setLayout(null);
	
		
		
		lblNomeCurso.setBounds(20, 20, 100, 30);
		janela.add(lblNomeCurso);
		
		txtNomeCurso.setBounds(100, 20, 250, 30);
		janela.add(txtNomeCurso);
		
		lblCoord.setBounds(20, 60, 100,30);
		janela.add(lblCoord);
		
		txtCoord.setBounds(100,60,250,30);
		janela.add(txtCoord);
		
		lblSala.setBounds(370, 20, 100, 30);
		janela.add(lblSala);
		
		txtSala.setBounds(430,20,250,30);
		janela.add(txtSala);
		
		lblInicio.setBounds(370, 60,100, 30);
		janela.add(lblInicio);
		
		cboInicio.setBounds(430, 60, 70, 30);
		janela.add(cboInicio);
		
		lblTermino.setBounds(520, 60,100, 30);
		janela.add(lblTermino);
		
		cboTermino.setBounds(580, 60, 70, 30);
		janela.add(cboTermino);
		
		cboInicio.addItem("07:00");
		cboInicio.addItem("07:30");
		cboInicio.addItem("08:00");
		cboInicio.addItem("08:30");
		cboInicio.addItem("12:00");
		cboInicio.addItem("12:30");
		cboInicio.addItem("13:00");
		cboInicio.addItem("13:30");
		cboInicio.addItem("18:00");
		cboInicio.addItem("18:30");
		cboInicio.addItem("19:00");
		cboInicio.addItem("19:30");
		
		cboTermino.addItem("10:00");
		cboTermino.addItem("10:30");
		cboTermino.addItem("11:00");
		cboTermino.addItem("11:30");
		cboTermino.addItem("15:00");
		cboTermino.addItem("15:30");
		cboTermino.addItem("16:00");
		cboTermino.addItem("16:30");
		cboTermino.addItem("21:00");
		cboTermino.addItem("21:30");
		cboTermino.addItem("22:00");
		cboTermino.addItem("22:30");
		
		btnCadastrar.setBounds(210, 230, 100, 50);
		janela.add(btnCadastrar);
		
		btnVoltar.setBounds(340, 230, 100, 50);
		janela.add(btnVoltar);
		
		btnVoltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				Principal principal = new Principal();
				dispose();
			}
		});
		
		
		
		this.setVisible(true);
		this.setSize(700,370);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main (String args[]){
		CadastroTurma turma = new CadastroTurma();
	}

}
