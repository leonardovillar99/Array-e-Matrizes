package cursojava.classes;

import java.util.Arrays;
import java.util.Objects;

public class Disciplina {
	private double[] notas = new double[4];
	private String disciplina;
	
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getMediaNotas() {
		
		double somaTotal = 0;
		
		for(int pos = 0; pos < notas.length; pos++) {
			somaTotal += notas[pos];
		}
		return somaTotal / 4;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(notas);
		result = prime * result + Objects.hash(disciplina);
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina) && Arrays.equals(notas, other.notas);
	}
	
	@Override
	public String toString() {
		return "Disciplina [notas=" + Arrays.toString(notas) + ", disciplina=" + disciplina + "]";
	}
	
	
	
}
