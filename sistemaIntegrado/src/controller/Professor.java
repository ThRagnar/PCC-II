package controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Professor {

	public void gravarProfessor(){
		
		model.Professor professor = new model.Professor();
		
		FileWriter fw;
		try {
			fw = new FileWriter("C:/Users/Aluno_2/Desktop/Contato/sistemaIntegrado/src/view/professor.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			bw.write("Nome: " + professor.getNome());
			bw.newLine();
            bw.flush();
			
			bw.write("Endereço: " + professor.getEndereco());
			bw.newLine();
           	bw.flush();
           	
           	bw.write("Cep: " + professor.getCep());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Bairro: " + professor.getBairro());
			bw.newLine();
           	bw.flush();
            
           	bw.write("Cidade: " + professor.getCidade());
			bw.newLine();
           	bw.flush();
           	
           	bw.write("Telefone: " + professor.getTelefone());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Celular: " + professor.getCelular());
			bw.newLine();
           	bw.flush();
           	
           	bw.write("Email: " + professor.getEmail());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Estado: " + professor.getEstado());
           	bw.newLine();
           	bw.flush();
           	
           	bw.write("Pais: " + professor.getPais());
           	bw.newLine();
           	bw.flush();
           	bw.write("-----------");
           	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}