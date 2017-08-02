package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Principal extends JFrame {
	private JMenuBar menuBar = new JMenuBar();
	private JMenu menuArquivo = new JMenu("Arquivo");
	private JMenu menuEditar = new JMenu("Editar");
	private JMenu menuExibir = new JMenu("Exibir");
	
	private JMenuItem menuItemProfessor  = new JMenuItem("Professor");
	private JMenuItem menuItemTurma = new JMenuItem("Turma");
	private JMenuItem menuItemAluno = new JMenuItem("Aluno");
	private JMenuItem menuItemSair = new JMenuItem("Sair");
	
	
	
	public Principal(){
		super(".:Tela Principal:.");
		menuBar.add(menuArquivo);
		menuBar.add(menuEditar);
		menuBar.add(menuExibir);
		
		menuArquivo.add(menuItemProfessor);
		menuArquivo.add(menuItemAluno);
		menuArquivo.add(menuItemTurma);
		menuArquivo.add(menuItemSair);
		
		menuItemProfessor.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					CadastroProfessor principal = new CadastroProfessor();
					dispose();
					
				
			}
			});
		
		menuItemAluno.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					CadastroAluno principal = new CadastroAluno();
					dispose();
					
				
			}
			});
		
		menuItemTurma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					CadastroTurma principal = new CadastroTurma();
					dispose();
					
				
			}
			});
		
		menuItemSair.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					dispose();

			}
			});
		
		
		
		this.setJMenuBar(menuBar);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 400);
		this.setVisible(true);
		this.setResizable(false);
	


	}
		public static void main(String args[]){
			Principal prin = new Principal();
		}
	}
