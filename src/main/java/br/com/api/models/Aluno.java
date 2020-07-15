package br.com.api.models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aluno {

	private int id;

	private String nome;

	private Date dataNasc;

	private Turma turma;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNasc() {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = dateFormat.format(dataNasc);
		
		return dataFormatada;
	}

	public void setDataNasc(Date dataNasc) {

		this.dataNasc = dataNasc;

	}

}
