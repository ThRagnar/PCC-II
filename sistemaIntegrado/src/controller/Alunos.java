package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Alunos {

	public void gravarAluno(){
			model.Aluno aluno = new model.Aluno();
		FileWriter fw;
		try {
			fw = new FileWriter("C:/Users/Aluno_2/Desktop/Contato/sistemaIntegrado/src/view/alunos.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Nome: " + aluno.getNome());
			bw.newLine();
            bw.flush();
			
			bw.write("Endereço: " + aluno.getEndereco());
			bw.newLine();
           	bw.flush();
           	
           	bw.write("Cep: " + aluno.getCep());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Bairro: " + aluno.getBairro());
			bw.newLine();
           	bw.flush();
            
           	bw.write("Cidade: " + aluno.getCidade());
			bw.newLine();
           	bw.flush();
           	
           	bw.write("Telefone: " + aluno.getTelefone());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Celular: " + aluno.getCelular());
			bw.newLine();
           	bw.flush();
           	
           	bw.write("Email: " + aluno.getEmail());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Estado: " + aluno.getEstado());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Pais: " + aluno.getPais());
           	bw.newLine();
           	bw.flush();
           	bw.write("-----------");
           	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

