package executavel.arrays;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class Arrays {
	public static void main(String[] args) {
		
		double[] notasJS = {5.8, 7.7, 10, 8.3};
		double[] notasLogica = {7.2, 4.4, 9.8, 7.6};
		
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
		
		System.out.println("Nome do aluno: " + aluno.getNome() + "\nIdade do aluno: " + aluno.getIdade() + "\nIncrito no curso: " + aluno.getNomeCurso());
		
		for(Disciplina d : aluno.getDisciplinas()) {
			System.out.println("\n---------- Disciplina e Notas ----------");
			System.out.println("Disciplina: " + d.getDisciplina());
			
			double notaMax = 0.0;
			for(int pos = 0; pos < d.getNotas().length; pos++) {
				System.out.println("Nota " + (pos + 1) + " é: " + d.getNotas()[pos]);
				if(pos == 0) {
					notaMax = d.getNotas()[pos];
				}else {
					if(d.getNotas()[pos] > notaMax) {
						notaMax = d.getNotas()[pos];
					}
				}
			}
			System.out.println("\nA maior nota da disciplina: " + d.getDisciplina() + " é de valor: " + notaMax);
		}
	}
}	
