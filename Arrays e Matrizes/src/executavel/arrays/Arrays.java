package executavel.arrays;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Arrays {
	public static void main(String[] args) {
		
		double[] notasJS = {5.8, 7.7, 10, 8.3};
		double[] notasLogica = {7.2, 4.4, 9.8, 7.6};
		double[] notasJava = {5.4, 6.9, 9.1, 7.6};
		double[] notasTratamentoErros = {7.7, 8.4, 2.8, 9.6};
		
		Aluno aluno = new Aluno();
		aluno.setNome("Leonardo Fernandez Villar");
		aluno.setIdade(23);
		aluno.setNomeCurso("OneBitCode JS");
		
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Javascript");
		disciplina.setNotas(notasJS);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNotas(notasLogica);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Bruno Nunes");
		aluno2.setIdade(25);
		aluno2.setNomeCurso("JDev Treinamentos");
		
		Disciplina disciplina3 = new Disciplina();
		disciplina3.setDisciplina("Java");
		disciplina3.setNotas(notasJava);
		
		aluno.getDisciplinas().add(disciplina3);
		
		Disciplina disciplina4 = new Disciplina();
		disciplina4.setDisciplina("Tratamento de erros e exceções");
		disciplina4.setNotas(notasTratamentoErros);
		
		aluno.getDisciplinas().add(disciplina4);
		
		//--------------------------------------------------
		
		Aluno[] arrayAlunos = new Aluno[2];
		
		arrayAlunos[0] = aluno;
		arrayAlunos[1] = aluno2;
		
		for(int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getIdade() + " anos");
			
			for(Disciplina d : arrayAlunos[pos].getDisciplinas()) {
				System.out.println("\nNome da disciplina: " + d.getDisciplina());
				
				for(int posNota = 0; posNota < d.getNotas().length; posNota++) {
					System.out.println("Nota " + (posNota + 1) + " é: " + d.getNotas()[posNota]);
				}
			}
		}
	}
}	
