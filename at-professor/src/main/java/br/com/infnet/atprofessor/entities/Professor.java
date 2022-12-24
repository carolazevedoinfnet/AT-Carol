package br.com.infnet.atprofessor.entities;

import java.io.Serializable;

public class Professor implements Serializable {
	

	private static final long serialVersionUID = 1L;

	private String aluno;
	private String disciplina;
	private String atividade;
	private Integer nota;
		
	public Professor() {
		
	}

	public Professor(String aluno, String disciplina, String atividade, Integer nota) {
		super();
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.atividade = atividade;
		this.nota = nota;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	public String getDisciplina() {
		return disciplina; 
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public String getAtividade() {
		return atividade;
	}

	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	
}
