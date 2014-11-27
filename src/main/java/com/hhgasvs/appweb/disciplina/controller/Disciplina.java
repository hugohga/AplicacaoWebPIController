package com.hhgasvs.appweb.disciplina.controller;

import com.google.common.base.Objects;

public class Disciplina {

	private String nome;
	private String codigo;
	private String professor;
	private String sala;
	private String horario[];
	private String curso;

	public Disciplina(){}
	
	public Disciplina(String nome, String codigo, String professor, 
			     String sala, String horario[], String curso) {
		this.nome = nome;
		this.codigo = codigo;
		this.professor = professor;
		this.sala = sala;
		this.horario = horario;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getSala() {
		return sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}
	
	public String [] getHorario() {
		return horario;
	}

	public void setHorario(String horario[]) {
		this.horario = horario;
	}
	
	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(nome,codigo,professor,sala,horario,curso);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Disciplina){
			Disciplina other = (Disciplina)obj;
			return Objects.equal(nome, other.nome)
					&& Objects.equal(professor, other.professor);
					
		}
		else {
			return false;
		}
	}

}